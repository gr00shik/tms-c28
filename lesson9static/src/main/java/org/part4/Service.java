package org.part4;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Service {

    public void rename(Object obj) {

        Class<?> aClass = obj.getClass();
        System.out.println(aClass.getName());
        System.out.println(aClass.getSimpleName());

        Method[] declaredMethods = aClass.getDeclaredMethods();

        for (Method method : declaredMethods) {

            System.out.println(method.getName());
            Class<?> returnType = method.getReturnType();
            System.out.println(returnType);

        }

        System.out.println(" ----------- ");

        Field[] declaredFields = aClass.getDeclaredFields();

        for (Field field : declaredFields) {
            System.out.println(field.getName());
        }

//        if (obj instanceof User) {
//            User user = (User)obj;
//            user.setName("vasya");
//        }
//
//        if (obj instanceof Cat) {
//            Cat cat = (Cat)obj;
//            cat.setNick("vasya");
//        }

    }

}
