public class TestFactorial {
       public static void main(String[] args) {
        try {
           if (Factorial.compute(5) != 120) {
    System.err.println("Test failed for input 5");
 
}

if (Factorial.compute(0) != 1) {
    System.err.println("Test failed for input 0");
    
}
	  
            System.out.println("All tests passed.");
        } catch (Exception e) {
            System.err.println("Test failed ");
            
        }
    }
}