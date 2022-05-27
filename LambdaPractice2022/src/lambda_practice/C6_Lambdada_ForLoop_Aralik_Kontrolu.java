package lambda_practice;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class C6_Lambdada_ForLoop_Aralik_Kontrolu {

    public static void main(String[] args) {
        ilkOtuz( 30);
        System.out.println();
        ilkOtuzDahil( 30);
        System.out.println();
        System.out.println("ikiDegerArasiniTopla(1, 20) = " + ikiDegerArasiniTopla(1, 20));
        System.out.println();
        System.out.println("ortalama(30,40) = " + ortalama(30, 40));
        System.out.println();
        System.out.println("sekizeBolunen(325, 468) = " + sekizeBolunen(325, 468));
        System.out.println();
        sekizeBolunenYazdir(325,468);
        System.out.println();
        System.out.println("sekizeBolunenToplam(325,468) = " + sekizeBolunenToplam(325, 468));
        System.out.println();
        System.out.println("carp(7,15) = " + carp(7, 15));
    }

    // S1:1 den 30 kadar olan sayilari (30 dahil degil) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //range(int startInclusive, int endExclusive)
public static void ilkOtuz(int a){
        IntStream.range(1,a).sorted().forEach(Methods::yazInteger);
}

    //S2 1 den 30 kadar olan sayilari (30 dahil ) 1 2 3 .... seklinde siralayalim (for loopsuz)
    //rangeClosed(int startInclusive, int endInclusive)
    public static void ilkOtuzDahil(int a){
        IntStream.rangeClosed(1,a).sorted().forEach(Methods::yazInteger);
    }

    //S3 Istenen iki deger(dahi) arasindaki sayilari toplayalim
    public static int ikiDegerArasiniTopla(int a, int b){
       return IntStream.rangeClosed(a,b).sum();
    }

    //S4: 30 ile 40 arasindaki sayilarin (dahi) ortalamasini bulalim
    public static OptionalDouble ortalama(int a, int b){
        return IntStream.rangeClosed(a,b).average();
    }

    //S5: 325 ile 468 arasinda 8 e bolunen kac sayi vardir?
    public static long sekizeBolunen(int a, int b) {
        return IntStream.rangeClosed(a, b).filter(t -> t % 8 == 0).count();
    }
    //S6: 325 ile 468 arasinda 8 e bolunen sayilari yazdiralim
    public static void sekizeBolunenYazdir(int a, int b) {
        IntStream.rangeClosed(a, b).filter(t -> t % 8 == 0).forEach(Methods::yazInteger);
    }

    // S7:325 ile 468 arasinda 8 e bolunen sayilarin toplamini bulalim
    public static int sekizeBolunenToplam(int a, int b) {
        return IntStream.rangeClosed(a, b).filter(t -> t % 8 == 0).sum();
    }
    // S8: 7ile 15 arasindaki tek sayilarin carpimini bulalim
    public static double carp(int a, int b) {
        return IntStream.rangeClosed(a, b).filter(t -> t % 2 != 0).reduce(1,(x,y)->(x*y));
    }

    //S9: pozitif tek sayilarin ilk 10 elemanin yazdiralim

    public static void ilkOnYazdir(int a) {
        IntStream.rangeClosed(1,a).limit(10).filter(Methods::tekMi);
    }
    //S10: 21 den baslayan 7 nin katlarinin tek olanlari ilk 10 teriminin yaziralim



    //S11: 21 den baslayan 7 nin katlarinin ilk 20 teriminin toplayalim

}
//iterate bize sayilari istedigimiz sekilde yineletmeyi saglar yani buradaki ornekte 7ser7ser artmayi saglar
//iterate icin bir baslangic degeri girilmeli ve artisin nasil olacagi belirtilmeli nerede biteceginide
// limit() ile belirliyoruz