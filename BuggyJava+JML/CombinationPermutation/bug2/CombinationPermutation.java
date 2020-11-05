public class CombinationPermutation {
	//@ requires 0 <= n && n <= 20 && 0 <= r && r <= 20 && 0 <= (n-r) && (n-r) <= 20 ;
	//@ old Factorial fac_spec = new Factorial();
	//@ ensures \result == fac_spec.spec_factorial(n)/(fac_spec.spec_factorial(r) * fac_spec.spec_factorial(n-r));
        private /* pure @*/ long combination(int n, int r) {
		Factorial fac = new Factorial();
		long combin;
		combin = fac.factorial(n) / (fac.factorial(r) / fac.factorial(n-r)); //combin = fac.factorial(n) / (fac.factorial(r) * fac.factorial(n-r));
		return combin;
	}

	//@ requires 0 <= n && n <= 20 && 0 <= (n-r) && (n-r) <= 20 ;
	//@ old Factorial fac_spec = new Factorial();
	//@ ensures \result == fac_spec.spec_factorial(n)/fac_spec.spec_factorial(n-r);
	private /* pure @*/ long permutation(int n, int r) {
		Factorial fac = new Factorial();
		long permut;
		permut = fac.factorial(n) / fac.factorial(n-r);
		return permut;
	}

	/*@ 	requires flag;
	  @ 	requires 0 <= n && n <= 20 && 0 <= r && r <= 20 && 0 <= (n-r) && (n-r) <= 20 ;
	  @	old Factorial fac_spec = new Factorial();
	  @ 	ensures \result == fac_spec.spec_factorial(n)/(fac_spec.spec_factorial(r) * fac_spec.spec_factorial(n-r));
	  @ also
	  @	 requires !flag;
	  @	 requires 0 <= n && n <= 20 && 0 <= (n-r) && (n-r) <= 20;
	  @	 old Factorial fac_spec = new Factorial();
	  @	 ensures \result == fac_spec.spec_factorial(n)/fac_spec.spec_factorial(n-r); @*/
	public /* pure @*/ long select(int n, int r, boolean flag) {
		return flag ? combination(n, r) : permutation(n, r);
	}
}

