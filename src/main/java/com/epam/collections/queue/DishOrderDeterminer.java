package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {

        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        int count = 1;

        while (!queue.isEmpty()) {
            int dishNumber = queue.poll();

            if (count % everyDishNumberToEat == 0) {
                result.add(dishNumber);
            } else {
                queue.add(dishNumber);
            }
            count++;
        }

        return result;
    }
}
