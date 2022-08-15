import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //dik üçgende hipotenusun hesaplanması
        double a, b, c;

        Scanner inp = new Scanner(System.in);

        System.out.println("Hipotenusun Hesaplanması için dik kenar uzunluklarını giriniz : ");
        b = inp.nextDouble();
        c = inp.nextDouble();

        a = Math.sqrt(b*b + c*c);

        System.out.println("Hipotenus : " + a);

        // Kenar uzunlukları girilen üçgenin alanını bulma
        double x, y, z, u, s;
        System.out.println("Alanın hesaplanması için üçgenin kenar uzunluklarını giriniz : ");
        Scanner input= new Scanner(System.in);
        x = input.nextDouble();
        y = input.nextDouble();
        z = input.nextDouble();

        u = (x+y+z)/2;
        s = Math.sqrt(u*(u-x)*(u-y)*(u-z));
        System.out.println("Kenar uzunlukları :"+x+" "+y+" "+z+" olan üçgenin alanı: "+s+" birim karedir.");
    }
}