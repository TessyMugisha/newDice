package PD;
/**
* numberOfFaceRangeException is a Class that creates an exception and throws it
* 
* @package PD
* @author(TessyMugisha) 
*/

public class numberOfFaceRangeException extends Exception
{
	 /**
     * Constructs a new numberOfFaceRangeException with an error message.
     *
     * @param message The detail message describing the exception.
     */
		public numberOfFaceRangeException(String message)
		{
			super("Faces should be greater than zero");
		}
	
}
