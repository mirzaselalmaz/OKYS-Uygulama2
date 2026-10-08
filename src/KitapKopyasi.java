public class KitapKopyasi {
    private int kopyaId;
    private Kitap kitap;
    private boolean oduncteMi;

    public KitapKopyasi(int kopyaId, Kitap kitap) {
        this.kopyaId = kopyaId;
        this.kitap = kitap;
        this.oduncteMi = false;
    }

    public int getKopyaId() {
        return kopyaId;
    }

    public boolean isOduncteMi() {
        return oduncteMi;
    }

    public void oduncVer() {
        if (!oduncteMi) {
            oduncteMi = true;
            System.out.println(kopyaId + " nolu '" + kitap.getBaslik() + "' kopyasi odunc verildi.");
        } else {
            System.out.println("Hata: " + kopyaId + " nolu kopya zaten oduncte!");
        }
    }

    public void iadeEt() {
        if (oduncteMi) {
            oduncteMi = false;
            System.out.println(kopyaId + " nolu '" + kitap.getBaslik() + "' kopyasi iade edildi.");
        } else {
            System.out.println("Bu kopya zaten kutuphanede.");
        }
    }
}