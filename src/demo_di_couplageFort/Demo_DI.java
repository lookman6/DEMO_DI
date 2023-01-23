
package demo_di_couplageFort;

/**
 *
 * @author Mohamed EL HADDAD
 */
public class Demo_DI {

    public static void main(String[] args) {
     
        Client Clt ;
        Service Sc = new Service();
        Clt = new Client(Sc);
        Clt.doSomething();
    }
    
}
