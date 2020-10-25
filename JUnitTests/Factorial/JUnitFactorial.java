
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitFactorial {

	@Test
	public void test() {
		Factorial a = new Factorial();
		assertEquals(1307674368000L, a.Facto(15));
	}

	@Test
	public void test1() {
		Factorial a = new Factorial();
		assertEquals(1, a.Facto(0));
	}

	@Test
	public void test2() {
		Factorial a = new Factorial();
		assertEquals(20922789888000L, a.Facto(16));
	}

	@Test
	public void test3() {
		Factorial a = new Factorial();
		assertEquals(1, a.Facto(1));
	}

	@Test
	public void test4() {
		Factorial a = new Factorial();
		assertEquals(362880, a.Facto(9));
	}

	@Test
	public void test5() {
		Factorial a = new Factorial();
		assertEquals(40320, a.Facto(8));
	}
}
