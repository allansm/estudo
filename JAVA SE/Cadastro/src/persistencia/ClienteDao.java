

package persistencia;

import entidade.Cliente;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class ClienteDao {
    public Path makeDirectory() throws Exception{
        String url;
        if(System.getProperty("os.name").toLowerCase().contains("linux")){
            url = "/home/"+System.getProperty("user.name")+"/Desktop/Data/dados.txt";
        }else{
            url = "c:/users/%USERNAME%/desktop/Data/dados.txt";
        }
        Path p = Paths.get(url);
        if(!Files.exists(p.getParent())){
            Files.createDirectories(p.getParent());
        }
        if(!Files.exists(p)){
            Files.createFile(p);
        }
        return p;
    }
    public void add(Cliente c) throws Exception{
        Path p = makeDirectory();
        List<String> document = Files.readAllLines(p);
        String register = (document.size()+1)+" - "+c.getNome()+" - "+c.getEmail()+" - "+c.getIdade()+" ;";
        document.add(register);
        String data = "";
        for(String s:document){
            data+= s+"\n";
        }
        Files.write(p,data.getBytes());
    }
    public List<Cliente> searchAll() throws Exception{
        Path p = makeDirectory();
        List<String> document = Files.readAllLines(p);
        List<Cliente> clientes = new ArrayList<>();
        int count = 0,ini =0,vc =0;
        String[] vet;
        for(String s: document){
            vet = new String[5];
            for(int i =0; i < s.length();i++){
                if(s.charAt(i) == '-' || s.charAt(i) == ';'){
                    count = i-1; 
                    vet[vc++] = s.substring(ini, count);
                    ini = i+2;
                }
                
            }
            clientes.add(new Cliente(vet[1],vet[2],Integer.parseInt(vet[3])));
            ini = 0;
            vc = 0;
            count = 0;
        }
        return clientes;
    }
    public Cliente search(int id) throws Exception{
        int count = 1;
        List<Cliente> clientes = new ClienteDao().searchAll();
        for(Cliente c:clientes){
            if(id == count++){
                return c;
            }
        }
        return null;
    }
    public void update(int id,Cliente c) throws Exception{
        Path p = makeDirectory();
        List<String> document = Files.readAllLines(p);
        String register = id+" - "+c.getNome()+" - "+c.getEmail()+" - "+c.getIdade()+" ;";
        document.set(id-1, register);
        String data = "";
        for(String s : document){
            data += s+"\n";
        }
        Files.write(p, data.getBytes());
    }
    public void delete(int id)throws Exception{
        Path p = makeDirectory();
        List<String> document = Files.readAllLines(p);
        String register = " "+" - "+" "+" - "+" "+" - "+0+" ;";
        document.set(id-1, register);
        String data = "";
        for(String s : document){
            data += s+"\n";
        }
        Files.write(p, data.getBytes());
    }
}
