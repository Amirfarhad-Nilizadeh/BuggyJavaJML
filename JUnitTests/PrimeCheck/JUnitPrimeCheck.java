
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPrimeCheck {

	@Test
	public void test() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(false, a.Prime(1416128883));
	}

	@Test
	public void test1() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(true, a.Prime(13883));
	}

	@Test
	public void test2() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(false, a.Prime(707144230));
	}

	@Test
	public void test3() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(false, a.Prime(712143369));
	}


	@Test
	public void test4() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(true, a.Prime(1126563961));
	}

	@Test
	public void test5() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(false, a.Prime(1596797566));
	}


	@Test
	public void test6() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(true, a.Prime(1596732019));
	}

	@Test
	public void test7() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(false, a.Prime(845164150));
	}

	@Test
	public void test8() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(false, a.Prime(554259599));
	}


	@Test
	public void test9() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(true, a.Prime(1043498377));
	}

	@Test
	public void test10() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(false, a.Prime(1498771831));
	}


	@Test
	public void test11() {
		PrimeCheck a = new PrimeCheck();
		assertEquals(true, a.Prime(1498808183));
	}
}
