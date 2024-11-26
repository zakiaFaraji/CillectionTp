import java.util.ArrayList;
import java.util.List;

public class GestionnaireDePrets<T> {

    private List<T> listeDePrets;

    public GestionnaireDePrets() {
        this.listeDePrets = new ArrayList<>();
    }

    public void ajouterPret(T pret) {
        listeDePrets.add(pret);
    }

    public T retirerPret() {
        if (!listeDePrets.isEmpty()) {
            return listeDePrets.remove(0);
        }
        return null;
    }

    public List<T> listerPrets() {
        return new ArrayList<>(listeDePrets); // Retourne une copie pour éviter la modification directe
    }

    public int compterPrets() {
        return listeDePrets.size();
    }
}
