package com.springframework.docs;

import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // Load Spring context from beans.xml
        MessageSource resources = new ClassPathXmlApplicationContext("beans.xml");

        // Retrieve the message from format.properties
        String message = resources.getMessage("message", null, "Default message", Locale.ENGLISH);

        // Print the message to the console
        System.out.println(message);
    }
}
