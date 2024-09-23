import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] firstArray = randomArray(10);
        System.out.println(Arrays.toString(firstArray));

        Arrays.sort(firstArray);

        int temp;
        boolean flag = true;

        for(int i = 0; i < firstArray.length; i++){

            for(int j = 0; j < firstArray.length - 1; j++){

                if(firstArray[j] < firstArray[j + 1]){
                    temp = firstArray[j];
                    firstArray[j] = firstArray[j + 1];
                    firstArray[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(firstArray));

        }
        private static int[] randomArray(int len){

            Random random = new Random();
            int[] newInt = new int[len];
            for(int i = 0; i < len; i++){
                newInt[i] = random.nextInt(100);
            }
            return newInt;

        }
}
