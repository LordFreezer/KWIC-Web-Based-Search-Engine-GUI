package pak;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.util.ArrayList;

public class Input {
	Input() {
		// Component Declarations
		Frame f = new Frame();
		Button b = new Button();
		TextField t1 = new TextField();
		TextField t2 = new TextField();

		// Add Components to Frame
		f.add(b);
		f.add(t1);
		f.add(t2);

		// Apply settings to components
		t1.setBounds(20, 100, 400, 400);
		t2.setBounds(420, 100, 400, 400);
		b.setBounds(820, 470, 80, 30);
		b.setLabel("Engage!");
		f.setSize(1000, 1000);
		f.setTitle("Webbased Search Engine");
		f.setLayout(null);
		f.setVisible(true);

	}

	public static void main(String[] args) {

		Input display = new Input();

		ArrayList<String> l = new ArrayList<String>();

		l.add("Pipe");
		l.add("and");
		l.add("Filter");

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i) + " ");
		}
		System.out.println("\n");

		Organizer test = new Organizer();
		test.Sort(l);

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i) + " ");
		}

	}

}
