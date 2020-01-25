package main;


public class Main {

	public static void main(String[] args) {
		
		Stack<Integer> stackPersons = new Stack<Integer>();
		stackPersons.push(10);
		stackPersons.push(11);
		stackPersons.pop();
		System.out.println(stackPersons.toString());
		
		Queue<Integer> queue = new Queue<Integer>();
		
		queue.enQueue(2);
		queue.enQueue(1);
		System.out.println(queue.toString());
		System.out.println(queue.deQueue());
		System.out.println(queue.toString());
		
		LinkedList list = new LinkedList();
		
		list.addFirst(2);
		list.addLast(4);
		list.addLast(6);
		list.addLast(8);
	}
	
}
