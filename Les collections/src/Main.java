import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Créer une instance de GestionnaireDePrets
        GestionnaireDePrets<Pret> gestionnaire = new GestionnaireDePrets<>();

        // 2. Ajouter plusieurs prêts de différents types
        PretImmobilier pretImmobilier = new PretImmobilier("P001", 200000, 3.0, 20);
        PretEtudiant pretEtudiant = new PretEtudiant("P002", 15000, 2.0, true);
        PretPersonnel pretPersonnel = new PretPersonnel("P003", 5000, 5.0, "Voyage");

        gestionnaire.ajouterPret(pretImmobilier);
        gestionnaire.ajouterPret(pretEtudiant);
        gestionnaire.ajouterPret(pretPersonnel);

        // 3. Afficher la liste des prêts
        System.out.println("Liste des prêts :");
        List<Pret> prets = gestionnaire.listerPrets();
        for (Pret pret : prets) {
            System.out.println(pret + ", Intérêt total: " + pret.calculerInteret());
        }

        // 4. Afficher le nombre total de prêts
        System.out.println("\nNombre total de prêts : " + gestionnaire.compterPrets());

        // 5. Retirer un prêt et afficher la liste mise à jour
        Pret pretRetire = gestionnaire.retirerPret();
        System.out.println("\nRetrait du prêt : " + pretRetire);

        System.out.println("\nListe mise à jour :");
        prets = gestionnaire.listerPrets();
        for (Pret pret : prets) {
            System.out.println(pret + ", Intérêt total: " + pret.calculerInteret());
        }
    }
}
