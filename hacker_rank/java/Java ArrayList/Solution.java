import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt(); //n is the first input for user to define list length
        
        ArrayList<ArrayList<Integer>> al=new ArrayList<>(); // Declearing the arrayList
        
        for (int x=0; x<n; x++){
            int nou= sc.nextInt(); //number of unit in a single row 
            ArrayList<Integer> row= new ArrayList<>();
            
            for( int k=0; k<nou; k++){
                row.add(sc.nextInt());
            }
            al.add(row);
        }
        
        int qn= sc.nextInt();
        for (int x=0; x<qn; x++){
            int rn= sc.nextInt();
            int in= sc.nextInt();
            
            try {
                System.out.println(al.get(rn - 1).get(in - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
        
    }
}