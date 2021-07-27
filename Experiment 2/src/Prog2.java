import java.util.*;
public class Prog2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[];
		int n, x, c=0;
		System.out.println("Enter the Size of the array:");
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the values of the Array");
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the value of X:");
		x = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i] > x)
				c = c + 1;
		}
		System.out.println("Count = " + c);
		System.out.print("Numbers are = ");
		for(int i=0; i<n; i++)
			if(arr[i] > x)
				System.out.print( arr[i] + " ");
			
		}
	}


