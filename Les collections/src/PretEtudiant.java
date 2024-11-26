public class PretEtudiant extends Pret {
    private boolean differe; // Indique si les intérêts sont différés

    public PretEtudiant(String id, double montant, double tauxInteret, boolean differe) {
        super(id, montant, tauxInteret);
        this.differe = differe;
    }

    @Override
    public double calculerInteret() {
        // Calcul des intérêts pour un prêt étudiant
        if (differe) {
            return getMontant() * getTauxInteret() / 100; // Intérêts calculés uniquement sur le capital
        } else {
            return getMontant() * getTauxInteret() * 5 / 100; // Intérêts normaux sur 5 ans
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Différé: " + (differe ? "Oui" : "Non");
    }
}
