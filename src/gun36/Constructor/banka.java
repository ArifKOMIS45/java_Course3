package gun36.Constructor;

public class banka {
    String adi;
    int subeSayisi;
    int kurulusYili;

    public banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public banka(String adi, int subeSayisi) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
    }

    public banka(String adi) {
        this.adi = adi;
    }

    @Override
    public String toString() {
        return "banka{" +
                "adi='" + adi + '\'' +
                ", subeSayisi=" + subeSayisi +
                ", kurulusYili=" + kurulusYili +
                '}';
    }
}