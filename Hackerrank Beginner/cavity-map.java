//https://www.hackerrank.com/challenges/cavity-map/problem?isFullScreen=true

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'cavityMap' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static List<String> cavityMap(List<String> grid) {
    // Write your code here
        int n=grid.size();
        char[][] chars = new char[n][n];
        List<String> res = new ArrayList<>();
        
        for(int i=0;i<grid.size();i++)
        {
            chars[i] = grid.get(i).toCharArray();
        }
        
        for(int i=1;i<n-1;i++)
        {
            for(int j=1;j<n-1;j++)
            {
                char temp = grid.get(i).get(j);
                if(
                    chars[i-1][j-1] > temp &&
                    chars[i-1][j] > temp &&
                    chars[i][j-1] > temp &&
                    chars[i][j-1] > temp
                )
                {
                    chars[i][j] = 'X';
                }
            }
        }
        System.out.println(chars);
        return res;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> grid = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result.cavityMap(grid);

        bufferedWriter.write(
            result.stream()
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
