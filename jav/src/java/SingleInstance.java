package java;

/**
 * @Author: zt
 * @time: 2020/1/4 9:20
 * @description: 单例模式
 */
//public class SingleInstance {
//    // 饿汉模式  线程安全
//    private static SingleInstance mSingleInstance;
//
//    private SingleInstance() {
//    }
//
//    public static SingleInstance getHungryInstance() {
//        return mSingleInstance;
//    }
//
//}

//public class SingleInstance {
//    private SingleInstance() {
//    }
//
//    // 懒汉模式，线程不安全的，所以一般使用升级版  ------>>> DCL 双重线程锁模式
//    // volatile 关键字，保证（java虚拟机中创建对象的过程）程序顺序执行
//    private static volatile SingleInstance mSingleInstance;
//
//    public static SingleInstance getLazyInstance() {
//        if (mSingleInstance == null) {
//            synchronized (SingleInstance.class) {
//                if (mSingleInstance == null) {
//                    mSingleInstance = new SingleInstance();
//                }
//            }
//        }
//        return mSingleInstance;
//    }
//}

//public class SingleInstance {
//    private SingleInstance() {
//    }
//    // 静态内部类方式
//    // 优点：1、好写；2、巧妙利用了类加载机制保证线程安全
//    private static class SingleInstanceInnerClass {
//        // 静态内部类只会加载一次
//        private static SingleInstance singleInstance = new SingleInstance();
//    }
//
//    public static SingleInstance getInstance() {
//        return SingleInstanceInnerClass.singleInstance;
//    }
//}
public class SingleInstance {

    // 枚举类单例0
    private static enum Singleton {
        INSTANCE;

        // 我们需要把单例序列化放到文件中去，当我从文件中取出来时，我还想用的是存进去的那个单例
        private Singleton() {
            mSingleInstance = new SingleInstance();
        }

        private SingleInstance mSingleInstance;

        public SingleInstance getInstance() {
            return mSingleInstance;
        }
    }
}