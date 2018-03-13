
package conexao;


public class Teste {
    public static void main(String[] args) {
        try{
            new Conexao().getConnection();
            System.out.println("conectado");
        }catch(Exception e){
            System.err.println("error!!!");
        }
        
    }
}
