package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {


		Set<String> set = new HashSet<String>(); // usado para conjunto   nao mantem a ordem HasSet
		
		Set<String> linset = new LinkedHashSet<>();
		
		Set<String> treeset = new TreeSet<>();
		
		

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		
		set.remove("TV"); // removeu a tv
		
		
		linset.add("TV");
		linset.add("Notebook");
		linset.add("Tablet");
		
	   linset.removeIf(x-> x.length() >=3); //removeu linset todo.
		
		treeset.add("TV");
		treeset.add("Notebook");
		treeset.add("Tablet");
		
		
		treeset.removeIf(x-> x.charAt(0) == 'T');  // remove tudo comecado com T

		System.out.println(set.contains("Notebook"));//ve se existe no conjunto...

		for (String p : set) {
			System.out.println(p);
		}
		
		for (String c : linset) {
			System.out.println(c);
		}
		
		for (String tr : treeset) {
			System.out.println(tr);
		}

	}

}
