package estudo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("c:/test/test.txt");
		Charset utf8  = StandardCharsets.UTF_8;
		BufferedWriter w = null;
		try{
			w = Files.newBufferedWriter(path, utf8);
			w.write("fuck\n");
			w.write("fuck yeah");
			w.flush();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			if(w != null){
				w.close();
			}
		}
		BufferedReader r = null;
		try{
			r = Files.newBufferedReader(path,utf8);
			String linha = null;
			while((linha = r.readLine()) != null){
				System.out.println(linha);
			}
		}catch(Exception  e){
			
		}finally{
			r.close();
		}
	}
}
