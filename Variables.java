
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
    CuentaBancaria ct1 = new CuentaBancaria();
    CuentaBancaria ct2 = new CuentaBancaria();
    CuentaBancaria ct3 = new CuentaBancaria();
    CuentaBancaria ct4 = new CuentaBancaria();
    CuentaBancaria ct5 = new CuentaBancaria();
    CuentaBancaria ct6 = new CuentaBancaria();
    CuentaBancaria ct7 = new CuentaBancaria();
    CuentaBancaria ct8 = new CuentaBancaria();
    CuentaBancaria ct9 = new CuentaBancaria();
    CuentaBancaria ct10 = new CuentaBancaria();
    
    ct1.saldo = 1000; 
    ct2.saldo = 500; 
    ct3.saldo = 100; 
    ct4.saldo = 400; 
    ct5.saldo = 200; 
    ct6.saldo = 300; 
    ct7.saldo = 700; 
    ct8.saldo = 800; 
    ct9.saldo = 900; 
    ct10.saldo = 600; 
     
    sumarSaldo(ct1);
    sumarSaldo(ct1.saldo);
    ct2 = ct1;
    sumarSaldo(ct3);
    sumarSaldo(ct3.saldo);
    ct4 = ct3;
    sumarSaldo(ct5);
    sumarSaldo(ct6);
    sumarSaldo(ct6.saldo);
    sumarSaldo(ct7);
    ct7 = ct8;
    sumarSaldo(ct8);
    sumarSaldo(ct9);
    sumarSaldo(ct10);
    System.out.println(ct1.saldo);
    System.out.println(ct2.saldo);
    System.out.println(ct3.saldo);
    System.out.println(ct4.saldo);
    System.out.println(ct5.saldo);
    System.out.println(ct6.saldo);
    System.out.println(ct7.saldo);
    System.out.println(ct8.saldo);
    System.out.println(ct9.saldo);
    System.out.println(ct10.saldo);
    }
    
}
