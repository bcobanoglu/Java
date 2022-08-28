class TanimliTip {
    enum Gun { Pazartesi, Salı, Çarşamba, Perşembe, Cuma, Cumartesi, Pazar}
    enum Aylar { Ocak, Şubat, Mart, Nisan, Mayıs, Haziran, Temmuz, Ağustos, Eylül, Ekim, Kasım, Aralık}

    public static void main(String[] args) {
        System.out.println(Gun.Perşembe);
        int ay=Aylar.Ekim.ordinal()+1; // enum yapısında ilk elemanın indisi 0 dır
        System.out.println("Ekim Yılın "+ ay +". ayıdır");
    }
}