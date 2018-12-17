import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
        Integer[] intArr = getIntArr();
        byte[] byteBook = new byte[intArr.length];

        for (Integer integer : intArr) {
            setBookOfOneNumber(integer,byteBook);
        }
    }

    private static void setBookOfOneNumber(Integer integer, byte[] byteBook) {

    }

    private static Integer[] getIntArr(){
        Integer[] arr = new Integer[10000000];
        for (int i = 0; i < arr.length; i++) {

            Long round = getLong();
            arr[i] = round.intValue();
        }
        for (int i = 0; i < 10000; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }

    private static Long getLong() {
        Double floor = Math.floor(Math.random() * 10000000);
        if(floor<1000000){
            return getLong();
        }
        return floor.longValue();
    }
}
