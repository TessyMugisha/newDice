package PD;
import java.util.Random;
/**
* Dice is a Class that represents the faces 
* 
* @package PD
* @author(TessyMugisha) 
*/

public class Dice 
{
	private int numberOfFaces;
	private int currentFace;
	private Random randomGen;
	/**
     * Constructor for initializing a Dice object with a specified number of faces.
     *
     * @param numberOfFaces The number of faces on the die.
     */
	public Dice(int numberOfFaces)
	{
		this.numberOfFaces=numberOfFaces;
		randomGen=new Random();
	}
	 /**
     * Retrieves the number of faces on the die.
     *
     * @return The number of faces on the die.
     */
	public int getNumberOfFaces() 
	{
		return numberOfFaces;
	}
	/**
     * Sets the number of faces on the die.
     *
     * @param numberOfFaces The new number of faces to set.
     * @throws numberOfFaceRangeException If the provided number of faces is less than or equal to zero.
     */
	public void setNumberOfFaces(int numberOfFaces)throws numberOfFaceRangeException 
	{
		if(numberOfFaces<=0)
		{
			numberOfFaceRangeException exception= new numberOfFaceRangeException(" Number of faces must be greater than zero");
			throw exception;
		}
		else
			this.numberOfFaces = numberOfFaces;
	}
	 /**
     * Retrieves the current face of the die.
     *
     * @return The current face of the die.
     */
	public int getCurrentFace() 
	{
		return currentFace;
	}
	/**
     * Sets the current face of the die.
     *
     * @param currentFace The new current face to set.
     */
	public void setCurrentFace(int currentFace) 
	{
		this.currentFace = currentFace;
	}
	/**
     * Retrieves the currently set random number generator.
     *
     * @return The Random object representing the current random number generator.
     */
	public Random getRandom()
	{
		return randomGen;
	}
	/**
	 * Sets the random number generator to be used by this class.
	 * 
	 * @param randomGen The Random object to set as the random number generator.
	 */
	public void setRandom(Random randomGen)
	{
		this.randomGen=randomGen;
	}
	/**
	 * Simulates rolling a multi-sided die and returns the result.
	 * 
	 * @return The randomly generated integer representing the face of the die rolled.
	 */
	public int roll()
	{
		return currentFace=randomGen.nextInt(numberOfFaces)+1;
	}
	/**
     * Returns a string representation of the current face of the die.
     *
     * @return A string representation of the current face of the die.
     */
	public String toString()
	{
		return Integer.toString(currentFace);
	}
	
}
