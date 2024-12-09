package listaexercicios.BancoXPTO;
public class BancoXPTOMain {
    public static void main(String[] args) {
        BancoXPTO conta1 = new BancoXPTO();
        BancoXPTO conta2 = new BancoXPTO("Cicrano", "12.123.123-12", "123.123.123-00","0000","1234",1);
        
        conta1.detalhesConta();
        conta2.detalhesConta();
        
        conta1.imprimirSaldo();
        conta2.imprimirSaldo();
        
        conta1.cadastrar("Beltrano", "não existe", "inexistente", "4321", "0987", 0);
        conta2.cadastrar("Jonhson", "09.098.098-09", "098.098.098-09", "6543", "4567", 0);
        System.out.println();
        conta1.detalhesConta();
        System.out.println();
        conta2.detalhesConta();
        System.out.println();
        
        conta1.alterar("Bob esponja", "NULL","NULL", "876","27", 0);
        conta2.alterar("Patrick estrela", "45", "9749", "345678","43264586", 0);
        System.out.println();
        
        conta1.detalhesConta();
        System.out.println();
        conta2.detalhesConta();
    }   
    
    
}
