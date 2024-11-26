public class PretImmobilier extends Pret {
    private int duree; // Durée du prêt en années

    public PretImmobilier(String id, double montant, double tauxInteret, int duree) {
        super(id, montant, tauxInteret);
        this.duree = duree;
    }

    @Override
    public double calculerInteret() {
        // Calcul des intérêts pour un prêt immobilier
        return getMontant() * getTauxInteret() * duree / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ", Durée: " + duree + " ans";
    }
}
