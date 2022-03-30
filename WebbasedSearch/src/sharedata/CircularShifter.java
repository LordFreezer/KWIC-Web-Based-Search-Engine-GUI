package sharedata;

import java.util.ArrayList;

/**
 * 
 */
public class CircularShifter {
	int[] lineLengths;
	private LineStorage reference;

	/**
	 * Constructor: Fills in the Reference attribute and stores is line lengths in lineLengths
	 */
	public CircularShifter(LineStorage ls) {
		//Fill the reference attribute
		reference = ls;
		
		//Store the length of each line
		lineLengths = new int[reference.linecount()];
		for (int g = 0; g < lineLengths.length; g++)
		{
			lineLengths[g] = wordCountAt(g);
		}
	}
	
	/**
	 * We may not even need this function :P
	 */
	public void makeShift() {
		// TODO implement here

	}

	/**
	 * Returns the k'th character in the j'th word in the i'th line in the Circular shift array
	 */
	public char getChar(int i, int j, int k) {
		//Find which line from LineStorage to pick from
		int g;
		for(g = 0; g < reference.linecount(); g++)
		{
			i -= lineLengths[g];
			if (i < 0)
			{
				i += lineLengths[g];
				break;
			}
		}
		
		int h = /*Find out which word this line should start on*/;
		if(/*The word we need to pick is after this line would wrap around*/)
			/*"Wrap around" h*/;
		
		return reference.getChar(g, h, k);
	}

}
