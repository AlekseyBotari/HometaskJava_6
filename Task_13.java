public class Task_13 {
    public static void main(String[] args) {
        //Написати калькулятор
        int a;
        int b;
        char c;
        a = 3;
        b = 4;
        c = '/';
        calculator(a, b, c);
    }

    public static void calculator(int a, int b, char c){
        int answer;
        switch (c) {
            case '*': {
                answer = a * b;
                System.out.println(answer);
                break;
            }
            case '-': {
                answer = a - b;
                System.out.println(answer);
                break;
            }
            case '+': {
                answer = a + b;
                System.out.println(answer);
                break;
            }
            case '/': {
                double answer2;
                answer2 = (double) a / b;
                System.out.println(answer2);
                break;
            }
        }
    }
}









