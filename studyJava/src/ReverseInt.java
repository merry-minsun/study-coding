import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ReverseInt {
	
	// �Լ� solution�� ���� n�� �Ű������� �Է¹޽��ϴ�. 
	// n�� �� �ڸ����� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���. 
	// ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
	
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
