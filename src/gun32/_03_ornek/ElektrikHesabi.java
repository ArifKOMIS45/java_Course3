package gun32._03_ornek;

public class ElektrikHesabi {
    int toplamTuketim = 0;
    double oran = 0.7;
    double fatura ;


    public void tuketimEkle(int tuketim) {
        toplamTuketim += tuketim; }

    public double odenecekTutar() {
        fatura = toplamTuketim * oran;

        return fatura;}

}
