import java.awt.Point;

public class JavaMemoryTester {

	public static void main(String[] args) {
		
		/*
		int num = 0;
		System.out.println("In main, before method, num is "  + num);
		primitiveParam(num);
		*/
		
		// it's as if behind the scenes, you have this statement:
		// formalParam = actualParam;
		// number = num;
		
		//System.out.println("In main, after method, num is "  + num);
		
		/*
		Point p = new Point(0,0);
		System.out.println("In main, before method, p is "  + p);
		objectParam(p);
		System.out.println("In main, after method, p is "  + p);
		*/
		
		Point p2 = new Point(0,0);
		System.out.println("In main, before method, p is "  + p2);
		objectParamReassign(p2);
		System.out.println("In main, after method, p is "  + p2);
		
	}

	public static void primitiveParam(int number) {
		System.out.println("\tIn method, formal paramter number is " + number);
		number = 99;
		System.out.println("\tIn method, formal paramter number is " + number);
	}
	
	
	
	// behind the scenes: point = p;
	public static void objectParam(Point point) {
		System.out.println("\tIn method, formal paramter point is " + point);
		point.setLocation(99,99);
		System.out.println("\tIn method, formal paramter point is " + point);
	}
	
	
	
	
	
	
	public static void objectParamReassign(Point pointReassign) {
		System.out.println("\tIn method, formal paramter pointReassign is " + pointReassign);
		pointReassign = new Point(100,100);
		pointReassign.setLocation(50,50);
		System.out.println("\tIn method, formal paramter pointReassign is " + pointReassign);
	}
	
}
