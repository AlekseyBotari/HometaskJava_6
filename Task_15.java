public class Task_15 {
    public static void main(String[] args) {
        //Ввести число з клавіатури два числа. Створити метод, що виводить всі спільні дільники цих чисел.
        int aa, bb;
        aa = 49;
        bb = 56;
        divisor(aa, bb);
    }

    public static void divisor(int a, int b){
        int max;
        max = a;

        if (a > b) {
            max = b;
        }

        for (int i = 1; i <= max; i++){
            if (a%i == 0 && b%i == 0) {
                System.out.println(i);
            }
        }
    }
}
