package array;

public class ArrayQueue {
    public static final int MAX_SIZE = 100;
    public int[] queueArray;
    public int front;
    public int rear;
    public int size;

    public ArrayQueue() {
        this.queueArray = new int[MAX_SIZE];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public boolean enqueue(int value) {
        if (size == MAX_SIZE) {
            return false; // キューが満杯
        }
        queueArray[rear] = value;
        rear = (rear + 1) % MAX_SIZE;
        size++;
        return true;
    }

    public int dequeue() {
        if (size == 0) {
            return -1; // キューが空
        }
        int value = queueArray[front];
        front = (front + 1) % MAX_SIZE;
        size--;
        return value;
    }

    public int peak() {
        if (size == 0) {
            return -1; // キューが空
        }
        return queueArray[front]; // 削除せずに参照
    }
}
