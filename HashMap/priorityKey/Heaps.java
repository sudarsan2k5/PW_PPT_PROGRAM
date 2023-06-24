import java.util.PriorityQueue;

public class Heaps {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = {11, 2, 45, 89, 90, 32, 7, 54, 8};

        for(int val: arr){
            pq.add(val);
        }
        while(pq.size() > 0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}