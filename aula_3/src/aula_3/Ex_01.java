package aula_3;

import java.util.HashSet;
import java.util.Set;

public class Ex_01 {
    public static void main(String[] args) {
    	
    	
    	
        HashSet<Integer> mySet = new HashSet<>();
        
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(4);
        mySet.add(5);
         
        
        
        System.out.println(mySet);
        
        mySet.remove(3);
        mySet.remove(2);
        System.out.println("hash_1:  "+mySet);
        
        HashSet<Integer> otherSet = new HashSet<>();
        
        otherSet.add(4);
        otherSet.add(5);
        otherSet.add(6);
        otherSet.add(7);
        
        System.out.println("hash_2:  " + otherSet);
        
        System.out.println("tamanho do hash_1:  " + mySet.size());
        System.out.println("tamanho do hash_2:  " + otherSet.size());
        
       // mySet.retainAll(otherSet);
        
        //System.out.println(mySet);
        
        mySet.addAll(otherSet);
        
        System.out.println("Adição de elementos: "+mySet);
        
        for(int i = 1; i <= 10; i++) {
        	if(mySet.contains(i)) {
        		System.out.println(i);
        		
        		
        	}
        	
        	
        }
        
        
        
    }
}

