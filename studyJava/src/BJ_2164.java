import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ_2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cardNum = Integer.parseInt(br.readLine());
		
		int lastCardNum = getLastCardNum(cardNum);
		
		System.out.println(lastCardNum);
	}
	
	
	public static int getLastCardNum(int cardNum) {
		
		ArrayList<Integer> cards = new ArrayList<Integer>();
		ArrayList<Integer> tmpCards = new ArrayList<Integer>();
		
		
		for(int i = 0; i < cardNum; i++) {
			cards.add(i); //1234
		}

		while(true) {
			
			if(cards.size() == 2) {
				System.out.println("#1 ");
				cards.remove(0);
			}else if(cards.size() > 2) {
				
				System.out.println("#2 ");
				System.out.println("cards.size():" + cards.size());
				System.out.println("cards1:" + cards.get(1));
				cards.remove(1);
				System.out.println("cards2:" + cards.get(1));
				
				int tmp = cards.get(1);
				tmpCards.clear();
				
				for(int i = 1; i < cards.size(); i++) {
					
					tmpCards.add(cards.get(1));
					
					System.out.println("i:" + i);
					System.out.println("cards.size():" + cards.size());
					
					if(i == cards.size()-1) {
						System.out.println("tmpCards:" + tmpCards.get(1));
						System.out.println("cards" + cards.get(1));
						
						tmpCards.add(tmp);
						cards.clear();
						cards = tmpCards;
					}
				}
				
				for(int j = 0; j < cards.size(); j++) {
					System.out.println("#######[" + j + "]-->" + cards.get(j));
				}
			}
			
			if(cards.size() == 1) {
				System.out.println("#3 ");
				return cards.get(1);
			}
		}
		
	}
}
