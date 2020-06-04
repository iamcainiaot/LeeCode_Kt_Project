package java;

/**
 * @Author: zt
 * @time: 2020/1/4 9:20
 * @description: ����ģʽ
 */
//public class SingleInstance {
//    // ����ģʽ  �̰߳�ȫ
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
//    // ����ģʽ���̲߳���ȫ�ģ�����һ��ʹ��������  ------>>> DCL ˫���߳���ģʽ
//    // volatile �ؼ��֣���֤��java������д�������Ĺ��̣�����˳��ִ��
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
//    // ��̬�ڲ��෽ʽ
//    // �ŵ㣺1����д��2����������������ػ��Ʊ�֤�̰߳�ȫ
//    private static class SingleInstanceInnerClass {
//        // ��̬�ڲ���ֻ�����һ��
//        private static SingleInstance singleInstance = new SingleInstance();
//    }
//
//    public static SingleInstance getInstance() {
//        return SingleInstanceInnerClass.singleInstance;
//    }
//}
public class SingleInstance {

    // ö���൥��0
    private static enum Singleton {
        INSTANCE;

        // ������Ҫ�ѵ������л��ŵ��ļ���ȥ�����Ҵ��ļ���ȡ����ʱ���һ����õ��Ǵ��ȥ���Ǹ�����
        private Singleton() {
            mSingleInstance = new SingleInstance();
        }

        private SingleInstance mSingleInstance;

        public SingleInstance getInstance() {
            return mSingleInstance;
        }
    }
}