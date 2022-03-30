package sharedata;

/**
 * 
 */
public class MastControl {

	/**
	 * Default constructor
	 */
	public MastControl(Input window) {
		Output display = new Output(window.local);
		display.Print(window.t2);
	}

}