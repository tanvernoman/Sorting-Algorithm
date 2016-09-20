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
public class QuickSort {
    private int[] theArray;
    private final int arraySize=10000;
    private final int randCap=1000;

    public QuickSort() 
    {
        theArray= new int[arraySize];
        Random r= new Random();
        
        System.out.println("Creating array of "+arraySize+"random numbers");
        System.out.println("-------------------------------");
        for(int i=0; i<arraySize; i++)
        {
            theArray[i]=r.nextInt(randCap);
        }
        
    }
    
    private QuickSort quickSort(int first,int last)
    {
        int pos_ =0; //initial position of pivot
        
        if(first<last)
        {
            pos_=splitAndSwap(first,last,pos_);
            quickSort(first,pos_-1);
            quickSort(pos_+1,last);
        }
        return this;
    }

    private int splitAndSwap(int first, int last, int pos_)
    {
        int left;
        int right;
        int pivot;
        
        pivot= theArray[first];
        left=first; //marker
        right=last;//marker
        
        while(left<right)//while markers have not met
        {
            //search from the left for element greater than pivot
            while((left<right) && (theArray[left]<=pivot))
            {
                left++;
            }
            //search from the right for element <=pivot
            while(theArray[right]>pivot)
            {
                right--;
            }
            //if markers have not met (elements are out of place and swap elements
             if(left<right)
            {
                int temp=theArray[left];
                 theArray[left]=theArray[right];
                 theArray[right]=temp;
            }
        }   //end while
        //search completed now set the pivot to the correct postion
        pos_=right;
        theArray[first]=theArray[pos_];
        theArray[pos_]=pivot;
        
        return pos_;
        
    }
    public QuickSort quickSort()
    {
        System.out.println("Sorting array elements into assending order");
        System.out.println("-----------------");
        //begin point at first and last element respectively 
        quickSort(0,theArray.length-1);
        return  this;
    }
    public QuickSort display()
    {
        System.out.println("---------------");
        System.out.println("displaying array");
        System.out.println("----------------");
        for(int i=0; i<arraySize; i++)
        {
            System.out.println("Elements "+ i+ "in the array"+theArray[i]);
            System.out.println("-------------");
        }
        return this;
    }
    
}
