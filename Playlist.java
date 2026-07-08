public class Playlist {

    private No inicio;
    private No fim;
    private No atual;

    private boolean tocando;
    private boolean repeat;
    public void adicionarMusica(String musica) {

        No novo = new No(musica);

        if (inicio == null) {
            inicio = fim = atual = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
    }

    public void playPause() {

        if (atual == null) {
            System.out.println("Playlist vazia.");
            return;
        }

        tocando = !tocando;

        if (tocando)
            System.out.println("Tocando: " + atual.musica);
        else
            System.out.println("Pausado.");
    }

    public void next() {

        if (atual == null)
            return;

        if (atual.proximo != null) {
            atual = atual.proximo;
        } else if (repeat) {
            atual = inicio;
        }

        System.out.println("Atual: " + atual.musica);
    }

    public void previous() {

        if (atual == null)
            return;

        if (atual.anterior != null) {
            atual = atual.anterior;
        }

        System.out.println("Atual: " + atual.musica);
    }

    public void alternarRepeat() {
        repeat = !repeat;
    }

    public void mostrarPlaylist() {

        No aux = inicio;

        while (aux != null) {

            if (aux == atual)
                System.out.println("-> " + aux.musica);
            else
                System.out.println(aux.musica);

            aux = aux.proximo;
        }
    }
}