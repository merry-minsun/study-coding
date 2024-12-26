import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReverseString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		ReverseString rs = new ReverseString();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String val = br.readLine();
		
		System.out.println("입력값:" + val);		
		System.out.println("결과값1:" + rs.getReverseVal1(val));
		System.out.println("결과값2:" + rs.getReverseVal2(val));
	}
	
	
	private String getReverseVal1(String inputVal) {
		
		return new StringBuilder(inputVal).reverse().toString();
	}
	
	private String getReverseVal2(String inputVal) {
		
		String returnVal = "";
		char cha[] = inputVal.toCharArray();
		
		// 12345
		for(int i = cha.length-1; i >= 0; i--) {
			returnVal += cha[i];
		}
		
		return returnVal;
	}	
}
