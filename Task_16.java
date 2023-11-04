public class Task_16 {
    public static void main(String[] args) {
        //В метод передається два числа. Метод має друкувати фігурку MxN знаків долара
        matrix(5, 7);
    }
    public static void matrix(int userInput, int userInput2){
        for (int i = 0; i < userInput; i++) {
            for (int j = 0; j < userInput2; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
