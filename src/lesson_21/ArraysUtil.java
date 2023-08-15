package lesson_21;

public class ArraysUtil {
    public static int linerSearch(int[] array,int saerchValue){
        for (int i=0; i< array.length;i++){
            if(array[i]==saerchValue){
                return  i;
            }
        }
        return  -1;
    }
    private static int minIndex(int[] arr){
        int min=arr[0];
        int minIndex=0;
        for (int i=0; i< arr.length;i++){
           if (arr[i]<min) {
               min=arr[i];
               minIndex=i;
           }
        }
        return minIndex;

    }
    private static int minIndex(int[] arr, int startIndex) {
        int min = arr[startIndex];
        int minIndex = startIndex;
        for (int i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

        public static void sortSelection(int[] array){

        for (int i=0; i< array.length-1;i++) {

            int localMin = minIndex(array,i);
            int temp = array[i];
            array[i] = array[localMin];
            array[localMin] = temp;

        }
    }
    // Бинарный поиск значения в массиве

    public static int binarySearch( int [] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        int counter=0;
        while (startIndex <= endIndex) {
            counter++;
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == searchValue) {
                System.out.println("Найдено за  "+counter+" шагов");
                return middleIndex;
            }
            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        System.out.println("Ничего не найдено!Сделано шагов "+counter);

        return -1;


    }
}
