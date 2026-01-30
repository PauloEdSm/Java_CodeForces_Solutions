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

        int startIndex = 0;
        int bestStartIndex = 0;
        int sum = 0;
        for (int endIndex = 0; endIndex<plankCount;endIndex++) {
            sum += plankHeights[endIndex];
            while (sum < minWindowSum) {
                sum -= plankHeights[startIndex];
                startIndex++;
            }
            int currentPlanks = endIndex - startIndex;
            if (currentPlanks < bestStartIndex)
                bestStartIndex = currentPlanks;
        }
        System.out.println(bestStartIndex);
    }
}