public class Task_14 {
    public static void main(String[] args) {
        // Написати метод який перевіряє чи є таке число у масиві

        int[] arrayy = {9, 78, 89, 99, 0, 799, 79};
        int aa;
        aa = 79;

        numberArray(aa, arrayy);

    }

    public static void numberArray(int a, int[] array){
        String answer;
        answer = "Такого числа немає у масиві";
        for (int i = 0; i < array.length; i++){
            if (array[i] == a) {
                answer = "Таке число є у масиві";
            }
        }
        System.out.println(answer);
    }
}
