/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithm;

import java.util.Random;

/**
 *
 * @author afnan
 */
public class MergeSort {
    
    private int number;
    private int[] theArray;
    private int[]helper;
    private final int arraysize=6;
    private final int maxint=100;

    //constructor 
    public MergeSort() 
    {
        Random rand= new Random();
        theArray= new int[arraysize];
        for(int i=0; i<arraysize; i++)
        {
            theArray[i]=rand.nextInt(maxint);
        }
    }//end constructor 
    
    public void sort()
    {
        this.helper=new int[arraysize];
        mergeSort(0,arraysize-1);
    }

    private void mergeSort(int left, int right) 
    {
        if(left<right)//list contains ate least at least 2 elements 
        {
            // find the middle point of the list
            int middle= left+(right-left)/2;
            
            //recursive calls sort the left/right side of the array
            mergeSort(left,middle); //sort the first half
            
            mergeSort(middle+1,right); //sort second half
            
            //combine the sorted subarrays  or merge sorted halves
            merge(left,middle,right);
            
        }
        System.out.println("after the pass");
            display();
    }

    private void merge(int left, int middle, int right) 
    {
        //copy both parts into the helper array
        for(int i=left; i<=right; i++)
        {
            helper[i]=theArray[i];
        }
        int i=left;
        int j=middle+1;
        int k=left;
        
        //copy the smallest values from either the left
        while(i<=middle && j<=right)
        {
            if(helper[i] <= helper[j])
            {
                theArray[k]=helper[i];
                i++;
            }
            else
            {
                theArray[k]=helper[j];
                j++;
                
            }
            k++;
        }
        //copy the rest of the left side of the array 
        while(i<=middle)
        {
            theArray[k]=helper[i];
            k++;
            i++;
        }
        
    }
    
    public MergeSort display()
    {
        for(int i=0; i<arraysize; i++)
        {
            System.out.print(theArray[i]+" ");
        }
        System.out.println("----------------");
        return this;
    }
    
}
