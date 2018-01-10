package com.best.cglib;

import net.sf.cglib.proxy.*;

import java.lang.reflect.Method;

/**
 * Created by BG276137 on 2017/12/19
 */
public class DaoProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before Method Invoke.");
        methodProxy.invokeSuper(o,objects);
        System.out.println("After Method Invoke");

        return o;
    }
    public static void main(String[] args){
         /*   DaoProxy daoProxy = new DaoProxy();

            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(Dao.class);
            enhancer.setCallback(daoProxy);

            Dao dao = (Dao)enhancer.create();
            dao.update();
            dao.select();*/
        DaoProxy daoProxy = new DaoProxy();
        DaoAnotherProxy daoAnotherProxy = new DaoAnotherProxy();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallbacks(new Callback[]{daoProxy, daoAnotherProxy, NoOp.INSTANCE});
        enhancer.setCallbackFilter(new DaoFilter());

        Dao dao = (Dao)enhancer.create();
        dao.update();
        dao.select();
    }
}
