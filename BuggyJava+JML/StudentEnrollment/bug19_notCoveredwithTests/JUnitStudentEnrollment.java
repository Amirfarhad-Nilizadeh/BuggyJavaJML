
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class JUnitStudentEnrollment {

	@Test
	public void test() {
		int result;
		boolean option = false;
		int initialBalance = 816;
		boolean lateRegistration = false;
		int passedCredits = 57;
		int semesterCredits = 1;
		boolean debit = true;	
		int payment = 1969385316;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1969384500);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 57);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test1() {
		int result;
		boolean option = false;
		int initialBalance = 3367;
		boolean lateRegistration = false;
		int passedCredits = 76;
		int semesterCredits = 7;
		boolean debit = false;	
		int payment = 1764914496;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1729612841);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 76);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test2() {
		int result;
		boolean option = true;
		int initialBalance = 2549;
		boolean lateRegistration = true;
		int passedCredits = 57;
		int semesterCredits = 1;
		boolean debit = false;	
		int payment = 1768842089;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2549);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 57);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test3() {
		int result;
		boolean option = true;
		int initialBalance = 816;
		boolean lateRegistration = false;
		int passedCredits = 57;
		int semesterCredits = 1;
		boolean debit = true;	
		int payment = 1449291620;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 816);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 57);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}	

	@Test
	public void test4() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 82;
		int semesterCredits = 0;
		boolean debit = false;	
		int payment = 14614528;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 0);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 82);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test5() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = false;
		int passedCredits = 64;
		int semesterCredits = 0;
		boolean debit = false;	
		int payment = 4849664;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 0);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 64);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test6() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 82;
		int semesterCredits = 8;
		boolean debit = false;	
		int payment = 14614528;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 1696);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 82);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test7() {
		int result;
		boolean option = false;
		int initialBalance = 1293;
		boolean lateRegistration = false;
		int passedCredits = 30;
		int semesterCredits = 11;
		boolean debit = true;	
		int payment = 1668245879;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1668244586);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 30);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	
	@Test
	public void test8() {
		int result;
		boolean option = true;
		int initialBalance = 2910;
		boolean lateRegistration = true;
		int passedCredits = 72;
		int semesterCredits = 4;
		boolean debit = true;	
		int payment = 1769414760;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2910);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 72);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test9() {
		int result;
		boolean option = false;
		int initialBalance = 3811;
		boolean lateRegistration = false;
		int passedCredits = 25;
		int semesterCredits = 5;
		boolean debit = false;	
		int payment = 1128027973;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1105463604);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 25);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test10() {
		int result;
		boolean option = true;
		int initialBalance = 1994;
		boolean lateRegistration = false;
		int passedCredits = 38;
		int semesterCredits = 17;
		boolean debit = true;	
		int payment = 1668245760;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 1994);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 38);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test11() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 50;
		int semesterCredits = 14;
		boolean debit = false;	
		int payment = 3697151;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2968);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 50);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test12() {
		int result;
		boolean option = false;
		int initialBalance = 1412;
		boolean lateRegistration = true;
		int passedCredits = 38;
		int semesterCredits = 17;
		boolean debit = false;	
		int payment = 1146570752;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1123637926);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 38);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test13() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = false;
		int passedCredits = 50;
		int semesterCredits = 14;
		boolean debit = true;	
		int payment = 3697151;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2800);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 50);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test14() {
		int result;
		boolean option = false;
		int initialBalance = 1529;
		boolean lateRegistration = false;
		int passedCredits = 13;
		int semesterCredits = 0;
		boolean debit = false;	
		int payment = 2122219134;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -2079773223);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 13);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

