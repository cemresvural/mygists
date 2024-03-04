import java.util.Arrays;

public class metotLab {
	//Lab1
//
//	private static  int x=20;
//	
	public static void main(String[] args) {
//		 /*metotLab MetotLab=new metotLab();
//		MetotLab.normalMetot();
//		 */
//	
//		metotLab.staticMetot();
//		
//		Math.sqrt(4);
//		int max=metotLab.max(1, 5, 3);
//		System.out.println(max);
//		
//		
//		double max2=metotLab.max(2.0, 5.0,7.0);
//		System.out.println(max2);
//		boolean majority=metotLab.majority(true,false,true);
//		System.out.println(majority);
//		
//		
//		int[] x= {1,2,3};
//		int[] y= {1,2,3};
//		System.out.println(metotLab.eq(x, y));
		
		int x=10;
		int y=20;
		int[] sayilar= {2,3};
		System.out.println(Arrays.toString(sayilar));
		
		metotLab.degistir(sayilar);
		System.out.println(Arrays.toString(sayilar));
		
	}
//	public void  normalMetot() {
//		System.out.println(x);
//	}
//	
//	public static void staticMetot() {
//		System.out.println(x);
//	}
//    public static int max(int x,int y,int z) {
//    	int max=x;
//    	if(y>max)
//    		max=y;
//    	if(z>max)
//    		max=z;
//    	return max;
//	
//}
////Method signatures must be different from each other.
//    public static double max(double x,double y,double z) {
//    	double max=x;
//    	if(y>max) max=y;
//    	if(z>max) max=z;
//    	return max;
//    }

    	//Lab2
	/*public static boolean majority(boolean x,boolean y,boolean z) {
		return (x&&y) || (x&&z) || (y&&z);
	}
	
	
	
	
	public static boolean eq(int[] x,int[] y) {
		boolean result=true;
		if(x.length==y.length) {
			for(int i=0; i<x.length; i++) {
				if(x[i] !=y[i]) {
					result=false;
					break;
				}
			}
		}else { 
			result=false;
		}
		return result;
	}*/
	
	
	//Lab3
	public static void degistir(int[] sayilar) {
		int temp=sayilar[0];
		sayilar[0]=sayilar[1];
		sayilar[1]=temp;
	}
	
    }

