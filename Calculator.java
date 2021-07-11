package selfwork06.task01;

public class Calculator {

    public int plus2() {
        int[] array = new int[]{42, 12, 76, 21, 4, 10};
        int sum = 0;
        for (double element : array) {
            sum += element;
        }
        return sum;
    }

    public double multiply (double a, double b){
        return a + b;
    }
}
