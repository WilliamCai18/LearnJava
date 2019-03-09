///**
// * 饿汉式
// * 缺点：没有懒加载，浪费内存
// */
//public class Singleton {
//    private static Singleton singleton = new Singleton();
//    private Singleton() {}
//    public static Singleton getSingleton() {
//        return singleton;
//    }
//}
//
///**
// * 单线程
// * 缺点：多线程下，两条线程同时判断singleton实例是否为null，而实例没有创建好时两条线程分别会创建一个实例
// */
//public class Singleton {
//    private static Singleton singleton = null;
//    private Singleton() {}
//    public static Singleton getSingleton() {
//        if (singleton == null) {
//            singleton = new Singleton();
//        }
//        return singleton;
//    }
//}
//
///**
// * 线程安全
// * 优点：单例模式new操作极少，第一次判断可以减少加锁操作，提升并发性能
// */
//public class Singleton {
//    private static volatile Singleton singleton = null;
//    private Singleton() {}
//    public static Singleton getSingleton() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }
//}
//
///**
// * 静态内部类
// */
//public class Singleton {
//    private static class SingletonHolder {
//        private static Singleton singleton = new Singleton();
//    }
//    private Singleton() {}
//    public static Singleton getSingleton() {
//        return SingletonHolder.singleton;
//    }
//}
//
///**
// * 枚举
// */
//public enum Singleton {
//    INSTANCE;
//    private String name;
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
//    }
//}