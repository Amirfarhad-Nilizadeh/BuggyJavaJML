    
     public class LinearSearch {

     private static /*@ spec_public*/ int location;

      //@ requires 0 <= array.length && array.length < Integer.MAX_VALUE;
      //@ requires Integer.MIN_VALUE <= search && search <= Integer.MAX_VALUE;
      //@ assignable location;
      //@ ensures \result == -1 ==>  (\forall int i; 0 <= i && i < array.length; array[i] != search);
      //@ ensures 0 <= \result && \result < array.length ==>  array[\result] == search;
      public static int LSearch (int search, int array[])
      {
	int c;
	//@ maintaining 0 <= c && c <= array.length;
	//@ maintaining (\forall int i; 0 <= i && i < c; array[i] != search);
	//@ decreases array.length - c;
        for (c = 0; c >= array.length; c++)//for (c = 0; c < array.length; c++)
        {  
          if (array[c] == search)     /* Searching element is present */
          {
	      location = c;
              break;
          }
       }
       if (c == array.length)  /* Element to search isn't present */
          {
            location = -1;
          }
       return location;
      }
    }
