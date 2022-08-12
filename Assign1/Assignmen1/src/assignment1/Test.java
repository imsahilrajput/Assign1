package assignment1;
 class SingletonClass {
	private static SingletonClass single_instance = null;	  
    
    public String s; 
    
    private SingletonClass()
    {
        s = "Hello I am a string part of Singleton class";
    }
  
    // Static method
    // Static method to create instance of Singleton class
    public static SingletonClass getInstance()
    {
        if (single_instance == null)
            single_instance = new SingletonClass();
  
        return single_instance;
    }
 }
public class Test {
 	public static void main(String[] args) {
 		SingletonClass x = SingletonClass.getInstance();
 		  
         // Instantiating SingletonClass class with variable y
         SingletonClass y = SingletonClass.getInstance();
   
         // Instantiating SingletonClass class with variable z
         SingletonClass z = SingletonClass.getInstance();
   
         // Printing the hash code for above variable as
         // declared
         System.out.println("Hashcode of x is "
                            + x.hashCode());
         System.out.println("Hashcode of y is "
                            + y.hashCode());
         System.out.println("Hashcode of z is "
                            + z.hashCode());
   
         // Condition check
         if (x == y && y == z) {
   
             // Print statement
             System.out.println(
                 "Three objects point to the same memory location on the heap i.e, to the same object");
         }
   
         else {
             // Print statement
             System.out.println(
                 "Three objects DO NOT point to the same memory location on the heap");
         }
 	}

 }