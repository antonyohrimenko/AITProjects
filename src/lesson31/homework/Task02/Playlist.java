package lesson31.homework.Task02;

import java.util.*;

public class Playlist {
    private List<Song> songs;

    public Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public Song getSong(int index) {
        if (index >= 0 && index < songs.size()) {
            return songs.get(index);
        }
        return null;
    }

    public Queue<Song> getListeningQueue() {
        return new LinkedList<>(songs);
    }

    public Queue<Song> getReverseListeningQueue() {
        LinkedList<Song> reversedQueue = new LinkedList<>(songs);
        Collections.reverse(reversedQueue);
        return reversedQueue;
    }

    public Queue<Song> getShuffledListeningQueue() {
        List<Song> shuffledList = new ArrayList<>(songs);
        Collections.shuffle(shuffledList);
        return new LinkedList<>(shuffledList);
    }

    public List<Song> getSongs() {
        return songs;
    }
}

