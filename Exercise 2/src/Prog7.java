import java.util.Scanner;
public class Prog7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c =0;
		int arr[];
		arr = new int[10];
		int marr[];
		marr = new int[10];
		System.out.println("Enter 10 numbers");
		for(int i =0;i<10;i++)
			arr[i] = sc.nextInt();
		for(int i =0;i<10;i++) {
			if(arr[i]%3 ==0 && arr[i]%9==0) {
				marr[c] = arr[i];
				c= c+1;
			}
		}
		System.out.println("The numbers thst are multiple of both 9 and 3:");
		for(int i =0;i<c;i++)
			System.out.print(marr[i]+" ");
	}
}
