
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitGCDCalculator {

	@Test
	public void test() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(839516160, a.GCD(839516160, 0));
	}

	@Test
	public void test1() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(2, a.GCD(1912602640, 1198682738));
	}

	@Test
	public void test2() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(67108864, a.GCD(-67108864, 0));
	}

	@Test
	public void test3() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(1, a.GCD(1769473, 301793282));
	}

	@Test
	public void test4() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(360, a.GCD(2075703480, -1649035080));
	}

	@Test
	public void test5() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(-1, a.GCD(0, 0));
	}

	@Test
	public void test6() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(2129664, a.GCD(2129664, 0));
	}

	@Test
	public void test7() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(1, a.GCD(1416128883, 543781664));
	}

	@Test
	public void test8() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(2, a.GCD(-1338093054, -117440750));
	}

	@Test
	public void test9() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(4, a.GCD(828448852, 1702038120));
	}

	@Test
	public void test10() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(1291845632, a.GCD(1291845632, 0));
	}

	@Test
	public void test11() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(16777216, a.GCD(0, -16777216));
	}

	@Test
	public void test12() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(1, a.GCD(643704100, 591405353));
	}

	@Test
	public void test13() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(3, a.GCD(-927229341, 696188928));
	}

	@Test
	public void test14() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(14286848, a.GCD(-14286848, 0));
	}

	@Test
	public void test15() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(1, a.GCD(-458753, -268632065));
	}

	@Test
	public void test16() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(9, a.GCD(828864117, 1801663029));
	}

	@Test
	public void test17() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(1331162622, a.GCD(-1331162622, 0));
	}

	@Test
	public void test18() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(256, a.GCD(545197056, 2116352));
	}

	@Test
	public void test19() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(1, a.GCD(828864128, -129));
	}

	@Test
	public void test20() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(1, a.GCD(1650813282, 1718970677));
	}

	@Test
	public void test21() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(1, a.GCD(-1340517886, 1053991));
	}

	@Test
	public void test22() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(4, a.GCD(-993737532, -993770300));
	}

	@Test
	public void test23() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(2130706432, a.GCD(2130706432, 0));
	}

	@Test
	public void test24() {
		GCDCalculator a = new GCDCalculator();
		assertEquals(9633728, a.GCD(0, -9633728));
	}
}
