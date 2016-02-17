/**
 * Created by breno on 17/02/16.
 */
public class Animal {

    private String nome = new String();
    private float peso;
    private int numPatas;

    public Animal(String nome, float peso, int numPatas) {
        this.nome = nome;
        this.peso = peso;
        this.numPatas = numPatas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
}
