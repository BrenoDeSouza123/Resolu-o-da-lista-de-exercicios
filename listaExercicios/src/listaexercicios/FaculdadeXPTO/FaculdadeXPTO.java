package listaexercicios.FaculdadeXPTO;
public class FaculdadeXPTO {
    String nome, titulacao, formacao, disciplinas;
    int cargaHoraria;
    double salario;
    
    public FaculdadeXPTO(){
        nome = "Fulano";
        titulacao = "";
        formacao = "";
        disciplinas = "nenhuma";
        cargaHoraria = 0;
        salario = 0;
    }
    public FaculdadeXPTO(String nome, String titulacao, String formacao, String disciplinas,
    int cargaHoraria,
    double salario)
    {
        this.nome = nome;
        this. titulacao = titulacao;
        this.formacao = formacao;
        this.disciplinas = disciplinas;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
    }
    public void cadastrarProf(String nome, String titulacao, String formacao, String disciplinas,
    int cargaHoraria,
    double salario)
    {
        this.nome = nome;
        this. titulacao = titulacao;
        this.formacao = formacao;
        this.disciplinas = disciplinas;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        System.out.println("Professor cadastrado com sucesso!");
    }
    public void alterarDadosProf(String nome, String titulacao, String formacao, String disciplinas,
    int cargaHoraria,
    double salario)
    {
        this.nome = nome;
        this. titulacao = titulacao;
        this.formacao = formacao;
        this.disciplinas = disciplinas;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        System.out.println("Dados do professor alterados com sucesso!");
    }  
    public void imprimirInfoProf(){
        System.out.println("As informações do professor são:");
        System.out.println("-----------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Titulacao: " + this.titulacao);
        System.out.println("Formacao: " + this.formacao);
        System.out.println("Disciplinas: " + this.disciplinas);
        System.out.println("Carga horaria: " + this.cargaHoraria);        
        System.out.println("Salario: " + this.salario);
    }
}
