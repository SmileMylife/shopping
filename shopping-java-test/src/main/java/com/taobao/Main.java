package com.taobao;

public class Main {
    public static void main(String[] args) {
        ClassTest classTest = new ClassTest();
        new Thread(ClassTest::testStaticMethod).start();
        new Thread(classTest::otherMethod2).start();
    }
}

class ClassTest {
    synchronized public static void testStaticMethod() {
        System.out.println("这是一个静态方法");
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    synchronized public void testVoidMethod() {
        System.out.println("这是普通方法");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void testSynchronize() {
        synchronized (ClassTest.class) {
            try {
                System.out.println("这是代码块方法");
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void otherMethod() {
        synchronized (ClassTest.class) {
            System.out.println("执行其他方法");
        }
    }

    public void otherMethod2() {
        System.out.println("这是另外一个方法");
    }
}