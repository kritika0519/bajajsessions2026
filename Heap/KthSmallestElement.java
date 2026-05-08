import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(10);
        pq.add(40);
        pq.add(25);
        pq.add(15);
        pq.add(19);
        System.out.println(pq);

        int k=3;
        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        System.out.println(pq.peek());
    }
}
