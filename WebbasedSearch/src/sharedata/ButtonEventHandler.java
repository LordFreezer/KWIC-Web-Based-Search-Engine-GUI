package sharedata;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import sharedata.Input.Actions;

public class ButtonEventHandler implements ActionListener {
	private Input window;

	public ButtonEventHandler(Input window) {
		this.window = window;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() instanceof JButton) {
			System.out.println("JButton pressed");
			// JButton eventSrc = (JButton) event.getSource();
			if (event.getActionCommand() == Actions.ENGAGE.name()) {
				System.out.println("Engage pressed");
				window.Read();

				MastControl controller = new MastControl(window);

			} else if (event.getActionCommand() == Actions.RESET.name()) {

				// Purge JTextAreas
				window.t1.setText("");
				window.t2.setText("");

			}

		}
	}
}
