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
        int windowSize = Integer.parseInt(firstLineReader.nextToken());


        String lastLineRead = bufferedReader.readLine();
        StringTokenizer lastLineReader = new StringTokenizer(lastLineRead, " ");
        int[] plankHeights = new int[plankCount];
        for (int index = 0; index < plankCount;index++){
            plankHeights[index] = Integer.parseInt(lastLineReader.nextToken());
        }
        int currentSum = 0;
        for (int j = 0; j < windowSize; j++) {
            currentSum += plankHeights[j];
        }

        int bestStartIndex = 0;
        int minSum =  currentSum;

        for (int endIndex = windowSize; endIndex<plankCount;endIndex++) {
            currentSum += plankHeights[endIndex];
            currentSum -=plankHeights[endIndex - windowSize];
                if (currentSum < minSum) {
                    minSum = currentSum;
                    bestStartIndex = endIndex - windowSize + 1;
                }
            }
        System.out.println(bestStartIndex + 1);
    }
}