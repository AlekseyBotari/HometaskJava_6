public class Task_11 {
    public static void main(String[] args) {
        //Написати метод, який возводить число у ступінь
        int a, b;
        a = 2;
        b = 5;
        int answer2 = exponentiationNumDegree(a,b);
        System.out.println(answer2);
    }

    public static int exponentiationNumDegree(int a, int b) {
        int answer = a;
        for (int i = 0; i < b - 1; i++){
            answer *= a;
        }
        return answer;
    }
}
