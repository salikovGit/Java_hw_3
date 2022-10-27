package hw_3;

//3) Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class hw_3_3 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(1, 50));
        }
        System.out.println(numbers);
        int min, max;
        double mean = 0;
        min = Collections.min(numbers);
        max = Collections.max(numbers);
        for (int i = 0; i < numbers.size(); i++){
            mean+=numbers.get(i);
        }
        mean /= numbers.size();
        System.out.printf("Min = %d\n", min);
        System.out.printf("Max = %d\n", max);
        System.out.printf("Mean = %.2f\n", mean);
    }
}
