package listaexercicios.LojaVeiculos;
public class LojaVeiculos {
    String modelo, codigo, marca, cor, tipoCombustivel, completo;
    double preco;
    int anoFabricacao, qtdePortas, qtdeDisponivel;
    
    public LojaVeiculos(){
        modelo = "modelo A"; 
        codigo = "XXXX0000";
        marca = "marca A";
        cor = "preto";
        tipoCombustivel = "Gasolina";
        completo = "sim";
        preco = 10000.00;
        anoFabricacao = 2024;
        qtdePortas = 4;
        qtdeDisponivel = 1;    
    }
    public LojaVeiculos(String modelo, String codigo, String marca, String cor, String 
    tipoCombustivel, String completo, double preco,
    int anoFabricacao, int qtdePortas, int qtdeDisponivel)
    {
        this.modelo = modelo;
        this.codigo= codigo;
        this.marca = marca;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.completo = completo;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
        this.qtdePortas = qtdePortas;
        this.qtdeDisponivel = qtdeDisponivel;    
    }
    
    public void detalhesCarro(){
        System.out.println("Modelo do carro: " + this.modelo);
        System.out.println("Codigo do carro: " + this.codigo);
        System.out.println("Marca do carro: " + this.marca);
        System.out.println("Cor do carro: " + this.cor);
        System.out.println("Tipo do combustivel do carro: " + this.tipoCombustivel);        
        System.out.println("É completo ? " + this.completo);
        System.out.println("Preco do carro: " + this.preco);
        System.out.println("Ano de fabricacao do carro: " + this.anoFabricacao); 
        System.out.println("Quantidade de portas do carro: " + this.qtdePortas);
        System.out.println("Quantos carros estao disponiveis: " + this.qtdeDisponivel);        
    }
    public void cadastrar(String modelo, String codigo, String marca, String cor, String 
    tipoCombustivel, String completo, double preco,
    int anoFabricacao, int qtdePortas, int qtdeDisponivel)
    {
        this.modelo = modelo;
        this.codigo= codigo;
        this.marca = marca;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.completo = completo;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
        this.qtdePortas = qtdePortas;
        this.qtdeDisponivel = qtdeDisponivel;
        System.out.println("Carro cadastrado com sucesso!");
    }
    public void alterar(String modelo, String codigo, String marca, String cor, String 
    tipoCombustivel, String completo, double preco,
    int anoFabricacao, int qtdePortas, int qtdeDisponivel){
        this.modelo = modelo;
        this.codigo= codigo;
        this.marca = marca;
        this.cor = cor;
        this.tipoCombustivel = tipoCombustivel;
        this.completo = completo;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
        this.qtdePortas = qtdePortas;
        this.qtdeDisponivel = qtdeDisponivel;
        System.out.println("Dados do carro alterados com sucesso!");        
    }
}