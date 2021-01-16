
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitOddEven{

	@Test
	public void test() {
		OddEven a = new OddEven();
		boolean result = a.isEven(1416128883);
		assertEquals(false, result);
		result = a.isOdd(1416128883);
		assertEquals(true, result);
	}

	@Test
	public void test1() {
		OddEven a = new OddEven();
		boolean result = a.isEven(135266304);
		assertEquals(true, result);
		result = a.isOdd(135266304);
		assertEquals(false, result);
	}

	@Test
	public void test2() {
		OddEven a = new OddEven();
		boolean result = a.isEven(625493849);
		assertEquals(false, result);
		result = a.isOdd(625493849);
		assertEquals(true, result);
	}

	@Test
	public void test3() {
		OddEven a = new OddEven();
		boolean result = a.isEven(134744072);
		assertEquals(true, result);
		result = a.isOdd(134744072);
		assertEquals(false, result);
	}

	@Test
	public void test4() {
		OddEven a = new OddEven();
		boolean result = a.isEven(1936946035);
		assertEquals(false, result);
		result = a.isOdd(1936946035);
		assertEquals(true, result);
	}

	@Test
	public void test5() {
		OddEven a = new OddEven();
		boolean result = a.isEven(2116110922);
		assertEquals(true, result);
		result = a.isOdd(2116110922);
		assertEquals(false, result);
	}

	@Test
	public void test6() {
		OddEven a = new OddEven();
		boolean result = a.isEven(-1761779229);
		assertEquals(false, result);
		result = a.isOdd(-1761779229);
		assertEquals(true, result);
	}

	@Test
	public void test7() {
		OddEven a = new OddEven();
		boolean result = a.isEven(694035770);
		assertEquals(true, result);
		result = a.isOdd(694035770);
		assertEquals(false, result);
	}

	@Test
	public void test8() {
		OddEven a = new OddEven();
		boolean result = a.isEven(1130915187);
		assertEquals(false, result);
		result = a.isOdd(1130915187);
		assertEquals(true, result);
	}

	@Test
	public void test9() {
		OddEven a = new OddEven();
		boolean result = a.isEven(-1332141778);
		assertEquals(true, result);
		result = a.isOdd(-1332141778);
		assertEquals(false, result);
	}

}
