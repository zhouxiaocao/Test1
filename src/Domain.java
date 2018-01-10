/**
 * Created by BG276137 on 2017/12/19
 */
public class Domain implements Comparable<Domain> {
    private String str;

    public Domain(String str) {
        this.str = str;
    }

    public static void main(String[] args) {
        Domain d1 = new Domain("c");
        Domain d2 = new Domain("c");
        Domain d3 = new Domain("b");
        Domain d4 = new Domain("d");
        System.out.println(d1.compareTo(d2));
        System.out.println(d1.compareTo(d3));
        System.out.println(d1.compareTo(d4));
    }

    public int compareTo(Domain domain) {
        if (this.str.compareTo(domain.str) > 0) {
            return 1;
        } else if (this.str.compareTo(domain.str) == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public String getStr() {
        return str;
    }
}