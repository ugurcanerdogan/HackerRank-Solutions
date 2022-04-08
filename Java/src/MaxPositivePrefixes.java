import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


class Result {

    /*
     * Complete the 'maxPosPrefixes' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int maxPosPrefixes(List<Integer> arr) {
        List<Double> arr2 = new ArrayList<>();

        for (int i = 0; i< arr.size(); i++) {
            arr2.add(Double.valueOf(arr.get(i)));
        }
        
        
        int count = 0;
        Collections.sort(arr2, Collections.reverseOrder());
        //System.out.println(arr.toString());
        for(int i = 0; i< arr2.size(); i++){
            System.out.println(arr2.get(i));
            if(i == 0){
                if(arr2.get(i)>0)
                    count++;
                else
                    return 0;
            }
            else{
                if(arr2.get(i)+arr2.get(i-1)> 0){
                    count++;
                    double x = arr2.get(i)+arr2.get(i-1);
                    arr2.set(i, x);
                }
                else
                    return count;
            }
        }
        return count;
    }

}
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(bufferedReader.readLine().trim());
            arr.add(arrItem);
        }

        int result = Result.maxPosPrefixes(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
