public class Main {
    public static void main(String[] args) {
        Kitap k1 = new Kitap("Kucuk Prens", "Antoine de Saint-Exupery", "978975");
        k1.bilgileriGoster();

        KitapKopyasi kopya1 = new KitapKopyasi(1, k1);

        kopya1.oduncVer();
        kopya1.oduncVer(); // Zaten oduncte uyarisi vermeli
        kopya1.iadeEt();
    }
}