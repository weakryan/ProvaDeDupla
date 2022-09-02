public class ContaBancaria {
    protected String cliente;
    protected int numConta;
    protected float Saldoo;
 
    public ContaBancaria(String cliente, int numConta, float Saldoo){
        this.cliente = cliente;
        this.numConta = numConta;
        this.Saldoo = Saldoo;
    }
    public float saque(float dinheiroSacado) {
        float t = Saldoo - dinheiroSacado;
        if (t < 0){
            System.out.println("Você não pode sacar esse valor.");
            return 0;
        }else{
            return t;
        }
    }
    public float deposito(float deposito){
        float t = Saldoo + deposito;
        return t;
    }
    public String getcliente() {
        return cliente;
    }
    public void setcliente(String cliente) {
        cliente = cliente;
    }
    public float getSaldoo() {
        return Saldoo;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setSaldoo(float Saldoo) {
        this.Saldoo = Saldoo;
    }



}