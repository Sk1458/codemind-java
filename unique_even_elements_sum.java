import java.util.*;
class Soundwave{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
		    arr[i] = sc.nextInt();
		}
		int sum = 0 ;
		for(int i = 0 ; i < n ; i++){
		    int c = 0 ;
		    for(int j = i ; j < n ; j++){
		        if(arr[i]==arr[j]){
		            c++;
		        }
		    }
		    if(c==1 && arr[i]%2==0){
		        sum += arr[i];
		    }
		}
		System.out.format("%d",sum);
	}
}