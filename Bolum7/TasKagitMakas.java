//İçiçe if else mantığını kavratan eğlencelik Taş-Kağıt-Makas Oyunu
//author: Bülent Çobanoğlu
import java.util.Scanner;
import java.util.Random;
public class TasKagitMakas
{ 
public static void main(String[] args) 
{ 
    String oyuncu; //Oyuncunun "K", "M", "T" değerlerini tutacak değişken 
    String bilgisayar = ""; //PC nin "K", "M", "T" değerlerini tutacak değişken 
       
    var tara = new Scanner(System.in); 
    Random generator = new Random(); 

    System.out.println("Lütfen Taş için T, Kağıt için K, Makas için M giriniz:");

    //Bilgisayar için rasgele bir değer seç (1:"T", 2:"K", 3:"M") 
    int pcSayac = generator.nextInt(3)+1; 
    if (pcSayac == 1) 
       bilgisayar = "T"; 
    else if (pcSayac == 2) 
       bilgisayar = "K"; 
    else if (pcSayac == 3) 
       bilgisayar = "M"; 

    //Oyuncu tercihini klavyeden girerek yapıyor
    System.out.println("Oyuncu: "); 
    oyuncu = tara.next().toUpperCase(); //Küçük harf girerse büyüğe dönüştür
    
    //Bilgisayarın tercihini yaz
    System.out.println("Bilgisayar: " + bilgisayar); 

    //İç içe if else ile 9 ihtimal değerlendiriliyor
    if (oyuncu.equals(bilgisayar)) 
       System.out.println("Berabere!"); 
    else if (oyuncu.equals("T") && bilgisayar.equals("M")) 
          System.out.println("Taş, makası kırar.Sen kazandın!!");
    else if (bilgisayar.equals("K") && oyuncu.equals("T") )
    		System.out.println("Kâğıt, taşı sarar. Bilgisayar kazandı!!"); 
    else if (oyuncu.equals("K") && bilgisayar.equals("M")) 
       System.out.println("Makas, kâğıdı keser. Bilgisayar kazandı!!"); 
    else if (bilgisayar.equals("T") && oyuncu.equals("K")) 
            System.out.println("Kâğıt, taşı sarar. Sen kazandın!!"); 
    else if (oyuncu.equals("M") && bilgisayar.equals("K")) 
         System.out.println("Makas, kâğıdı keser. Sen kazandın!!"); 
    else if (bilgisayar.equals("T") && oyuncu.equals("M"))
            System.out.println("Taş, makası kırar. Bilgisayar kazandı!!"); 
    else 
         System.out.println("Hatalı giriş..."); 
} //main sonu
} //class sonu
 
