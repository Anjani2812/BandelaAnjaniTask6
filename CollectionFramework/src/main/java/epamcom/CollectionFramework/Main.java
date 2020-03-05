package epamcom.CollectionFramework;

public class Main {
	 public static void main(String[] args) 
	    {
	        Data<Integer> value = new Data();
	 

	        value.add(1);
	        value.add(2);
	        value.add(3);
	        value.add(4);
	        value.add(5);
	        value.add(7);
	        value.add(10);
	        value.add(6);
	        value.add(9);
	        value.add(11);
	        System.out.println(value);
	         
	        
	        value.remove(2);
	        System.out.println(value);
	        value.remove(7);
	        System.out.println(value);
	      
	        System.out.println( value.get(0) );
	        System.out.println( value.get(1) );
	        System.out.println(value.get(3)); 
	      
	        System.out.println(value.size());
	    }
}


