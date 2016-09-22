package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

// JUnit Testing for PS2 Starts here:
	
	@Test
	public void TestIsEven1(){
		MyInteger a = new MyInteger(2);
		MyInteger b = new MyInteger(3);
		MyInteger c = new MyInteger(6);
		assertTrue(a.isEven());
		assertFalse(b.isEven());
		assertTrue(c.isEven());
	}
	@Test
	public void TestIsOdd1(){
		MyInteger a = new MyInteger(2);
		MyInteger b = new MyInteger(3);
		MyInteger c = new MyInteger(6);
		assertFalse(a.isOdd());
		assertTrue(b.isOdd());
		assertFalse(c.isOdd());
	}
	@Test
	public void TestIsPrime1(){
		MyInteger a = new MyInteger(17);
		MyInteger b = new MyInteger(32);
		MyInteger c = new MyInteger(109);
		MyInteger d = new MyInteger(1);
		assertTrue(a.isPrime());
		assertFalse(b.isPrime());
		assertTrue(c.isPrime());
		assertFalse(d.isPrime());
	}

	@Test
	public void TestIsEven2(){
		assertTrue(MyInteger.isEven(8));
		assertFalse(MyInteger.isEven(17));
		assertTrue(MyInteger.isEven(82));
	}
	@Test
	public void TestIsOdd2(){
		assertTrue(MyInteger.isOdd(11));
		assertFalse(MyInteger.isOdd(16));
		assertTrue(MyInteger.isOdd(33));
	}
	@Test
	public void TestIsPrime2(){
		assertTrue(MyInteger.isPrime(2));
		assertFalse(MyInteger.isPrime(16));
		assertFalse(MyInteger.isPrime(33));
	}

	@Test
	public void TestIsEven3(){
		MyInteger a = new MyInteger(8);
		MyInteger b = new MyInteger(15);
		MyInteger c = new MyInteger(22);
		assertTrue(MyInteger.isEven(a));
		assertFalse(MyInteger.isEven(b));
		assertTrue(MyInteger.isEven(c));
	}
	@Test
	public void TestIsOdd3(){
		MyInteger a = new MyInteger(7);
		MyInteger b = new MyInteger(30);
		MyInteger c = new MyInteger(23);
		assertTrue(MyInteger.isOdd(a));
		assertFalse(MyInteger.isOdd(b));
		assertTrue(MyInteger.isOdd(c));
	}
	@Test
	public void TestIsPrime3(){
		MyInteger a = new MyInteger(7);
		MyInteger b = new MyInteger(18);
		MyInteger c = new MyInteger(3);
		assertTrue(MyInteger.isPrime(a));
		assertFalse(MyInteger.isPrime(b));
		assertTrue(MyInteger.isPrime(c));
	}

	@Test
	public void TestEquals1(){
		MyInteger a = new MyInteger(4);
		MyInteger b = new MyInteger(8);
		MyInteger c = new MyInteger(12);
		assertTrue(a.equals(4));
		assertFalse(b.equals(9));
		assertTrue(c.equals(12));
	}
	@Test
	public void TestEquals2(){
		MyInteger a = new MyInteger(5);
		MyInteger b = new MyInteger(7);
		assertTrue(a.equals(a));
		assertTrue(b.equals(b));
		assertFalse(a.equals(b));
	}
}
