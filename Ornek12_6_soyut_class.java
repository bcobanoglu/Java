//Soyut sınıf
abstract class Hayvan
{
//Soyut fonksiyon
public abstract void Konus ();
}

//Türetilmiş alt sınıflar
class Inek extends Hayvan {
 public void Konus()  {
  System.out.println ("Möööö");
}}
class Kedi extends Hayvan {
 public void Konus() {
  System.out.println("Miyav");
}}
class Kopek extends Hayvan {
 public void Konus ()   {
 System.out.println("Haaav");
}}

//Ana Program
class Test {
public static void main (String[] args)
{
/*Hayvan *b=new Hayvan
*Hata:Soyut sınıfdan Nesne üretilemez */

Hayvan[] a = new Hayvan[3];
a[0] = new Inek();
a[1] = new Kopek();
a[2] = new Kedi();
System.out.println("**Hayvanlar konuşuyor**");
for (int i=0; i < 3; i++)
	 a[i].Konus();
} //main sonu
} //Test sonu

