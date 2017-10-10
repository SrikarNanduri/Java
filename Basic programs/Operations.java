import java.util.Scanner;

public class Operations{
public static void main(String[] args){

Scanner in = new Scanner(System.in);
System.out.println("Enter 1st Number");
int num1= in.nextInt();
System.out.println("Enter 2st Number");
int num2= in.nextInt();

int num3= num1 + num2;
int num4= num1 - num2;
int num5= num1 * num2;
int num6= num1 / num2;
int num7= num1 % num2;
System.out.println("Sum of 2 numbers is" +" " + num3);
System.out.println("Sub of 2 numbers is" +" " + num4);
System.out.println("Mul of 2 numbers is" +" " + num5);
System.out.println("Div of 2 numbers is" +" " + num6);
System.out.println("Mod of 2 numbers is" +" " + num7);

}
}