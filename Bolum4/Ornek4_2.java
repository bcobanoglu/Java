//Örnek 4.2. Veri tiplerine bağlı olarak değişkenlerin değer aralıklarını test eden bir uygulama.
public class Ornek4_2 {
public static void main(String[] args) 
{
  byte nar = 10; // byte tipinde tanımlammış bir değişken
  //byte nar = 210; //Veri tipi uyuşmazlığı hatası
  int elma = 50; // int tipinde tanımlammış bir değişken
  
  double armut = 12.5;  // double tipinde tanımlammış bir değişken
  double toplam = 0;
  toplam = nar + elma + armut;           
  System.out.println("Toplam="+ toplam);
  }
}
/*Output:
Toplam=72.5
*/
