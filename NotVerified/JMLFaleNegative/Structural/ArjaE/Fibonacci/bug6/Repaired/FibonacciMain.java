import java.util.Scanner;

public class FibonacciMain{
	public static void main(String[] argv){

		try {
			int size;
		
			Scanner input = new Scanner(System.in);
        		System.out.print("Enter the size:");
			size = input.nextInt();
			System.out.println(" Before Constructor! ");

			Fibonacci f = new Fibonacci(size);
		
        		System.out.println("Constructor! ");
			f.fibCompute();
			for(int i = 0; i < size; i++)
            			System.out.println(f.getFib(i) + " is alue of fib for " + i +" Fibonacci.");
       	        	
		} catch (Exception e){
			e.printStackTrace();
			System.err.println(e);
			return;
		}
	}
}

