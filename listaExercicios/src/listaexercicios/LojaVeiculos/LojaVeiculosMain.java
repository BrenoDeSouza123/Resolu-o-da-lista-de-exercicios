package listaexercicios.LojaVeiculos;
public class LojaVeiculosMain {
   public static void main(String args[]){
        LojaVeiculos carro1 = new LojaVeiculos();
        LojaVeiculos carro2 = new LojaVeiculos("modelo B", "XXXX", "marca X", "branco", "etanol", "sim", 1,2024,
        1, 1);
        
        carro1.detalhesCarro();
        carro2.detalhesCarro();
        
        carro1.cadastrar("modelo X", "ZZZZ", "marca Z", "rosa", "eletrico", "não", 0, 2025, 1000, 1);
        carro2.cadastrar("modelo D", "AAAA", "marca O", "verde", "gas carbonico","talvez" , 2, 2077, 2, 123456789);
        System.out.println();
        
        carro1.detalhesCarro();
        System.out.println();
        carro2.detalhesCarro();        
        
        carro1.alterar("modelo A", "BBBB", "marca A", "cinza", "gasolina", "se quiser sim mano", 10, 1964, 2, 13);
        carro2.alterar("modelo B", "XXXX", "marca X", "branco", "etanol", "com certeza", 5, 1945, 11, 12);
        System.out.println();
        
        carro1.detalhesCarro();
        carro2.detalhesCarro();
    }
}
