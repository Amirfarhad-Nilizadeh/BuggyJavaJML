
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitEven {

	@Test
	public void test() {
		Even a = new Even();
		boolean result = a.isEven(1416128883);
		assertEquals(false, result);
	}

	@Test
	public void test1() {
		Even a = new Even();
		boolean result = a.isEven(135266304);
		assertEquals(true, result);
	}

	@Test
	public void test2() {
		Even a = new Even();
		boolean result = a.isEven(625493849);
		assertEquals(false, result);
	}

	@Test
	public void test3() {
		Even a = new Even();
		boolean result = a.isEven(134744072);
		assertEquals(true, result);
	}

	@Test
	public void test4() {
		Even a = new Even();
		boolean result = a.isEven(1936946035);
		assertEquals(false, result);
	}

	@Test
	public void test5() {
		Even a = new Even();
		boolean result = a.isEven(2116110922);
		assertEquals(true, result);
	}

	@Test
	public void test6() {
		Even a = new Even();
		boolean result = a.isEven(-1761779229);
		assertEquals(false, result);
	}

	@Test
	public void test7() {
		Even a = new Even();
		boolean result = a.isEven(694035770);
		assertEquals(true, result);
	}

	@Test
	public void test8() {
		Even a = new Even();
		boolean result = a.isEven(1130915187);
		assertEquals(false, result);
	}

	@Test
	public void test9() {
		Even a = new Even();
		boolean result = a.isEven(-1332141778);
		assertEquals(true, result);
	}

}
