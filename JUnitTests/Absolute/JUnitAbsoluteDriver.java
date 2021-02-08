
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAbsoluteDriver {

	@Test
	public void test() {
		AbsoluteDriver a = new AbsoluteDriver((short)21608, 1769152617, 8295737305099236212L);
		a.driver();
		assertEquals(21608, a.sh);
		assertEquals(1769152617, a.i);
		assertEquals(8295737305099236212L, a.l);
	}

	@Test
	public void test1() {
		AbsoluteDriver a = new AbsoluteDriver((short)-24466, 1778327630, 7637939491528865384L);
		a.driver();
		assertEquals(24466, a.sh);
		assertEquals(1778327630, a.i);
		assertEquals(7637939491528865384L, a.l);
	}

	@Test
	public void test2() {
		AbsoluteDriver a = new AbsoluteDriver((short)21608, 65536, -37720810451273116L);
		a.driver();
		assertEquals(21608, a.sh);
		assertEquals(65536, a.i);
		assertEquals(37720810451273116L, a.l);
	}

	@Test
	public void test3() {
		AbsoluteDriver a = new AbsoluteDriver((short)-14385, -943208505, -7133701809754865664L);
		a.driver();
		assertEquals(14385, a.sh);
		assertEquals(943208505, a.i);
		assertEquals(7133701809754865664L, a.l);
	}

	@Test
	public void test4() {
		AbsoluteDriver a = new AbsoluteDriver((short)9784, 946479228, 8948124831981786216L);
		a.driver();
		assertEquals(9784, a.sh);
		assertEquals(946479228, a.i);
		assertEquals(8948124831981786216L, a.l);
	}

	@Test
	public void test5() {
		AbsoluteDriver a = new AbsoluteDriver((short)-1, 1778327630, 8948124835720986624L);
		a.driver();
		assertEquals(1, a.sh);
		assertEquals(1778327630, a.i);
		assertEquals(8948124835720986624L, a.l);
	}

	@Test
	public void test6() {
		AbsoluteDriver a = new AbsoluteDriver((short)-1025, -65536, 2365620470L);
		a.driver();
		assertEquals(1025, a.sh);
		assertEquals(65536, a.i);
		assertEquals(2365620470L, a.l);
	}

	@Test
	public void test7() {
		AbsoluteDriver a = new AbsoluteDriver((short)1569, 942546176, -68526615457431552L);
		a.driver();
		assertEquals(1569, a.sh);
		assertEquals(942546176, a.i);
		assertEquals(68526615457431552L, a.l);
	}

	@Test
	public void test8() {
		AbsoluteDriver a = new AbsoluteDriver((short)22359, 1462644270, 3323692071900508960L);
		a.driver();
		assertEquals(22359, a.sh);
		assertEquals(1462644270, a.i);
		assertEquals(3323692071900508960L, a.l);
	}

	@Test
	public void test9() {
		AbsoluteDriver a = new AbsoluteDriver((short)-20328, 1879179264, 3747030548542485280L);
		a.driver();
		assertEquals(20328, a.sh);
		assertEquals(1879179264, a.i);
		assertEquals(3747030548542485280L, a.l);
	}

	@Test
	public void test10() {
		AbsoluteDriver a = new AbsoluteDriver((short)22377, 1461748868, -8897841454311800822L);
		a.driver();
		assertEquals(22377, a.sh);
		assertEquals(1461748868, a.i);
		assertEquals(8897841454311800822L, a.l);
	}

	@Test
	public void test11() {
		AbsoluteDriver a = new AbsoluteDriver((short)19287, -947912589, 2305843009213693952L);
		a.driver();
		assertEquals(19287, a.sh);
		assertEquals(947912589, a.i);
		assertEquals(2305843009213693952L, a.l);
	}

	@Test
	public void test12() {
		AbsoluteDriver a = new AbsoluteDriver((short)9252, 725233454, 3198795307612205929L);
		a.driver();
		assertEquals(9252, a.sh);
		assertEquals(725233454, a.i);
		assertEquals(3198795307612205929L, a.l);
	}

	@Test
	public void test13() {
		AbsoluteDriver a = new AbsoluteDriver((short)-20232, 906035200, -648687250201545879L);
		a.driver();
		assertEquals(20232, a.sh);
		assertEquals(906035200, a.i);
		assertEquals(648687250201545879L, a.l);
	}

	@Test
	public void test14() {
		AbsoluteDriver a = new AbsoluteDriver((short)16768, -151, 8258019949147127807L);
		a.driver();
		assertEquals(16768, a.sh);
		assertEquals(151, a.i);
		assertEquals(8258019949147127807L, a.l);
	}

	@Test
	public void test15() {
		AbsoluteDriver a = new AbsoluteDriver((short)9766, 673785897, 2893980013439295520L);
		a.driver();
		assertEquals(9766, a.sh);
		assertEquals(673785897, a.i);
		assertEquals(2893980013439295520L, a.l);
	}

	@Test
	public void test16() {
		AbsoluteDriver a = new AbsoluteDriver((short)-20328, 444694913, -9114861777597660799L);
		a.driver();
		assertEquals(20328, a.sh);
		assertEquals(444694913, a.i);
		assertEquals(9114861777597660799L, a.l);
	}

	@Test
	public void test17() {
		AbsoluteDriver a = new AbsoluteDriver((short)9766, 673785897, 2893980013439295520L);
		a.driver();
		assertEquals(9766, a.sh);
		assertEquals(673785897, a.i);
		assertEquals(2893980013439295520L, a.l);
	}
}
