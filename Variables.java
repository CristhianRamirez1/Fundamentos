
package variableshector;
 class CuentaBancaria {
        public int saldo;
    }
public class VariablesHector {

    public static void sumarSaldo(CuentaBancaria cta){
        cta.saldo +=10;
    }
    
    public static void sumarSaldo(int saldo){
        saldo +=10;
    }
   
    
    
   
    public static void main(String[] args) {
    CuentaBancaria v1 = new CuentaBancaria();
    CuentaBancaria ct2 = new CuentaBancaria();
    CuentaBancaria ct3 = new CuentaBancaria();
    CuentaBancaria ct4 = new CuentaBancaria();
    CuentaBancaria ct5 = new CuentaBancaria();
    CuentaBancaria ct6 = new CuentaBancaria();
    CuentaBancaria ct7 = new CuentaBancaria();
    CuentaBancaria ct8 = new CuentaBancaria();
    CuentaBancaria ct9 = new CuentaBancaria();
    CuentaBancaria ct10 = new CuentaBancaria();
    
    v1.saldo = 10; 
    ct2.saldo = 50; 
    ct3.saldo = 200; 
    ct4.saldo = 500; 
    ct5.saldo = 2; 
    ct6.saldo = 320; 
    ct7.saldo = 710; 
    ct8.saldo = 860; 
    ct9.saldo = 940; 
    ct10.saldo = 6; 
     
    sumarSaldo(v1);
    sumarSaldo(v1.saldo);
    ct2 = v1;
    sumarSaldo(ct3);
    sumarSaldo(ct3.saldo);
    ct4 = ct3;
    sumarSaldo(ct5);
    ct5 = new CuentaBancaria ();
    ct5.saldo = 89 ; 
    sumarSaldo(ct6);
    sumarSaldo(ct6.saldo);
    sumarSaldo(ct7);
    ct7 = ct8;
    sumarSaldo(ct8);
    sumarSaldo(ct9);
    ct9 = new CuentaBancaria (); 
    sumarSaldo(ct10);
    System.out.println(v1.saldo + v1.saldo);
    System.out.println(ct2.saldo);
    System.out.println(ct3.saldo);
    System.out.println(ct4.saldo);
    System.out.println(ct5.saldo);
    System.out.println(ct6.saldo+ ct5.saldo);
    System.out.println(ct7.saldo);
    System.out.println(ct8.saldo);
    System.out.println(ct9.saldo + ct9.saldo + ct9.saldo);
    System.out.println(ct10.saldo);
    }
    
}
