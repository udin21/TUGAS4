import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		Double[] bilangan = {15.0 , 30.81 , 37.2 , 12.3 , 24.4 , 18.5 , 52.6 , 44.5};
		System.out.println("DATA AWAL : "+Arrays.toString(bilangan));
		System.out.println();
		System.out.println("PROSES INSERTION SORT :");
		System.out.println();
		
		for(int a = 0; a < bilangan.length; a++) {
			System.out.print("STEP-"+(a+1)+"--> ");
			Double key = bilangan[a];
			int c = a-1;
			while (c>=0 && bilangan[c] >key) {
				bilangan[c+1] = bilangan[c];
				c = c-1;
			}
			bilangan[c+1] = key;	
			System.out.println(Arrays.toString(bilangan));
			} 
			
		
		System.out.println();
		System.out.println("HASIL SORTING INSERTION : "+Arrays.toString(bilangan));
			
		}
}	   
