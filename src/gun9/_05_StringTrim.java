package gun9;

public class _05_StringTrim {
    public static void main(String[] args) {
        //trim: stringin sadece basinda ve sonundaki bosluk karakterlerini temizler
        String text="   Merhaba Dunya  ";
        System.out.println("orjinal hali =--> " + text+"<--");
        System.out.println("textin trimlenmis hali =-->" + text.trim()+"<--");


    }
}
