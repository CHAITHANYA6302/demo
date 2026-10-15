package hello;

public class QueueLinkedList {
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	private Node front; 
	private Node rear;
	
	void enqueue(int value) {
		Node newNode = new Node(value);
		if(rear ==  null) {
			front = rear = newNode;
			return;
		}
		rear.next = newNode;
		rear = newNode;
	}
	int dequeue() {
		if(front == null) {
			return -1;
		}
		int value = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		int peek() {
			if(front ==null) {
				return -1;
			}
			return front.data;
		}
		public static void main(String[] args) {
			QueueLinkedList queue = new QueueLinkedList();
			Queue.enqueue(10);
			Queue.enqueue(20);
			Queue.enqueue(30);

		}
	}
}
