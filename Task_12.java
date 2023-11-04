public class Task_12 {
    public static void main(String[] args) {
       //Написати метод, який виводить у консоль true, якщо передане число більше 5
        int a;
        a = 3;
        boolean answer3;
        answer3 = consoleTrue(a);
        System.out.println(answer3);

    }
    public static boolean consoleTrue(int a){
        boolean answer = true;
        boolean answer2 = false;
        if (a > 5){
            return  answer;
        }
        else {
            return  answer2;
        }
    }
}
