package com.caidapao.pattern.singleton.destoryer;

import java.lang.reflect.Constructor;

/**
 * 反射破坏单例模式演示
 * Time 2020/7/20 21:32
 * address https://today.caidapao.com
 *
 * @author caidapao
 */
public class LazyWifeReflectionTest {


    public static void main(String[] args) {
        try {

            //已经创建一个了
            LazyWifeReflection singleton = LazyWifeReflection.getInstance();

            //再暴力创建一个
            Class<?> clazz = Class.forName(LazyWifeReflection.class.getName());
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            LazyWifeReflection o = (LazyWifeReflection) constructor.newInstance();
            System.out.println(o == singleton);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}
