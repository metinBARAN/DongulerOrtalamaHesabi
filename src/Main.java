import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int i,sayi,ortalama,sayac=0,toplam=0;
        Scanner inp=new Scanner(System.in);

        System.out.println("Bir sayi giriniz: ");
        sayi=inp.nextInt();
        inp.close();


        for(i=1;i<=sayi;i++){
            if ((i%3==0)&&(i%4==0)){

                toplam=toplam+i;
                sayac++;
                System.out.println("Alinan degerler: "+i);
            }
        }
        ortalama=toplam/sayac;
        System.out.println("sayac:"+sayac+" \ni: "+i+"\ntoplam: "+toplam+"\nOrtalama:"+ortalama);
    }
}
