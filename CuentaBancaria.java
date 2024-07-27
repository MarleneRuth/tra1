import java.util.Random;

public class CuentaBancaria {
    private String numerocuenta;
    private double saldo;
    private String titular;
    {
        Random rand = new Random();
        this.numerocuenta ="CTA" + rand.nextInt(1000);
    }
    public  CuentaBancaria(String titular){
        this(titular, 0);
    
    }
    public CuentaBancaria(String titular, double saldoInicial){
        this.titular = titular;
        this.saldo = saldoInicial;
    }
    public String getnumerocuenta() {
        return numerocuenta;
    }
    public double getsaldo(){
        return saldo;
    
    
    }
}
