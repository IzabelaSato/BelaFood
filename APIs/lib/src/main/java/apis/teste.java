package apis;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class teste {
	
	public static void main (String[] args) {

	List<String> words = List.of("CARLOS", "JOSE", "JOAO", "JOANA", "MARIA");
	
	//List <String> filtereWords = 
	words.stream()
		.filter(w -> w.startsWith("J"))
		.map(w -> w.toLowerCase())
		.forEach(w -> System.out.println(w));
		//.collect(Collectors.toList());
		
	//System.out.println(filtereWords);
//	filtereWords.stream().forEach(w -> System.out.println (w));

}
}


