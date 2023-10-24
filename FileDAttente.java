import java.util.LinkedList;

public class FileDAttente {
    public static final String afficherFileDAttente = null;
    // Attributs
    private LinkedList<String> maLinkedList;

    // Constructeur de la classe
    public FileDAttente() {
        // Initialisations de la LinkedList
        maLinkedList = new LinkedList<>();
    }

    public void ajouterPersonne(String name) {
        maLinkedList.add(name);
    }

    public void suppLastPersonne() {
        if (!maLinkedList.isEmpty()) {
            maLinkedList.removeLast();
        }
    }

    public String afficherFileDAttente(){
        for (String name : maLinkedList){
            System.out.println(name);
          
        }
        return null;

    }
}