import java.util.ArrayList;
import java.util.List;

/**
 * Created by BG276137 on 2017/12/19
 */
public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");

        for (String str : list) {
            System.out.println(str);
        }
    }
}
