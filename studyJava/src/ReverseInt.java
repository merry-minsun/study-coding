import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReverseInt {
	
	// 함수 solution은 정수 n을 매개변수로 입력받습니다. 
	// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
	// 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int val = Integer.parseInt(br.readLine());
		
		reverseInt(val);
		System.out.println(sb);
	}
	
	public static void reverseInt(int val) {
		
		String strVal = String.valueOf(val);
		char[] arr = new char[strVal.length()];
		
		for(int i = 0; i < strVal.length(); i++) {
			arr[i] = strVal.charAt(i);
		}
		
		Arrays.sort(arr);
	
		for(int i = strVal.length()-1; i >= 0; i--) {
			sb.append(arr[i]);
		}
	}
}
