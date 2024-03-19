
public class Square {
	private int x;
	private int y;
	private int length;
	
	public int getX() {
		return x;
	}
	
	public void  setX(int _x) {
		if(_x>=0) {
			x =_x;
		}else {
			System.out.println("X -1'den buyuk olmalıdır.");
		}
		
	}
	
	
	public int getY() {
		return y;
	}
	public void setY(int _y) {
		if(_y>=0) {
			y=_y;
		}else {
			System.out.println("Y -1'den buyuk olmalıdır.");
		}
		
	}
	
	public int getlength() {
		return length;
	}
	
	public void setLength(int _length) {
		if(_length>=0) {
			length= _length;
		}else {
			System.out.println("Uzunluk 0'dan buyuk olmalıdır.");
		}
		
	}
	
	public void printScreen() {
		System.out.println("X: " + x);
		System.out.println("Y: " + y);
		System.out.println("Length: " + length);
	}

}
