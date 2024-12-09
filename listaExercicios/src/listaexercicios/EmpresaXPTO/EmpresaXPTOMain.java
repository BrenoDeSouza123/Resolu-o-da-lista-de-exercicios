package listaexercicios.EmpresaXPTO;
public class EmpresaXPTOMain {
    public static void main (String args[]){
        EmpresaXPTO funcionario1 = new EmpresaXPTO();
        EmpresaXPTO funcionario2 = new EmpresaXPTO("Cicrano",
        "12/12/12", "", "", "", "", "", "", "", 1);
        
        funcionario1.exibirInfo();
        System.out.println();
        funcionario2.exibirInfo();
        System.out.println();
        
        funcionario1.cadastrarFuncionario("João Carlos da Silva", "15/03/1987", 
        "12.345.678-9", "123.456.789-01", " Rua das Flores, 123, Bairro Jardim, São Paulo - SP",
        "São Paulo - SP", "Analista de Sistemas", "Ensino Superior Completo",
        "2023456789", 4.500);
        System.out.println();
        funcionario2.cadastrarFuncionario("Maria Helena Costa","08/09/1992", 
        "98.765.432-1", "987.654.321-00", "Avenida Central, 456, Bairro Centro, Rio de Janeiro - RJ", 
        "Rio de Janeiro - RJ", "Médica Pediatra", "Pós-graduação Completa", "3039876543", 
        7.200);
        
        funcionario1.exibirInfo();
        System.out.println();
        funcionario2.exibirInfo();
        System.out.println();
        
        funcionario2.alterarInfoFuncionario("João Carlos da Silva", "15/03/1987", 
        "12.345.678-9", "123.456.789-01", " Rua das Flores, 123, Bairro Jardim, São Paulo - SP",
        "São Paulo - SP", "Analista de Sistemas", "Ensino Superior Completo",
        "2023456789", 4.500);
        System.out.println();
        funcionario1.alterarInfoFuncionario("Maria Helena Costa","08/09/1992", 
        "98.765.432-1", "987.654.321-00", "Avenida Central, 456, Bairro Centro, Rio de Janeiro - RJ", 
        "Rio de Janeiro - RJ", "Médica Pediatra", "Pós-graduação Completa", "3039876543", 
        7.200);

        funcionario1.exibirInfo();
        System.out.println();
        funcionario2.exibirInfo();
        System.out.println();        
    }
}
