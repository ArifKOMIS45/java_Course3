package gun7;

import java.util.Scanner;

public class _08_ornek {
    public static void main(String[] args) {
        // kullanicindan kac bilet istedigini ve sigorta isteyp istemedigini(boolean) olarak
        //ekrana yazdirin
        Scanner oku=new Scanner(System.in);

        System.out.print("Kac bilet istiyormusunuz? ="); byte bilet= oku.nextByte();
        System.out.print("sigorta istiyormusunuz? ="); boolean isSigorta= oku.nextBoolean();
        System.out.println("Biletiniz:" +bilet+ "  sigorta = " + isSigorta);


    }

}
