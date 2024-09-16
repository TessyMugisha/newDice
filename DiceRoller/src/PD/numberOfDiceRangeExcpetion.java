package PD;
/**
* numberOfDiceRangeException is a Class that creates an exception and throws it
* 
* @package PD
* @author(TessyMugisha) 
*/
public class numberOfDiceRangeExcpetion extends Exception 
{
	/**
     * Constructs a new numberOfDiceRangeExcpetion with the specified detail message.
     *
     * @param message The detail message describing the exception.
     */
	public numberOfDiceRangeExcpetion(String message)
	{
		super("Dice must be greater then zero");
	}
}

		