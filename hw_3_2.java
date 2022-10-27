package hw_3;

import java.util.ArrayList;
import java.util.Random;

//2) Пусть дан произвольный список целых чисел, удалить из него четные числа

public class hw_3_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(1, 10));
        }
        System.out.println(numbers);
        for (int i = numbers.size() - 1; i >= 0; i--){
            if (numbers.get(i) % 2 == 0){
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }
}
