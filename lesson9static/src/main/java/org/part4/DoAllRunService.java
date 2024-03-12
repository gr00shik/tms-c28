package org.part4;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class DoAllRunService {

    public void allRun(Object obj) {

        Class<?> aClass = obj.getClass();

        Method[] declaredMethods = aClass.getDeclaredMethods();

        for (Method method : declaredMethods) {

            if (method.getName().startsWith("run")) {

                Parameter[] parameters = method.getParameters();

                if (parameters != null && parameters.length == 1) {

                    Parameter parameter = parameters[0];

                    if(parameter.getType().isAssignableFrom(String.class)) {

                        try {
                            method.invoke(obj, "hello");
                        } catch (Exception e) {
                            // ignore
                        }

                    }

                }


            }

        }


    }

}
