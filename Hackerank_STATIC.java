import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        if(b>0 && h>0)
        {
            int res = b*h;
            System.out.println(res);

        }
        else
            System.out.println("java.lang.Exception: Breadth and height must be positive");

    }
}
