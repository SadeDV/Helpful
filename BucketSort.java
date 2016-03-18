import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static final int STU_SIZE = 500;

    public static final int BUCKET_SIZE = 11;

    public static void main(String[] args) {
        int[] a = init();
        print(a);
        int[] b = bucketSort(a);
        print(b);
    }


    private static int[] bucketSort(int[] a) {
        // TODO Auto-generated method stub
        int[] b = new int[STU_SIZE];
        List<List<Integer>> bucket = new ArrayList<>();
        for (int i = 0; i < BUCKET_SIZE; i++) {
            bucket.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < STU_SIZE; i++) {
            int k = a[i] / 10;
            bucket.get(k).add(a[i]);
        }
        for (List<Integer> list : bucket)
            Collections.sort(list);
        int i = 0;
        for (List<Integer> list : bucket) {
            for (Integer score : list) {
                b[i] = score;
                i++;
            }
        }
        return b;
    }

    private static int[] init() {
        // TODO Auto-generated method stub
        int[] score = new int[STU_SIZE];
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:/score.txt"));
            String sscore = "";
            int i = 0;
            try {
                while ((sscore = br.readLine()) != null) {
                    score[i] = Integer.valueOf(sscore.trim());
                    i++;
                }
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return score;
    }

    public static void print(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
