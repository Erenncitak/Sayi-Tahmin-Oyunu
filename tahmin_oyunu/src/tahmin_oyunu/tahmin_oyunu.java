package tahmin_oyunu;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class tahmin_oyunu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int pcSayi =random.nextInt(100)+1;
        
        System.out.println("Rastgele bir sayı tutuldu aşağıda tahminlerinizi belirtin.");
        
        int[] sayilar = new int[5];
        int[] sayilarFark = new int[5];
        
        for(int i=0;i<=4;i++) {
        	
        	System.out.println((i+1)+". Tahmininizi girin==>");
        	sayilar[i]=scanner.nextInt();
        	System.out.println("Kullanıcı==>"+ sayilar[i]);
        	sayilarFark[i] = Math.abs(pcSayi - sayilar[i]);
        }

        System.out.println();
        System.out.println("Bilgisayarın tutmuş olduğu sayı==>"+ pcSayi);
        System.out.println("Tahminleriniz==>");
        
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (sayilarFark[i] > sayilarFark[j]) {
                    int tempFark = sayilarFark[i];
                    sayilarFark[i] = sayilarFark[j];
                    sayilarFark[j] = tempFark;

                    int tempTahmin = sayilar[i];
                    sayilar[i] = sayilar[j];
                    sayilar[j] = tempTahmin;
                }
            }
        }
        
        for (int i = 0; i < 5; i++) {
            String durum = (sayilarFark[i] == 0) ? "Doğru tahmin!" : "en yakın " + (i + 1) + ". Sayı ve " + sayilarFark[i] + " sayı uzaklıkta";
            System.out.println(sayilar[i] + " " + durum);
        }
        
	}

}
