public class Task_17 {
    public static void main(String[] args) {
        String name, type;
        int econom, business;
        buildAirplane("F-16","Винищувачі");
        buildAirplane("Ан-72","Пасажирські", 67);
        buildAirplane("Airbus","Пасажирські",88,77);
//        Літаки:
//        Авіакомпанія виготовляє три типи літаків:
//
//        Винищувачі - не мають пасажирських місць
//        Пасажирські літаки #1 - мають місця тільки економ класу
//        Пасажирські літаки #2 - мають місця економ і бізнес класу
//
//        Потрібно зробити три методи з однаковою назвою buildAirplane(), який робитиме літаки всіх трьох типів.
//
//                На вхід кожен метод прийматиме різну кількість параметрів:
//
//        назва літака, тип літака
//        назва літака, тип літака, кількість місць економ класу
//        назва літака, тип літака, кількість місць економ класу, кількість місць бізнес класу

    }

    public static void buildAirplane(String name, String type){
        System.out.println(name + " " + " " +type);
    }

    public static void buildAirplane(String name, String type, int econom){
        System.out.println(name + " " + type + " " + econom);
    }

    public static void buildAirplane(String name, String type, int econom, int business){
        System.out.println(name + " " + type + " " + econom + " " + business);
    }

}
