import java.io.Serializable;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main4 {

    public static void main(String[] args) {
        Stream.of(new int[]{1, 2, 3, 4, 5, 6}).filter(x -> x.length > 2).forEach(System.out::println);
        Stream.generate(Math::random).limit(20).filter(x -> x > 0.5).forEachOrdered(System.out::println);
        Object list = Arrays.asList(1, 2, 8, 4, 7, 6).stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(list);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.TYPE);
        int a = 1;
        System.out.println(list instanceof Array);

        System.out.println(Integer.bitCount(20));
        System.out.println(new Integer(20));
        System.out.println();
        System.out.println(Integer.bitCount(1));
    }




}

class Outer{
    private Outer(String s){

    }

    private class Innter{
        private Innter(String s){

        }
    }
}