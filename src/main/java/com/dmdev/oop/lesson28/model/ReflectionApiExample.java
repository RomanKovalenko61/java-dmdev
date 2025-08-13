package com.dmdev.oop.lesson28.model;

import java.lang.reflect.*;

public class ReflectionApiExample {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        var user = new User(25L, "Ivan");
//        Class<? extends User> userClass = user.getClass();
//        Class<User> userClass1 = User.class;
//        System.out.println(userClass == userClass1); // true
//
//        System.out.println(userClass.getName()); // com.dmdev.oop.lesson28.model.User
//        System.out.println(userClass.getSimpleName()); // User
//
//        var example = new ReflectionApiExample();
//        var test1 = example.new Test1();
//
//        System.out.println(Test1.class.getName()); // com.dmdev.oop.lesson28.model.ReflectionApiExample$Test1
//        System.out.println(Test1.class.getCanonicalName()); // com.dmdev.oop.lesson28.model.ReflectionApiExample.Test1
//
//        System.out.println(Arrays.toString(userClass.getDeclaredFields())); // [private java.lang.String com.dmdev.oop.lesson28.model.User.name]
//        System.out.println(Arrays.toString(userClass.getSuperclass().getDeclaredFields())); // [private java.lang.Long com.dmdev.oop.lesson28.model.Person.id]
//
//
//        /*
//        [
//        public java.lang.String com.dmdev.oop.lesson28.model.User.getName(),
//        public java.lang.String com.dmdev.oop.lesson28.model.User.toString(),
//        public int com.dmdev.oop.lesson28.model.User.compareTo(java.lang.Object),
//        public int com.dmdev.oop.lesson28.model.User.compareTo(com.dmdev.oop.lesson28.model.User),
//        public void com.dmdev.oop.lesson28.model.User.setName(java.lang.String),
//        public java.lang.Long com.dmdev.oop.lesson28.model.Person.getId(),
//        public boolean java.lang.Object.equals(java.lang.Object),
//        public native int java.lang.Object.hashCode(),
//        public final native java.lang.Class java.lang.Object.getClass(),
//        public final native void java.lang.Object.notify(),
//        public final native void java.lang.Object.notifyAll(),
//        public final void java.lang.Object.wait(long) throws java.lang.InterruptedException,
//        public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException,
//        public final void java.lang.Object.wait() throws java.lang.InterruptedException
//        ]
//         */
//        System.out.println(Arrays.toString(userClass.getMethods()));
//
//        /*
//        [
//        public java.lang.String com.dmdev.oop.lesson28.model.User.getName(),
//        public java.lang.String com.dmdev.oop.lesson28.model.User.toString(),
//        public int com.dmdev.oop.lesson28.model.User.compareTo(java.lang.Object),
//        public int com.dmdev.oop.lesson28.model.User.compareTo(com.dmdev.oop.lesson28.model.User),
//        public void com.dmdev.oop.lesson28.model.User.setName(java.lang.String)
//        ]
//         */
//        System.out.println(Arrays.toString(userClass.getDeclaredMethods()));
//
//        System.out.println(Arrays.toString(userClass.getInterfaces())); // [interface java.io.Serializable, interface java.lang.Comparable]
//        System.out.println(Arrays.toString(userClass.getGenericInterfaces())); // [interface java.io.Serializable, java.lang.Comparable<com.dmdev.oop.lesson28.model.User>]
//
//        System.out.println(Arrays.toString(userClass.getConstructors())); // [public com.dmdev.oop.lesson28.model.User(java.lang.Long,java.lang.String)]
//        System.out.println(userClass.getConstructors()[0].getModifiers()); // 1
//
//        System.out.println(userClass.getPackageName()); // com.dmdev.oop.lesson28.model

//        testConstructor();
        testFields(user);
//        testMethod(user);
        System.out.println(user);
    }

    private static void testConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor<User> constructor = User.class.getConstructor(Long.class, String.class);
        User user = constructor.newInstance(5L, "Petr");
        System.out.println(user);
    }

    private static void testFields(Object object) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        var declaredFields = User.class.getDeclaredFields();
        Field[] declaredFields = object.getClass().getSuperclass().getDeclaredFields();
        for (var field : declaredFields) {
            field.setAccessible(true);
            Object value = field.get(object);
            field.set(object, 33L); // 25 => 33
            System.out.println(field.getName());
            System.out.println(field.getModifiers());
            // [0, 0, 0, 0, 0, 0, 1, 1] example
            System.out.println("isPrivate ? : " + Modifier.isPrivate(field.getModifiers()));
            System.out.println(value);
        }
    }

    private static void testMethod(User user) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Method method = user.getClass().getDeclaredMethod("getName");
//        System.out.println(method.invoke(user));
        Method method = user.getClass().getDeclaredMethod("setName", String.class);
        method.invoke(user, "Sveta");
        System.out.println(user);
    }

    private class Test1 {
    }

    private static class Test3 {
    }

    private enum Test2 {
        ONE, TWO
    }
}
