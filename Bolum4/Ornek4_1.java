//Örnek 4.1. MIN_VALUE/ MAX_VALUE ve SIZE komutlarının kullanım örneği
public class Ornek4_1 {
    public static void main(String args[]) {
      System.out.println("int maksimumu=" + Integer.MAX_VALUE );
      System.out.println("float maksimumu=" + Float.MAX_VALUE); 
      System.out.println("byte minimumu=" + Byte.MIN_VALUE);   
      System.out.println("byte kapasitesi=" + Byte.SIZE +" bit");   
      System.out.println("int kapasitesi=" + Integer.SIZE +" bit");
    }
}

/*Output:
int maksimumu=2147483647
float maksimumu=3.4028235E38
byte minimumu=-128
byte kapasitesi=8 bit
int kapasitesi=32 bit
*/
