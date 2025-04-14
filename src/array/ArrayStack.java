package array;


public class ArrayStack {
	int[] stackArray;
	static final int MAX_SIZE = 1000;
	int top;

	public ArrayStack() {
		this.stackArray = new int[MAX_SIZE];
		top = 0;
	}

	public int push(int x) {
		if(top >= MAX_SIZE) {
			return -1;
		}
		stackArray[top] = x;
		top++;
		return x;
	}
	

	public boolean empty() {
		if(top == 0) {
			return true;
		}else
		return false;
	}

	public int pop() {
		if(top != 0) {
			top--;
			return stackArray[top];
		}else
		return -1;
	}

	public int peek() {
		return top;
	}

	public int search(int x) {
		return 0;
	}
}
