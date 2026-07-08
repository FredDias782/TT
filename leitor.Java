import javazoom.jlayer.player.Player;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Leitor {
    private Player player;
    private Playlist playlist;
    private Thread threadMusica;
    private boolean tocando;
    private String caminhoAtual;

    public Leitor(Playlist playlist) {
        this.playlist = playlist;
        this.tocando = false;
        this.player = null;
    }

    public void tocar(String caminhoMusica) {
        if (tocando) {
            parar();
        }
