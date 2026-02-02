package CF34B;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CF34BBSale  {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstLineRead = bufferedReader.readLine();
        StringTokenizer firstLineReader = new StringTokenizer(firstLineRead, " ");
        int totTvs = Integer.parseInt(firstLineReader.nextToken());
        int maxTvsToCarry = Integer.parseInt(firstLineReader.nextToken());


        String finalLineRead = bufferedReader.readLine();
        StringTokenizer finalLineReader = new StringTokenizer(finalLineRead, " ");

        int[] tvPrices = new int[totTvs];
        for (int index = 0; index < totTvs; index++) {
            tvPrices[index] = Integer.parseInt(finalLineReader.nextToken());
        }
        Arrays.sort(tvPrices);
        int sum = 0;
        for (int tvPricesIndex = 0; tvPricesIndex < maxTvsToCarry;tvPricesIndex++) {
            if (tvPrices[tvPricesIndex] < 0) {
                sum += tvPrices[tvPricesIndex] * -1;
            }
        }
        System.out.println(sum);
    }
}
