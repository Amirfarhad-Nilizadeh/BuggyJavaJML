
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitFibonacci {

	@Test
	public void test() {
		Fibonacci a = new Fibonacci();
		a.fibCompute();
		assertEquals(1, a.getFib(1));
		assertEquals(0, a.getFib(0));
	}

	@Test
	public void test1() {
		Fibonacci a = new Fibonacci(89);
		a.fibCompute();
		assertEquals(1100087778366101931L, a.getFib(88));
	}

	@Test
	public void test2() {
		Fibonacci a = new Fibonacci(6);
		a.fibCompute();
		assertEquals(5, a.getFib(5));
	}

	@Test
	public void test3() {
		Fibonacci a = new Fibonacci(60);
		a.fibCompute();
		assertEquals(956722026041L, a.getFib(59));
	}

	@Test
	public void test4() {
		Fibonacci a = new Fibonacci(30);
		a.fibCompute();
		assertEquals(514229, a.getFib(29));
	}

	@Test
	public void test5() {
		Fibonacci a = new Fibonacci(11);
		a.fibCompute();
		assertEquals(55, a.getFib(10));
	}
}
