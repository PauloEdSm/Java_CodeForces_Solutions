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
        String previousToken;
        int qualifiedParticipants = 0;
        int kthPosition = 0;
        int participantsCount = 0;


              previousToken = initialTokenizer.nextToken();
              participantsCount = Integer.parseInt(previousToken);

              previousToken = initialTokenizer.nextToken();
              kthPosition = Integer.parseInt(previousToken);

        String scoreLine = bufferedReader.readLine();
              StringTokenizer scoreTokenizer = new StringTokenizer (scoreLine, " ");


              int position = 1;
              int nextToken = 0;
              int cutOffScore = 0;
              StringTokenizer cutOffTokenizer = new StringTokenizer(scoreLine," ");
              while (cutOffTokenizer.hasMoreTokens()) {
            int score = Integer.parseInt(cutOffTokenizer.nextToken());
            if (kthPosition == position)
                cutOffScore = score;
            position++;
        }


              while (scoreTokenizer.hasMoreTokens()) {
                  nextToken = Integer.parseInt(scoreTokenizer.nextToken());
                   qualifiedParticipants= (cutOffScore <= nextToken&& nextToken !=0)?qualifiedParticipants + 1 : qualifiedParticipants ;
              }
        System.out.println(qualifiedParticipants);
    }
}
