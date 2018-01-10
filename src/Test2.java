/**
 * Created by BG276137 on 2017/12/19
 */
public class Test2 {
    private int a=2;
    private int b;
    public Test2(){
        System.out.println("正在执行构造函数。。。");
    }

    {
        System.out.println("aaaaaaa");
    }
    public static void main(String[] args){
        Test2 test2 = new Test2();
    }

}
