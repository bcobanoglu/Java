//Örnek 4.8. Haftanın günlerini, rakamsal karşılığı ile veren programı kodlayınız. 
public class Ornek4_8a {
enum Gunler 
{Pazartesi, Salı, Çarşamba, Perşembe, Cuma, Cumartesi, Pazar};
public static void main(String[] args) {
	System.out.println("Haftanın;");
	System.out.println("1. günü:"+ Gunler.Pazartesi);
	System.out.println("2. günü:"+ Gunler.Salı);
	System.out.println("3. günü:"+ Gunler.Çarşamba);
	System.out.println("4. günü:"+ Gunler.Perşembe);
	System.out.println("5. günü:"+ Gunler.Cuma);
	System.out.println("6. günü:"+ Gunler.Cumartesi);
	System.out.println("7. günü:"+ Gunler.Pazar);
 }
}


/*Output:
Haftanın;
1. günü:Pazartesi
2. günü:Salı
3. günü:Çarşamba
4. günü:Perşembe
5. günü:Cuma
6. günü:Cumartesi
7. günü:Pazar
*/
