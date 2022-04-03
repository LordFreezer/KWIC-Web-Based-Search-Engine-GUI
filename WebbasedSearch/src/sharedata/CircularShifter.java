
import java.util.ArrayList;

/**
 *
 * @author Stephen Key
 */
public class CircularShifter implements ILineSet {

    private ILineSet reference;
    private ArrayList<Integer> lines;
    private ArrayList<Integer> offsets;

    public CircularShifter(ILineSet ls) {
        reference = ls;
        lines = new ArrayList();
        offsets = new ArrayList();
        makeShift();
    }

    public void makeShift() {
        for (int g = 0; g < reference.lineCount(); g++) {
            for (int h = 0; h < reference.wordCountAt(g); h++) {
                if (!isFiller(g, h)) {
                    lines.add(g);
                    offsets.add(h);
                }
            }
        }
    }

    private boolean isFiller(int i, int j) {
        String[] ref = {"a", "an", "the", "and", "or", "of", "to", "be", "is", "in", "out", "by", "as", "at", "off"};
        String word = "";
        for(int g=0; g < reference.charCountAt(i, j); g++)
            word += reference.getChar(i, j, g);
        for (String s : ref)
        {
            if (word.equals(s))
                    return true;
        }
        return false;
    }

    @Override
    public char getChar(int i, int j, int k) {
        if(i >= lines.size() || i < 0)
            return 0;
        if(j >= reference.wordCountAt(lines.get(i)))
            return 0;
        else {
            int a = j + offsets.get(i);
            if (a >= reference.wordCountAt(lines.get(i))) {
                a -= reference.wordCountAt(lines.get(i));
            }
            return reference.getChar(lines.get(i), a, k);
        }
    }

    @Override
    public int lineCount() {
        return lines.size();
    }

    @Override
    public int wordCountAt(int i) {
        if (i < lines.size() && i >= 0) {
            return reference.wordCountAt(lines.get(i));
        } else {
            return 0;
        }
    }

    @Override
    public int charCountAt(int i, int j) {
        if(i >= lines.size() || i < 0)
            return 0;
        if(j >= reference.wordCountAt(lines.get(i)))
            return 0;
        else {
            int a = j + offsets.get(i);
            if (a >= reference.wordCountAt(lines.get(i))) {
                a -= reference.wordCountAt(lines.get(i));
            }
            return reference.charCountAt(lines.get(i), a);
        }
    }

}
