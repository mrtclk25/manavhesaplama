import java.util.Scanner;

public class manavprogrami {
    public static void main(String[] args) {

        double a,e,d,m,p,armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00;

        Scanner input = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("Aldığınız Armut Miktarını Kilogram Cinsinden Yazınız");
        System.out.println("-----------------------------------------------------");

        a = input.nextDouble();

        System.out.println("----------------------------------------------------");
        System.out.println("Aldığınız Elma Miktarını Kilogram Cinsinden Yazınız");
        System.out.println("-----------------------------------------------------");

        e = input.nextDouble();

        System.out.println("----------------------------------------------------");
        System.out.println("Aldığınız Domates Miktarını Kilogram Cinsinden Yazınız");
        System.out.println("-----------------------------------------------------");

        d = input.nextDouble();

        System.out.println("----------------------------------------------------");
        System.out.println("Aldığınız Muz Miktarını Kilogram Cinsinden Yazınız");
        System.out.println("-----------------------------------------------------");

        m= input.nextDouble();

        System.out.println("----------------------------------------------------");
        System.out.println("Aldığınız Patlıcan Miktarını Kilogram Cinsinden Yazınız");
        System.out.println("-----------------------------------------------------");

        p = input.nextDouble();

        double toplam = (a*armut + e*elma + m*muz + p*patlican + d*domates);

        System.out.println("Toplam Tutar : " + toplam);

    }}
