package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Scanner;

public class DescribeClass {
    public static void main(String[] args) throws NoSuchMethodException {
        if (args.length != 1)
            System.out.println("Usage: "); // TODO: describe how to use the utility
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(String.class.getName());
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

        // TODO: implement the functionality for Question 1
    }
}
