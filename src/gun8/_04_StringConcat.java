package gun8;

public class _04_StringConcat {
    public static void main(String[] args) {
        String s1="merhaba";
        String s2="Dunya";

        System.out.println("s1.concat(s2) = " +  s1.concat(s2));//s1+s2 ile ayni
        System.out.println("s1.concat(s2) = " +  s1.concat("  ").concat(s2));//s1+" " +s2
        System.out.println("s1.concat(s2) = " +  s1.concat(" "+s2));

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        s1=s1.concat(s2);//ancak atanirsa degisir
        System.out.println("s1 = " + s1);//MerhabaDunya


    }
}
