package apis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		
		//List<String> listaMercado = new ArrayList<>();
		Set<String> listaMercado = new HashSet<>();
		
		
		listaMercado.add("macarrão");
		listaMercado.add("pão");
		listaMercado.add("feijão");
		listaMercado.add("arroz");
		listaMercado.add("batata");
		listaMercado.add("alface");
		
		// para ordenar a lista em ordem alfabetica usa colletions.sort
		
		//Collections.sort(listaMercado);
		
	//	System.out.println (listaMercado);
		
		for (String item : listaMercado) {
			System.out.println ("Item: " + item);
			
			
		}
		
		
	}

}
