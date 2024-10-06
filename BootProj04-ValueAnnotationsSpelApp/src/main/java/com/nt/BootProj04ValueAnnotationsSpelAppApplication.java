package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class BootProj04ValueAnnotationsSpelAppApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BootProj04ValueAnnotationsSpelAppApplication.class, args);

        Hotel hot = ctx.getBean("hotel", Hotel.class);
        System.out.println(hot);

        ((ConfigurableApplicationContext) ctx).close();
    }
}
