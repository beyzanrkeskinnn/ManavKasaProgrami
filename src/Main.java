import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pear=2.14, tomatoes=1.11, apple=3.67, banana=0.95,aubergine=5.00, total,pearkilo, applekilo, tomatokilo,bananakilo,auberkilo;

        Scanner input=new Scanner(System.in);

        System.out.print("Armut kaç kilo: " );
        pearkilo=input.nextDouble();

        System.out.print("Domates kaç kilo: " );
        tomatokilo=input.nextDouble();

        System.out.print("Elma kaç kilo: " );
        applekilo=input.nextDouble();

        System.out.print("Muz kaç kilo: " );
        bananakilo=input.nextDouble();
        
        System.out.print("Patlican kaç kilo: " );
        auberkilo=input.nextDouble();


        total=(pearkilo*pear)+(applekilo*apple)+(tomatokilo*tomatoes)+(bananakilo*banana)+(auberkilo*aubergine);
        System.out.println("Toplam Tıtarınız : "+total+" TL");

    }
}