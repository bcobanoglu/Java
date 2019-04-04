import java.util.Scanner;
class Ornek7_1 {
public static void main(String[] args) 
{
System.out.printf("Gir bir sayı\n");
Scanner gir = new Scanner(System.in);
int A = gir.nextInt();
if (A <= 0) 
  System.out.printf("Karesi..:%d", A * A);

} //main sonu
} //class 
