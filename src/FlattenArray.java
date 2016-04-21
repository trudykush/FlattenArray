/*
 * Write a function that will flatten an array of 
 * arbitrarily nested arrays of integers into a flat array of integers.
 * e.g. [[1,2,[3]],4] → [1,2,3,4]. 
 * If the language you're using has a function to flatten arrays,
 * you should pretend it doesn't exist.
 */


import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FlattenArray 
{
	private static final int ERROR_MESSAGE = 0;

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Output File");

		//JOptionPane for Taking User Input
		String arrayInput= JOptionPane.showInputDialog("Please Enter Nested Array. For Ex: [[1,2,[3]],4]", "[[1,2,[3]],4]");

		
		
		//To Check that input given by user is in proper format of Array
		if(arrayInput.startsWith("[") && arrayInput.endsWith("]"))
		{
			String replacing = arrayInput.replaceAll("\\[", "");
			String replaced = replacing.replaceAll("\\]", "");
			
			// JOptionPane for Giving Output to user.
			JOptionPane.showMessageDialog(frame,
					"Flatten Array is: [" + replaced + "]", 
					"Flatten Array", 
					JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		else
		{
			// To display Error message if input in not in Array Format.
			JOptionPane.showMessageDialog(null, "Invalid Input", "Error", ERROR_MESSAGE); 
		}
}

}
