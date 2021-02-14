package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         */ 
    	// 1) Builds a TreeSet containing Strings
    	//final Set<String> tree = new TreeSet<String>();
    	final var tree = new TreeSet<String>();
    	
        // 2) Populates such Collection with all the Strings ranging from "1" to "20"
    	for(int i = 1; i <= 20; i++) {
    		tree.add(Integer.toString(i));
    	}
    	
        // 3) Prints its content
    	System.out.println("Tree contains: " + tree);
    	
		// 4) Removes all those strings whose represented number is divisible by three
    	//Iterator<String> it = tree.iterator();
    	final var it = tree.iterator();
    	
    	while(it.hasNext()) {
    		if(Integer.parseInt(it.next()) % 3 == 0) {
    			it.remove();
    		}
    	}
    	
		// 5) Prints the content of the Set using a for-each costruct
    	System.out.print("Tree now contains: [ ");
    	for(final String s : tree) {
    		System.out.print(s + " ");
    	}
    	System.out.println("]");
    	
		// 6) Verifies if all the numbers left in the set are even
    	
    	/*it = tree.iterator();
    	boolean allEven = true;
    	
    	while(it.hasNext()) {
    		if(Integer.parseInt(it.next()) % 2 != 0) {
    			allEven = false;
    		}
    	}
    	
    	System.out.println("Numbers are all even: " + allEven);*/
    	
    	final var tree2 = new TreeSet<>();
    	for(int i = 2; i <= 20; i += 2) {
    		tree2.add(Integer.toString(i));
    	}
    	System.out.println("All even numbers: " + tree2);
    	System.out.println(tree2.containsAll(tree));  //false -> the numbers left are not all even
    	
    	
    	/*Prova
    	final Set<Integer> albero = new TreeSet<Integer>();
    	albero.add(1);
    	albero.add(2);
    	albero.add(3);
    	albero.add(4);
    	Iterator<Integer> iteratore = albero.iterator();
    	
    	for(int j : albero) {
    		albero.remove(j);   //NON FUNZIONA: al posto di albero si DEVE usare l'iteratore
    	}
    	
    	System.out.println(albero.toString()); */
    	
    }
}
