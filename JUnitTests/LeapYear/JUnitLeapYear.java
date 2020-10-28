
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitLeapYear {

	@Test
	public void test() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (1416128883));
	}

	@Test
	public void test1() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (1694498816));
	}

	@Test
	public void test2() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (100659200));
	}

	@Test
	public void test3() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (2106384300));
	}

	@Test
	public void test4() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (1579559530));
	}

	@Test
	public void test5() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (1056964608));
	}

	@Test
	public void test6() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (1677721600));
	}

	@Test
	public void test7() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (739513900));
	}

	@Test
	public void test8() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (724249387));
	}

	@Test
	public void test9() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (654311424));
	}


	@Test
	public void test10() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (165670400));
	}

	@Test
	public void test11() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (2147420100));
	}

	@Test
	public void test12() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (742145596));
	}

	@Test
	public void test13() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (742145605));
	}


	@Test
	public void test14() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (100659200));
	}

	@Test
	public void test15() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (572654100));
	}

	@Test
	public void test16() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (1515733846));
	}

	@Test
	public void test17() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (1514423364));
	}


	@Test
	public void test18() {
		LeapYear year = new LeapYear();
		assertEquals(true, year.isLeapYear (4198400));
	}

	@Test
	public void test19() {
		LeapYear year = new LeapYear();
		assertEquals(false, year.isLeapYear (1514423300));
	}
}
