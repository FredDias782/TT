public class No {
    String musica;
    No anterior;
    No proximo;

    public No(String musica) {
        this.musica = musica;
        this.anterior = null;
        this.proximo = null;
    }
     // Getters
    public String getMusica() {
        return musica;
    }

    public No getAnterior() {
        return anterior;
    }

    public No getProximo() {
        return proximo;
    }
    // Setters
    public void setMusica(String musica) {
        this.musica = musica;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
     @Override
    public String toString() {
        return "No{" +
                "musica='" + musica + '\'' +
                '}';
    }
}
