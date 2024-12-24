import java.util.Arrays;
import java.util.Scanner;

public class BJ_2750 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int dataCnt = sc.nextInt();
		int[] arr = new int[dataCnt];
		
		int[] resultVal;
		
		for(int i = 0; i < dataCnt; i++) {
			arr[i] = sc.nextInt();
		}
		
		BJ_2750 ns = new BJ_2750();
		//resultVal = ns.getResult1(dataCnt, arr); // 선택정렬
		resultVal = ns.getResult2(dataCnt, arr); // Array.sort
		
		for(int val : resultVal) {
			System.out.println(val);
		}
	}
	
	private int[] getResult2(int dataCnt, int[] arr) {
		
		int[] resultVal = arr;
		
		Arrays.sort(resultVal);
		
		return resultVal;
	}	
	
	private int[] getResult1(int dataCnt, int[] arr) {
		
		int[] resultVal = arr;
		
		for(int i = 0; i < dataCnt - 1; i++) {
			for(int j = i+1; j < dataCnt; j++) {
				if(arr[i] > arr[j]) {
					int tmp = resultVal[i];
					resultVal[i] = resultVal[j];
					resultVal[j] = tmp;
				}
			}
		}
		return resultVal;
	}
}
