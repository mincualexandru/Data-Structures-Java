package main;

import java.util.Arrays;

public class Stack<T> {
	
	private static final int DEFAULT_CAPACITY = 10;
	private T[] stack;
	private int top;
	private int size;
	
	public Stack() {
		top = -1;
		size = 10;
		stack = (T[]) new Object[DEFAULT_CAPACITY];
	}
	
	public Stack(int size) {
		top = -1;
		this.size = size;
		stack = (T[]) new Object[this.size];
	}
	
	public boolean push(T item) {
		if(!isFull()) {
			top++;
			stack[top] = item;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean pop() {
		if(!isEmpty()) {
			stack[top] = null;
			top--;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean isFull() {
		return (top == stack.length - 1);
	}
	
	public int size() {
		return size;
	}

	@Override
	public String toString() {
		return "Stack [stack=" + Arrays.toString(stack) + ", top=" + top + ", size=" + size + "]";
	}
}
