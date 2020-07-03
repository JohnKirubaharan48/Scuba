
package com.dataStructures;

 


import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

 

public class SetExample {

 

    public static void main(String[] args) {
        Set<String> set = new HashSet();//Hashing
        //Set<String> set = new TreeSet();//Sorted
        //Set<String> set = new LinkedHashSet<>();//Insertion Order

 

        set.add("Maveric");
        set.add("CTS");
        set.add("Wipro");
        set.add("CapeGemini");
        set.add("Wipro");
        set.add(null);
        set.add(null);
         System.out.println(set);
        System.out.println(set.size());
        
        //
        // System.out.println();
        // //Interface //traversing the set using hasNext and next
        /*Iterator<String> itr = set.iterator();
        //
        // System.out.println("********************* set using Iterator***********");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
    }
}