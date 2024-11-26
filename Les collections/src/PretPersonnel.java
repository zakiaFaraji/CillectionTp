public class PretPersonnel extends Pret {
    private String motif;

    public PretPersonnel(String id, double montant, double tauxInteret, String motif) {
        super(id, montant, tauxInteret);
        this.motif = motif;
    }

    @Override
    public double calculerInteret() {
        // Calcul des intérêts pour un prêt personnel
        return getMontant() * getTauxInteret() * 3 / 100; // Intérêts calculés sur une durée fixe de 3 ans
    }

    @Override
    public String toString() {
        return super.toString() + ", Motif: " + motif;
    }
}
