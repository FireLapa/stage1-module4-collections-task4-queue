package com.epam.collections.queue;

import com.sun.jdi.Value;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

         arrayDeque.offer(firstQueue.poll());
        arrayDeque.offer(firstQueue.poll());
        arrayDeque.offer(secondQueue.poll());
        arrayDeque.offer(secondQueue.poll());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {

            firstQueue.offer(arrayDeque.pollLast());
            arrayDeque.offer(firstQueue.poll());
            arrayDeque.offer(firstQueue.poll());

            secondQueue.offer(arrayDeque.pollLast());
            arrayDeque.offer(secondQueue.poll());
            arrayDeque.offer(secondQueue.poll());
        }

        ArrayDeque<Integer> resultDeque = new ArrayDeque<>();
        resultDeque.addAll(arrayDeque);
        resultDeque.addAll(firstQueue);
        resultDeque.addAll(secondQueue);

        return resultDeque;
    }
}
