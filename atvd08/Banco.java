package atvd08;

public class Banco {
    private String name;
    private String numberAccount;
    private int saldo;

    public Banco(String name, String numberAccount, int saldo){
        this.name = name;
        this.numberAccount = numberAccount;
        this.saldo = saldo;
    }
    public String getName(){
        return name;
    }
    public String getNumberAccount(){
        return numberAccount;
    }
    public int getSaldo(){
        return saldo;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
}