@Test
	public void test15() {
		int result;
		boolean option = false;
		int initialBalance = 3180;
		boolean lateRegistration = false;
		int passedCredits = 13;
		int semesterCredits = 0;
		boolean debit = true;	
		int payment = 2122219164;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -2122215984);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 13);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test16() {
		int result;
		boolean option = true;
		int initialBalance = 1529;
		boolean lateRegistration = false;
		int passedCredits = 13;
		int semesterCredits = 0;
		boolean debit = false;	
		int payment = 2122219134;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 1529);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 13);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test17() {
		int result;
		boolean option = false;
		int initialBalance = 1904;
		boolean lateRegistration = false;
		int passedCredits = 71;
		int semesterCredits = 20;
		boolean debit = false;	
		int payment = 2122219134;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -2079772848);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 71);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test18() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 0;
		int semesterCredits = 14;
		boolean debit = true;	
		int payment = 226;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2968);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 0);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test19() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 0;
		int semesterCredits = 0;
		boolean debit = true;	
		int payment = 2122186978;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 0);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 0);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test20() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = false;
		int passedCredits = 0;
		int semesterCredits = 14;
		boolean debit = true;	
		int payment = 226;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2800);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 0);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test21() {
		int result;
		boolean option = false;
		int initialBalance = 2354;
		boolean lateRegistration = false;
		int passedCredits = 63;
		int semesterCredits = 10;
		boolean debit = false;	
		int payment = 959467867;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -940276157);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 63);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test22() {
		int result;
		boolean option = true;
		int initialBalance = 2676;
		boolean lateRegistration = false;
		int passedCredits = 89;
		int semesterCredits = 19;
		boolean debit = false;	
		int payment = 1176633600;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2676);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 89);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test23() {
		int result;
		boolean option = false;
		int initialBalance = 1421;
		boolean lateRegistration = true;
		int passedCredits = 89;
		int semesterCredits = 10;
		boolean debit = true;	
		int payment = 961566539;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -961565118);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 89);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test24() {
		int result;
		boolean option = false;
		int initialBalance = 2354;
		boolean lateRegistration = false;
		int passedCredits = 63;
		int semesterCredits = 10;
		boolean debit = false;	
		int payment = 959467867;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -940276157);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 63);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test25() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = false;
		int passedCredits = 98;
		int semesterCredits = 10;
		boolean debit = true;	
		int payment = 544171008;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2000);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 98);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test26() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 98;
		int semesterCredits = 10;
		boolean debit = true;	
		int payment = 544171008;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2120);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 98);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test27() {
		int result;
		boolean option = true;
		int initialBalance = 1141;
		boolean lateRegistration = false;
		int passedCredits = 67;
		int semesterCredits = 4;
		boolean debit = true;	
		int payment = 1449488998;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 1141);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 67);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test28() {
		int result;
		boolean option = false;
		int initialBalance = 3475;
		boolean lateRegistration = false;
		int passedCredits = 58;
		int semesterCredits = 5;
		boolean debit = false;	
		int payment = 2013291877;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1973022566);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 58);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test29() {
		int result;
		boolean option = false;
		int initialBalance = 1141;
		boolean lateRegistration = false;
		int passedCredits = 51;
		int semesterCredits = 2;
		boolean debit = true;	
		int payment = 1449488998;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == -1449487857);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 51);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test30() {
		int result;
		boolean option = true;
		int initialBalance = 2264;
		boolean lateRegistration = true;
		int passedCredits = 118;
		int semesterCredits = 7;
		boolean debit = true;	
		int payment = 6645093;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 2264);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 118);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test31() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = false;
		int passedCredits = 115;
		int semesterCredits = 3;
		boolean debit = true;	
		int payment = 6645093;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 600);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 115);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}

	@Test
	public void test32() {
		int result;
		boolean option = true;
		int initialBalance = 0;
		boolean lateRegistration = true;
		int passedCredits = 78;
		int semesterCredits = 3;
		boolean debit = true;	
		int payment = 472327988;

		StudentEnrollment student = new StudentEnrollment("AnyFirstName", "AnyLastName");
		
		student.enrollmentProcess(passedCredits, semesterCredits, payment, initialBalance, lateRegistration, debit, option);
		assertTrue("Balance is not correct", student.getTuition() == 636);	
		assertTrue("Passed Credits value is not correct", student.getPassedCredits() == 78);
		assertTrue("First name is not correct", student.getFirstName() == "AnyFirstName");
		assertTrue("Last name is not correct", student.getLastName() == "AnyLastName");
	}
}
