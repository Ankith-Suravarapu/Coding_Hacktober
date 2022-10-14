/*Write a program that creates integer array of 10 elements, accepts
// values of arrays and then displays the values.

import java.util.*;
public class java{
	public static void main (String [] args){
		Scanner input=new Scanner (System.in);
		int a=input.nextInt();
		int[] al=new int[a];
		for(int i=0;i<al.length;i++){
			al[i]=input.nextInt();
		
		}
		for(int j=0;j<al.length;j++){
			System.out.print(al[j]+ " ");
		}
	}
}
*/

/*Write a program that creates integer array of 10 elements, accepts values of 
//arrays and Print the array in reverse
import java.util.*;
class java{
	public static void main(String []args){
		Scanner input=new Scanner (System.in);
		System.out.printf("Enter the number of elements in array:");
        int a =input.nextInt();
		int []ar=new int[a];
		for(int i=0;i<ar.length;i++){
			ar[i]=input.nextInt();
		}
		System.out.println("The array in normal order");
		for(int j=0;j<ar.length;j++){
			System.out.print(ar[j] +" ");
		}
		System.out.println("");
		System.out.println("The array in reverse order");
		for(int k=ar.length-1;k>=0;k--){
			System.out.print(ar[k] +" ");
		}
		
	}
}


//Write a program that creates integer array of 10 elements,
// accepts values of arrays and Find Sum, Average, Min, Max.
import java.util.*;
class java{
	public static void main(String [] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the number of elements in the array:");
	int a=input.nextInt();
	int []arr =new int[a];
	int sum = 0, max, min;
	for(int i =0;i<arr.length;i++){
		arr[i]=input.nextInt();
	}
		System.out.print("The elements in the Array: ");
		for(int j=0;j<arr.length;j++){
		System.out.print(arr[j]+" ");
		}
		
	max=arr[0];
	min=arr[0];
	for(int k=0;k<arr.length;k++){
		if(min>arr[k]){
			min=arr[k];
		}
		if(max<arr[k]){
			max=arr[k];
		}
		sum+=arr[k];
	}
	System.out.println("");
	System.out.println(sum/arr.length);
	System.out.println("Min array :"+min);
	System.out.println("Sum is :" +sum);
	System.out.println("Max array :"+max);
		
		
		
		
	}
}
*/
//Write a program that creates integer array of 10 elements,
//accepts values of arrays and Print only even numbers in the array.

import java.util.*;
class java{
	public static void main(String [] args){
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the length of the array: ");
	int al=input.nextInt();
	int arr[]=new int[al];
	
	for(int i=0;i<arr.length;i++){
	arr[i]=input.nextInt();
	}
	
	for(int j=0;j<arr.length;j++){
	System.out.print(arr[j]+" ");
	}
	for(int k=0;k<arr.length;k++){
		if(arr[k]%2==0){
			//System.out.print("The even elements ");
		System.out.println( "The even elements "+ arr[k]+ " ");
		
		
	}
	}
	

}

}






































