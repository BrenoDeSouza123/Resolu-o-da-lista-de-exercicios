package listaexercicios.EmpresaXPTO;
public class EmpresaXPTO {
    String nome, dataNascimento, RG, CPF, endereco, naturalidade, profissao, grauInstrucao, matricula;
    double salario;
    
    public EmpresaXPTO (){
        nome = "Fulano";
        dataNascimento = "12/12/12";
        RG = "XX.XXX.XXX-XX";
        CPF = "XXX.XXX.XXX-XX";
        endereco = "rua dos bobos, no.0";
        naturalidade = "Daqui mesmo";
        profissao = "curioso";
        grauInstrucao = "";
        matricula = "aquela la";
        salario = 1200.00;
     }
    public EmpresaXPTO (String nome, String dataNascimento, String RG, String CPF, String endereco, String naturalidade,
    String profissao, String grauInstrucao, String matricula, double salario)
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
        this.salario = salario;
     }
    public void cadastrarFuncionario (String nome, String dataNascimento, String RG, String CPF, String endereco, String naturalidade,
    String profissao, String grauInstrucao, String matricula, double salario)
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
        this.salario = salario;
        System.out.println("Funcionario cadastrado com sucesso");
    }
    public void alterarInfoFuncionario (String nome, String dataNascimento, String RG, String CPF, String endereco, String naturalidade,
    String profissao, String grauInstrucao, String matricula, double salario)
    {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.RG = RG;
        this.CPF = CPF;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;
        this.salario = salario;
        System.out.println("Dados do funcionario alterados com sucesso");
    }        
    
    public void exibirInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("RG: " + this.RG);
        System.out.println("CPF: " + this.CPF);
        System.out.println("Endereco: " + this.endereco);
        System.out.println("Naturalidade: " + this.naturalidade);
        System.out.println("Profissao: " + this.profissao);
        System.out.println("Grau de instrucao: " + this.grauInstrucao);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("salario: " + this.salario);
    }
}
