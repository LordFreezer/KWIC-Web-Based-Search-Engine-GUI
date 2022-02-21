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
	Button r = new Button();
	JTextArea t1 = new JTextArea();
	JTextArea t2 = new JTextArea();
	static ArrayList<ArrayList<String>> box = new ArrayList<ArrayList<String>>();

	private enum Actions {
		RESET, ENGAGE
	}

	Input() {

		// Component Declarations

		// Add Components to Frame
		f.add(b);
		f.add(r);
		f.add(t1);
		f.add(t2);

		// Apply settings to components
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
		if (e.getActionCommand() == Actions.ENGAGE.name()) {
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
			ArrayList<String> test = alpha.Sort(circ.circShift(box));
			for (int i = 0; i < test.size(); i++) {
				t2.append(test.get(i) + "\n");
			}
			box.clear();

		} else if (e.getActionCommand() == Actions.RESET.name()) {
			box.clear();
			t1.setText("");
			t2.setText("");

		}
	}
}
