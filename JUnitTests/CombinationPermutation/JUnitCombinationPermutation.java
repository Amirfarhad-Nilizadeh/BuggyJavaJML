import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitCombinationPermutation {

	@Test
	public void test() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(20,4,true) == 4845);
	}

	@Test
	public void test1() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(4,4,true) == 1);
	}	

	@Test
	public void test2() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(13,0,true) == 1);
	}	

	@Test
	public void test3() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(20,0,false) == 1);
	}

	@Test
	public void test4() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(0,0,false) == 1);
	}

	@Test
	public void test5() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(17,1,true) == 17);
	}	

	@Test
	public void test6() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(18,18,true) == 1);
	}	

	@Test
	public void test7() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(1,0,true) == 1);
	}

	@Test
	public void test8() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(8,8,false) == 40320);
	}	

	@Test
	public void test9() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(14,14,true) == 1);
	}	
	
	@Test
	public void test10() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(17,3,true) == 680);
	}	

	@Test
	public void test11() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(19,0,true) == 1);
	}

	@Test
	public void test12() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(3,1,false) == 3);
	}	

	@Test
	public void test13() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(16,14,true) == 120);
	}	

	@Test
	public void test14() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(5,0,true) == 1);
	}	

	@Test
	public void test15() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(11,0,false) == 1);
	}	

	@Test
	public void test16() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(1,1,false) == 1);
	}	

	@Test
	public void test17() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(3,3,true) == 1);
	}

	@Test
	public void test18() {
		CombinationPermutation a = new CombinationPermutation();	
		assertTrue("Correct", a.select(4,0,false) == 1);
	}						
}
