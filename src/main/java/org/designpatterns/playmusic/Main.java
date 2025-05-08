package org.designpatterns.playmusic;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> tracks = List.of("Track 1", "Track 2", "Track 3");
        MusicPlayer player = new MusicPlayer(tracks);

        // Simulate pressing buttons
        player.playOrPause();   // Playing: Track 1
        player.next();          // Playing next track: Track 2
        player.next();          // Playing next track: Track 3
        player.next();          // Already on the last track
        player.repeatOnOrOff(); // Repeat on
        player.next();          // Replaying first track: Track 1
        player.previous();      // Already on the first track
        player.stop();          // Stopping: Track 1
        player.stop();          // Already stopped
        player.playOrPause();   // Playing: Track 1
        player.repeatOnOrOff(); // Repeat off
    }
}
