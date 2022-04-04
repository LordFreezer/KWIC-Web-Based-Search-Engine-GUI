package sharedata;

import javax.swing.JTextArea;

/**
 * 
 */
public class MastControl {

	/**
	 * Default constructor
	 */
	public MastControl(Input window) {
		CircularShifter cs = new CircularShifter(window.local);

		Alphabetizer az = new Alphabetizer(cs);

		Display(az, window.t2);

	}

	public static void Display(ILineSet ls, JTextArea t2) {
		int f = 0, g = 0, h = 0;
		while (true) {
			if (ls.getChar(f, g, h) == 0) {
				h = 0;
				g++;
				// System.out.print(' ');
				t2.append(" ");

			}
			if (ls.getChar(f, g, h) == 0) {
				g = 0;
				f++;
				// System.out.print('\n');
				t2.append("\n");
			}
			if (ls.getChar(f, g, h) == 0) {
				break;
			}
			// System.out.print(ls.getChar(f, g, h));
			t2.append(ls.getChar(f, g, h) + "");
			h++;
		}
	}
}