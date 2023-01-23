
package demo_di_couplageFort;

/**
 *
 * @author Mohamed EL HADDAD
 */
public class Client {
    private Service MonServicee ;
     public void doSomething() {
        String info = MonServicee.GetInfo();
        System.out.println(info);
    }

    public void setMonServicee(Service MonServicee) {
        this.MonServicee = MonServicee;
    }

    public Client(Service MonServicee) {
        this.MonServicee = MonServicee;
    }
     
}
