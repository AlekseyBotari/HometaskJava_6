public class Task_4 {
    public static void main(String[] args) {
        int userInput1;
        userInput1 = 6;
        simpleNumber(userInput1);
    }

    public  static void simpleNumber(int userInput) {
        int count = 2;

        for (int i = 2; i <= userInput / 2; i++) {
            if (userInput % i == 0) {
                break;
            }
            count++;
        }
        if (userInput % count != 0 && userInput != 1 || userInput == 2) {
            System.out.println("Введене число є простим");
        } else {
            System.out.println("Введене число не є простим");
        }
    }
}
