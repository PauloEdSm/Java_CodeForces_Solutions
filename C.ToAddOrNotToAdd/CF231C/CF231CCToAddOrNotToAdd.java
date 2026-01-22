package CF231C;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF231CCToAddOrNotToAdd {
    //A resolution is for a problem 231C on CodeForces
    //https://codeforces.com/problemset/problem/231/C
		public static void main(String[] args) throws Exception {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String headLine = bufferedReader.readLine();
            StringTokenizer headerTokens = new StringTokenizer(headLine," ");
            int n = Integer.parseInt(headerTokens.nextToken());
            int k = Integer.parseInt(headerTokens.nextToken()) ;

            String ValuesLine = bufferedReader.readLine();
            StringTokenizer valueTokenizer = new StringTokenizer(ValuesLine, " ");

            int [] nums = new int[n];
            for (int j = 0;valueTokenizer.hasMoreTokens(); j++) {
                nums[j] = Integer.parseInt(valueTokenizer.nextToken());
            }
            Arrays.sort(nums);

            for (int i = 0; i < nums.length; i++) {

            }
		}
    }