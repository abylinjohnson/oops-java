import java.util.*;
public class Prog1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,oddSum=0,evenSum=0;
		System.out.println("Enter the Length Of the Array:");
		num = sc.nextInt();
		int arr[];
		arr = new int[num]; 
		System.out.println("Enter The numbers:");
		for(int i=0;i<num;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2==0)
				evenSum = evenSum + arr[i];
			else{
				oddSum = oddSum + arr[i];
			}
		}
		System.out.println("The Sum of Even numbers is :" +evenSum);
		System.out.println("The Sum of odd numbers is :" +oddSum);
	}

}
