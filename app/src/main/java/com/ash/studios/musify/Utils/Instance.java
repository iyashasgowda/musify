package com.ash.studios.musify.Utils;

import android.media.MediaPlayer;
import android.net.Uri;

import com.ash.studios.musify.Model.Song;

import java.util.ArrayList;

public class Instance {
    public static int position;

    public static boolean repeat;
    public static boolean shuffle;

    public static Uri uri;
    public static MediaPlayer mp;
    public static ArrayList<Song> songs;
}
