//string ornek
/*
public class StringDriver {
    public static void main(String[] args) {
    	String firstName= "John";
    	System.out.println(firstName.charAt(1));
    	System.out.println(firstName.toUpperCase());
    	System.out.println(firstName.toLowerCase());
    	System.out.println(firstName.replace('o','a'));
    	System.out.println(firstName.length());
    	System.out.println(firstName.substring(2));
    	System.out.println(firstName);
    }
}
*/

//String builder
import java.util.Scanner;

public class StringDriver {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
    	//String userInput=scanner.nextLine();
    	//System.out.println(userInput);
    	//System.out.println(userInput.toLowerCase());
    	StringBuffer buffer =new StringBuffer();
    	System.out.print("Adınız: ");
        buffer.append(scanner.nextLine());
    	System.out.print("Soyadınız: ");
    	buffer.append(scanner.nextLine());
    	
    	System.out.println(buffer.toString());
    	
    }
    }