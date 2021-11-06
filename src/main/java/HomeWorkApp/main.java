package HomeWorkApp;

public class main {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printTreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    public static void checkSumSign(){
        int a = 2;
        int b = 9;
        int result = a + b;
        if(result >= 0){
            System.out.println("Сумма положительная");
        } else{
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(){
        int value = 7;
        if(value <= 0){
            System.out.println("Красный");
        } else if(value <= 100){
            System.out.println("жёлтый");
        } else{
            System.out.println("зелёный");
        }

    }
    public static void compareNumbers() {
        int a1 = 6;
        int b2 = 10;
        if (a1 >= b2) {
            System.out.println("a >= b");
        } else{
            System.out.println(" a < b");
        }
    }
}






