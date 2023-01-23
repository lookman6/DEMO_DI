/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_di_couplagefaible;

/**
 *
 * @author Mohamed EL HADDAD
 */
public class Test {
    public static void main(String[] args) {
    
        IService Sc = new Service2();
        IClient Clt = new Client(Sc);
        Clt.doSomething();
        
    }
}
