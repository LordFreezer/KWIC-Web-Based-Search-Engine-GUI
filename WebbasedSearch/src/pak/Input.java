package pak;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Input implements ActionListener {
	JFrame f = new JFrame();
	Button b = new Button();
	JTextArea t1 = new JTextArea();
	JTextArea t2 = new JTextArea();
	static ArrayList<ArrayList<String>> box = new ArrayList<ArrayList<String>>();

	Input() {

		// Component Declarations

		// Add Components to Frame
		f.add(b);
		f.add(t1);
		f.add(t2);

		// Apply settings to components
		t1.setBounds(20, 100, 400, 400);
		t2.setBounds(520, 100, 400, 400);
		b.setBounds(820, 600, 80, 30);
		b.setLabel("Engage!");
		b.addActionListener(this);
		f.setSize(1000, 1000);
		f.setTitle("Webbased Search Engine");
		f.setLayout(null);
		f.setVisible(true);

	}

	static public void print() {
		for (int i = 0; i < box.size(); i++) {
			for (int j = 0; j < box.get(i).size(); j++)
				System.out.print(box.get(i).get(j) + " ");
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {

		Input display = new Input();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String[] rowWords = t1.getText().split("\n");
		for (int i = 0; i < t1.getLineCount(); i++) {
			String[] colWords = rowWords[i].split(" ");
			ArrayList<String> t = new ArrayList<String>();
			for (int j = 0; j < colWords.length; j++) {
				t.add(colWords[j]);
			}
			box.add(t);
		}

		Shifter circ = new Shifter();
		Organizer alpha = new Organizer();
		/******************************************************************
		 * Testing *
		 ******************************************************************/

//Pipe and Filter
//Software Architecture in Practice

		// Test of both Shifter and Organizer
//		ArrayList<String> test = alpha.Sort(circ.circShift(box));

		// Isolated Shifting Test
		ArrayList<String> test = circ.circShift(box);

		// Isolated Organizer Test
//		ArrayList<String> test = new ArrayList<String>();
//		test.add("Filter and Pipe");
//		test.add("Filter Pipe and");
//		test.add("Pipe and Filter");
//		test.add("Architecture in Practice Software");
//		test.add("in Practice Software Architecture");
//		test.add("Practice Software Architecture in");
//		test.add("Software Architecture in Practice");
//		alpha.Sort(test);

		for (int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}

	}
}
