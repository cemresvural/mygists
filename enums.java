import java.time.DayOfWeek;

public class enums {
  public static void main(String[] args) {
//	  months ay=months.OCAK;
//	  System.out.println(ay);
//	  
//	  months[] values= months.values();
//	  for(int i=1; 1< values.length;i++) {
//		  System.out.println(values[i]);
//	  }
	  
	  DayOfWeek sunday= DayOfWeek.SUNDAY;
	  System.out.println(sunday);
	  
	  DayOfWeek of =DayOfWeek.of(3);
	  System.out.println(of);
  }
}
