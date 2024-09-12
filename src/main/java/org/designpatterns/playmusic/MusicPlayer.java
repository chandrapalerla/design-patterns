package org.designpatterns.playmusic;

import java.util.List;

public class MusicPlayer implements Player {
    private final List<String> tracks;
    private int currentTrackIndex = -1;
    private boolean isPlaying = false;
    private boolean isStopped = true;
    private boolean isRepeatOn = false;

    public MusicPlayer(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public void playOrPause() {
        if (isStopped) {
            currentTrackIndex = 0;
            isStopped = false;
        }
        if (isPlaying) {
            System.out.println("Pausing: " + tracks.get(currentTrackIndex));
            isPlaying = false;
        } else {
            System.out.println("Playing: " + tracks.get(currentTrackIndex));
            isPlaying = true;
        }
    }

    @Override
    public void stop() {
        if (isStopped) {
            System.out.println("Already stopped");
        } else {
            System.out.println("Stopping: " + tracks.get(currentTrackIndex));
            isPlaying = false;
            isStopped = true;
        }
    }

    @Override
    public void next() {
        if (currentTrackIndex == -1) {
            System.out.println("Please start the player first.");
            return;
        }
        if (currentTrackIndex < tracks.size() - 1) {
            currentTrackIndex++;
            System.out.println("Playing next track: " + tracks.get(currentTrackIndex));
            isPlaying = true;
        } else if (isRepeatOn) {
            currentTrackIndex = 0;
            System.out.println("Replaying first track: " + tracks.get(currentTrackIndex));
            isPlaying = true;
        } else {
            System.out.println("Already on the last track");
        }
    }

    @Override
    public void previous() {
        if (currentTrackIndex == -1) {
            System.out.println("Please start the player first.");
            return;
        }
        if (currentTrackIndex > 0) {
            currentTrackIndex--;
            System.out.println("Playing previous track: " + tracks.get(currentTrackIndex));
            isPlaying = true;
        } else {
            System.out.println("Already on the first track");
        }
    }

    @Override
    public void repeatOnOrOff() {
        isRepeatOn = !isRepeatOn;
        System.out.println(isRepeatOn ? "Repeat on" : "Repeat off");
    }
}
