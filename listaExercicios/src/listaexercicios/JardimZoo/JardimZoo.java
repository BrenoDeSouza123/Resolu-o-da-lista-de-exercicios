package listaexercicios.JardimZoo;
public class JardimZoo {
    String especie, nomeAnimal, numRegistro, localNascimento, dataNascimento;
    
    public JardimZoo(){
        especie = "lendaria";
        nomeAnimal = "ser humaninho";
        numRegistro = "inexistente";
        localNascimento = "naquele lugar lá";
        dataNascimento = "12/12/12";    
    }
    public JardimZoo(String especie, String nomeAnimal, String numRegistro, String localNascimento, String dataNascimento){
        this.especie = especie;
        this.nomeAnimal = nomeAnimal;
        this.numRegistro = numRegistro;
        this.localNascimento = localNascimento;
        this.dataNascimento = dataNascimento;                
    }
    public void cadastrar(String especie, String nomeAnimal, String numRegistro, String localNascimento, String dataNascimento){
        this.especie = especie;
        this.nomeAnimal = nomeAnimal;
        this.numRegistro = numRegistro;
        this.localNascimento = localNascimento;
        this.dataNascimento = dataNascimento;
        System.out.println("Animal cadastrado com sucesso!");
    }
    public void alterar(String especie, String nomeAnimal, String numRegistro, String localNascimento, String dataNascimento){
        this.especie = especie;
        this.nomeAnimal = nomeAnimal;
        this.numRegistro = numRegistro;
        this.localNascimento = localNascimento;
        this.dataNascimento = dataNascimento;
        System.out.println("Dados do animal alterados com sucesso!");
    }
    public void infoAnimal(){
        System.out.println("As informacoes do animal sao:");
        System.out.println("-----------------------------");
        System.out.println();
        System.out.println("especie: " + this.especie);
        System.out.println("Nome do animal: " + this.nomeAnimal);
        System.out.println("Numero de registro: " + this.numRegistro);
        System.out.println("Local de nascimento: " + this.localNascimento);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println();
    }
}


