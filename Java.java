/*import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int i= input.nextInt();        
        int o= input.nextInt();
        String a=input.next();
        String b=input.next();
        
    }
}
*/




/*
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double a=input.nextDouble();
        double b =input.nextDouble();
        
        if( a%5==0 && b>=a+0.5){
            System.out.printf("%.02f",b-(a+0.5));
            // double sol = Math.round((b-(a+0.5))*100.0)/100.0;
            // System.out.println(sol);
            
        }else{
            System.out.printf("%.02f",b);
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
			Sum = Sum+ Reminder;
			Number = Number / 10;
		}
	System.out.println(Sum);
}
}




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		int t = input.nextInt();
		
		for(int i=1;i<=t;i++){
			System.out.println(n+" * "+i+" = "+n*i);
		}


		}
}

import java.io.*;
import java.util.*;
public class Solution {
 
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
 
        int x = input.nextInt();
        int y = input.nextInt();
 
        int temp = x;
        x = y;
        y = temp;
 
        System.out.print(x+" "+y);
    }
}

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
		Scanner input =new Scanner (System.in);
        int num = input.nextInt();
		 int reversed = 0;
   
    while(num != 0) {
    

      int digit = num % 10;
      reversed = reversed * 10 + digit;

      num /= 10;
    }

    System.out.println(reversed);    

    }
}


import java.util.Scanner;
public class Solution
{
    public static void main(String[ ] arg)
    {
    int i=0;
    Scanner sc=new Scanner(System.in);
    char ch=sc.next( ).charAt(0);             
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
    {
    System.out.println("Vowel"); 
    }
    else 
        System.out.println("Not a vowel");        
    }
}

*/
 

























































































































