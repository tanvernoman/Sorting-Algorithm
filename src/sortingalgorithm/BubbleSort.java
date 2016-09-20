/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithm;

import java.util.ArrayList;

/**
 *
 * @author afnan
 */
public class BubbleSort {
    private ArrayList<String> list;

    public BubbleSort() 
    {
        list= new ArrayList<>();
        list.add("Bolu");
        list.add("james");
        list.add("connoer");
        list.add("Tanver");
        list.add("Louis");
    }
    
    
    public int bubbleSortStringComparison()
    {
        boolean flag= true;
        String temp;
        Integer nswap=0;
        while(flag)
        {
            flag=false;
            nswap++;
            for(int i=0; i<(list.size()-1); i++)
            {
                if(list.get(i).compareToIgnoreCase(list.get(i+1))>0)//comparing adjacent element 
                {
                    temp=list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp); // swaping elements
                    flag=true;
                }//end if
            }//end for
        }//end while
        System.out.println("Bubble Sort passes:"+nswap+"times");
        return list.size();
    }
    public BubbleSort linearSearch(String value)
    {
        for(int i=0; i<list.size(); i++)
        {
            if(list.get(i).equalsIgnoreCase(value))
            {
                System.out.println(value +" found in the list ");
                break;
            }
            else
            {
                System.out.println(value + " is not present in the list");
                
            }
           
        }
         return this;
    }
    public BubbleSort display()
    {
        for(String s: list)
        {
            System.out.println(s);
                    
        }
        return this;
    }
}
