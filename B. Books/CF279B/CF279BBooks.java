package CF279B;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF279BBooks {
    //A resolution is for a problem 279B on CodeForces
    //https://codeforces.com/problemset/problem/279/B
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader (System.in));

        String firstLineRead = bufferedReader.readLine();
        StringTokenizer firstLineReader = new StringTokenizer(firstLineRead, " ");

        int totalBooks = Integer.parseInt(firstLineReader.nextToken());
        int pagesPerDay = Integer.parseInt(firstLineReader.nextToken());

        String lastLineRead = bufferedReader.readLine();
        StringTokenizer lastLineReader = new StringTokenizer(firstLineRead, " ");

        int [] readingTimePerBook = new int[totalBooks];

        for (int index= 0; lastLineReader.hasMoreTokens() && index < readingTimePerBook.length; index++) {

            readingTimePerBook[index] = Integer.parseInt(lastLineReader.nextToken());

        }
        Arrays.stream(readingTimePerBook).forEach(System.out::println);

    }
}
