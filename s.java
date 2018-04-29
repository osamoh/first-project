import java.util.Scanner;
public class s {
public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
int x , y ;
System.out.print("Enter performance level: ");
y = reader.nextInt();
System.out.println("Enter base salary: ");
x = reader.nextInt();


if (y >= 90){

	x = x + x * 3 /100;
}
System.out.println("Salary is " + x);
}
}
