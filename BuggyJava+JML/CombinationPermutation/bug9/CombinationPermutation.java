public class CombinationPermutation {
	//@ requires 0 <= n && n <= 20 && 0 <= r && r <= 20 && 0 <= (n-r) && (n-r) <= 20 ;
	//@ old Factorial fac_spec = new Factorial();
	//@ ensures \result == fac_spec.spec_factorial(n)/(fac_spec.spec_factorial(r) * fac_spec.spec_factorial(n-r));
        /*@ spec_public @*/ private long Combination (int n, int r) {
		Factorial fac = new Factorial();
		long combin;
		combin = fac.Facto(n) / (fac.Facto(r) * fac.Facto(n-r));
		return combin;
	}

	//@ requires 0 <= n && n <= 20 && 0 <= (n-r) && (n-r) <= 20 ;
	//@ old Factorial fac_spec = new Factorial();
	//@ ensures \result == fac_spec.spec_factorial(n)/fac_spec.spec_factorial(n-r);
	/*@ spec_public @*/ private long Permutation (int n, int r) {
		Factorial fac = new Factorial();
		long permut;
		permut = fac.Facto(n) / fac.Facto(n-r);
		return permut;
	}

	//@ old Factorial fac_spec = new Factorial();
	//@ {|
	//@ requires flag;
	//@ requires 0 <= n && n <= 20 && 0 <= r && r <= 20 && 0 <= (n-r) && (n-r) <= 20 ;
	//@ ensures \result == fac_spec.spec_factorial(n)/(fac_spec.spec_factorial(r) * fac_spec.spec_factorial(n-r));

	//@ also

	//@ requires !flag;
	//@ requires 0 <= n && n <= 20 && 0 <= (n-r) && (n-r) <= 20;
	//@ ensures \result == fac_spec.spec_factorial(n)/fac_spec.spec_factorial(n-r);
	//@ |}
	public long select (int n, int r, boolean flag) {
		return (flag ? Combination (n, r) : Permutation (n, r))+1;//return flag ? Combination (n, r) : Permutation (n, r);
	}
}

