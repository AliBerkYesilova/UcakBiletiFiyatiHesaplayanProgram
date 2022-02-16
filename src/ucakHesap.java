import java.util.Scanner;

public class ucakHesap {
    public static void main(String[] args) {
        //Deişkenleri tanımladım
        double mesafe, yas, mesafeUcret=0.10, normalTutar, yasIndirimi=0, indirimTutar, gidnbiIndirimi, toplamTutar;
        int yolTip;

        //Kullanıcıdan değerlerin aldırılması icin scanner kullandım.
        Scanner input = new Scanner(System.in);


        //Kullanıcıdan km, yaş ve gidiş-dönüş bilgisi istedim.
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolTip = input.nextInt();

        //Ücreti hesapladım
        normalTutar=mesafe*mesafeUcret;

        //İndirimleri hesapladım
        if (yas < 12) {
            yasIndirimi=normalTutar*0.50;
        } else if (yas >=12 && yas <= 24){
            yasIndirimi=normalTutar*0.10;
        } else if (yas >= 65){
            yasIndirimi=normalTutar*0.30;
        }

        indirimTutar=normalTutar-yasIndirimi;

        switch (yolTip) {
            case 1:
                gidnbiIndirimi=indirimTutar*0;
                toplamTutar=indirimTutar-gidnbiIndirimi;
                System.out.print("\nToplam Tutar = " + (toplamTutar) +" TL");
                break;

            case 2:
                gidnbiIndirimi=indirimTutar*0.20;
                toplamTutar=indirimTutar-gidnbiIndirimi;
                toplamTutar=toplamTutar*2;
                System.out.print("\nToplam Tutar = " + (toplamTutar) +" TL");
                break;

            default:
                System.out.println("\nHatalı Veri Girdiniz !");
                break;
        }
    }
}