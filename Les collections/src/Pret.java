public abstract class Pret {
    private String id;
    private double montant;
    private double tauxInteret;

    public Pret(String id, double montant, double tauxInteret) {
        this.id = id;
        this.montant = montant;
        this.tauxInteret = tauxInteret;
    }

    public abstract double calculerInteret();

    public String getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    @Override
    public String toString() {
        return "Prêt [ID: " + id + ", Montant: " + montant + ", Taux d'intérêt: " + tauxInteret + "%]";
    }
}
