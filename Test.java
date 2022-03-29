public class Test {
    public static void main(String[] args)
    {
        //Declare new LineStorage
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
        
        char c = l.getChar(0, 0, 0);
        for(int f = 0; f < l.lineCount(); f++)
        {
           c = l.getChar(f, 0, 0);
           for(int g = 0; g < l.wordCountAt(f); g++)
            {
                c = l.getChar(f, g, 0);
                for(int h = 0; h < l.charCountAt(f, g); h++)
                {
                    c = l.getChar(f, g, h);
                    System.out.print(c);
                }
                System.out.print(' ');
            }
            System.out.print('\n');
        }
    }
}
