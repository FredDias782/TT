import javazoom.jlayer.player.Player;
import java.io.FileInputStream;
import java.util.Scanner;

import javazoom.jlayer.player.Player;
import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Playlist playlist = new Playlist();
      int opcao;

      do {
            System.out.println("\n===== MENU PLAYLIST =====");
            System.out.println("1 - Adicionar Música");
            System.out.println("2 - Play/Pause");
            System.out.println("3 - Próxima Música");
            System.out.println("4 - Música Anterior");
            System.out.println("5 - Ativar/Desativar Repeat");
            System.out.println("6 - Mostrar Playlist");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

               case 1:
                  System.out.print("Nome da música: ");
                  String musica = sc.nextLine();
                  playlist.adicionarMusica(musica);
                  break;

               case 2:
                  playlist.playPause();
                  break;

               case 3:
                  playlist.next();
                  break;

               case 4:
                  playlist.previous();
                  break;

               case 5:
                  playlist.alternarRepeat();
                  System.out.println("Modo Repeat alterado.");
                  break;

               case 6:
                  playlist.mostrarPlaylist();
                  break;

               case 0:
                  System.out.println("Programa encerrado.");
                  break;

               default:
                  System.out.println("Opção inválida!");
            }

      } while (opcao != 0);

      sc.close();
   }
}
}
