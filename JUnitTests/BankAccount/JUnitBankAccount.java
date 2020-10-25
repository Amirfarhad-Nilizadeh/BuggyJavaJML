
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitBankAccount {

	@Test
	public void test() {
		int result;
		int option = 9;
		int flag = 0;	
		int amount = 593440095;
		int balance = 943208490;
		int previousTransaction = 761210401;
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test1() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = 593571167;
		int balance = 943208490;
		int previousTransaction = 0;
	
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -593571171);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 349637319);	
	}

	@Test
	public void test2() {
		int result;
		int flag = 1;
		int option = 4;
		int amount = -1970651345;
		int balance = 943208490;
		int previousTransaction = 725623647;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test3() {
		int result;
		int flag = 0;
		int option = 0;
		int amount = 1330794303;
		int balance = 761210401;
		int previousTransaction = 299899166;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test4() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 593440095;
		int balance = 943208490;
		int previousTransaction = 761204736;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -593440095);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 349768395);	
	}	

	@Test
	public void test5() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 2135949311;
		int balance = 419430404;
		int previousTransaction = 72292652;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 16777216);	
	}	

	@Test
	public void test6() {
		int result;
		int flag = 2;
		int option = 9;
		int amount = 727659103;
		int balance = 943208490;
		int previousTransaction = 761210401;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -727659107);	
		}
		assertTrue("Balance is not correct", result == 215549383);	
	}	

	@Test
	public void test7() {
		int result;
		int flag = 0;
		int option = 1;
		int amount = 757935424;
		int balance = 943205677;
		int previousTransaction = 757935405;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 757935424);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 757935424);	
	}	

	@Test
	public void test8() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = -2143813632;
		int balance = 943194112;
		int previousTransaction = 21290;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 943194112);	
	}	

	@Test
	public void test9() {
		int result;
		int flag = 2;
		int option = 7;
		int amount = 793333583;
		int balance = 943208490;
		int previousTransaction = 387389221;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 753666908);	
		}
		assertTrue("Balance is not correct", result == 1696875398);	
	}

	@Test
	public void test10() {
		int result;
		int flag = 1;
		int option = 4;
		int amount = -1768516096;
		int balance = -33466832;
		int previousTransaction = -2130706661;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test11() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 706740505;
		int balance = 761593872;
		int previousTransaction = 45357321;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -742077530);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 19516342);	
	}	

	@Test
	public void test12() {
		int result;
		int flag = 0;
		int option = 7;
		int amount = -2130706433;
		int balance = 587195136;
		int previousTransaction = 10287;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test13() {
		int result;
		int flag = 0;
		int option = 1;
		int amount = -1852768256;
		int balance = 1596809016;
		int previousTransaction = 33561635;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test14() {
		int result;
		int flag = 2;
		int option = 2;
		int amount = 1145324612;
		int balance = 1145324612;
		int previousTransaction = 1145324612;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -1145324612);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test15() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 1330597711;
		int balance = 943210287;
		int previousTransaction = 382189777;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 943210287);	
	}	

	@Test
	public void test16() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = -1616928865;
		int balance = 943208490;
		int previousTransaction = -1616928865;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 943208490);	
	}	

	@Test
	public void test17() {
		int result;
		int flag = 0;
		int option = 2;
		int amount = 1953796352;
		int balance = 2088006772;
		int previousTransaction = 4143;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test18() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = -64256;
		int balance = 1114111;
		int previousTransaction = 1048862;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1114111);	
	}	

	@Test
	public void test19() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = 1330597455;
		int balance = 943673167;
		int previousTransaction = 536888197;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test20() {
		int result;
		int flag = 0;
		int option = 6;
		int amount = 1920103026;
		int balance = 1130918514;
		int previousTransaction = 789184512;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test21() {
		int result;
		int flag = 0;
		int option = 8;
		int amount = 800832443;
		int balance = 943203882;
		int previousTransaction = -1145324736;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test22() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = 33023;
		int balance = 0;
		int previousTransaction = -1146625;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test23() {
		int result;
		int flag = 2;
		int option = 6;
		int amount = 593440095;
		int balance = 943208575;
		int previousTransaction = 761266176;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -581571295);	
		}
		assertTrue("Balance is not correct", result == 361637280);	
	}	

	@Test
	public void test24() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 1600085855;
		int balance = 943208490;
		int previousTransaction = 656877333;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -50);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 943208440);	
	}	

	@Test
	public void test25() {
		int result;
		int flag = 2;
		int option = 6;
		int amount = -1616904384;
		int balance = 1688182687;
		int previousTransaction = -1616904314;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -1616904314);	
		}
		assertTrue("Balance is not correct", result == 1688182687);	
	}	

	@Test
	public void test26() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 1330803519;
		int balance = 262144;
		int previousTransaction = 160627;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 7863);	
	}	

	@Test
	public void test27() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = -1;
		int balance = 1688182687;
		int previousTransaction = -1616969473;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1688182687);	
	}	

	@Test
	public void test28() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 21;
		int balance = 64272;
		int previousTransaction = 160627;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1284);	
	}	

	@Test
	public void test29() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = 1246579744;
		int balance = 791625760;
		int previousTransaction = 657863241;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 791625760);	
	}	

	@Test
	public void test30() {
		int result;
		int flag = 1;
		int option = 7;
		int amount = 1246579744;
		int balance = 791625760;
		int previousTransaction = 319222313;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 1184250759);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1975876519);	
	}	

	@Test
	public void test31() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = -80741581;
		int balance = 804990971;
		int previousTransaction = 900;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 804990971);	
	}	

	@Test
	public void test32() {
		int result;
		int flag = 1;
		int option = 7;
		int amount = -1970632054;
		int balance = -1971257462;
		int previousTransaction = -1968731510;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test33() {
		int result;
		int flag = 1;
		int option = 4;
		int amount = 1332766062;
		int balance = 793726799;
		int previousTransaction = 450690257;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test34() {
		int result;
		int flag = 2;
		int option = 0;
		int amount = 1244351490;
		int balance = 791625760;
		int previousTransaction = 355526958;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 355526958);	
		}
		assertTrue("Balance is not correct", result == 791625760);	
	}	

	@Test
	public void test35() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 1246579744;
		int balance = 791625760;
		int previousTransaction = 657863241;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 791625760);	
	}	

	@Test
	public void test36() {
		int result;
		int flag = 0;
		int option = 2;
		int amount = 1248228471;
		int balance = 791625760;
		int previousTransaction = 52225248;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test37() {
		int result;
		int flag = 2;
		int option = 9;
		int amount = -370546199;
		int balance = -370546199;
		int previousTransaction = -370546199;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -370546199);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test38() {
		int result;
		int flag = 1;
		int option = 6;
		int amount = 1246579744;
		int balance = 791625760;
		int previousTransaction = 657863241;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 791625760);	
	}	

	@Test
	public void test39() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = -151587082;
		int balance = -151587082;
		int previousTransaction = -151587082;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test40() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 1953066784;
		int balance = 796606569;
		int previousTransaction = 652882432;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -50);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 796606519);	
	}	

	@Test
	public void test41() {
		int result;
		int flag = 0;
		int option = 9;
		int amount = 1718182753;
		int balance = 791625760;
		int previousTransaction = 369815342;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test42() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 2004316773;
		int balance = 791625764;
		int previousTransaction = 542401907;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 542401907);	
		}
		assertTrue("Balance is not correct", result == 31665028);	
	}	

	@Test
	public void test43() {
		int result;
		int flag = 2;
		int option = 1;
		int amount = 1246579744;
		int balance = 791625760;
		int previousTransaction = 657863241;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 1246579744);	
		}
		assertTrue("Balance is not correct", result == 2038205504);	
	}	

	@Test
	public void test44() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = -398400256;
		int balance = -398421504;
		int previousTransaction = 65562369;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}	

	@Test
	public void test45() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = -1987475063;
		int balance = 791625865;
		int previousTransaction = -1987475063;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -1987475063);	
		}
		assertTrue("Balance is not correct", result == 791625865);	
	}	

	@Test
	public void test46() {
		int result;
		int flag = 2;
		int option = 9;
		int amount = 1901936864;
		int balance = 1903261297;
		int previousTransaction = 1567715839;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -1901936868);	
		}
		assertTrue("Balance is not correct", result == 1324429);	
	}

	@Test
	public void test47() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = 709708832;
		int balance = 791609344;
		int previousTransaction = 657879657;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -709708832);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 81900512);	
	}	

	@Test
	public void test48() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = -1;
		int balance = -1;
		int previousTransaction = -65520;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test49() {
		int result;
		int flag = 1;
		int option = 6;
		int amount = -1768515946;
		int balance = -1768515946;
		int previousTransaction = -1768515946;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test50() {
		int result;
		int flag = 1;
		int option = 6;
		int amount = 2160;
		int balance = 800751659;
		int previousTransaction = 283505565;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -2118);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 800749541);	
	}

	@Test
	public void test51() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = 2170655;
		int balance = 791625760;
		int previousTransaction = 522133248;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test52() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 7237375;
		int balance = 1328543241;
		int previousTransaction = 1089339182;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -7599240);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1320944001);	
	}

	@Test
	public void test53() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 1633771873;
		int balance = 1633771873;
		int previousTransaction = 1633771873;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -1633771873);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test54() {
		int result;
		int flag = 1;
		int option = 1;
		int amount = -1189011167;
		int balance = 555858361;
		int previousTransaction = 555819297;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 555858361);	
	}

	@Test
	public void test55() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 1481460768;
		int balance = 57343;
		int previousTransaction = 29990;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1146);	
	}

	@Test
	public void test56() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 1698780261;
		int balance = 262260;
		int previousTransaction = 23803;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 7866);	
	}

	@Test
	public void test57() {
		int result;
		int flag = 0;
		int option = 4;
		int amount = 2122219134;
		int balance = 612269694;
		int previousTransaction = 285410052;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test58() {
		int result;
		int flag = 0;
		int option = 8;
		int amount = 2122219134;
		int balance = 612433919;
		int previousTransaction = 284917377;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test59() {
		int result;
		int flag = 0;
		int option = 6;
		int amount = 2122219134;
		int balance = 612990590;
		int previousTransaction = 283247239;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test60() {
		int result;
		int flag = 0;
		int option = 2;
		int amount = 2122219134;
		int balance = 612269694;
		int previousTransaction = 285851842;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test61() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 1330597711;
		int balance = -2072411004;
		int previousTransaction = 1330597711;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test62() {
		int result;
		int flag = 2;
		int option = 9;
		int amount = -2071690159;
		int balance = 620757123;
		int previousTransaction = 259948151;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 259948151);	
		}
		assertTrue("Balance is not correct", result == 620757123);	
	}

	@Test
	public void test63() {
		int result;
		int flag = 0;
		int option = 6;
		int amount = -1600085838;
		int balance = 614506656;
		int previousTransaction = -1600085856;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test64() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = -1498106700;
		int balance = 605060734;
		int previousTransaction = -1263225648;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 605060734);	
	}

	@Test
	public void test65() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = 2142746551;
		int balance = 511606398;
		int previousTransaction = -1216446850;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test66() {
		int result;
		int flag = 0;
		int option = 0;
		int amount = 2122219134;
		int balance = 612269694;
		int previousTransaction = 285410042;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test67() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 2147446148;
		int balance = 360611454;
		int previousTransaction = -1569886867;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -50);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 360611404);	
	}

	@Test
	public void test68() {
		int result;
		int flag = 1;
		int option = 7;
		int amount = 1100585356;
		int balance = 475660800;
		int previousTransaction = -1718024712;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 1045556091);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1521216891);	
	}

	@Test
	public void test69() {
		int result;
		int flag = 0;
		int option = 1;
		int amount = -1179010816;
		int balance = -1179010631;
		int previousTransaction = 960051512;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test70() {
		int result;
		int flag = 2;
		int option = 6;
		int amount = 37246;
		int balance = 216105614;
		int previousTransaction = 960051512;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -36502);	
		}
		assertTrue("Balance is not correct", result == 216069112);	
	}

	@Test
	public void test71() {
		int result;
		int flag = 2;
		int option = 9;
		int amount = -1734764135;
		int balance = -1734764135;
		int previousTransaction = -1717986919;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -1717986919);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test72() {
		int result;
		int flag = 0;
		int option = 9;
		int amount = 1551633022;
		int balance = 612269694;
		int previousTransaction = 283443973;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test73() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = -10592642;
		int balance = 612269568;
		int previousTransaction = 285398529;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 24490780);	
	}

	@Test
	public void test74() {
		int result;
		int flag = 0;
		int option = 1;
		int amount = 16777333;
		int balance = 1433597594;
		int previousTransaction = 494110566;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 16777333);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 16777333);	
	}

	@Test
	public void test75() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = 606348324;
		int balance = 612269604;
		int previousTransaction = 25067136;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -606348324);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 5921280);	
	}

	@Test
	public void test76() {
		int result;
		int flag = 0;
		int option = 7;
		int amount = -1751672937;
		int balance = 612269719;
		int previousTransaction = -1751672937;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test77() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = -10191715;
		int balance = 209616510;
		int previousTransaction = -1650614883;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 209616510);	
	}

	@Test
	public void test78() {
		int result;
		int flag = 2;
		int option = 9;
		int amount = 184549392;
		int balance = 187435787;
		int previousTransaction = 723723;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -184549396);	
		}
		assertTrue("Balance is not correct", result == 2886391);	
	}

	@Test
	public void test79() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 151587081;
		int balance = 259953022;
		int previousTransaction = 151587081;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -159166431);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 100786591);	
	}

	@Test
	public void test80() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = -11;
		int balance = 612256256;
		int previousTransaction = 358736128;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 612256256);	
	}

	@Test
	public void test81() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = 37246;
		int balance = 611136768;
		int previousTransaction = 297252095;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -37246);	
		}
		assertTrue("Balance is not correct", result == 611099522);	
	}

	@Test
	public void test82() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = -10551426;
		int balance = 32256;
		int previousTransaction = 512;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 512);	
		}
		assertTrue("Balance is not correct", result == 644);	
	}

	@Test
	public void test83() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 33150;
		int balance = 262144;
		int previousTransaction = 258560;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 7863);	
	}

	@Test
	public void test84() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 993672572;
		int balance = 592662793;
		int previousTransaction = 366328364;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 592662793);	
	}

	@Test
	public void test85() {
		int result;
		int flag = 1;
		int option = 4;
		int amount = 1602224215;
		int balance = 592530257;
		int previousTransaction = 415025341;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test86() {
		int result;
		int flag = 0;
		int option = 5;
		int amount = 993670950;
		int balance = 592662793;
		int previousTransaction = 33423438;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test87() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = 1515925552;
		int balance = 590356480;
		int previousTransaction = 522856256;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 590356480);	
	}

	@Test
	public void test88() {
		int result;
		int flag = 2;
		int option = 2;
		int amount = 993672552;
		int balance = 16809984;
		int previousTransaction = 13032043;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 13032043);	
		}
		assertTrue("Balance is not correct", result == 16809984);	
	}

	@Test
	public void test89() {
		int result;
		int flag = 2;
		int option = 7;
		int amount = 977108060;
		int balance = 594366729;
		int previousTransaction = 301222664;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 928252660);	
		}
		assertTrue("Balance is not correct", result == 1522619389);	
	}

	@Test
	public void test90() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = -1970632054;
		int balance = -1970632054;
		int previousTransaction = -1970632054;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 928252660);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test91() {
		int result;
		int flag = 2;
		int option = 2;
		int amount = 20303;
		int balance = 1330597711;
		int previousTransaction = 1330597711;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -20303);	
		}
		assertTrue("Balance is not correct", result == 1330577408);	
	}

	@Test
	public void test92() {
		int result;
		int flag = 0;
		int option = 1;
		int amount = 6117978;
		int balance = 592693477;
		int previousTransaction = 382254480;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 6117978);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 6117978);	
	}

	@Test
	public void test93() {
		int result;
		int flag = 0;
		int option = 1;
		int amount = -336860181;
		int balance = 592662793;
		int previousTransaction = -336860181;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test94() {
		int result;
		int flag = 0;
		int option = 7;
		int amount = -402456576;
		int balance = 589648209;
		int previousTransaction = -948866816;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test95() {
		int result;
		int flag = 1;
		int option = 6;
		int amount = 3816828;
		int balance = 592662793;
		int previousTransaction = 366328364;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -3740492);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 588922301);	
	}

	@Test
	public void test96() {
		int result;
		int flag = 1;
		int option = 0;
		int amount = 1515870765;
		int balance = 5921370;
		int previousTransaction = 1976354;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 5921370);	
	}

	@Test
	public void test97() {
		int result;
		int flag = 1;
		int option = 6;
		int amount = 993672572;
		int balance = 592662793;
		int previousTransaction = 115740265;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 592662793);	
	}

	@Test
	public void test98() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = -488447262;
		int balance = -488447262;
		int previousTransaction = -488447262;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test99() {
		int result;
		int flag = 2;
		int option = 9;
		int amount = 1397819717;
		int balance = 587235583;
		int previousTransaction = 574208572;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 574208572);	
		}
		assertTrue("Balance is not correct", result == 587235583);	
	}

	@Test
	public void test100() {
		int result;
		int flag = 2;
		int option = 5;
		int amount = 1262320732;
		int balance = 1397819696;
		int previousTransaction = 689518027;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -1325436767);	
		}
		assertTrue("Balance is not correct", result == 72382929);	
	}

	@Test
	public void test101() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 124;
		int balance = 592662793;
		int previousTransaction = 366328364;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 23706508);	
	}

	@Test
	public void test102() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = -1515913216;
		int balance = 1027423549;
		int previousTransaction = 4209981;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 4209981);	
		}
		assertTrue("Balance is not correct", result == 1027423549);	
	}

	@Test
	public void test103() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = 1467442522;
		int balance = 592662793;
		int previousTransaction = 330545224;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test104() {
		int result;
		int flag = 0;
		int option = 9;
		int amount = -1044266559;
		int balance = -1044266559;
		int previousTransaction = -1044266559;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test105() {
		int result;
		int flag = 2;
		int option = 6;
		int amount = -32768;
		int balance = 1600064813;
		int previousTransaction = 96749092;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 96749092);	
		}
		assertTrue("Balance is not correct", result == 1600064813);	
	}

	@Test
	public void test106() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = 1364288860;
		int balance = 1700420186;
		int previousTransaction = 302710949;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -1364288864);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 336131322);	
	}

	@Test
	public void test107() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 1766686569;
		int balance = 1785293161;
		int previousTransaction = 1768515945;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -1766686569);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 18606592);	
	}

	@Test
	public void test108() {
		int result;
		int flag = 2;
		int option = 9;
		int amount = 993662250;
		int balance = -783068919;
		int previousTransaction = 707418624;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 707418624);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test109() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 1920103026;
		int balance = 262366;
		int previousTransaction = 257340;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 7869);	
	}

	@Test
	public void test110() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 33686018;
		int balance = 131586;
		int previousTransaction = 2;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 2);	
		}
		assertTrue("Balance is not correct", result == 2630);	
	}

	@Test
	public void test111() {
		int result;
		int flag = 1;
		int option = 1;
		int amount = 676154701;
		int balance = 557844813;
		int previousTransaction = 181222067;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 676154701);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1233999514);	
	}

	@Test
	public void test112() {
		int result;
		int flag = 0;
		int option = 1;
		int amount = 676154701;
		int balance = 557844813;
		int previousTransaction = 181222067;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 676154701);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 676154701);	
	}

	@Test
	public void test113() {
		int result;
		int flag = 2;
		int option = 1;
		int amount = 676154701;
		int balance = 557846605;
		int previousTransaction = 181218446;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 676154701);	
		}
		assertTrue("Balance is not correct", result == 1234001306);	
	}

	@Test
	public void test114() {
		int result;
		int flag = 1;
		int option = 5;
		int amount = 559089997;
		int balance = 557844813;
		int previousTransaction = 181213541;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 557844813);	
	}

	@Test
	public void test115() {
		int result;
		int flag = 0;
		int option = 8;
		int amount = 1296911693;
		int balance = 557844813;
		int previousTransaction = 181222067;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test116() {
		int result;
		int flag = 2;
		int option = 0;
		int amount = 1077952512;
		int balance = 4472896;
		int previousTransaction = 2950208;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 2950208);	
		}
		assertTrue("Balance is not correct", result == 4472896);	
	}

	@Test
	public void test117() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = 1296911693;
		int balance = 1144468050;
		int previousTransaction = 152443644;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test118() {
		int result;
		int flag = 1;
		int option = 4;
		int amount = -2171137;
		int balance = 560480256;
		int previousTransaction = -554377673;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test119() {
		int result;
		int flag = 2;
		int option = 3;
		int amount = 674647373;
		int balance = 557844813;
		int previousTransaction = 176156025;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -50);	
		}
		assertTrue("Balance is not correct", result == 557844763);	
	}

	@Test
	public void test120() {
		int result;
		int flag = 0;
		int option = 6;
		int amount = 727058425;
		int balance = 270834;
		int previousTransaction = -953069312;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test121() {
		int result;
		int flag = 2;
		int option = 5;
		int amount = 1101374885;
		int balance = -336869360;
		int previousTransaction = 16;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 16);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test122() {
		int result;
		int flag = 2;
		int option = 7;
		int amount = -782283443;
		int balance = 553904205;
		int previousTransaction = 63796992;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 63796992);	
		}
		assertTrue("Balance is not correct", result == 553904205);	
	}

	@Test
	public void test123() {
		int result;
		int flag = 0;
		int option = 1;
		int amount = -10223597;
		int balance = 1073807168;
		int previousTransaction = -1;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test124() {
		int result;
		int flag = 2;
		int option = 5;
		int amount = 226492237;
		int balance = 557844813;
		int previousTransaction = 298662579;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -237816847);	
		}
		assertTrue("Balance is not correct", result == 320027966);	
	}

	@Test
	public void test125() {
		int result;
		int flag = 0;
		int option = 7;
		int amount = 993737787;
		int balance = 391075886;
		int previousTransaction = 211585759;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 944050902);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 944050902);	
	}

	@Test
	public void test126() {
		int result;
		int flag = 2;
		int option = 2;
		int amount = 609613;
		int balance = 557844845;
		int previousTransaction = 481302094;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -609613);	
		}
		assertTrue("Balance is not correct", result == 557235232);	
	}

	@Test
	public void test127() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = 676154701;
		int balance = 557844813;
		int previousTransaction = 181222067;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 557844813);	
	}

	@Test
	public void test128() {
		int result;
		int flag = 0;
		int option = 9;
		int amount = -2103614307;
		int balance = 1239698784;
		int previousTransaction = 810365412;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test129() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = 1295006867;
		int balance = 1296924672;
		int previousTransaction = 1296920141;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -1295006871);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1917801);	
	}

	@Test
	public void test130() {
		int result;
		int flag = 1;
		int option = 2;
		int amount = -205;
		int balance = 557844813;
		int previousTransaction = 179329459;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 557844813);	
	}

	@Test
	public void test131() {
		int result;
		int flag = 2;
		int option = 6;
		int amount = 235802126;
		int balance = 235802126;
		int previousTransaction = 235802126;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == -231086084);	
		}
		assertTrue("Balance is not correct", result == 4716042);	
	}

	@Test
	public void test132() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 676154701;
		int balance = 557844813;
		int previousTransaction = 181222067;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 181222067);	
		}
		assertTrue("Balance is not correct", result == 22313792);	
	}

	@Test
	public void test133() {
		int result;
		int flag = 1;
		int option = 3;
		int amount = 1296911693;
		int balance = 1296911693;
		int previousTransaction = 1296315946;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == -1296911693);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test134() {
		int result;
		int flag = 2;
		int option = 2;
		int amount = 1527384330;
		int balance = 177356928;
		int previousTransaction = 99106813;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 99106813);	
		}
		assertTrue("Balance is not correct", result == 177356928);	
	}

	@Test
	public void test135() {
		int result;
		int flag = 1;
		int option = 9;
		int amount = 2147478784;
		int balance = -603945857;
		int previousTransaction = 7030784;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test136() {
		int result;
		int flag = 1;
		int option = 6;
		int amount = -268435455;
		int balance = 1082355556;
		int previousTransaction = 16777200;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1082355556);	
	}

	@Test
	public void test137() {
		int result;
		int flag = 0;
		int option = 3;
		int amount = -1503355265;
		int balance = -336888063;
		int previousTransaction = 17169704;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test138() {
		int result;
		int flag = 1;
		int option = 8;
		int amount = 716485804;
		int balance = 65536;
		int previousTransaction = -1673489740;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 1310);	
	}

	@Test
	public void test139() {
		int result;
		int flag = 0;
		int option = 5;
		int amount = -1;
		int balance = 557907967;
		int previousTransaction = -144;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 0);	
		}
		assertTrue("Balance is not correct", result == 0);	
	}

	@Test
	public void test140() {
		int result;
		int flag = 2;
		int option = 8;
		int amount = 676154701;
		int balance = 264525;
		int previousTransaction = 210143;
			
		if (flag == 0) {
			BankAccount a = new BankAccount();
			result = a.menu(option, amount);	
			assertTrue("PreviousTransaction is not correct", a.getPreviousTransaction() == 0);
		} else if (flag == 1) {	
			BankAccount b = new BankAccount(balance);
			result = b.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", b.getPreviousTransaction() == 0);	
		} else {
			BankAccount c = new BankAccount(balance, previousTransaction);
			result = c.menu(option, amount);
			assertTrue("PreviousTransaction is not correct", c.getPreviousTransaction() == 210143);	
		}
		assertTrue("Balance is not correct", result == 7935);	
	}
}
