/**
 * Created by breno on 17/02/16.
 */
public class Cachorro extends Animal{

    private String raca = new String();

    public Cachorro(String nome, float peso, int numPatas, String raca) {
        super(nome, peso, numPatas);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
