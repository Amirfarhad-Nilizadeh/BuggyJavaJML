
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitLCM {

	@Test
	public void test() {
		LCM a = new LCM();
		assertEquals(192441312, a.lcm(8883, 21664));
	}

	@Test
	public void test1() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(14272, 0));
	}

	@Test
	public void test2() {
		LCM a = new LCM();
		assertEquals(819324174, a.lcm(30707, 26682));
	}

	@Test
	public void test3() {
		LCM a = new LCM();
		assertEquals(761896320, a.lcm(25329, -30080));
	}

	@Test
	public void test4() {
		LCM a = new LCM();
		assertEquals(7416036, a.lcm(-15228, -17532));
	}

	@Test
	public void test5() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(152076287, 2320));
	}

	@Test
	public void test6() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, 0));
	}

	@Test
	public void test7() {
		LCM a = new LCM();
		assertEquals(757366056, a.lcm(26856, 28201));
	}

	@Test
	public void test8() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(21824, 0));
	}

	@Test
	public void test9() {
		LCM a = new LCM();
		assertEquals(12419946, a.lcm(38934, 20097));
	}

	@Test
	public void test10() {
		LCM a = new LCM();
		assertEquals(492654342, a.lcm(-21377, -23046));
	}

	@Test
	public void test11() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(974744168, 1853188201));
	}

	@Test
	public void test12() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, -36032));
	}

	@Test
	public void test13() {
		LCM a = new LCM();
		assertEquals(589554324, a.lcm(38538, 30596));
	}

	@Test
	public void test14() {
		LCM a = new LCM();
		assertEquals(100124100, a.lcm(-8100, -37083));
	}

	@Test
	public void test15() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(978078464, 32580));
	}

	@Test
	public void test16() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-768, 0));
	}

	@Test
	public void test17() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, 16628));
	}
	
	@Test
	public void test18() {
		LCM a = new LCM();
		assertEquals(1188494430, a.lcm(38595, 30794));
	}

	@Test
	public void test19() {
		LCM a = new LCM();
		assertEquals(703, a.lcm(-703, -703));
	}

	@Test
	public void test20() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-512, 0));
	}

	@Test
	public void test21() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(1214535755, 1180190792));
	}

	@Test
	public void test22() {
		LCM a = new LCM();
		assertEquals(250567538, a.lcm(11122, 22529));
	}

	@Test
	public void test23() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(-32062, 0));
	}
	
	@Test
	public void test24() {
		LCM a = new LCM();
		assertEquals(71670144, a.lcm(37504, 3822));
	}

	@Test
	public void test25() {
		LCM a = new LCM();
		assertEquals(33010096, a.lcm(11122, -5936));
	}

	@Test
	public void test26() {
		LCM a = new LCM();
		assertEquals(3571125, a.lcm(-321, -33375));
	}

	@Test
	public void test27() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(953212112, -791621438));
	}

	@Test
	public void test28() {
		LCM a = new LCM();
		assertEquals(-1, a.lcm(0, -24494));
	}
}
