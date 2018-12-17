import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {
        int[] arr = getIntArr(15);
        //System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[]{-15, -90, 21, 40, -100, -44, 3, 52, 8, 52, -42, 22, -39, 9, -7};
        System.out.println(Arrays.toString(arr));
        int[] deal1 = dealPro1(arr);
        System.out.println(Arrays.toString(deal1));
        int max = getMax(deal1);
        System.out.println(max);
        deal2(deal1,max);

    }

    private static int deal2(int[] deal1, int max) {

        int value=0;
        for (int i = 0; i < deal1.length; i++) {

        }
        return 0;
    }

    private static int getMax(int[] deal1) {
        int max=deal1[0];
        for (int i : deal1) {
            if(i>max){
                max=i;
            }
        }
        return max;
    }

    private static int[] dealPro1(int[] arr) {
        boolean key = arr[0]>0;
        List<Integer> list = new ArrayList<>();
        int value = 0;
        for (int i : arr) {
            if(i>0==key){
                value+=i;
            }else{
                list.add(value);
                key = i>0;
                value=i;
            }
        }
        list.add(value);
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    private static int[] getIntArr(int len){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round ( Math.random()*100 );
            if(Math.random()>0.5){
                arr[i]*=-1;
            }
        }
        return arr;
    }

}
