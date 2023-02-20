/**
 * Implements the <i>Facade </i> role in the pattern by providing a higher-level
 * interface to the operations provided by <code>RegularScreen</code>,
 * <code>Decoration</code>, and <code>StringTransformer</code>.
 *  
 */

public class OutputFacade
{

	/**
	 * Prints a string using <code>RegularScreen</code>.
	 * 
	 * @param s
	 *            the string to print
	 */

	public void printNormal( String s )
	{
		RegularScreen.print( s );
		RegularScreen.newline();
	}

	/**
	 * Prints a two versions of string with decorations using
	 * <code>RegularScreen</code> and <code>Decoration</code>.
	 * 
	 * @param s
	 *            the string to print
	 */

	public void printFancy( final String s )
	{
		printDecoration();

		RegularScreen.print( StringTransformer.transformToUpper( s + " (uppercase)" ) );
		RegularScreen.newline();

		printDecoration();

		RegularScreen.print( StringTransformer.transformToLower( s + " (lowercase)" ) );
		RegularScreen.newline();

		printDecoration();
	}

	/**
	 * Prints a decorator string.
	 */

	public void printDecoration()
	{
		RegularScreen.print( Decoration.getDecoration() );
		RegularScreen.newline();
		RegularScreen.newline();
	}
}
