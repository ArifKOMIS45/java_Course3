package gun6;

public class _09_ornek6 {
    public static void main(String[] args) {
        String kenar="40";
      short shortkenar= Short.parseShort(kenar);

        int cevre = shortkenar+shortkenar+shortkenar+shortkenar;
        //javada tam sayilar ve tam sayi degiskenlerinin degerleri turu ne olursa olsun default int
        //goruldugundenislemlerin sag tarafi INT kabul edilir,dolayisiyla narrow casting yapilmasi zorunludur
          // yazilimlar bestpratics olarak tam sayilartanimlanirken int tanimlanir bu yuzden

        System.out.println("cevre = " + cevre);



    }
}
