public class Task_18 {
    public static void main(String[] args) {

        int[] arrayy = {44, 344, 455, 79, 90, 77, 100, 76};
        sortArray(arrayy);
    }

    public static void sortArray(int[] array ){

        int tmp;
        for(int current = 0; current < array.length; current++) {

            for (int next = 0; next < array.length; next++) {
                if (array[current] < array[next]) {
                    tmp = array[next];
                    array[next] = array[current];
                    array[current] = tmp;

                }
            }
        }
        for (int s : array){
            System.out.print(s + " ");
        }
    }


}
