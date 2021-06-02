public class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(isLessOrMore(10, 5));
        System.out.println(isPositiveOrNegative(15));
        System.out.println(NegativeEqPositive(-7));
        System.out.println(printWordNTimes("iTried", 5));
        System.out.println(isYearLeap(2021));
    }

    public static boolean isLessOrMore(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static String isPositiveOrNegative(int a) {
        if (a < 0) {
            return ("Число отрицательое");
        } else {
            return ("Число положительное");
        }
    }

    public static boolean NegativeEqPositive (int a){
        if (a > 0){
            return false;
        } else {
            return true;
        }
    }

    public static String printWordNTimes(String args, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(args);
        }
        return args;
    }
    static boolean isYearLeap(int a) {
        if (!(a % 4 == 0) || ((a % 100 == 0) && !(a % 400 == 0))) return false; //Год не високосный
        else return true; //Год високосный
    }
}















