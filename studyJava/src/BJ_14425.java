import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ_14425 {
	public static void main(String[] args) throws IOException {
	
		int result = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		Map<String, Integer> map = new HashMap();
		
		for(int i = 0; i < n; i++) {
			map.put(br.readLine(), 0);
		}
		
		for(int j = 0; j < m; j++) {
			if(map.containsKey(br.readLine())) {
				result++;
			}
		}
		
		/*
		Scanner sc = new Scanner(System.in);
		String chkInfo = sc.nextLine().toString();
		int sourceStrCnt = Integer.parseInt(chkInfo.split(" ")[0]);
		int checkStrCnt = Integer.parseInt(chkInfo.split(" ")[1]);
		
		String[] sourceStrArr = new String[sourceStrCnt];
		String[] checkStrArr = new String[checkStrCnt];
		
		for(int i=0; i<sourceStrCnt; i++) {
			sourceStrArr[i] = sc.nextLine();
		}
		
		for(int j=0; j < checkStrCnt; j++) {
			//checkStrArr[j] = sc.nextLine();
			String checkStr = sc.nextLine();
			
			for(int k=0; k<sourceStrCnt; k++) {
				if(sourceStrArr[k].equals(checkStr)) {
					result++;
					break;
				}
			}
		}
		*/
		
		System.out.println(result);
		
		
	}
}
