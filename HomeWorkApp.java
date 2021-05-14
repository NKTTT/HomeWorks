package HomeWork;

public class HomeWorkApp {
    public static void main(String[] args) {
     PrintThreeWords();
     checkSumSign();
     printColor();
     compareNumbers();
    }
    public static void PrintThreeWords() {
        System.out.println("orange");
        System.out.println("banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
    int a = 7;
    int b = 9;
    int c = a + b;
    if (c >= 0){
        System.out.println("Сумма положиельная ");
    } if (c < 0){
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 30;
        if (value <= 0){
            System.out.println("Красный");
        } if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } if (value > 100) {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 7;
        int b = 10;
        if ((int)a >= b){
            System.out.println(a >= b);
        } else if ((int)a < b){
            System.out.println(a < b);
        }
    }
    }
