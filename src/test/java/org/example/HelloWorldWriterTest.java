package org.example;

import org.junit.Test;

import java.util.Locale;

public class HelloWorldWriterTest {
    @Test
    public void shouldWriteHelloWorldToConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables(){
        Integer age =42;
        age = age + 1;
        System.out.println("age = " + age);

    }
    @Test
    public void declaringNumericalVariable2(){
        final int thisYear = 42;          /* can't be reassigned */
        int nextYear = thisYear + 1;
        System.out.println("age = " + nextYear);
        long numberOfStars = 100000000000L;
        double weight = 78.55;           /* preferred over float */
    }

    @Test
    public void declaringStrings(){               /* text values */
        String fullName = " Farid Abderrahmani ";
        String upperCaseFullName = fullName.toUpperCase();  /* Upper case */
        String lowerCaseFullName = fullName.toLowerCase(); /* Lower case */
        String replaceFirstName = fullName.replace("Farid" , "Adem");  /* Replacement of characters */
        System.out.println(upperCaseFullName);
        System.out.println(lowerCaseFullName);
        System.out.println(replaceFirstName);
        System.out.println(fullName.length());   /* Number of characters , including spaces */
        System.out.println(fullName.trim());    /* Remove all spaces from beginning and ending */
    }
}
