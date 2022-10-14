/*
import java.util.*;
public class javaa{
	public static void main(String args []){
		Scanner input=new Scanner(System.in);
		
		int q=input.nextInt();
		int ar[]=new int[q];
		for(int i =0;i<ar.length;i++){
		ar[i]= input.nextInt();
}
		int sum=0;
		for(int i =0;i<ar.length;i++){
			sum = sum + ar[i];
	
			
		}
		System.out.println(sum);
		
}
}
/*

import java.util.*;
public class java{
	public static void main(String [] args){
		Scanner input=new Scanner (System.in);
		int [][]a= new int[10][3];
		for(int i=0;i<10;i++){
			for(int j=0;j<3;j++){
				System.out.print(a[i][j]);
			}
			 System.out.println();
			
		}
	}
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int Number=input.nextInt();
		int Sum=0;
		int Reminder=0;
		
		while(Number> 0) {
			Reminder = Number % 10;
			System.out.println(Reminder);
			//Sum = Sum+ Reminder;
			Number = Number / 10;
		}
	//System.out.println(Sum);
}
}




import java.util.*;
class java{
	public static void main(String []args){
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		int rem;
		
		int count;
		
		for(int i=0;i<a;i++){
			count = 0;
			rem =0;
			int u=input.nextInt();
				
			while(u>0){
				rem=u%10;
				u=u/10;
				if(rem==0) continue;
				else if(u/rem>0 || u/rem==0){
					count++;
				}
			}
			System.out.println(count);
			
		}	
		
	}
}




import java.util.*;
public class java{
public static void main(String [] args){
	Scanner input= new Scanner(System.in);
	System.out.print("Enter the length of the array :");
	int a=input.nextInt();
	//deffing an array 
	int[] na=new int[a];
	for(int i=0;i<a;i++) {
		na[i]=input.nextInt(); 
	}
	System.out.println(Arrays.toString(na));
}
}

import java.util.*;
public class javaa{
	public static void main(String args []){
		Scanner input=new Scanner(System.in);
		int al= input.nextInt();
		int ar[]=new int[al];
		int sum=0;
		
		for (int i=0;i<al;i++){
			ar[i]=input.nextInt();
            
		}
		System.out.println(Arrays.toString(ar));
		for(int j:ar)
			 sum+=j;
		System.out.println("Sum :" +sum);

	}
}


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner (System.in);
		//int qs[]=new int[4];
		int count=0;
		String vals = input.nextLine();
		String[] val = vals.split(" ");
		
		
		for(int i=0;i<val.length;i++){
			//int val =input.nextInt();
			if (Integer.parseInt(val[i])>=10){
				count++;
			}
			
		}
		System.out.println(count);
			//System.out.println(Arrays.toString(qs));
		   
	}
	
}





import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan= new Scanner(System.in);
		int count=0;
	     int p[]=new int [4];
	     for(int i=0;i<4;i++){
	          p[i]=scan.nextInt();
	         if(p[i]>=10){
	             count++;
	         }
	     }
	     System.out.println(count);
	}
}





import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner (System.in);
		int ti=input.nextInt();
		for(int j=0;j<ti;j++){
		int t=input.nextInt();
		 int a[] = new int[t];
		 int count=0;
		 for(int i=0;i<t;i++){
			a[i]= input.nextInt();
			if (a[i]>=1000){
				count++;
			}
			
		}
		
			System.out.println(count);
		}
		
	}
}


 
				 
			 }
			 




import java.util.*;
import java.lang.*;
import java.math.*;

// Name of the class has to be "Main" only if the class is public. 
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
             Scanner input = new Scanner(System.in);
             int tc = input.nextInt();
			 int fact=1,i=1;
			 
			 for(int j=1;j<=tc;j++){
				 int d =input.nextInt();
			 
			 while(j<=d){
				fact *=i;
				i++;
			 }
			System.out.println(fact);
			 
			 
			}
	}
}
*/



import java.util.*;
import java.lang.*;
import java.io.*;

// Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input=new Scanner(System.in);
		int tc =input.nextInt;
		int[] s=new int[4];
		for(int i=0;i<=tc;i++){
			s[i]=input.nextInt();
			
			
		}
		
	}
}








































