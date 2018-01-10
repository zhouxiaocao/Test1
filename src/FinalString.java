import java.util.Date;

/**
 * Created by BG276137 on 2017/12/19
 */
public class FinalString
{
    private String str;

    public FinalString(String str)
    {
        this.str = str;
    }

    public String getStr()
    {
        return str;
    }

    public void setStr(String str)
    {
        this.str = str;
    }

    public static void main(String[] args)
    {
        final FinalString fs = new FinalString("1");
        fs.setStr("2");
        System.out.println(fs.getStr());

        final FinalString fs1 = new FinalString("1");
        final FinalString fss2 = new FinalString("333");
        //fs1 = fss2;
        System.out.println(new Date(1513662980251L));
    }
}