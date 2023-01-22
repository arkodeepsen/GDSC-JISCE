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
     * Complete the 'sherlockAndMinimax' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER p
     *  3. INTEGER q
     */

    public static int sherlockAndMinimax(List<Integer> arr, int p, int q) 
    {
        TreeSet<Integer> tree=new TreeSet<Integer>(arr); 
        int op=0;
        if (q<=tree.first()) 
        {
            op=tree.first();
        } 
        else if(p>=tree.last())
        {
            op=tree.last();
        } 
        else 
        {
            int num1=0;
            int num2=0;
            if(tree.contains(p)||tree.higher(p)==null) 
            {
                num1=p;
            } 
            else 
            {
                num1=2*p-tree.higher(p);
            }
            if(tree.contains(q)||tree.lower(q)==null)
            {
                num2=q;
            } 
            else 
            {
                num2=2*q-tree.lower(q);
            }
            int i=num1;
            int max=0;
            int mid=0;
            tree.add(num2);
            while(i<=num2) 
            {
                if(tree.higher(i)!=null) 
                {
                    int og=(tree.higher(i)-i)/2;
                    if (og>max&&(tree.higher(i)+i)/2<=q) 
                    {
                        max=og;
                        mid=(tree.higher(i)+i)/2;
                    }
                    i=tree.higher(i);
                } 
                else 
                {
                    break;
                }                
            }
            op=mid;
        }
        return op;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int p = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        int result = Result.sherlockAndMinimax(arr, p, q);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
