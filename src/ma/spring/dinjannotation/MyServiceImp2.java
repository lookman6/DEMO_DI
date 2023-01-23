/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.spring.dinjannotation;

import org.springframework.stereotype.Component;

/**
 *
 * @author dell
 */
@Component("myserviceimp2")
public class MyServiceImp2 implements IService {
    
    public MyServiceImp2() {
        System.out.println("On instancie Un MyServiceImp2");
    }
    @Override
    public String GetInfo() {   
        return "Service 2 :  Info";}
    
}
