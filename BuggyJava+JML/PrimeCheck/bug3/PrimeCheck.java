class PrimeCheck
{
   //@ public normal_behavior     
   //@ requires d != 0;
   // ensures \result == n%d; // This is time consuming
   // ensures 0 <= \result && \result < d;    
   //@ pure function
   public static int div(int n, int d) { return n%d; }


   //@ requires 1 < a && a <= Integer.MAX_VALUE;
   //@ ensures \result ==> (\forall int k; 1 < k && k <= a/2; div(a, k) != 0);
   //@ ensures \result == false ==> (\exists int k; 1 < k && k <= a/2; div(a,k) == 0); 
   public boolean Prime(int a)
   {	
	
	int i = 2;
	int mid = a/2;
	//@ assert mid == a/2;
	//@ ghost int maxnumber = Integer.MAX_VALUE;
	
	//@ maintaining 1 < i && i <= mid + 1;
	//@ maintaining 2 < i ==> \forall int k; 1 < k && k < i; div(a, k) != 0; 
	//@ decreases maxnumber - i;
	while (i > mid)//while (i <= mid)
	{
	   if (div(a,i) == 0)
		return false;
	   i++;
	}
	return true;
   }
}
