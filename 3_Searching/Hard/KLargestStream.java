import java.util.*;

public class KLargestStream {
    public static void main(String[] args) {
        int[] stream = {10, 20, 11, 70, 50, 40, 100, 5};
        int k = 3;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : stream) {
            if (minHeap.size() < k) {
                minHeap.add(num);
            } else if (num > minHeap.peek()) {
                minHeap.poll(); 
                minHeap.add(num);
            }
            if (minHeap.size() < k) {
                System.out.println("Kth largest element is: _");
            } else {
                System.out.println("Kth largest element is: " + minHeap.peek());
            }
        }
    }
}
