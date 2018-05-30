package com.neo.CoreJava;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;


public class ReverseArray {

	Stack ss=new Stack();
	public static void main(String[] args) {
	int[] no={10,20,30,40,50,60};
 
	System.out.println(no);    //[I@f72617
	System.out.println(no.toString());    //[I@f72617
    System.out.println(no.length);          //6
    System.out.println(no.hashCode());    //31843011
    //System.out.println(no.getClass());    //class [I
	//System.out.println(Arrays.toString(no));   //[10, 20, 30, 40, 50, 60]
    
	//reverse(no);
   //reverseUsingList(no);
   //reverseUsingThirdValue(no);
    reverseUsingWithoutThirdValue(no);
    //reverseUsingThirdValueFor(no);

	}//main 
	
	public static  void reverse(int a[]){
		System.out.println(Arrays.toString(a));  //[10, 20, 30, 40, 50, 60]

          int ss[]=new int[6];
          int j=0;
          for(int i=a.length-1;i>=0;i--){
        	ss[j]=a[i];  
        	  j++;
          }
		System.out.println(Arrays.toString(ss));   //[60, 50, 40, 30, 20, 10]
		
	}//reverse
	
	public static  void reverseUsingList(int [] no){		
		
		List list1 = Arrays.asList(no);
		System.out.println("array  "+list1);    //array  [[I@1bab50a]
		
		List<Integer> list = Arrays.asList(1, 4, 9, 16, 9, 7, 4, 9, 11);
		System.out.println(list);	     //[1, 4, 9, 16, 9, 7, 4, 9, 11]
		Collections.reverse(list);
		System.out.println(list);         //[11, 9, 4, 7, 9, 16, 9, 4, 1]
	}//reverseUsingList
	
	public static void reverseUsingThirdValue(int[] no){
		System.out.println("while loop using");
		System.out.println(Arrays.toString(no));  //[10, 20, 30, 40, 50, 60]
       int start=0,end=no.length-1;
		int temp=0;     //this is third value
		while(start<=end){
			temp=no[start];
			no[start]=no[end];
			no[end]=temp;
			start++;
			end--;
		}//while
		System.out.println(Arrays.toString(no));    //[60, 50, 40, 30, 20, 10]
	}//reverseUsingThirdValue
	
	public static void reverseUsingThirdValueFor(int[] no){
		System.out.println("for loop using");
		System.out.println(Arrays.toString(no));  //[10, 20, 30, 40, 50, 60]
		int j=no.length-1;
		int temp=0;     //this is third value
		for(int i=0;i<no.length/2;i++){
			temp=no[i];		
			no[i]=no[j];
			no[j]=temp;
			j--;
		}//for
		System.out.println(Arrays.toString(no));    //[60, 50, 40, 30, 20, 10]
	}//reverseUsingThirdValueFor
	
	
	
	
	public static void reverseUsingWithoutThirdValue(int[] no){
		System.out.println(Arrays.toString(no));  //[10, 20, 30, 40, 50, 60]
       int start=0,end=no.length-1;
		//int temp=0;
		while(start<=no.length-1){
			//temp=no[start];
			no[start]=no[end];
			//no[end]=temp;
			start++;
			end--;
		}//while
		System.out.println(Arrays.toString(no));    //[60, 50, 40, 30, 20, 10]
	}//reverseUsingThirdValue
	
	
}//class
