
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitOddOrEven {

	@Test
	public void test() {
		OddOrEven a = new OddOrEven();
		boolean result = a.Even(1416128883);
		assertEquals(false, result);
	}

	@Test
	public void test1() {
		OddOrEven a = new OddOrEven();
		boolean result = a.Even(135266304);
		assertEquals(true, result);
	}

	@Test
	public void test2() {
		OddOrEven a = new OddOrEven();
		boolean result = a.Even(625493849);
		assertEquals(false, result);
	}

	@Test
	public void test3() {
		OddOrEven a = new OddOrEven();
		boolean result = a.Even(134744072);
		assertEquals(true, result);
	}

	@Test
	public void test4() {
		OddOrEven a = new OddOrEven();
		boolean result = a.Even(1936946035);
		assertEquals(false, result);
	}

	@Test
	public void test5() {
		OddOrEven a = new OddOrEven();
		boolean result = a.Even(2116110922);
		assertEquals(true, result);
	}

	@Test
	public void test6() {
		OddOrEven a = new OddOrEven();
		boolean result = a.Even(-1761779229);
		assertEquals(false, result);
	}

	@Test
	public void test7() {
		OddOrEven a = new OddOrEven();
		boolean result = a.Even(694035770);
		assertEquals(true, result);
	}

	@Test
	public void test8() {
		OddOrEven a = new OddOrEven();
		boolean result = a.Even(1130915187);
		assertEquals(false, result);
	}

	@Test
	public void test9() {
		OddOrEven a = new OddOrEven();
		boolean result = a.Even(-1332141778);
		assertEquals(true, result);
	}

}
