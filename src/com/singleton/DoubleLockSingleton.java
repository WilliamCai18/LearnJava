package com.singleton;

/**
 * 优点：单例模式new操作极少，第一次判断可以减少加锁操作，提升并发性能
 */
public class DoubleLockSingleton {
    private static volatile DoubleLockSingleton singleton = null;
    private DoubleLockSingleton() {}
    public static DoubleLockSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DoubleLockSingleton.class) {
                if (singleton == null) {
                    singleton = new DoubleLockSingleton();
                }
            }
        }
        return singleton;
    }
}
