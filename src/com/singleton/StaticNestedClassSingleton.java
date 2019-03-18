package com.singleton;

public class StaticNestedClassSingleton {
    private static class SingletonHolder {
        private static StaticNestedClassSingleton singleton = new StaticNestedClassSingleton();
    }
    private StaticNestedClassSingleton() {}
    public static StaticNestedClassSingleton getSingleton() {
        return SingletonHolder.singleton;
    }
}
