import java.util.Scanner;

public class BJ_11047 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner scanner = new Scanner(System.in);
		
		String inputNum = scanner.nextLine();
		int coinKindCnt = Integer.parseInt(inputNum.split(" ")[0]);
	    int coinSum = Integer.parseInt(inputNum.split(" ")[1]);
		
	    int[] coinKindList = new int[coinKindCnt];
	    
	    for(int i = 0; i < coinKindList.length; i++) {
	    	coinKindList[i] = scanner.nextInt();
	    }
	    
	    BJ_11047 m = new BJ_11047();
	    int result = m.getCoinCnt(coinKindCnt, coinSum, coinKindList);
		System.out.print(result);

		scanner.close();
		
	}
	
	public int getCoinCnt(int coinKindCnt, int coinSum, int[] coinKindList) {
		
		int returnCnt = 0;
		int calcSum = 0;
		
		for(int i = coinKindCnt-1; i >= 0; i--) {
			if(coinKindList[i] <= coinSum) {
				while(true) {
					if(calcSum + coinKindList[i] <= coinSum) {
						calcSum += coinKindList[i];
						returnCnt++;
					}else {
						break;
					}
				}
			}
		}
		
		return returnCnt;
	}	
}
