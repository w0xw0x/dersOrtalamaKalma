import java.sql.SQLOutput;
import java.util.Scanner;
public class Kalma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double mat,fiz,tr,kim,muz,toplam;

        System.out.println("Matematik Notunuzu Giriniz : ");
        mat = input.nextDouble();

        System.out.println("Fizik Notunuzu Giriniz : ");
        fiz = input.nextDouble();

        System.out.println("Türkçe Notunuzu Giriniz : ");
        tr = input.nextDouble();

        System.out.println("Kimya Notunuzu Giriniz : ");
        kim = input.nextDouble();

        System.out.println("Müzik Notunuzu Giriniz : ");
        muz = input.nextDouble();

        toplam = (mat + fiz + tr + kim + muz) / 5;

        if ((toplam<0) && (toplam>100)){
            System.out.println("Girdiğiniz notları gözden geçiriniz!");
        }else {

            if (toplam >= 55){
                System.out.println("Ortalamanız : "+toplam);
                System.out.println("Sınıfı Geçtiniz");
            }else {
                System.out.println("Ortalamanız : "+toplam);
                System.out.println("Sınıfta Kaldınız");
                }

        }



    }
}
