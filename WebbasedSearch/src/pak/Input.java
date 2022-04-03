/*
 * Software Architecture & Design
 * SE4433/CMSC5433
 * Assignment 3
 * 2/22/2022
 * Stephen Key and Chad Marshall
 */

package pak;

/*
 * @author Chad Marshall
 */
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Input implements ActionListener {
	// Component Declarations.
	JFrame f = new JFrame();
	Button b = new Button();
	Button r = new Button();
	JTextArea t1 = new JTextArea();
	JTextArea t2 = new JTextArea();

	// List of lists that will hold each line, word by word.
	static ArrayList<ArrayList<String>> box = new ArrayList<ArrayList<String>>();
	static ArrayList<String> presentation = new ArrayList<String>();

	// Enums for ActionCommands
	private enum Actions {
		RESET, ENGAGE
	}

	/*
	 * Sets properties of display that user interacts with.
	 */
	Input() {
		// Add Components to Frame.
		f.add(b);
		f.add(r);
		f.add(t1);
		f.add(t2);

		// Apply settings to components.
		t1.setBounds(20, 100, 400, 400);
		t2.setBounds(520, 100, 400, 400);
		r.setBounds(700, 600, 80, 30);
		r.setLabel("Reset");
		r.setActionCommand(Actions.RESET.name());
		r.addActionListener(this);
		b.setBounds(820, 600, 80, 30);
		b.setLabel("Engage!");
		b.setActionCommand(Actions.ENGAGE.name());
		b.addActionListener(this);
		f.setSize(1000, 1000);
		f.setTitle("Webbased Search Engine");
		f.setLayout(null);
		f.setVisible(true);
	}

	/*
	 * EFFECTS: Prints out List of Lists for debugging.
	 * 
	 * @param None.
	 * 
	 * @return None.
	 */
	static public void print() {
		for (int i = 0; i < box.size(); i++) {
			for (int j = 0; j < box.get(i).size(); j++)
				System.out.print(box.get(i).get(j) + " ");
			System.out.print("\n");
		}
	}

	/*
	 * EFFECTS: Creates display for user to use.
	 * 
	 * @param String array for arguments entered by user.
	 * 
	 * @return None.
	 */
	public static void main(String[] args) {

		Input display = new Input();
	}

	/*
	 * EFFECTS: Acts as en event listener based on what the user does in the
	 * display.
	 * 
	 * @param ActionEvent that controls which event is executing from which Button.
	 * 
	 * @return None.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		final long startTime = System.currentTimeMillis();
		Organizer alpha = new Organizer();

		// Takes user input from JTextArea and parses the data into line, then words.
		if (e.getActionCommand() == Actions.ENGAGE.name()) {

			// Splits the JTextArea data by the newline character, making an array of lines.
			String[] rowWords = t1.getText().split("\n");

			presentation = new ArrayList<>(Arrays.asList(rowWords));

			for (int i = 0; i < t1.getLineCount(); i++) {
				// Splits a single line by the whitespace, making an array of words.
				String[] colWords = rowWords[i].split(" ");
				ArrayList<String> t = new ArrayList<String>();
				// Convert array to list.
				for (int j = 0; j < colWords.length; j++) {
					t.add(colWords[j]);
				}
				box.add(t); // Add the list to the list of lists.
			}
			Shifter circ = new Shifter();

			// Perform the shifting and alphabetizing.
			// Original Assignment

			ArrayList<String> test = alpha.Sort(circ.circShift(box));

			// Video Demonstration
			// ArrayList<String> test = circ.parse(alpha.Sort(presentation));

			for (int i = 0; i < test.size(); i++) {
				// Output the result to the user.
				t2.append(test.get(i) + "\n");
			}

			box.clear();// Purge the list of lists.
			presentation.clear();

		} else if (e.getActionCommand() == Actions.RESET.name()) {
			box.clear();
			presentation.clear();
			// Purge JTextAreas
			t1.setText("");
			t2.setText("");

		}
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) + "ms");
	}
}
