package lambda_practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C5_Method_Referance_String {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("Elma", "Muz", "Portakal", "Cilek", "Limon");
        bykharf(l);
        uzun(l);
    }
    // S1: Tum harfleri buyuk harf ile aralarinda bosluk birakarak yazdiralim
public static void bykharf(List<String> l){
   l.stream().map(String::toUpperCase).forEach(t->System.out.print(t+" "));
}

    //S2: Stringleri uzunluklarina gore siralayip yaziniz
public static void uzun(List<String> l){
        l.stream().map(String::length).
                sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+" "));
}

    //S3: E ILE Baslayanlari yazdiralim


}
