/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.spring.dinjannotation;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author elhaddadmohamed
 */
@Component("myserviceimp1")
public class MyServiceImpl1 implements IService{

    public MyServiceImpl1() {
        System.out.println("On instancie Un MyServiceImp1");
    }
    @Override
    public String GetInfo() {   
        return "Service 1 :  Info";}
}
