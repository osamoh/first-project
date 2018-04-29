import java.util.*;
public class Distance {

	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);
		double x1,x2 ,y1 , y2 ;
		System.out.println("Enter x1 and x2 :" );
		x1 = a.nextDouble();
		x2 = a.nextDouble();
		System.out.println("Enter y1 and y2 :" );
		y1 = a.nextDouble();
		y2 = a.nextDouble();

		double distance = Math.pow((x1 - x2) * (x1 - x2) +
				 (y1 - y2) * (y1 - y2), 0.5);

				 System.out.println("The distance between the two points is " + distance);
				 }
				

	}


