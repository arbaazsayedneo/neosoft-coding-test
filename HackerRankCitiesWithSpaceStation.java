package org.coding;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class HackerRankCitiesWithSpaceStation {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        // This list is like maintaining a flag of where the space station is present
        List<Integer> list = new ArrayList<>(n);
        // This list is the final list to keep record from space stations
        List<Integer> distance = new ArrayList<>(n);

        for(int i=0; i < list.size(); i++)
            list.add(c[i],1);

        xyz: for(int i=0; i< list.size(); i++){
            if(list.get(i) == 1){
                distance.add(0);
                continue xyz;
            }

            if(list.get(i) != 1){
                // iterate over the list again
                int minDistance = 0;
                for(int j=0; j<list.size();j++){
                    if(list.get(j) == 1)
                    {
                        int dist = Math.abs(i-j);
                        if(dist < minDistance)
                            minDistance = dist;
                    }
                }
                distance.add(minDistance);
            }
        }

        int max = 0;
        // finding the maximum distance
        for(int i=0; i<distance.size(); i++)
        {
            if(max <= distance.get(i))
                max = distance.get(i);
        }
        return max;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] c = new int[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = flatlandSpaceStations(n, c);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

