import java.io.*;
import java.util.Scanner;
import kong.unirest.Unirest;
import static java.lang.Integer.parseInt;

public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_FILE")));
        int result = getNumDraws(year);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();
        bufferedWriter.close();
    }

    public static int getNumDraws(int year) throws IOException {
        int totalDraws = 0;
        for(int x=0;x<=10;x++) {
            String yearlyDraws = Unirest.get(String.format("https://jsonmock.hackerrank.com/api/football_matches?year=%d&team1goals=%o&team2goals=%o",year, x, x))
                    .asJson()
                    .getBody()
                    .getObject()
                    .getString("total");

            System.out.println(String.format("%2d-%2d draws in %d:%4s",x ,x, year, yearlyDraws));
            totalDraws = totalDraws + parseInt(yearlyDraws);
        }
        System.out.println(String.format("Total draws in %d:%4d", year, totalDraws));

        return totalDraws;
    }


}