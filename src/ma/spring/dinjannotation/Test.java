/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.dinjannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author elhaddadmohamed
 */

@ComponentScan("ma.spring.dinjannotation")
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        AnnotationConfigApplicationContext context ;
        context = new AnnotationConfigApplicationContext(Test.class);

        IClient Clt = context.getBean("myclientimp",IClient.class);
        Clt.doSomething();
        
    }
    
}
        //context.scan("ma.spring");
//        context.refresh();
//        IClient Clt = (IClient)context.getBean("client1");