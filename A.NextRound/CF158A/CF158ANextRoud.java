package CF158A;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF158ANextRoud {
    //A resolution is for a problem 158A on CodeForces
    //https://codeforces.com/problemset/problem/158/A
    public static void main(String[] args) throws Exception{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String initialData = bufferedReader.readLine();
        StringTokenizer initialTokenizer = new StringTokenizer(initialData, " ");
        String nextToken;
        int qualifiedParticipants = 0;
        int kthPosition = 0;
        int participantsCount = 0;


              nextToken = initialTokenizer.nextToken();
              participantsCount = Integer.parseInt(nextToken);

              nextToken = initialTokenizer.nextToken();
              kthPosition = Integer.parseInt(nextToken);

        String scoreLine = bufferedReader.readLine();
              StringTokenizer scoreTokenizer = new StringTokenizer (scoreLine, " ");
        int [] scores = new int[participantsCount];
        for (int j = 0;scoreTokenizer.hasMoreTokens(); j++) {
            scores[j] = Integer.parseInt(scoreTokenizer.nextToken());
        }
        Arrays.stream(scores).sorted();

        System.out.println(qualifiedParticipants);
    }
}
