import java.util.ArrayDeque;
import java.util.Deque;

public class lec3_4 {
    
    public static void main(String[] args) {
        
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); // добавление в начало
        deque.addLast(2);  // добавление в конец
        deque.addFirst(1); // добавление в начало
        deque.addLast(2);  // добавление в конец
        System.out.println(deque);
        deque.removeFirst(); // удаление из начала
        deque.removeLast(); // удаление с конца
        System.out.println(deque);
        deque.addLast(13);  // добавление в конец
        deque.offerFirst(25); // добавление в начало против порядка
        deque.offerLast(2); // добавление в конец против порядка
        System.out.println(deque);
        deque.pollFirst(); // извлекает и удаляет первый элемент
        System.out.println(deque); 
        deque.pollLast(); // извлекает и удаляет второй элемент
        System.out.println(deque);
        deque.getFirst(); // извлекает, но не удаляет, будет exeption если deque пустая 
        deque.getLast();
        deque.peekFirst();  // извлекает, но не удаляет, НЕ будет exeption если deque пустая
        deque.peekLast();
        System.out.println(deque);
    }
}
