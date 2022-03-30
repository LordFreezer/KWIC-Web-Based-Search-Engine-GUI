package sharedata;

public class Test {
	public static void main(String[] args) {
		// Declare new LineStorage
		/*
		 * LineStorage l = new LineStorage();
		 * 
		 * // Line 1 l.addLine(); l.addWord(); l.addChar('H'); l.addChar('e');
		 * l.addChar('l'); l.addChar('l'); l.addChar('o'); l.addWord(); l.addChar('W');
		 * l.addChar('o'); l.addChar('r'); l.addChar('l'); l.addChar('d');
		 * l.addChar('!');
		 * 
		 * // Line 2 l.addLine(); l.addWord(); l.addChar('S'); l.addChar('h');
		 * l.addChar('a'); l.addChar('r'); l.addChar('e'); l.addChar('d'); l.addWord();
		 * l.addChar('D'); l.addChar('a'); l.addChar('t'); l.addChar('a'); l.addWord();
		 * l.addChar('D'); l.addChar('e'); l.addChar('s'); l.addChar('i');
		 * l.addChar('g'); l.addChar('n');
		 * 
		 * char c = l.getChar(0, 0, 0); for (int f = 0; f < l.lineCount(); f++) { c =
		 * l.getChar(f, 0, 0); for (int g = 0; g < l.wordCountAt(f); g++) { c =
		 * l.getChar(f, g, 0); for (int h = 0; h < l.charCountAt(f, g); h++) { c =
		 * l.getChar(f, g, h); System.out.print(c); } System.out.print(' '); }
		 * System.out.print('\n'); }
		 */
		LineStorage l = new LineStorage();
		Input display = new Input(l);
		
		LineStorage l = new LineStorage();
        //Line 1
        l.addLine();
        l.addWord();
        l.addChar('H');
        l.addChar('e');
        l.addChar('l');
        l.addChar('l');
        l.addChar('o');
        l.addWord();
        l.addChar('W');
        l.addChar('o');
        l.addChar('r');
        l.addChar('l');
        l.addChar('d');
        l.addChar('!');
        
        //Line 2
        l.addLine();
        l.addWord();
        l.addChar('S');
        l.addChar('h');
        l.addChar('a');
        l.addChar('r');
        l.addChar('e');
        l.addChar('d');
        l.addWord();
        l.addChar('D');
        l.addChar('a');
        l.addChar('t');
        l.addChar('a');
        l.addWord();
        l.addChar('D');
        l.addChar('e');
        l.addChar('s');
        l.addChar('i');
        l.addChar('g');
        l.addChar('n');
        
        //Line 3
        l.addLine();
        l.addWord();
        l.addChar('A');
        l.addChar('n');
        l.addChar('o');
        l.addChar('t');
        l.addChar('h');
        l.addChar('e');
        l.addChar('r');
        l.addWord();
        l.addChar('L');
        l.addChar('i');
        l.addChar('n');
        l.addChar('e');
        int f=0, g=0, h=0;
        //Display LineStorage
        System.out.println("--LINESTORAGE DISPLAY--");
        while(true)
        {
            if(l.getChar(f, g, h) == 0)
            {
                h = 0;
                g++;
                System.out.print(' ');
            }
            if(l.getChar(f, g, h) == 0)
            {
                g = 0;
                f++;
                System.out.print('\n');
            }
            if(l.getChar(f, g, h) == 0)
            {
                break;
            }
            System.out.print(l.getChar(f, g, h));
            h++;
            
        }
        System.out.println("--END LINESTORAGE DISPLAY--");
        
        //Test Alphabetizer
        System.out.println("--ALPHABETIZER TEST--");
        Alphabetizer a = new Alphabetizer(l);
        //a.Sort();
        f=0; g=0; h=0;
        while(true)
        {
            if(a.getChar(f, g, h) == 0)
            {
                h = 0;
                g++;
                System.out.print(' ');
            }
            if(a.getChar(f, g, h) == 0)
            {
                g = 0;
                f++;
                System.out.print('\n');
            }
            if(a.getChar(f, g, h) == 0)
            {
                break;
            }
            System.out.print(a.getChar(f, g, h));
            h++;
            
        }
        System.out.println("--END ALPHABETIZER TEST--");
    }

	}
}
