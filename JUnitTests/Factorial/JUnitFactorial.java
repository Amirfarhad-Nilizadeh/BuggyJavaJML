
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitFactorial {

	@Test
	public void test() {
		Factorial f = new Factorial();
		assertEquals(1307674368000L, f.factorial(15));
	}

	@Test
	public void test1() {
		Factorial f = new Factorial();
		assertEquals(1, f.factorial(0));
	}

	@Test
	public void test2() {
		Factorial f = new Factorial();
		assertEquals(20922789888000L, f.factorial(16));
	}

	@Test
	public void test3() {
		Factorial f = new Factorial();
		assertEquals(1, f.factorial(1));
	}

	@Test
	public void test4() {
		Factorial f = new Factorial();
		assertEquals(362880, f.factorial(9));
	}

	@Test
	public void test5() {
		Factorial f = new Factorial();
		assertEquals(40320, f.factorial(8));
	}
}
