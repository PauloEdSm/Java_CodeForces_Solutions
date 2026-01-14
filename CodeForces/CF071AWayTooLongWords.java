import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CF071AWayTooLongWords {
    //This solution is for problem 71A on CodeForces
    //https://codeforces.com/problemset/problem/71/A

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int wordCount = Integer.parseInt(bufferedReader.readLine());

        String [] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            words[i] = bufferedReader.readLine();
        }
        for (int k = 0; k < wordCount ; k++) {

            //Implement a word abbreviation logic for words longer than 10 characters
            if (words[k].length()>10) {
                System.out.printf("%c%d%c%n", words[k].charAt(0), words[k].length() - 2, words[k].charAt(words[k].length() -1));
            }else {
                System.out.println(words[k]);

            }

            }
        }
    }