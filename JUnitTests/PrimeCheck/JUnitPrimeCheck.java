
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPrimeCheck {

	@Test
	public void test() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(false, p.isPrime(1416128883));
	}

	@Test
	public void test1() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(true, p.isPrime(13883));
	}

	@Test
	public void test2() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(false, p.isPrime(707144230));
	}

	@Test
	public void test3() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(false, p.isPrime(712143369));
	}


	@Test
	public void test4() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(true, p.isPrime(1126563961));
	}

	@Test
	public void test5() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(false, p.isPrime(1596797566));
	}


	@Test
	public void test6() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(true, p.isPrime(1596732019));
	}

	@Test
	public void test7() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(false, p.isPrime(845164150));
	}

	@Test
	public void test8() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(false, p.isPrime(554259599));
	}


	@Test
	public void test9() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(true, p.isPrime(1043498377));
	}

	@Test
	public void test10() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(false, p.isPrime(1498771831));
	}


	@Test
	public void test11() {
		PrimeCheck p = new PrimeCheck();
		assertEquals(true, p.isPrime(1498808183));
	}
}
