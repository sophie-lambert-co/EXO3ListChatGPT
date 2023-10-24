public class Main {
    public static void main(String[] args){
        FileDAttente maFile = new FileDAttente();
    

    maFile.ajouterPersonne("Thérèse");
    maFile.ajouterPersonne("Barbara");
    maFile.ajouterPersonne("Pénélope");
    maFile.ajouterPersonne("Gérard");

    maFile.suppLastPersonne();

    maFile.ajouterPersonne("Denver");

    maFile.afficherFileDAttente();
   
}
}
