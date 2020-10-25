
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitAlphabet{

	@Test
	public void test() {
		int option = 0;
		int c = 12850;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test1() {
		int option = 2;
		int c = 11786;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test2() {
		int option = 3;
		int c = 12851;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test3() {
		int option = 0;
		int c = 0;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test4() {
		int option = 4;
		int c = 12851;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test5() {
		int option = 1;
		int c = 1;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test6() {
		int option = 4;
		int c = 0;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test7() {
		int option = 2;
		int c = 5;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test8() {
		int option = 3;
		int c = 11;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test9() {
		int option = 4;
		int c = 65;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test10() {
		int option = 0;
		int c = 65;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test11() {
		int option = 1;
		int c = 65;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test12() {
		int option = 2;
		int c = 121;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test13() {
		int option = 4;
		int c = 114;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test14() {
		int option = 3;
		int c = 53;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test15() {
		int option = 1;
		int c = 31868;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test16() {
		int option = 2;
		int c = 65280;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test17() {
		int option = 4;
		int c = 15678;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test18() {
		int option = 3;
		int c = 32818;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test19() {
		int option = 1;
		int c = 57632;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test20() {
		int option = 1;
		int c = 0;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test21() {
		int option = 2;
		int c = 0;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test22() {
		int option = 3;
		int c = 0;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test23() {
		int option = 4;
		int c = 47;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test24() {
		int option = 3;
		int c = 50;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test25() {
		int option = 2;
		int c = 100;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test26() {
		int option = 0;
		int c = 31744;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test27() {
		int option = 2;
		int c = 31945;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test28() {
		int option = 3;
		int c = 57344;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test29() {
		int option = 1;
		int c = 64;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test30() {
		int option = 4;
		int c = 1536;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test31() {
		int option = 2;
		int c = 64;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test32() {
		int option = 4;
		int c = 113;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}


	@Test
	public void test33() {
		int option = 1;
		int c = 87;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test34() {
		int option = 4;
		int c = 83;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test35() {
		int option = 3;
		int c = 56;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test36() {
		int option = 0;
		int c = 73;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test37() {
		int option = 2;
		int c = 19488;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test38() {
		int option = 4;
		int c = 19488;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test39() {
		int option = 1;
		int c = 64622;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test40() {
		int option = 3;
		int c = 25345;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test41() {
		int option = 1;
		int c = 16;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test42() {
		int option = 2;
		int c = 32;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}


	@Test
	public void test43() {
		int option = 4;
		int c = 1;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test44() {
		int option = 3;
		int c = 51;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test45() {
		int option = 2;
		int c = 107;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test46() {
		int option = 0;
		int c = 97;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test47() {
		int option = 4;
		int c = 108;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test48() {
		int option = 4;
		int c = 83;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test49() {
		int option = 1;
		int c = 83;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test50() {
		int option = 1;
		int c = 28516;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test51() {
		int option = 4;
		int c = 28516;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test52() {
		int option = 3;
		int c = 6925;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test53() {
		int option = 2;
		int c = 28516;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test54() {
		int option = 0;
		int c = 28532;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(false, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test55() {
		int option = 4;
		int c = 100;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test56() {
		int option = 4;
		int c = 76;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test57() {
		int option = 0;
		int c = 79;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}

	@Test
	public void test58() {
		int option = 3;
		int c = 53;
		Alphabet a = new Alphabet((char)c);
		boolean[] result = new boolean[6];
		result = a.driver(option);
		assertEquals(true, result[0]);
		assertEquals(true, result[option+1]);
		assertEquals(a.getVowel_set(), result[1]);
		assertEquals(a.getUppercase_set(), result[2]);
		assertEquals(a.getLowercase_set(), result[3]);
		assertEquals(a.getDigit_set(), result[4]);
		assertEquals(a.getAlphabetic_set(), result[5]);
	}
}
