package listaexercicios.FaculdadeXPTO;
public class FaculdadeXPTOMain {
    public static void main (String args[]){
        FaculdadeXPTO prof1 = new FaculdadeXPTO();
        FaculdadeXPTO prof2 = new FaculdadeXPTO("Fulano", "" , "", "", 44, 1);
        
        prof1.imprimirInfoProf();
        prof2.imprimirInfoProf();
        
        prof1.cadastrarProf("Prof A", "mestre", "IFBA", "", 0, 0);
        prof2.cadastrarProf("Prof B", "Doutor", "UFBA", "", 0, 0);
        System.out.println();
        
        prof1.imprimirInfoProf();
        System.out.println();
        prof2.imprimirInfoProf();
        
        prof2.alterarDadosProf("Prof A", "mestre", "IFBA", "", 0, 0);
        prof1.alterarDadosProf("Prof B", "Doutor", "UFBA", "", 0, 0);
        System.out.println();
        
        prof1.imprimirInfoProf();
        System.out.println();
        prof2.imprimirInfoProf();
    }
}
