package net.alango.main;

import java.util.*;

public class Main
  {
    public static void main(String[] args)
      {

        int[] mas={0,5,2,4,7,1,3,19};
        
        int n=0;
        
        for(int i=0;i<mas.length;i++){
          n=(mas[i]%2==0)?(n):(n+1);
        }
        
        System.out.println("количество нечётных чисел в массиве: "+n);
        
        
      }
  }