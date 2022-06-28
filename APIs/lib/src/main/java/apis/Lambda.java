package apis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda {
	public static void main(String[] args) {
		
		System.out.println(" -----------------------");
		System.out.println("| PROGRAMAÇÃO FUNCIONAL |");
		System.out.println(" -----------------------");
		List<Integer> numbers = new ArrayList<>(List.of(5,3,4,2,1));
	
		Comparator<Integer> comparator = (o1, o2) -> -o1.compareTo(o2);
		numbers.sort(comparator);
		
		System.out.println("EXERCÍCIO 1");
		System.out.println("ORDENAÇÃO DOS NUMEROS USANDO LAMBDA");
		System.out.println(numbers);
		System.out.println();
		
		//__________________________________________________________________
		
		System.out.println("EXERCÍCIO 2");
		System.out.println("MULTIPLICAÇÃO USANDO LAMBDA");
		Operator op = (x, y) -> x * y;
		System.out.println(op.execute(5, 3));
		System.out.println();
		
		//__________________________________________________________________
		System.out.println("EXERCÍCIO 3");
		System.out.println("MOSTRANDO NA TELA SOMENTE OS NOMES COM A LETRA J E EM MINUSCULO");
		List<String> words = List.of("CARLOS", "JOSE", "JOAO", "JOANA", "MARIA");
		
		List <String> filtereWords = words
			.stream()
			.filter(w -> w.startsWith ("J"))
			//.map(w -> w.toLowerCase())
			.map(String::toLowerCase)
			//.forEach(w -> System.out.println(w));
			.collect(Collectors.toList());
		
		//System.out.println(filtereWords);
	//	filtereWords.stream().forEach(w -> System.out.println (w));
		filtereWords.forEach(System.out::println);
		System.out.println();
		
		//____________________________________________________________________
		System.out.println("EXERCÍCIO 4");
		System.out.println("MOSTRANDO NA TELA UMA SEQUENCIA DE 1 A 20 QUE ESTA SENDO MULTIPLICADA POR 3");
		int mult = 3;
		int count = 0;
		
		IntStream.range(1,21)
		.map (i-> {
			return i*mult;
		})
		.forEach (System.out::println);
		System.out.println();
		
		//____________________________________________________________________
		System.out.println("EXERCÍCIO 5");
		System.out.println("MOSTRAR A POSIÇÃO DAS LETRAS ACBA");
		String str = "ACBA";
		String result = str.chars()
				.map(i -> i -64)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining("-", "=>>", "<<="));
		System.out.println(result);
		System.out.println();
		
		//___________________________________________________________________
		
		System.out.println("EXERCÍCIO 6");
		System.out.println("MOSTRAR NA TELA A MULTIPLICAÇÃO DOS NUMEROS USANDO CLOSURE");
		int []array = List.of(3, 2, 5).stream().mapToInt(Integer:: intValue).toArray();
		System.out.println (multiply(array));
	}
		private static int multiply (int[]array) {
			return Arrays.stream(array).reduce((x,y)-> x*y).orElse(0);
		
	}
}

