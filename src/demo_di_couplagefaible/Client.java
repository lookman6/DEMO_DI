/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_di_couplagefaible;

/**
 *
 * @author Mohamed EL HADDAD
 */
public class Client implements IClient{
    private IService service ;

    public Client(IService service) {
        this.service = service;
    }

    @Override
    public void doSomething() {  
        System.out.println(service.GetInfo());
    }
    
}
