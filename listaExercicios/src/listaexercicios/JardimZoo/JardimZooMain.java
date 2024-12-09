package listaexercicios.JardimZoo;
public class JardimZooMain {
    public static void main (String args[]){
        JardimZoo animal1 = new JardimZoo();
        JardimZoo animal2 = new JardimZoo("Especie rara", "Rex", "XXXX", "Aqui", 
        "12/12/12");
        
        animal1.infoAnimal();
        animal2.infoAnimal();
        
        animal1.cadastrar("felino", "xaninho", "1234", "Pindamoiangaba", "1/1/1");
        animal2.cadastrar("canino", "garoto", "0987", "Feira de Santana", "09/12/2024");
        System.out.println();
        
        animal1.infoAnimal();
        System.out.println();
        animal2.infoAnimal();
        
        animal2.alterar("felino", "xaninho", "1234", "Pindamoiangaba", "1/1/1");
        animal1.alterar("canino", "garoto", "0987", "Feira de Santana", "09/12/2024");
        System.out.println();
        
        animal1.infoAnimal();
        System.out.println();
        animal2.infoAnimal();
    }
}
