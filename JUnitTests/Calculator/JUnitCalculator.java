
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitCalculator {

	@Test
	public void test() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(1416128883, 543781664,')'));
	}
	
	@Test
	public void test1() {
		Calculator a = new Calculator();
		assertEquals(983040, a.calculate(8323072, 7340032,'%'));
	}

	@Test
	public void test2() {
		Calculator a = new Calculator();
		assertEquals(1, a.calculate(1164461381, 1162167621,'/'));
	}

	@Test
	public void test3() {
		Calculator a = new Calculator();
		assertEquals(-268168653, a.calculate(1416198753, 1684367406,'-'));
	}

	@Test
	public void test4() {
		Calculator a = new Calculator();
		assertEquals(1426512531, a.calculate(1418094451, 8418080,'+'));
	}

	@Test
	public void test5() {
		Calculator a = new Calculator();
		assertEquals(3276800, a.calculate(32768, 100,'*'));
	}

	@Test
	public void test6() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(574245986, 2037085798,'/'));
	}
	
	@Test
	public void test7() {
		Calculator a = new Calculator();
		assertEquals(-128, a.calculate(-128, 1265434624,'%'));
	}

	@Test
	public void test8() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(574245986, 542401907,','));
	}

	@Test
	public void test9() {
		Calculator a = new Calculator();
		assertEquals(-161512244, a.calculate(-550146841, -388634597,'-'));
	}

	@Test
	public void test10() {
		Calculator a = new Calculator();
		assertEquals(1066768008, a.calculate(488776226, 577991782,'+'));
	}

	@Test
	public void test11() {
		Calculator a = new Calculator();
		assertEquals(-436142080, a.calculate(-65536, 6655,'*'));
	}

	@Test
	public void test12() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(1026830645, 724842553,')'));
	}
	
	@Test
	public void test13() {
		Calculator a = new Calculator();
		assertEquals(1, a.calculate(543236196, 542009674,'/'));
	}

	@Test
	public void test14() {
		Calculator a = new Calculator();
		assertEquals(557004822, a.calculate(557068544, 63722,'-'));
	}

	@Test
	public void test15() {
		Calculator a = new Calculator();
		assertEquals(301988092, a.calculate(1026830645, 724842553,'%'));
	}

	@Test
	public void test16() {
		Calculator a = new Calculator();
		assertEquals(822877984, a.calculate(774766592, 48111392,'+'));
	}

	@Test
	public void test17() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(-1334566785, 0,'*'));
	}

	@Test
	public void test18() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(707406378, 707406378,'-'));
	}
	
	@Test
	public void test19() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(707406388, -128,'&'));
	}

	@Test
	public void test20() {
		Calculator a = new Calculator();
		assertEquals(1419269204, a.calculate(707537450, 711731754,'+'));
	}

	@Test
	public void test21() {
		Calculator a = new Calculator();
		assertEquals(707406378, a.calculate(707406378, 885508039,'%'));
	}

	@Test
	public void test22() {
		Calculator a = new Calculator();
		assertEquals(0, a.calculate(1228609314, -1876272130,'/'));
	}

	@Test
	public void test23() {
		Calculator a = new Calculator();
		assertEquals(1414921728, a.calculate(707460864, 2,'*'));
	}

	@Test
	public void test24() {
		Calculator a = new Calculator();
		assertEquals(-1, a.calculate(1097689458, 1717662312,')'));
	}
	
	@Test
	public void test25() {
		Calculator a = new Calculator();
		assertEquals(1097689458, a.calculate(1097689458, 1717662312,'%'));
	}

	@Test
	public void test26() {
		Calculator a = new Calculator();
		assertEquals(-202579728, a.calculate(1919312128, 2121891856,'-'));
	}

	@Test
	public void test27() {
		Calculator a = new Calculator();
		assertEquals(2, a.calculate(1097689449, 541223276,'/'));
	}

	@Test
	public void test28() {
		Calculator a = new Calculator();
		assertEquals(1632698498, a.calculate(1092616320, 540082178,'+'));
	}

	@Test
	public void test29() {
		Calculator a = new Calculator();
		assertEquals(-548496, a.calculate(-26, 21096,'*'));
	}
}
