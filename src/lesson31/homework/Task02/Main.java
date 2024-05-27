package lesson31.homework.Task02;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        // Добавление песен в плейлист
        playlist.addSong(new Song("Blinding Lights", "The Weeknd", 200));
        playlist.addSong(new Song("Shape of You", "Ed Sheeran", 233));
        playlist.addSong(new Song("Someone Like You", "Adele", 285));
        playlist.addSong(new Song("Bohemian Rhapsody", "Queen", 354));
        playlist.addSong(new Song("Bad Guy", "Billie Eilish", 194));

        // Прослушивание плейлиста в различных порядках
        listenToPlaylist(playlist, OrderType.NORMAL);
        listenToPlaylist(playlist, OrderType.REVERSE);
        listenToPlaylist(playlist, OrderType.SHUFFLED);
    }


    // метод для прослушивания
    public static void listenToPlaylist(Playlist playlist, OrderType orderType) {
        Queue<Song> queue;
        switch (orderType) {
            case REVERSE:
                queue = playlist.getReverseListeningQueue();
                break;
            case SHUFFLED:
                queue = playlist.getShuffledListeningQueue();
                break;
            case NORMAL:
            default:
                queue = playlist.getListeningQueue();
                break;
        }

        System.out.println("Прослушивание плейлиста (" + orderType + "):");
        while (!queue.isEmpty()) {
            System.out.println("Играет песня: " + queue.poll());
        }
        System.out.println();
    }
}

