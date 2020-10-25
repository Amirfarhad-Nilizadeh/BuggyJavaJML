
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitPalindrome {

	@Test
	public void test() {
		Palindrome a = new Palindrome();
		boolean result = a.palindromeCheck("UVby49cnboYHURyjtyuHGTlkVNhitrhNzzNhrtihNVklTGHuytjyRUHYobnc94ybVU");
		assertEquals(true, result);
	}

	@Test
	public void test1() {
		Palindrome a = new Palindrome();
		boolean result = a.palindromeCheck("dOU9rp");
		assertEquals(false, result);
	}

	@Test
	public void test2() {
		Palindrome a = new Palindrome();
		boolean result = a.palindromeCheck("");
		assertEquals(true, result);
	}

	@Test
	public void test3() {
		Palindrome a = new Palindrome();
		boolean result = a.palindromeCheck("ebm");
		assertEquals(false, result);
	}

	@Test
	public void test4() {
		Palindrome a = new Palindrome();
		boolean result = a.palindromeCheck("nG7IcrhittihrcI7Gn");
		assertEquals(true, result);
	}

	@Test
	public void test5() {
		Palindrome a = new Palindrome();
		boolean result = a.palindromeCheck("T6ngtjBVh");
		assertEquals(false, result);
	}

	@Test
	public void test6() {
		Palindrome a = new Palindrome();
		boolean result = a.palindromeCheck("ongignymu8m65RTJJTR56m8umyngigno");
		assertEquals(true, result);
	}

	@Test
	public void test7() {
		Palindrome a = new Palindrome();
		boolean result = a.palindromeCheck("88h881GsQvhitiH2iJhjru2btr75KH1T8Y");
		assertEquals(false, result);
	}

	@Test
	public void test8() {
		Palindrome a = new Palindrome();
		boolean result = a.palindromeCheck("FOykn8GOPt6UUbIIIpph99d8bOT4c75Ui4giTassaTig4iU57c4TOb8d99hppIIIbUU6tPOG8nkyOF");
		assertEquals(true, result);
	}

	@Test
	public void test9() {
		Palindrome a = new Palindrome();
		boolean result = a.palindromeCheck("F0g8Rb8etYYOhdJetb");
		assertEquals(false, result);
	}
}
