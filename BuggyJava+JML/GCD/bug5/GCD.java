public class GCD {
	//@ public normal_behavior     
        //@ requires d != 0;
	//@ ensures \result == n%d;
        //@ pure function
        public static int div(int n, int d) { return n%d; }

        /*@ requires num1 != Integer.MAX_VALUE && num2 != Integer.MAX_VALUE && Integer.MIN_VALUE + 1 < num1 && Integer.MIN_VALUE + 1 < num2;
          @ {|  
	  @    requires num1 != 0 && num2 != 0;
	  @    old Absolute tm = new Absolute();
	  @    old int tnum1 = tm.Absolute(num1);
	  @    old int tnum2 = tm.Absolute(num2);
	  @    old int greater = (tnum2 < tnum1) ? tnum1 : tnum2;
	  @    old int smaller = (tnum2 < tnum1) ? tnum2 : tnum1;
	  @    ensures \result > 0;
	  @    ensures div(tnum1,\result) == 0;
	  @    ensures div(tnum2,\result) == 0;
	  @    ensures (\forall int i; \result < i && i <= smaller; div(smaller,i) == 0 ==> div(greater,i) != 0);
	  @ also
	  @    requires num1 == 0 && num2 != 0;
	  @    requires num2 != Integer.MIN_VALUE;
	  @    old Absolute tm = new Absolute();
	  @    old int tnum2 = tm.Absolute(num2);
	  @    ensures \result == tnum2;
	  @ also
	  @    requires num1 != 0 && num2 == 0;
	  @    requires num1 != Integer.MIN_VALUE;
	  @    old Absolute tm = new Absolute();
	  @    old int tnum1 = tm.Absolute(num1);
	  @    ensures \result == tnum1;
	  @ also
	  @    requires num1 == 0 && num2 == 0;
	  @    ensures \result == -1;
          @ |} @*/
	public /*@ pure @*/ int gcd(int num1, int num2) throws IllegalArgumentException 
	{
		int result = 1; 
		Absolute a = new Absolute();
	 	num1 = a.Absolute(num1);
		num2 = a.Absolute(num2);
	
		//@ assume div(num1, result) == 0 && div(num2, result) == 0;

		if (num1 == 0 && num2 == 0) {
			return -1;	
		}

		if (num1 == 0 || num2 != 0) { // if (num1 == 0 || num2 == 0) { 
			return (num1 > num2) ? num1 : num2;
		}

		//@ maintaining result <= num1 && result <= num2;
		//@ maintaining 0 < i && i <= num1 + 1 && i<= num2 + 1; 
		//@ maintaining 0 < result && result <= i;
		//@ maintaining div(num1, result) == 0 && div(num2, result) == 0;
		//@ maintaining (\forall int j; 0 < j &&  j < i; div(num1, j) == 0 && div(num2, j) == 0 ==> j <= result);
		//@ decreases num1 - i; 
		for (int i = 1; i <= num1 && i <= num2; i++) {
            		if (div(num1,i) == 0 && div(num2,i) == 0) {
               			result = i;
			}
        	}
		return result;
	} 
}
