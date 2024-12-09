package listaexercicios.BancoXPTO;
public class BancoXPTO {
    String nomeCorrentista, RG, CPF, numConta, numAgencia;
    double saldo;
    
    public BancoXPTO(){
        nomeCorrentista = "Fulano de tal";
        RG = "00.000.000-00";
        CPF = "000.000.000-00";
        numConta = "XXXXXXX-X";
        numAgencia = "XXXX";
    }
    public BancoXPTO(String nomeCorrentista, String RG, String CPF, String numConta, String numAgencia,
    double saldo)
    {
        this.nomeCorrentista = nomeCorrentista;
        this.RG = RG;
        this.CPF = CPF;
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.saldo = saldo;
    }
    
    public void cadastrar(String nomeCorrentista, String RG, String CPF, String numConta, String numAgencia,
    double saldo)
    {
        this.nomeCorrentista = nomeCorrentista;
        this.RG = RG;
        this.CPF = CPF;
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.saldo = saldo;
        System.out.println("Conta cadastrada com sucesso!");
    }
    public void alterar (String nomeCorrentista, String RG, String CPF, String numConta, String numAgencia,
    double saldo)
    {
        this.nomeCorrentista = nomeCorrentista;
        this.RG = RG;
        this.CPF = CPF;
        this.numConta = numConta;
        this.numAgencia = numAgencia;
        this.saldo = saldo;
        System.out.println("Dados da conta alterados com sucesso!");
    } 
    public void imprimirSaldo (){
        System.out.println("O saldo do cliente é: " + this.saldo);
    }
    public void detalhesConta(){
        System.out.println("Nome do correntista: " + this.nomeCorrentista);
        System.out.println("RG: " + this.RG);
        System.out.println("CPF: " + this.CPF);
        System.out.println("No da conta: " + this.numConta);
        System.out.println("Nome da agencia: " + this.numAgencia);
        System.out.println("Saldo: " + this.saldo);
    }
}
