package gun39;

public class mentor {
    int boy;
    int yas;
int kilo;


    public mentor() {
        System.out.println("Insan objesi olustruldu");
    yas=1;
    }




    public mentor(int boy, int yas, int kilo) {
        this();///default contructori cagisiriyor
        this.boy = boy;
        this.yas = yas;
        this.kilo = kilo;

        System.out.println("boy = " + boy);
        System.out.println("yas = " + yas);
        System.out.println("kilo = " + kilo);
    }




    public static void main(String[] args) {
        mentor adam1=new mentor();
        adam1.boy=186;
        adam1.kilo=90;
        System.out.println("boy:" +adam1.boy+"\n kilo:"+ adam1.kilo+ "\n yas:"+ adam1.yas);
        System.out.println("----------------------------------------");
        mentor adam2=new mentor(185,27,90);

    }



}
