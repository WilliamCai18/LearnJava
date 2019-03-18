package com.singleton;

/**
 * 缺点：没有懒加载，浪费内存
 */
public class HungrySingleton {
    private static HungrySingleton singleton = new HungrySingleton();
    private HungrySingleton() {}
    public static HungrySingleton getSingleton() {
        return singleton;
    }
}
