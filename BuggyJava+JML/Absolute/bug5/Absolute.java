 public class Absolute{

	//@ requires 0 <= num && num <= Short.MAX_VALUE;
	//@ ensures \result == num;
	//@ ensures 0 <= \result && \result <= Short.MAX_VALUE;

	//@ also

	//@ requires  Short.MIN_VALUE < num && num < 0;
	//@ ensures \result == -num; 
	//@ ensures 0 <= \result && \result <= Short.MAX_VALUE;
	public /*@ pure @*/ short Absolute(short num) {
		if (0 <= num)
			return num;
		else
			return (short)-num;	
	}


	//@ requires 0 <= num && num <= Integer.MAX_VALUE;
	//@ ensures \result == num;
	//@ ensures 0 <= \result && \result <= Integer.MAX_VALUE;

	//@ also

	//@ requires Integer.MIN_VALUE < num && num < 0;
	//@ ensures \result == -num; 
	//@ ensures 0 <= \result && \result <= Integer.MAX_VALUE;
	public /*@ pure @*/ int Absolute(int num) {
		if (0 <= num)
			return num;
		else
			return -num;
	}


	//@ requires 0 <= num && num <= Long.MAX_VALUE;
	//@ ensures \result == num;
	//@ ensures 0 <= \result && \result <= Long.MAX_VALUE;

	//@ also

	//@ requires  Long.MIN_VALUE < num && num < 0;
	//@ ensures \result == -num; 
	//@ ensures 0 <= \result && \result <= Long.MAX_VALUE;
	public /*@ pure @*/ long Absolute(long num) {
		if (0 > num)//if (0 <= num)
			return num;
		else
			return -num;	
	}
}
