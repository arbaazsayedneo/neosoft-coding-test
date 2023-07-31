package org.coding;

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
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */

    public static List<Integer> getMax(List<String> operations) {
        // Write your code here

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<operations.size(); i++){
            String item = operations.get(i);

            char[] arr = item.toCharArray();
            if(arr[0] == '1')
            {
                // extracting the 3rd and 4th value
                String number = new Character(item.charAt(2)).toString() + new Character(item.charAt(3)).toString();
                System.out.println(number);
                int num = Integer.parseInt(number);
                stack.push(num);
            }
            else if(arr[0] == '2')
                // pop the element from the top of stack
                stack.pop();

            else{
                int max = 0;
                Iterator itr = stack.iterator();
                while(itr.hasNext()){
                    int val = (Integer)itr.next();
                    if(val > max)
                        max = val;
                }
                System.out.println(max);
            }

        }

        return  stack.stream()
                .collect(Collectors.toList());
    }

}

public class HackerRankStackProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> ops = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .collect(toList());

        List<Integer> res = Result.getMax(ops);

        bufferedWriter.write(
                res.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
