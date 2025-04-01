import java.util.Arrays;

public class Main {
    public static int largestSmallestNum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("El array debe contener al menos un numero");
        }
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int num : numbers) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        return largest - smallest;
    }

    public static void findSmallestNumbers(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("El numero menor es: "+numbers[0]+" El segundo menor es: "+numbers[1]);
    }

    public static double expressionMathematical(int x, int y){
        double result= (double) (4 * y) /5;
        return Math.pow(x,2)+Math.pow(result,2);

    }

    public static void main(String[] args) {
        // variables
        int[] arr = {20, 10, 80, 23};
        int x=5;
        int y=2;
        System.out.println("Array");
        System.out.println(Arrays.toString(arr));
        System.out.println("Task 1");
        int diference = largestSmallestNum(arr);
        System.out.println("La diferencia entre el mayor y el menor es: " + diference);
        System.out.println("Task 2");
        findSmallestNumbers(arr);
        System.out.println("Task 3");
        System.out.println("Valores: \nx"+x+"\ny: "+y);
        double result=expressionMathematical(x,y);
        System.out.println("El resultado es "+result);




    }
}
