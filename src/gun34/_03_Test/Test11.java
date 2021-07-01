package gun34._03_Test;

import org.junit.Assert;
import org.junit.Test;

public class Test11 {
    @Test
     public void DikdortgenAlanTest1(){
        //nesneyi olusturupve degerleri al
        Dikdortgen d=new Dikdortgen();
        d.yukseklik=4;
        d.genislik=5;
        //sonucu al
        int sonuc=d.alan();
        //Beklenen deger 20

       //Assert ile karsilastir
        Assert.assertEquals("Testi gecti",20,sonuc);



    }




}
