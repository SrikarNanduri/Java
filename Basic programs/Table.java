import java.util.Scanner;

public class Table{
public static void main (String [] args){

Scanner in= new Scanner(System.in);
System.out.println("Enter the number");
int a = in.nextInt();
System.out.println("Enter the limit number");
int b = in.nextInt();

for( int i=0; i<b; i++)
{
System.out.println(a + "x" + (i+1) + "=" + (a*(i+1)));
}

}
}