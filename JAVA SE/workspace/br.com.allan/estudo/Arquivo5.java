package estudo;

import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

public class Arquivo5 {
	
	public static void main(String[] args){
		/*Iterable<Path> dirs =FileSystems.getDefault().getRootDirectories();
		for (Path path : dirs) {
			System.out.println(path);
		}
		Path dir = Paths.get("c:/");
		try{
			DirectoryStream<Path> stream = Files.newDirectoryStream(dir);
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}*/
		FileSystem fs = FileSystems.getDefault();
		for(FileStore store : fs.getFileStores()){
			System.out.println("unidade : "+store.toString());
			try{
				System.out.println("tamanho : "+store.getTotalSpace());
				System.out.println("disponivel : "+store.getUsableSpace());
				System.out.println("utilizada : "+(store.getTotalSpace()-store.getUsableSpace()));
				System.out.println("\n");
			}catch(Exception e){
				e.getMessage();
			}
		}
	}

}
