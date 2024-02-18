import java.util.Arrays;

public class dizilerdriv {
	public static void main(String[] args) {
		//tek boyutlu 
		/*int[] numbers;
		numbers=new int[16];
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers[5]);
		numbers[5]=32;
		System.out.println(numbers[5]);
		*/
		
		/*
		int[] numbers={1,2,3,4,5,6,7,8,9};
		System.out.println(numbers[5]);
		System.out.println(numbers.length);
		
		String[] names=new String[10];
		System.out.println(Arrays.toString(names));
		
		names[2]="cemre";
		System.out.println(Arrays.toString(names));
		*/
		
		 //çok boyutlu 
		/*
		int[][] numbers = new int[2][3];
		numbers[0][0]=1;
		numbers[0][1]=2;
		numbers[0][2]=3;
		
		numbers[1][0]=4;
		numbers[1][1]=5;
		numbers[1][2]=6;
		System.out.println(Arrays.toString(numbers));
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(numbers[i][j]);
			}
		}*/
		
		String[][] ogrenciler=new String[3][3];
		ogrenciler[0][0]="cemre";
		ogrenciler[0][1]="can";
		ogrenciler[0][2]="ceren";
		
		
		ogrenciler[1][0]="cevdet";
		ogrenciler[1][1]="cem";
		ogrenciler[1][2]="aysel";
		
		ogrenciler[2][0]="cemres";
		ogrenciler[2][1]="cemrev";
		ogrenciler[2][2]="cemresv";
		for(int i=0; i< ogrenciler.length; i++) {
			for(int j=0; j<ogrenciler[i].length; j++) {
				System.out.print(i +" " + j+":");
				System.out.println(ogrenciler[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
	   
       