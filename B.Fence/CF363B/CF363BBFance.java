package CF363B;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF363BBFance {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader (System.in));

        String firstLineRead = bufferedReader.readLine();
        StringTokenizer firstLineReader = new StringTokenizer(firstLineRead, " ");
        int plankCount = Integer.parseInt(firstLineReader.nextToken());
        int minWindowSum = Integer.parseInt(firstLineReader.nextToken());

        String lastLineRead = bufferedReader.readLine();
        StringTokenizer lastLineReader = new StringTokenizer(lastLineRead, " ");

        int[] plankHeights = new int[plankCount];

        for (int index = 0; index < plankCount;index++){
            plankHeights[index] = Integer.parseInt(lastLineReader.nextToken());
        }
    }
}
