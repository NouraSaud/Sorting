/*
Random Number Generator between (1,20) and the numbers should be unique.

To have an array for such numbers which may be utilised for further processing 

@Author : Mohammad Amir Jamil

*/

import java.net.*;
import java.io.*;
import java.util.*;

class RandomNumberGenerator {
   public static void main(String[] args)throws IOException{
         final int a[] = new Random().ints(1, 20).distinct().limit(19).toArray();         //array of unique numbers           
         for(int i=0;i<a.length;i++){
            System.out.println(a[i]); // printing numbers
         }
  }

}