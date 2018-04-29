import java.util.Scanner;
public class Tips {
 public static void main(String args[]) {
 // Read subtotal
 Scanner input = new Scanner(System.in);
 System.out.print("Enter subtotal and gratuity rate:");
 double subtotal = input.nextDouble();
 double rate = input.nextDouble();
 double gratuity = subtotal * rate / 100;
 double total = subtotal + gratuity;
 System.out.println("The gratuity is $" + gratuity +
 " total is $" + total);
 }
}
