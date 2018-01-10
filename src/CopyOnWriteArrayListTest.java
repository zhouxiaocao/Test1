import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by BG276137 on 2017/12/29
 */
public class CopyOnWriteArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<Integer>();
        list.add(1);
        list.add(2);
    }
}

class T1 extends Thread {
    private List<Integer> list;

    public T1(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (Integer i : list) {
        }
    }
}

class T2 extends Thread {
    private List<Integer> list;

    public T2(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }
}
