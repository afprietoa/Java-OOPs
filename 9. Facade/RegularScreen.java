
/**
 * Implements a low-level interface for printing to System.out.
 *  
 */

public class RegularScreen
{
	/**
	 * Prints a string to System.out.
	 * 
	 * @param s
	 *            the string to print
	 */

	public static void print( final String s )
	{
		System.out.print( s );
	}

	/**
	 * Prints a newline to System.out.
	 */

	public static void newline()
	{
		System.out.println();
	}
}
