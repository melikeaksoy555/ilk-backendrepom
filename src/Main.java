import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
// System.out.println("Veri tipleri ve Değişkenler");

    // İlkel veri tipleri
        // int, short, byte, long, double, float, char, boolean = true, false
        // kısa yol -> ctrl + shift + /

        // System.out.println(10);
        // System.out.println(10.0);
        // System.out.println(10+5);
        // int number = 10;
        // String slogan = "bizim sloganımız...";
        // System.out.println(number);
        // System.out.println(slogan);

        //int yas = 25;
        /*double maas = 50000.0;
        char cinsiyet = 'M';
        boolean ogrenciMi = false;

        System.out.println("Yaş: " + yas);
        System.out.println("Maaş: " + maas);
        System.out.println("Cinsiyet: " + cinsiyet);
        System.out.println("Öğrenci Mi: " + ogrenciMi);*/

        /*String isim; //değişken tanımlama
        isim = "John";   //değişkene değer atama
        System.out.println("İsim: " + isim);*/

        // Java'da final anahtar kelimesi, bir değişkenin değerinin bir kez atandıktan sonra değiştirilemeyeceğini belirtir (yani sabit/constant yapar).
       /* final int SAYI = 10;
        System.out.println("Sabit Sayı: " + SAYI);
        final double PI = 3.14;
        System.out.println(PI);*/

        // Scanner: Kullanıcıdan klavye aracılığıyla veri almak
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("Bir tane değer gir");
        int n=scanner.nextInt();
        System.out.println("Girdiğiniz değer");
        System.out.println(n);*/
       /* Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen adınızı giriniz: ");
        String isim = scanner.nextLine();
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("\nGirilen Bilgiler:");
        System.out.println("Ad: " + isim);
        System.out.println("Yaş: " + yas);
        scanner.close();*/

              /*  Scanner scanner = new Scanner(System.in);

                System.out.print("Bir sayı girin: ");
                double sayi = scanner.nextDouble();

                if (sayi > 0) {
                    System.out.println("Pozitif sayı");
                }
                else if (sayi < 0) {
                    System.out.println("Negatif sayı");
                }
                else {
                    System.out.println("Sayı sıfır");
                }
                scanner.close();*/
   /*     Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Çift sayı");
        } else {
            System.out.println("Tek sayı");
        }
        scanner.close();  */
/*Scanner scanner = new Scanner(System.in);
System.out.print("Notunuzu girin (0-100): ");
int not = scanner.nextInt();
        if (not < 0 || not > 100) {
            System.out.println("Geçersiz not! Lütfen 0-100 arası bir sayı girin.");
        } else {
            char harfNotu;
            switch (not / 10) {
                case 10:
                case 9:
                    harfNotu = 'A';
                    break;
                case 8:
                    harfNotu = 'B';
                    break;
                case 7:
                    harfNotu = 'C';
                    break;
                case 6:
                    harfNotu = 'D';
                    break;
                default:
                    harfNotu = 'F';
            }

            System.out.println("Harf notunuz: " + harfNotu);
            scanner.close();
}*/
        /*for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }*/
       /* int sayi = 10;

        while (sayi >= 1) {
            System.out.println(sayi);
            sayi--;
        }*/

        /*int[] sayilar = {10, 20, 30, 40, 50};

        System.out.println("Dizinin elemanları:");
        for (int i = 0; i < sayilar.length; i++) {
            System.out.println("indeks[" + i + "] = " + sayilar[i]);
        }*/

                Scanner scanner = new Scanner(System.in);

                System.out.print("Birinci sayıyı girin: ");
                double sayi1 = scanner.nextDouble();

                System.out.print("İkinci sayıyı girin: ");
                double sayi2 = scanner.nextDouble();

                System.out.print("Üçüncü sayıyı girin: ");
                double sayi3 = scanner.nextDouble();


                double enBuyuk = sayi1;

                if (sayi2 > enBuyuk) {
                    enBuyuk = sayi2;
                }

                if (sayi3 > enBuyuk) {
                    enBuyuk = sayi3;
                }

                System.out.println("Girilen en büyük sayı: " + enBuyuk);

                scanner.close();
            }
        }