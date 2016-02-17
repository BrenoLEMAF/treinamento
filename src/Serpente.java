/**
 * Created by breno on 17/02/16.
 */
public class Serpente extends Animal{
    public String especie = new String();

    public Serpente(String nome, float peso, int numPatas, String especie) {
        super(nome, peso, numPatas);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
