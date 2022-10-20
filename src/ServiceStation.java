import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    private Queue<T> queue = new LinkedList<>();


    public Queue<T> getQueue() {
        return queue;
    }

    public void addTransport(T transport) {
        queue.offer(transport);
    }

    public void doInspection() {
        T transport = queue.poll();
//        if (transport instanceof Bus) {
//            System.out.println("Автобусы в диагностике не нуждаются");
//        }
        if (transport != null ){
            System.out.println("Провести техосмотр");
            doInspection();
        } else {
            System.out.println("На техосмотр очереди нет");
        }
    }
}
