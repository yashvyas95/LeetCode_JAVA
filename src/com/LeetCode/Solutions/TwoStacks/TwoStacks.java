package com.LeetCode.Solutions.TwoStacks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.lang.Integer;

public class TwoStacks {
    public static void main(String[] args) throws FileNotFoundException {
        MyQueue<Integer> queue = new MyQueue<Integer>();
        Scanner scan = new Scanner(new FileReader("C:\\Users\\Itachi_yv\\IdeaProjects\\LeetCode_JAVA\\src\\com\\LeetCode\\Solutions\\TwoStacks\\data.txt"));
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}

class MyQueue<Integer> {
    Stack<Integer> LIFO = new Stack<>();
    Stack<Integer> FIFO = new Stack<>();

    public MyQueue() {
    }

    void enqueue(int element) {

        LIFO.add(0, (Integer) java.lang.Integer.valueOf(element));
        FIFO.add(FIFO.size(), (Integer) java.lang.Integer.valueOf(element));
    }

    void dequeue() {
        if (LIFO.size() > 0)
            LIFO.remove(LIFO.size() - 1);
    }

    Integer peek() {
        return LIFO.peek();
    }
}
