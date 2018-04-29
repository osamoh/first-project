import java.util.*;
public class CToF {

	public static void main(String[] args) {
		Scanner a = new Scanner (System.in);

		System.out.println("Enter a temperature in Celsius: ");
		double celsius = a.nextDouble();
		double fahrenheit ;
		fahrenheit =(9.0/5)*celsius+32;
		System.out.println(celsius + " Celsius is " + fahrenheit +" Fahrenheit" );
	}

}
