package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		return MyInteger.isEven(iValue); // returns True if iValue is even
	}

	public boolean isOdd() {
		return MyInteger.isOdd(iValue);
	}

	public boolean isPrime() {
		return MyInteger.isPrime(iValue);
	}

	public static boolean isEven(int x) {
		if (x % 2 == 0) 	// actual even check just coded once for briefer code
			return true;
		else
			return false;
	}

	public static boolean isOdd(int x) {
		if (x % 2 != 0)
			return true;
		else
			return false;
	}

	public static boolean isPrime(int x) {
		if (x < 2)
			return false;
		if (x == 2 || x == 3)
			return true;
		if (x % 2 == 0)
			return false;
		int root = (int) (Math.sqrt(x) + 1);
		for (int i = 2; i < root; i++) {
			if (x % i == 0)
				return false;
		}
		return true;
	}
		
	public static boolean isEven(MyInteger myInt) {
		return MyInteger.isEven(myInt.getiValue()); // returns True is specified value is even
	}

	public static boolean isOdd(MyInteger myInt) {
		return MyInteger.isOdd(myInt.getiValue());
	}

	public static boolean isPrime(MyInteger myInt) {
		return MyInteger.isPrime(myInt.getiValue());
	}

	public boolean equals(int x) {
		if (x == iValue) 
			return true;  // returns True if the entered integer is equal to the specified value
		else
			return false;
	}

	public boolean equals(MyInteger myInt) {
		if (myInt.getiValue() == iValue) // returns true if object value is equal to specified value
			return true;
		else
			return false;
	}
}