
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitStrPalindrome {

	@Test
	public void test() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("UVby49cnboYHURyjtyuHGTlkVNhitrhNzzNhrtihNVklTGHuytjyRUHYobnc94ybVU");
		assertEquals(true, result);
	}

	@Test
	public void test1() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("dOU9rp");
		assertEquals(false, result);
	}

	@Test
	public void test2() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("");
		assertEquals(true, result);
	}

	@Test
	public void test3() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("ebm");
		assertEquals(false, result);
	}

	@Test
	public void test4() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("nG7IcrhittihrcI7Gn");
		assertEquals(true, result);
	}

	@Test
	public void test5() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("T6ngtjBVh");
		assertEquals(false, result);
	}

	@Test
	public void test6() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("ongignymu8m65RTJJTR56m8umyngigno");
		assertEquals(true, result);
	}

	@Test
	public void test7() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("88h881GsQvhitiH2iJhjru2btr75KH1T8Y");
		assertEquals(false, result);
	}

	@Test
	public void test8() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("FOykn8GOPt6UUbIIIpph99d8bOT4c75Ui4giTassaTig4iU57c4TOb8d99hppIIIbUU6tPOG8nkyOF");
		assertEquals(true, result);
	}

	@Test
	public void test9() {
		StrPalindrome p = new StrPalindrome();
		boolean result = p.isPalindrome("F0g8Rb8etYYOhdJetb");
		assertEquals(false, result);
	}
}
