public class No {
    String musica;
    No anterior;
    No proximo;

    public No(String musica) {
        this.musica = musica;
        this.anterior = null;
        this.proximo = null;
    }
}