import java.util.Scanner;
public class Prog8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[],evenarray[],oddarray[];
		arr = new int[10];
		evenarray = new int[10];
		oddarray = new int[10];
		int oc=0, ec=0;
		System.out.println("Enter 10 Elements:");
		for(int i=0;i<10;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]%2==0) {
				evenarray[ec] = arr[i]*arr[i]*arr[i];
				ec += 1;
			}
			else {
				oddarray[oc] = arr[i]*arr[i];
				oc += 1;
			}
		}
		System.out.print("Original Array: ");
		for(int i=0;i<10;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
		System.out.print("Odd array: ");
		for(int i=0;i<oc;i++)
			System.out.print(oddarray[i]+" ");
		System.out.println("");
		System.out.print("Even array: ");
		for(int i=0;i<oc;i++)
			System.out.print(evenarray[i]+" ");
	}
}
