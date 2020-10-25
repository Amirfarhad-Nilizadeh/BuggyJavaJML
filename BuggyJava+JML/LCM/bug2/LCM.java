
public class LCM {

        //@ public normal_behavior     
        //@ requires d != 0;
	//@ ensures \result == n%d;        // this post condition is time consuming.
        //@ pure function
        public static int div(int n, int d) { return n%d; }

  //@ requires Integer.MIN_VALUE < num1 && num1 <= Integer.MAX_VALUE;
  //@ requires Integer.MIN_VALUE < num2 && num2 <= Integer.MAX_VALUE;
  //@ {|
    //@ requires num1 != 0 && num2 != 0;
    //@ old int pNum1 = (num1 > 0) ? num1 : -num1;
    //@ old int pNum2 = (num2 > 0) ? num2 : -num2;
    //@ old int max = (pNum1 > pNum2) ? pNum1 : pNum2;
    //@ ensures \result == -1 || 0 < \result; 
    //@ ensures 0 < \result ==> (div(\result, pNum2) == 0 && div(\result, pNum2) == 0);
    //@ ensures 0 < \result ==> (\forall int i; max <= i && i < \result; div(i, pNum1) == 0 ==> div(i, pNum2) != 0);
    //@ ensures \result == -1 ==> (\forall int k; max <= k && k <= Integer.MAX_VALUE; div(k, pNum1) == 0 ==> div(k, pNum2) != 0); 

    //@ also

    //@ requires num1 == 0 || num2 == 0;
    //@ ensures \result == -1;
  //@ |}
    public int LCMCalculating(int num1, int num2) {

	if (num1 != 0 || num2 == 0){//if(num1 == 0 || num2 == 0){
		//Inputs cannot be zero.
		return -1;
	}	
	//@ assert num1 != 0 && num2 != 0;

	if (num1 < 0)
		num1 = -num1;
	if (num2 < 0)
		num2 = -num2;
	//@ assert 0 < num1 && 0 < num2;

        int lcm = (num1 > num2) ? num1 : num2;
	
	//@ ghost int check = lcm; 

	//@ maintaining num1 <= lcm && num2 <= lcm && lcm <= Integer.MAX_VALUE;
	//@ maintaining (\forall int k; check <= k && k < lcm; div(k, num1) == 0 ==> div(k, num2) != 0);
	//@ decreases Integer.MAX_VALUE - lcm;
        while (lcm < Integer.MAX_VALUE)
        {
            if (div(lcm, num1) == 0 && div(lcm, num2) == 0)
            {
                break;
            }
            lcm++;
        }
	
	if (div(lcm, num1) == 0 && div(lcm, num2) == 0) {
		//@ assert div(lcm, num1) == 0 && div(lcm, num2) == 0;
		return lcm;
	}
	//LCM is greater than Max Integer Number.
	return -1;
    }
}
