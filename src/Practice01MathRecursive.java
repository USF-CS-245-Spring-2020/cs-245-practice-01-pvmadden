/**
 * Practice 01 Math Recursive
 * CS 245 - Part of the first practice assignment
 * This class contains the recursive form of the desired functions
 * @author pmadden
 *
 */
public class Practice01MathRecursive implements Practice01Math
{
	/**
	 * Function is derived from in class notes.
	 */
	public int fact(int n) throws Exception
	{
		if(n <= 0)
		{
			throw new Exception("Input cannot be less than or equal to zero.");
		}

		if(n == 1)
		{
			return n;
		}

		return n * fact(n-1);
	}

	/**
	 * Function is derived from in class notes.
	 */
	public int fib (int n) throws Exception
	{
		if(n < 0)
		{
			throw new Exception("Input cannot be less than zero.");
		}

		if(n < 2)
		{
			return n;
		}

		return fib(n-1) + fib(n-2);
	}


	public static void main(String[] args) throws Exception
	{
		Practice01MathRecursive test = new Practice01MathRecursive();
		int arg = Integer.parseInt(args[0]);
		System.out.println(test.fib(arg));
	}
}