import java.util.Scanner; 
public class Combi{ 
	public static void main(String[] args) { 
		Scanner scannerObj = new Scanner(System.in); 
		System.out.println("Enter The First Number"); 
		int fNum = scannerObj.nextInt(); 
 
		System.out.println("Enter The Second Number"); 
		int sNum = scannerObj.nextInt();
 
		System.out.println("Enter The Third Number"); 
		int tNum = scannerObj.nextInt();
		int[] arr = { fNum, sNum, tNum };  
		for (int a = 0; a < 3; a++) { 
			for (int b = 0; b < 3; b++) { 
				for (int c = 0; c < 3; c++) { 
					if (arr[a] != arr[b] && arr[b] != arr[c] && arr[c] != arr[a]) {
						System.out.println(arr[a] + "" + arr[b] + "" + arr[c]);
					} 
				} 
			} 
		} 
		scannerObj.close(); 
	} 
} 