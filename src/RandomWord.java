import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String readIn;
        String champion = "";
        int index = 0;
        while (!StdIn.isEmpty()) {
            readIn = StdIn.readString();
            index++;
            if (StdRandom.bernoulli(1.0 / index)) {
                champion = readIn;
            }
        }
        StdOut.println(champion);

    }
}
