
   public class SwapNumbers
    {
        //@ requires 0 <= x && x < array.length && 0 <= y && y < array.length; 
	//@ requires 0 <= array.length && array.length <= Integer.MAX_VALUE;  
	//@ assignable array[x], array[y];
	//@ ensures \old(array[x]) == array[y] && \old(array[y]) == array[x];
	//@ ensures array.length == \old(array.length);
	public void swapArray(int x, int y,  int array[]) {
	  int temp;     
          temp = array[x];
          array[x] = array[y];
          array[y] = temp;
       }
    }
