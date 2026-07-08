public class Playlist {
    private No inicio;
    private No fim;
    private No atual;
    private boolean tocando;
    private boolean repeat;

    public Playlist() {
        this.inicio = null;
        this.fim = null;
        this.atual = null;
        this.tocando = false;
        this.repeat = false;
    }

    public void adicionarMusica(String musica) {
        No novo = new No(musica);
        
        if (inicio == null) {
            inicio = fim = atual = novo;
        } else {
            fim.setProximo(novo);
            novo.setAnterior(fim);
            fim = novo;
        }
        System.out.println("Música adicionada: " + musica);
    }

    public void playPause() {
        if (atual == null) {
            System.out.println("Playlist vazia.");
            return;
        }
        
        tocando = !tocando;
        
        if (tocando)
            System.out.println("Tocando: " + atual.getMusica());
        else
            System.out.println("Pausado.");
    }

    public void next() {
        if (atual == null) {
            System.out.println("Playlist vazia.");
            return;
        }
        
        if (atual.getProximo() != null) {
            atual = atual.getProximo();
        } else if (repeat) {
            atual = inicio;
        } else {
            System.out.println("Fim da playlist.");
            return;
        }
        
        System.out.println("Atual: " + atual.getMusica());
    }

    public void previous() {
        if (atual == null) {
            System.out.println("Playlist vazia.");
            return;
        }
        
        if (atual.getAnterior() != null) {
            atual = atual.getAnterior();
        } else if (repeat) {
            atual = fim;
        } else {
            System.out.println("Início da playlist.");
            return;
        }
        
        System.out.println("Atual: " + atual.getMusica());
    }

    public void alternarRepeat() {
        repeat = !repeat;
        System.out.println("Repeat: " + (repeat ? "ATIVADO" : "DESATIVADO"));
    }

    public void mostrarPlaylist() {
        if (inicio == null) {
            System.out.println("Playlist vazia!");
            return;
        }
        
        System.out.println("\n--- PLAYLIST ---");
        No aux = inicio;
        int posicao = 1;
        
        while (aux != null) {
            if (aux == atual)
                System.out.println(posicao + ". ► " + aux.getMusica() + " (tocando)");
            else
                System.out.println(posicao + ". " + aux.getMusica());
            
            aux = aux.getProximo();
            posicao++;
        }
        System.out.println("--- FIM ---\n");
    }
}
