package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        int[] copyNumbers = new int[101];

        for (int i = 0; i <= 100; i++) {
            numbers[i] = 100 - i;
        }

        System.out.println("Массив numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int sumEven = 0;
        long productOdd = 1; // Используем long для избежания переполнения

        for (int num : numbers) {
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                productOdd *= num;
            }
        }

        System.out.println("Сумма четных элементов: " + sumEven);
        System.out.println("Произведение нечетных элементов: " + productOdd);

        System.arraycopy(numbers, 0, copyNumbers, 0, numbers.length);
    }
}
