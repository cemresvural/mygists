import java.util.Date;

public class Driver {
	
	public static void main(String[] args) {
		/*Working working=new Working();
		working.setName("Cemre");
		working.setWage(27600);
		working.setStartDateOfWork(new Date());
		
		
		System.out.println(working.getName());
		System.out.println(working.getWage());
		System.out.println(working.getStartDateOfWork());
	}*/
		
		Square square=new Square();
		square.setX(10);
		square.setY(5);
		square.setLength(100);
		square.printScreen();
		
		System.out.println(square.getX());

}
}