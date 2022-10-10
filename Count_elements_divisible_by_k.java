import java.util.*;
class naruto{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		    if(arr[i]%k==0){
		        count++;
		    }
		}
		System.out.format("%d",count);
	}
}