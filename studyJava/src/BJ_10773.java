import java.util.Scanner;
import java.util.Stack;

public class BJ_10773 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int dataCnt = sc.nextInt();
		
		int[] arr = new int[dataCnt]; 
		
		for(int i = 0; i < dataCnt; i++) {
			arr[i] = sc.nextInt();
		}
		
		Stack s = new Stack();
		
		for(int val : arr) {
			if(val != 0) s.add(val);
			else s.pop();
		}
		
		int result = 0;
		for(int i = 0; i < s.size(); i++) {
			result += (int)s.get(i);
		}
		
		System.out.println(result);
		
	}
}
