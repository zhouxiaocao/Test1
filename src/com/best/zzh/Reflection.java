package com.best.zzh; /**
 * Created by BG276137 on 2017/12/19
 */

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.List;

@SuppressWarnings("serial")
public class Reflection implements Cloneable, Serializable
{
    private String     str;
    private double     d;
    public     boolean b;
    public static short s;

    public Reflection()
    {

    }

    public Reflection(String str)
    {
        this.str = str;
    }

    public Reflection(String str, double d, boolean b)
    {
        this.str = str;
        this.d = d;
        this.b = b;
    }

    private void privateMethod()
    {

    }

    public String publicMethod()
    {
        privateMethod();
        return null;
    }

    public String publicMethod(int i)
    {
        return null;
    }

    public String publicMethod(int i, double d, List<String> l)
    {
        return "Reflection.publicMethod(int i, double d), i = " + i + ", d = " + d;
    }

    public static int returnOne()
    {
        return 1;
    }

    public String toString()
    {
        return "str = " + str + ", d = " + d + ", b = " + b;
    }

    public static void main(String[] args) throws Exception
    {
       /* Class<?> c = Class.forName("com.best.zzh.Reflection");
        Reflection[] rs = new Reflection[2];

        System.out.println("Class.getClass()：" + c.getClass()); // 获取java.lang.Class的Class对象
        System.out.println("Class.getClassLoader()：" + c.getClassLoader()); // 获取类的加载器
        System.out.println("Class.getSuperclass()：" + c.getSuperclass()); // 获取父类Class对象
        System.out.println("Class.getInterfaces()：" + c.getInterfaces()[0] + ", " + c.getInterfaces()[1]); // 获取类的接口列表，注意返回的是一个数组
        System.out.println("Class.getgetComponentType()：" + rs.getClass().getComponentType()); // 获取该数组的Class对象

        Reflection r = (Reflection)c.newInstance(); // 根据Class实例化出一个类实例来,默认调用无参构造方法
        System.out.println("Class.newInstance()：" + r);*/

       /* Class<?> c = Class.forName("com.best.zzh.Reflection");
        Package p = c.getPackage();

        System.out.println("Package.toString()：" + p.toString()); //toString()
        System.out.println("Package.getName()：" + p.getName());     // 获取包名
        System.out.println("Package.getImplementationTitle()：" + p.getImplementationTitle()); // 获取包标题
        System.out.println("Package.getImplementationVendor()：" + p.getImplementationVendor()); // 获取提供该实现的组织、供应商或公司的名称
        System.out.println("Package.getImplementationVersion()：" + p.getImplementationVersion()); // 获取该实现的版本
        System.out.println("Package.isSealed()：" + p.isSealed()); // 获取包是否密封的*/

        Class<?> c = Class.forName("com.best.zzh.Reflection");
        Reflection r = new Reflection();
        Field f0 = c.getField("b");
        Field f1 = c.getDeclaredField("d");
        Field[] fs0 = c.getFields();
        Field[] fs1 = c.getDeclaredFields();

        System.out.print("Class.getFields()："); // 获取类中所有public字段,顺序即public的Field定义的顺序
        for (Field f : fs0)
            System.out.print(f + "\t");

        System.out.println();
        System.out.print("Class.getDeclaredFields()："); // 获取类中任意访问权限的字段,顺序即所有Field定义的顺序
        for (Field f : fs1)
            System.out.print(f + "\t");

        System.out.println();
        System.out.println("Class.getField(String name)：" + f0); // 根据name获取类中一个访问权限为public的字段
        System.out.println("Class.getDeclaredField(String name)：" + f1); // 根据name获取类中一个任意访问权限的字段

        System.out.println();
        System.out.println("Field.getName()：" + f0.getName()); // 获取字段名
        System.out.println("Field.getType()：" + f0.getType()); // 获取类的类型
        System.out.println("Field.getBoolean()：" + f0.getBoolean(r));    // 获取某个实例对象该Field的值，什么类型的Field就是getXXX(Object obj)
        System.out.println("Field.getModifiers()：" + f0.getModifiers()); // 以整数形式返回此Field对象的Java语言修饰符，如public、static、final等
        System.out.println("Field.isAccessible()：" + f0.isAccessible()); // 返回Field的访问权限，对private的Field赋值，必须要将accessible设置为true，如下

        System.out.println();
        f1.setAccessible(true);
        System.out.println("Before setB()：" + r);
        f1.setDouble(r, 1.1);
        System.out.println("After setB()：" + r); // 向对象的指定Field设定值

    }
}