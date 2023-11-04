public class Task_10 {
    public static void main(String[] args) {
        //Написати метод, який возводить число у куб
        int a;
        a = 3;
        int degree;
        degree = exponentiationCube(a);
        System.out.println(degree);
    }

    public static int exponentiationCube(int a) {
        int b;
        b = a*a*a;
        //b = (int) Math.pow(a,3);
        return b;
    }
}
