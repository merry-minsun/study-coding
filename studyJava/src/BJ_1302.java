import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1302 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine());
		
		int bookCnt = Integer.parseInt(br.readLine());
		
		String[] books = new String[bookCnt];
		
		for(int i = 0; i < bookCnt; i++) {
			books[i] = br.readLine().toString();
		}
		
		Arrays.sort(books);
		
		String book = getBestSeller(books);
		
		System.out.println(book);
	}
	
	public static String getBestSeller(String[] books) {
		
		String tmpBook = books[0];
		int tmpCnt = 1;
		
		String bestBook = books[0];
		int maxCnt = 1;
		
		for(int i = 1; i < books.length; i++) {
			if(tmpBook.equals(books[i])) {
				tmpCnt++;
				
				if(maxCnt < tmpCnt) {
					bestBook = books[i];
					maxCnt = tmpCnt;
				}
				
			}else {
				tmpBook = books[i];
				tmpCnt = 1;
			}
		}
		
		return bestBook;
		
	}
}
