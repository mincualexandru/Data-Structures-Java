package main;

import java.util.Arrays;

public class Queue<T> {

	private T[] queue;
	private int size;
	private int total;
	private int front;
	private int rear;

	public Queue() {
		size = 10;
		total = 0;
		front = 0;
		rear = 0;
		queue = (T[]) new Object[size];
	}

	public Queue(int size) {
		this.size = size;
		total = 0;
		front = 0;
		rear = 0;
		queue = (T[]) new Object[this.size];
	}

	public boolean enQueue(T item) {
		if (isFull()) {
			return false;
		} else {
			total++;
			queue[rear] = item;
			rear++;
			return true;
		}
	}

	public T deQueue() {
		if(isEmpty()) {
			return null;
		} else {
			T item = queue[front];
			total--;
			front++;
			return item;
		}
	}

	public boolean isFull() {
		if (size == total) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
       if(front == 0 && rear == 0) {
    	   return true;
       } else {
    	   return false;
       }
    }

	@Override
	public String toString() {
		return "Queue [queue=" + Arrays.toString(queue) + ", size=" + size + ", total=" + total + ", front=" + front
				+ ", rear=" + rear + "]";
	}

}
