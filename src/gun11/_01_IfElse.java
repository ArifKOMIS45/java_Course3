package gun11;

import java.util.Scanner;

public class _01_IfElse {
public static void main(String[]args){
    Scanner oku=new Scanner(System.in) ;
    System.out.println("Notu Giriniz=");
    int ogrnot= oku.nextInt();

    if (ogrnot>=50){System.out.println("Gectiniz,Tebrikler");}
    if (ogrnot<50){
    System.out.println("Kladiniz");

    if (ogrnot>=50){System.out.println("Gectiniz,tebrikler"); }
    else {System.out.println("Kaldiniz");}
        }
}}
