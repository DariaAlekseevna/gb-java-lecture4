
import java.util.PriorityQueue;

public class lec3_3 {
    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll()); // извлекаем элементы 1
        System.out.println(pq.poll()); // 3
        System.out.println(pq.poll()); // 13
        System.out.println(pq.poll()); //123
        System.out.println(pq.poll()); // при удалении всех элементов получим null
    }
}
