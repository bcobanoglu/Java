// Bu alanda değişken tanımlanmaz
class Test {
/*Burada tanımlanan değişkenler global değişkenlerdir
 ve static ön eki almalıdır */
static String mesaj1;
public static void main(String[] args) {
 // Burada tanımlanan değişkenler yerel değişkenlerdir  
 
 mesaj1="Merhaba"; //global değişkene değer ataması yapıldı
 String mesaj2="Türkiye"; //yerel değişken tanımlandı
 System.out.println(mesaj1);
 System.out.println(mesaj2);
// Burada tanımlanan değişkenler yerel değişkenlerdir    	   	
}
/*Burada tanımlanan değişkenler global değişkenlerdir
ve static ön eki almalıdır */      
}
// Bu alanda da değişken tanımlanmaz
