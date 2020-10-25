
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JUnitTime {

	@Test
	public void test() {
		int constructor = 0;
		int select = 2;
		int hour = 15;
		int minute = 51;
		int second = 46;
		int start_h = 15;
		int start_m = 27;
		int start_s = 27;
		int stop_h = 8;
		int stop_m = 30;
		int stop_s = 37;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test1() {
		int constructor = 0;
		int select = 4;
		int hour = 15;
		int minute = 51;
		int second = 46;
		int start_h = 21;
		int start_m = 46;
		int start_s = 27;
		int stop_h = 8;
		int stop_m = 32;
		int stop_s = 13;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(13, 14, 14);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test2() {
		int constructor = 0;
		int select = 4;
		int hour = 15;
		int minute = 59;
		int second = 19;
		int start_h = 12;
		int start_m = 16;
		int start_s = 27;
		int stop_h = 12;
		int stop_m = 24;
		int stop_s = 24;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 7, 57);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test3() {
		int constructor = 0;
		int select = 0;
		int hour = 10;
		int minute = 41;
		int second = 53;
		int start_h = 20;
		int start_m = 7;
		int start_s = 5;
		int stop_h = 7;
		int stop_m = 49;
		int stop_s = 4;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test4() {
		int constructor = 0;
		int select = 4;
		int hour = 15;
		int minute = 51;
		int second = 46;
		int start_h = 15;
		int start_m = 42;
		int start_s = 27;
		int stop_h = 21;
		int stop_m = 56;
		int stop_s = 37;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(6, 14, 10);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test5() {
		int constructor = 0;
		int select = 1;
		int hour = 23;
		int minute = 51;
		int second = 46;
		int start_h = 15;
		int start_m = 27;
		int start_s = 27;
		int stop_h = 1;
		int stop_m = 17;
		int stop_s = 37;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test6() {
		int constructor = 1;
		int select = 3;
		int hour = 16;
		int minute = 15;
		int second = 16;
		int start_h = 16;
		int start_m = 16;
		int start_s = 28;
		int stop_h = 8;
		int stop_m = 27;
		int stop_s = 27;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(16, 15, 16);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test7() {
		int constructor = 0;
		int select = 3;
		int hour = 15;
		int minute = 51;
		int second = 46;
		int start_h = 8;
		int start_m = 27;
		int start_s = 27;
		int stop_h = 8;
		int stop_m = 36;
		int stop_s = 57;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test8() {
		int constructor = 0;
		int select = 4;
		int hour = 11;
		int minute = 40;
		int second = 18;
		int start_h = 14;
		int start_m = 17;
		int start_s = 51;
		int stop_h = 0;
		int stop_m = 41;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(13, 36, 35);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test9() {
		int constructor = 0;
		int select = 4;
		int hour = 0;
		int minute = 0;
		int second = 0;
		int start_h = 14;
		int start_m = 14;
		int start_s = 22;
		int stop_h = 14;
		int stop_m = 14;
		int stop_s = 14;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 8);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test10() {
		int constructor = 1;
		int select = 3;
		int hour = 4;
		int minute = 45;
		int second = 46;
		int start_h = 9;
		int start_m = 57;
		int start_s = 47;
		int stop_h = 9;
		int stop_m = 57;
		int stop_s = 57;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(4, 45, 46);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test11() {
		int constructor = 1;
		int select = 4;
		int hour = 15;
		int minute = 51;
		int second = 34;
		int start_h = 9;
		int start_m = 53;
		int start_s = 24;
		int stop_h = 9;
		int stop_m = 27;
		int stop_s = 13;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 26, 11);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test12() {
		int constructor = 1;
		int select = 4;
		int hour = 15;
		int minute = 51;
		int second = 46;
		int start_h = 19;
		int start_m = 43;
		int start_s = 39;
		int stop_h = 19;
		int stop_m = 43;
		int stop_s = 43;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 4);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test13() {
		int constructor = 0;
		int select = 3;
		int hour = 8;
		int minute = 8;
		int second = 8;
		int start_h = 8;
		int start_m = 8;
		int start_s = 8;
		int stop_h = 8;
		int stop_m = 8;
		int stop_s = 8;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test14() {
		int constructor = 0;
		int select = 4;
		int hour = 6;
		int minute = 54;
		int second = 54;
		int start_h = 6;
		int start_m = 54;
		int start_s = 54;
		int stop_h = 6;
		int stop_m = 54;
		int stop_s = 54;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test15() {
		int constructor = 0;
		int select = 4;
		int hour = 13;
		int minute = 36;
		int second = 40;
		int start_h = 2;
		int start_m = 17;
		int start_s = 37;
		int stop_h = 16;
		int stop_m = 24;
		int stop_s = 18;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(14, 6, 41);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test16() {
		int constructor = 1;
		int select = 1;
		int hour = 9;
		int minute = 15;
		int second = 48;
		int start_h = 0;
		int start_m = 8;
		int start_s = 36;
		int stop_h = 6;
		int stop_m = 3;
		int stop_s = 46;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test17() {
		int constructor = 0;
		int select = 4;
		int hour = 15;
		int minute = 38;
		int second = 54;
		int start_h = 18;
		int start_m = 54;
		int start_s = 18;
		int stop_h = 6;
		int stop_m = 34;
		int stop_s = 54;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(12, 19, 24);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test18() {
		int constructor = 0;
		int select = 0;
		int hour = 6;
		int minute = 18;
		int second = 54;
		int start_h = 6;
		int start_m = 54;
		int start_s = 54;
		int stop_h = 6;
		int stop_m = 54;
		int stop_s = 54;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test19() {
		int constructor = 0;
		int select = 4;
		int hour = 8;
		int minute = 54;
		int second = 54;
		int start_h = 6;
		int start_m = 54;
		int start_s = 49;
		int stop_h = 6;
		int stop_m = 54;
		int stop_s = 54;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 5);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test20() {
		int constructor = 0;
		int select = 4;
		int hour = 6;
		int minute = 54;
		int second = 6;
		int start_h = 6;
		int start_m = 54;
		int start_s = 34;
		int stop_h = 6;
		int stop_m = 52;
		int stop_s = 54;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 1, 40);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test21() {
		int constructor = 0;
		int select = 3;
		int hour = 20;
		int minute = 24;
		int second = 36;
		int start_h = 6;
		int start_m = 54;
		int start_s = 10;
		int stop_h = 6;
		int stop_m = 50;
		int stop_s = 42;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test22() {
		int constructor = 0;
		int select = 1;
		int hour = 6;
		int minute = 22;
		int second = 54;
		int start_h = 6;
		int start_m = 54;
		int start_s = 54;
		int stop_h = 18;
		int stop_m = 54;
		int stop_s = 54;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test23() {
		int constructor = 0;
		int select = 2;
		int hour = 22;
		int minute = 54;
		int second = 6;
		int start_h = 6;
		int start_m = 54;
		int start_s = 6;
		int stop_h = 22;
		int stop_m = 58;
		int stop_s = 50;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test24() {
		int constructor = 0;
		int select = 4;
		int hour = 6;
		int minute = 50;
		int second = 6;
		int start_h = 6;
		int start_m = 42;
		int start_s = 51;
		int stop_h = 6;
		int stop_m = 47;
		int stop_s = 2;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 4, 11);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test25() {
		int constructor = 0;
		int select = 3;
		int hour = 6;
		int minute = 38;
		int second = 55;
		int start_h = 6;
		int start_m = 0;
		int start_s = 8;
		int stop_h = 16;
		int stop_m = 30;
		int stop_s = 18;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test26() {
		int constructor = 0;
		int select = 3;
		int hour = 14;
		int minute = 54;
		int second = 54;
		int start_h = 6;
		int start_m = 54;
		int start_s = 54;
		int stop_h = 6;
		int stop_m = 54;
		int stop_s = 54;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test27() {
		int constructor = 0;
		int select = 3;
		int hour = 6;
		int minute = 14;
		int second = 54;
		int start_h = 6;
		int start_m = 54;
		int start_s = 54;
		int stop_h = 6;
		int stop_m = 54;
		int stop_s = 50;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test28() {
		int constructor = 1;
		int select = 4;
		int hour = 17;
		int minute = 4;
		int second = 42;
		int start_h = 7;
		int start_m = 7;
		int start_s = 11;
		int stop_h = 8;
		int stop_m = 56;
		int stop_s = 44;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(1, 49, 33);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test29() {
		int constructor = 0;
		int select = 3;
		int hour = 16;
		int minute = 1;
		int second = 24;
		int start_h = 11;
		int start_m = 27;
		int start_s = 4;
		int stop_h = 14;
		int stop_m = 9;
		int stop_s = 31;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test30() {
		int constructor = -1;
		int select = 2;
		int hour = 2;
		int minute = 13;
		int second = 45;
		int start_h = 22;
		int start_m = 34;
		int start_s = 34;
		int stop_h = 22;
		int stop_m = 34;
		int stop_s = 32;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	
	@Test
	public void test31() {
		int constructor = 0;
		int select = 1;
		int hour = 8;
		int minute = 2;
		int second = 24;
		int start_h = 23;
		int start_m = 7;
		int start_s = 49;
		int stop_h = 18;
		int stop_m = 14;
		int stop_s = 1;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test32() {
		int constructor = 0;
		int select = 4;
		int hour = 16;
		int minute = 50;
		int second = 24;
		int start_h = 3;
		int start_m = 18;
		int start_s = 17;
		int stop_h = 9;
		int stop_m = 13;
		int stop_s = 15;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(5, 54, 58);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test33() {
		int constructor = 0;
		int select = 0;
		int hour = 4;
		int minute = 48;
		int second = 28;
		int start_h = 0;
		int start_m = 16;
		int start_s = 8;
		int stop_h = 3;
		int stop_m = 4;
		int stop_s = 58;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test34() {
		int constructor = 0;
		int select = 3;
		int hour = 9;
		int minute = 22;
		int second = 24;
		int start_h = 16;
		int start_m = 11;
		int start_s = 57;
		int stop_h = 16;
		int stop_m = 40;
		int stop_s = 45;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test35() {
		int constructor = 1;
		int select = 4;
		int hour = 15;
		int minute = 57;
		int second = 20;
		int start_h = 14;
		int start_m = 48;
		int start_s = 36;
		int stop_h = 12;
		int stop_m = 42;
		int stop_s = 31;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(2, 6, 5);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test36() {
		int constructor = 0;
		int select = 3;
		int hour = 8;
		int minute = 10;
		int second = 17;
		int start_h = 11;
		int start_m = 27;
		int start_s = 48;
		int stop_h = 11;
		int stop_m = 27;
		int stop_s = 54;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test37() {
		int constructor = 0;
		int select = 4;
		int hour = 6;
		int minute = 39;
		int second = 12;
		int start_h = 4;
		int start_m = 40;
		int start_s = 0;
		int stop_h = 4;
		int stop_m = 40;
		int stop_s = 40;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 40);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test38() {
		int constructor = 0;
		int select = 4;
		int hour = 8;
		int minute = 2;
		int second = 24;
		int start_h = 8;
		int start_m = 49;
		int start_s = 1;
		int stop_h = 8;
		int stop_m = 44;
		int stop_s = 28;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 4, 33);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test39() {
		int constructor = 0;
		int select = 4;
		int hour = 0;
		int minute = 2;
		int second = 7;
		int start_h = 22;
		int start_m = 28;
		int start_s = 55;
		int stop_h = 22;
		int stop_m = 35;
		int stop_s = 56;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 7, 1);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test40() {
		int constructor = 0;
		int select = 3;
		int hour = 20;
		int minute = 43;
		int second = 0;
		int start_h = 20;
		int start_m = 8;
		int start_s = 8;
		int stop_h = 20;
		int stop_m = 8;
		int stop_s = 8;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test41() {
		int constructor = 0;
		int select = 3;
		int hour = 20;
		int minute = 43;
		int second = 0;
		int start_h = 20;
		int start_m = 8;
		int start_s = 8;
		int stop_h = 20;
		int stop_m = 8;
		int stop_s = 8;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test42() {
		int constructor = 0;
		int select = 4;
		int hour = 9;
		int minute = 22;
		int second = 24;
		int start_h = 4;
		int start_m = 40;
		int start_s = 57;
		int stop_h = 4;
		int stop_m = 40;
		int stop_s = 40;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 17);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test43() {
		int constructor = 0;
		int select = 1;
		int hour = 16;
		int minute = 16;
		int second = 16;
		int start_h = 16;
		int start_m = 16;
		int start_s = 16;
		int stop_h = 16;
		int stop_m = 16;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test44() {
		int constructor = -1;
		int select = 1;
		int hour = 17;
		int minute = 4;
		int second = 56;
		int start_h = 7;
		int start_m = 7;
		int start_s = 11;
		int stop_h = 8;
		int stop_m = 56;
		int stop_s = 44;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test45() {
		int constructor = 0;
		int select = 2;
		int hour = 4;
		int minute = 29;
		int second = 54;
		int start_h = 0;
		int start_m = 7;
		int start_s = 9;
		int stop_h = 23;
		int stop_m = 8;
		int stop_s = 20;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test46() {
		int constructor = -1;
		int select = 2;
		int hour = 9;
		int minute = 4;
		int second = 42;
		int start_h = 8;
		int start_m = 34;
		int start_s = 11;
		int stop_h = 16;
		int stop_m = 48;
		int stop_s = 12;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test47() {
		int constructor = 1;
		int select = 4;
		int hour = 8;
		int minute = 31;
		int second = 15;
		int start_h = 11;
		int start_m = 41;
		int start_s = 52;
		int stop_h = 8;
		int stop_m = 4;
		int stop_s = 59;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(3, 36, 53);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test48() {
		int constructor = 0;
		int select = 3;
		int hour = 11;
		int minute = 29;
		int second = 9;
		int start_h = 2;
		int start_m = 58;
		int start_s = 1;
		int stop_h = 5;
		int stop_m = 26;
		int stop_s = 33;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test49() {
		int constructor = 1;
		int select = 4;
		int hour = 17;
		int minute = 4;
		int second = 42;
		int start_h = 15;
		int start_m = 7;
		int start_s = 11;
		int stop_h = 8;
		int stop_m = 56;
		int stop_s = 44;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(6, 10, 27);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	
	@Test
	public void test50() {
		int constructor = 1;
		int select = 0;
		int hour = 17;
		int minute = 4;
		int second = 42;
		int start_h = 2;
		int start_m = 7;
		int start_s = 11;
		int stop_h = 2;
		int stop_m = 41;
		int stop_s = 14;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test51() {
		int constructor = 1;
		int select = 4;
		int hour = 13;
		int minute = 24;
		int second = 58;
		int start_h = 3;
		int start_m = 39;
		int start_s = 39;
		int stop_h = 3;
		int stop_m = 39;
		int stop_s = 39;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test52() {
		int constructor = 1;
		int select = 4;
		int hour = 17;
		int minute = 12;
		int second = 42;
		int start_h = 7;
		int start_m = 7;
		int start_s = 11;
		int stop_h = 7;
		int stop_m = 39;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 32, 5);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test53() {
		int constructor = 1;
		int select = 4;
		int hour = 9;
		int minute = 12;
		int second = 40;
		int start_h = 7;
		int start_m = 47;
		int start_s = 48;
		int stop_h = 7;
		int stop_m = 32;
		int stop_s = 48;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 15, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test54() {
		int constructor = 1;
		int select = 3;
		int hour = 17;
		int minute = 20;
		int second = 42;
		int start_h = 19;
		int start_m = 43;
		int start_s = 58;
		int stop_h = 19;
		int stop_m = 43;
		int stop_s = 43;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(17, 20, 42);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test55() {
		int constructor = 0;
		int select = 3;
		int hour = 17;
		int minute = 15;
		int second = 42;
		int start_h = 7;
		int start_m = 36;
		int start_s = 16;
		int stop_h = 7;
		int stop_m = 24;
		int stop_s = 33;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test56() {
		int constructor = 0;
		int select = 3;
		int hour = 12;
		int minute = 12;
		int second = 13;
		int start_h = 12;
		int start_m = 48;
		int start_s = 48;
		int stop_h = 12;
		int stop_m = 48;
		int stop_s = 48;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test57() {
		int constructor = 0;
		int select = 4;
		int hour = 14;
		int minute = 11;
		int second = 40;
		int start_h = 13;
		int start_m = 49;
		int start_s = 0;
		int stop_h = 13;
		int stop_m = 49;
		int stop_s = 49;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 49);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test58() {
		int constructor = 0;
		int select = 1;
		int hour = 16;
		int minute = 16;
		int second = 16;
		int start_h = 8;
		int start_m = 16;
		int start_s = 16;
		int stop_h = 16;
		int stop_m = 8;
		int stop_s = 48;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test59() {
		int constructor = 0;
		int select = 3;
		int hour = 16;
		int minute = 16;
		int second = 32;
		int start_h = 16;
		int start_m = 16;
		int start_s = 16;
		int stop_h = 16;
		int stop_m = 16;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test60() {
		int constructor = 0;
		int select = 3;
		int hour = 16;
		int minute = 8;
		int second = 18;
		int start_h = 16;
		int start_m = 24;
		int start_s = 9;
		int stop_h = 8;
		int stop_m = 40;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test61() {
		int constructor = 0;
		int select = 4;
		int hour = 16;
		int minute = 20;
		int second = 16;
		int start_h = 16;
		int start_m = 16;
		int start_s = 16;
		int stop_h = 0;
		int stop_m = 8;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(16, 8, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test62() {
		int constructor = 0;
		int select = 0;
		int hour = 16;
		int minute = 11;
		int second = 16;
		int start_h = 16;
		int start_m = 16;
		int start_s = 12;
		int stop_h = 16;
		int stop_m = 16;
		int stop_s = 55;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test63() {
		int constructor = -1;
		int select = 0;
		int hour = 0;
		int minute = 52;
		int second = 16;
		int start_h = 16;
		int start_m = 8;
		int start_s = 24;
		int stop_h = 3;
		int stop_m = 15;
		int stop_s = 1;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test64() {
		int constructor = 0;
		int select = 2;
		int hour = 7;
		int minute = 16;
		int second = 24;
		int start_h = 16;
		int start_m = 32;
		int start_s = 24;
		int stop_h = 8;
		int stop_m = 14;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test65() {
		int constructor = 0;
		int select = 3;
		int hour = 16;
		int minute = 12;
		int second = 6;
		int start_h = 0;
		int start_m = 32;
		int start_s = 38;
		int stop_h = 0;
		int stop_m = 36;
		int stop_s = 38;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test66() {
		int constructor = 0;
		int select = 4;
		int hour = 23;
		int minute = 17;
		int second = 54;
		int start_h = 23;
		int start_m = 51;
		int start_s = 19;
		int stop_h = 16;
		int stop_m = 16;
		int stop_s = 43;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(7, 34, 36);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test67() {
		int constructor = 1;
		int select = 4;
		int hour = 5;
		int minute = 48;
		int second = 16;
		int start_h = 16;
		int start_m = 16;
		int start_s = 20;
		int stop_h = 17;
		int stop_m = 20;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(1, 3, 40);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test68() {
		int constructor = 0;
		int select = 4;
		int hour = 16;
		int minute = 16;
		int second = 16;
		int start_h = 16;
		int start_m = 16;
		int start_s = 16;
		int stop_h = 16;
		int stop_m = 16;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test69() {
		int constructor = 0;
		int select = 4;
		int hour = 16;
		int minute = 16;
		int second = 4;
		int start_h = 7;
		int start_m = 28;
		int start_s = 16;
		int stop_h = 16;
		int stop_m = 16;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(8, 48, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test70() {
		int constructor = 0;
		int select = 4;
		int hour = 16;
		int minute = 16;
		int second = 16;
		int start_h = 0;
		int start_m = 19;
		int start_s = 16;
		int stop_h = 0;
		int stop_m = 16;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 3, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test71() {
		int constructor = 0;
		int select = 4;
		int hour = 16;
		int minute = 16;
		int second = 16;
		int start_h = 16;
		int start_m = 16;
		int start_s = 16;
		int stop_h = 16;
		int stop_m = 40;
		int stop_s = 16;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 24, 0);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test72() {
		int constructor = 0;
		int select = 3;
		int hour = 8;
		int minute = 24;
		int second = 16;
		int start_h = 16;
		int start_m = 16;
		int start_s = 16;
		int stop_h = 16;
		int stop_m = 16;
		int stop_s = 0;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(23, 59, 59);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}

	@Test
	public void test73() {
		int constructor = 0;
		int select = 4;
		int hour = 11;
		int minute = 35;
		int second = 16;
		int start_h = 11;
		int start_m = 47;
		int start_s = 31;
		int stop_h = 11;
		int stop_m = 47;
		int stop_s = 47;
		Time start = new Time(start_h, start_m, start_s);
		Time stop = new Time(stop_h, stop_m, stop_s);
		if (constructor == 0) {
			Time t = new Time();
			Time result = new Time();
			Time expected = new Time(0, 0, 16);
			result = t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
		} else {
			Time _t = new Time(hour, minute, second);
			Time result = new Time();
			Time expected = new Time(0, 0, 0);
			result = _t.timeOptions(start, stop, select);
			assertEquals(true, result.equals(expected));
	        }
	}
}
