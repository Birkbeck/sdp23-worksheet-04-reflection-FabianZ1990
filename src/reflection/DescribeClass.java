package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


public class DescribeClass {
    public static void main(String[] args) {

        if (args.length > 0){

            try {

                for (String classes : args) {
                    System.out.println(classes);
                Class<?> testClass = Class.forName(classes);
                getConstructorInfo(testClass);
                getMethodInfo(testClass);
                getModifierInfo(testClass); }



            } catch (ClassNotFoundException e) {
                System.out.println("Class not found");
            }
        }



/*
        String s = args[0];
        //System.out.println(String.class.getName());
        Class<?> x;
        try {
            x = (java.lang.Class.forName(s));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Constructors:\n");
        Constructor[] cons = (x.getConstructors());
        for (Constructor y : cons) {
            System.out.println(y);
        }
        System.out.println("Methods:\n");
        Method [] methods = (x.getMethods());
        for (Method y : methods) {
            System.out.println(y);
        }
*/

        // TODO: implement the functionality for Question 1
    }

    private static void getModifierInfo(Class<?> testClass) {
        System.out.println(testClass.getModifiers());
    }

    private static void getMethodInfo(Class<?> testClass) {
        System.out.println(testClass.getMethods().length);
        System.out.println(Arrays.stream(testClass.getMethods()).limit(4).collect(Collectors.toList()));
    }

    private static void getConstructorInfo(Class<?> testClass) {
        System.out.println(testClass.getConstructors().length);
        System.out.println(Arrays.stream(testClass.getConstructors()).limit(4).collect(Collectors.toList()));
    }
}
