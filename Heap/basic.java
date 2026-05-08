import java.util.PriorityQueue;
public class basic {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(1);
        System.out.println(pq);
        pq.add(30);
        System.out.println(pq);
        pq.add(25);
        System.out.println(pq);
        pq.add(15);
        System.out.println(pq);
        pq.remove();
        System.out.println(pq);
        pq.add(35);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.add(40);
        System.out.println(pq);
        System.out.println(pq.contains(35));

        System.out.println("size:- "+pq.size());

        System.out.println("is empty:- "+pq.isEmpty());
        // convert pq to array
        Integer[] arr=pq.toArray(new Integer[0]);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
