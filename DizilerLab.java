import java.util.Arrays;
import java.util.Scanner;
public class DizilerLab {
	public static void main(String[] args) {
	  /*LAB1 
	  int[] numbers =new int[5];
	  numbers[0]=5;
	  numbers[1]=10;
	  numbers[2]=20;
	  numbers[3]=30;
	  numbers[4]=40;
	  
	  System.out.println(numbers.length);
	  System.out.println(Arrays.toString(numbers));
	   
	  System.out.println("--------------------------");
	  
	  for(int i=0;i<5;i++) {
		  System.out.println(numbers[i]);
	  }*/
		//array tanımlaması,arrayin uzunluğunun kullanıcıdan alınması,
		//arrayin uzunluğu kadar for ile dönülüp,girilen değerler ilgili indekse atanıp ekrana yazdırma 
	  /*Scanner scanner =new Scanner(System.in);
	  System.out.print("Dizi uzunlugu:");
	  int length=scanner.nextInt();
	  int[] numbers=new int[length];
	  for(int i=0;i<numbers.length;i++) {
		  System.out.print((i+1)+". Sayı:");
		  numbers[i]=scanner.nextInt();
	  }
	  System.out.println(Arrays.toString(numbers));
	  // array deki değerleri toplayıp arrayin eleman sayısına bölme 
	  int total=0;
	  
	  for(int i=0;i<numbers.length;i++) {
		  total=total + numbers[i];
	  }
	  System.out.println(total/numbers.length);
	  */
	  
	  
	  //LAB2
//		int total=0;
//		int[] numbers= {1,5,-5,9,2,8,9};
//		int[] numbers2=new int[numbers.length];
//		for(int i=0;i<numbers.length;i++) {
//			numbers2[i]=numbers[i];
//		}
//		
//		System.out.println(Arrays.toString(numbers));
//		System.out.println(Arrays.toString(numbers2));
		  /*for(int i=0;i<numbers.length;i++) {
			total=total +numbers[i];
			
		}
		System.out.println(total);*/
		
//		
//		String[] names=new String[3];
//		names[0]="asya";
//		names[1]="arya";
//		names[2]="ayça";
//		
//		
//		System.out.println(Arrays.toString(names));
//		for(int i=names.length-1 ;i>= 0; i--) {
//			System.out.println(names[i]);
//		}
				
//		int[] numbers1= {1,2,3};
//		System.out.println(Arrays.toString(numbers1));
//		int[] numbers2=numbers1;
//		System.out.println(Arrays.toString(numbers2));
//		//numbers1 in sıfırıncı indeksinin değeri 5 olursa numbers2 nin sıfırıncı indeksinin değeri 5 olur mu?
//		numbers1[0]=5;
//		System.out.println(Arrays.toString(numbers2));
		
		//array ,reference type 
		
		//LAB3
		int[] numbers= {20,32,12,46,4};
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.binarySearch(numbers, -5));
		
		int[] copyOf= Arrays.copyOf(numbers, 3);
		System.out.println(Arrays.toString(copyOf));
		int[] copyOfRange =Arrays.copyOfRange(numbers,2,4);//2=inclusive ,4=exclusive
		System.out.println(Arrays.toString(copyOfRange));
		
//		
//		Arrays.fill(numbers, 44);
//		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		
		
	}
}
