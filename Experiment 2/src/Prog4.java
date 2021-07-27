import java.util.*;
public class Prog4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of the array: ");
		int arr[];
		int n,t,flag=0,ind1=0, ind2=0;
		n = sc.nextInt();
		arr = new int[n];
		System.out.println("Enter the values of the array: ");
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the value of the target: ");
		t = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i != j) {
					if((arr[i] + arr[j]) == t) {
						ind1 = i;
						ind2 = j;
						flag = 1;
					}
				}
			}
			if(flag == 1) {
				System.out.println("The indices are " + ind1 + " and " + ind2);
				break;
			}
		}
	}
}
