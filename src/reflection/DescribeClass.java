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
                getModifierInfo(testClass);
                getConstructorInfo(testClass);
                getMethodInfo(testClass);
                getFieldsInfo(testClass);}



            } catch (ClassNotFoundException e) {
                System.out.println("Class not found");
            }
        }

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
    private static void getFieldsInfo(Class<?> testClass) {
        System.out.println(testClass.getFields().length);
        System.out.println(Arrays.stream(testClass.getFields()).collect(Collectors.toList()));
    }
}
