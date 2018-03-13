package estudo;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {
	
	public static void main(String[] args){
	
		Path path = Paths.get("c:/users/allan/desktop/test/fonte.txt");
		try{
			Files.createDirectories(path.getParent());
			//Files.write(path,"vai te fuder".getBytes());
			Files.deleteIfExists(path);
			Files.createFile(path);
			Files.write(path,"vai se ferrar".getBytes());
			Path destiny = Paths.get("c:/users/allan/desktop/test/copy.txt");
			Files.copy(path, destiny,StandardCopyOption.REPLACE_EXISTING);
			Path destiny2 = Paths.get("c:/users/allan/desktop/test/move/fonte.txt");
			Files.createDirectories(destiny2.getParent());
			Files.move(path, destiny2,StandardCopyOption.REPLACE_EXISTING);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
