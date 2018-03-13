package colecao;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ColecaoMap {
	public static void main(String[] args){
		
		Map<String,String> pais = new HashMap<>();
		pais.put("BR", "Brasil");
		pais.put("RU", "R�ssia");
		pais.put("IN", "�ndia");
		pais.put("CN", "China");
		System.out.println(pais);
		System.out.println(pais.containsKey("US"));
		System.out.println(pais.containsValue("Brasil"));
		System.out.println(pais.get("CN"));
		pais.remove("RU");
		System.out.println(pais);
		Set<String> keys = pais.keySet();
		for(String key:keys){
			System.out.println(key+":"+pais.get(key));
		}
	}
}
