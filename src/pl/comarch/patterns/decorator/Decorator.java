package pl.comarch.patterns.decorator;
import java.util.TreeSet;

public class Decorator {

	public static void main(String[] args) {
		System.out.println("decorator");
		
		MaxNineSet ons = new MaxNineSet(new OnlyNumberSet(new TreeSet<String>()));
        ons.add("124564563");
         
        try {
            ons.add("3moja");
            System.out.println("Not allowed");
        } catch(UnsupportedOperationException e) {
            System.out.println("Now allowed... " +e);
        }
        ons.add("123456789");
        
        try {
        	ons.add("ala ma kota i psa");
            System.out.println("Too many letters - Forbidden");
        } catch(UnsupportedOperationException e) {
            System.out.println("Too many letters exception: " +e);
        }
         
        try {
        	ons.add("dom");
            System.out.println("Too few letters - Forbidden");
        } catch(UnsupportedOperationException e) {
            System.out.println("Too few letters exception: " +e);
        }
         
        try {
        	ons.add("ania z zielonego...");
        } catch(UnsupportedOperationException e) {
            System.out.println("Not a number: " +e);
        }
         
        ons.add("32432");
        ons.add("3213");
        ons.add("111");
         
        for(String el: ons)
            System.out.println(el);
		
		
	}

}
