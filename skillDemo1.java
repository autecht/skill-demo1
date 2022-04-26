public class skillDemo1{
    public static int findMax(int[] array){
        if(array == null || array.length == 0){
            return -1;
        }
        int max = array[0];
        for (int num: array){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
}
