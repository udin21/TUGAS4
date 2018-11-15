import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		Double[] bilangan = {15.0 , 30.81 , 37.2 , 12.3 , 24.4 , 18.5 , 52.6 , 44.5};
		
		System.out.println("DATA AWAL : "+Arrays.toString(bilangan));
		System.out.println();
		System.out.println("PROSES BUBBLE SORT :");
		System.out.println();
		
		for(int a = 0; a < bilangan.length; a++) {
			
			for(int b = 0; b < bilangan.length-1; b++) {
				if(bilangan[b] > bilangan[b+1]) {
					Double temp = bilangan[b];
					bilangan[b] = bilangan[b+1];
					bilangan[b+1] = temp;
				}
				System.out.println("STEP->"+(a+1)+", MIN = "+bilangan[b+1]+" SWAP("+(a+1)+","+bilangan[b+1]+")"+" -> "+Arrays.toString(bilangan));
			}
			
			System.out.println();
		}
		System.out.println("HASIL SORTING BUBBLE : "+Arrays.toString(bilangan));
		}
	}
