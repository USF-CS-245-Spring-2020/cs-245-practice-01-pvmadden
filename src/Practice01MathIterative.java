/**
 * Practice 01 Math Iterative
 * CS 245 - Part of the first practice assignment
 * This class contains the iterative form of the desired functions
 * @author pmadden
 *
 */
public class Practice01MathIterative implements Practice01Math
{
	/**
	 * Function is derived from in class notes.
	 */
	public int fact(int n) throws Exception
	{
		int f = 1;

		if(n <= 0)
		{
			throw new Exception("Input cannot be less than or equal to zero.");
		}

		for(int i = n; i >= 1; i--)
		{
			f *= i;
		}
		return f;
	}

	public int fib (int n) throws Exception
	{
		int[] term = new int[]{0,0};

		if(n < 0)
		{
			throw new Exception("Input cannot be less than zero.");
		}

		//roundRobin switches which index of term is modified per loop.
		int roundRobin = 0;
		int result = 0;

		for(int i = 0; i != n; i++)
		{
			//System.out.println(i + " " + n); my previous debugging
				if(term[roundRobin] == 0)
				{
					term[roundRobin]++;
				}
				else
				{
					term[roundRobin] = term[0]+ term[1];
				}

				//Without this, the index returned when i = n would be the wrong one.
				result = term[roundRobin];

				if (roundRobin == 0)
				{
					roundRobin++;
				}
				else
				{
					roundRobin--;
				}
		}

		return result;
	}

	public static void main(String[] args) throws Exception
	{
		Practice01MathIterative test = new Practice01MathIterative();
		int arg = Integer.parseInt(args[0]);
		System.out.println(test.fib(arg));
	}
}