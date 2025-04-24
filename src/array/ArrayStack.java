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
        if (top != 0) {
            return stackArray[top - 1]; // 削除しないで参照するだけ
        } else {
            return -1;
        }
    }

    public int search(int x) {
        for (int i = top - 1; i >= 0; i--) {
            if (stackArray[i] == x) {
                return top - i; // 上からの距離
            }
        }
        return -1;
    }
}
