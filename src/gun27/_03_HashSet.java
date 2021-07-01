package gun27;

import java.util.HashSet;

public class _03_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);
        HashSet<Integer> setB = new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("birlesik hali = " + birlestir(setA,setB));
        System.out.println("farki = " + farki(setA,setB));
        System.out.println("ortak elamanlar = " + kesisim(setA,setB));



    }

    public static  HashSet<Integer> birlestir( HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> birlesikHali = new HashSet<>();
    birlesikHali.addAll(setA);
    birlesikHali.addAll(setB);
    return birlesikHali; }

    public static  HashSet<Integer> farki( HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> fark = new HashSet<>(setA);
        fark.removeAll(setB);//setA dan setB olan ortak elemanlari cikariyor (1,2,3) kaliyor
        return fark; }

    public static  HashSet<Integer> kesisim( HashSet<Integer> setA, HashSet<Integer> setB) {
        HashSet<Integer> ortak = new HashSet<>(setA);
        ortak.retainAll(setB);//ortak elamanlari yaziyor
        return ortak; }

}
