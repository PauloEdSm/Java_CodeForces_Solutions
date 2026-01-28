package CF279B;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CF279BBooks {
    //A resolution is for a problem 279B on CodeForces
    //https://codeforces.com/problemset/problem/279/B
    public static void main(String[] args) throws Exception {
        int dayCounter = 1;
        int currentSDayCounter = 1;
        int sum = 0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader (System.in));

        String firstLineRead = bufferedReader.readLine();
        StringTokenizer firstLineReader = new StringTokenizer(firstLineRead, " ");

        int numberOfBooks = Integer.parseInt(firstLineReader.nextToken());
        int maxTime = Integer.parseInt(firstLineReader.nextToken());

        String lastLineRead = bufferedReader.readLine();
        StringTokenizer lastLineReader = new StringTokenizer(lastLineRead, " ");

        int [] readingTimePerBook = new int[numberOfBooks];

        for (int index= 0; lastLineReader.hasMoreTokens() && index < readingTimePerBook.length; index++) {

            readingTimePerBook[index] = Integer.parseInt(lastLineReader.nextToken());

        }
        int start = 0;
        int maxBooks =0;
        for (int end = 0; end < numberOfBooks; end++) {

            sum += readingTimePerBook[end];

            while (sum > maxTime) {
                sum -= readingTimePerBook[start];
                start++;
            }

            int currentBooks = end - start + 1;
            if (currentBooks > maxBooks) {
                maxBooks = currentBooks;
            }
        }
        System.out.println(maxBooks);
    }
}
