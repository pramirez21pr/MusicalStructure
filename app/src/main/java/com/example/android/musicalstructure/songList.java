package com.example.android.musicalstructure;

import java.util.ArrayList;

public class songList extends ArrayList {
  private ArrayList<song> songItems = new ArrayList<>();
/*
*@param songItems is needed to access the songs for the playlist.
* */
  public ArrayList getSongList() {
      songItems.add(new song("The Chainsmokers", "Something Just Like You",
              R.drawable.chainsmokers_image, "feat: Coldplay"));
      songItems.add(new song("Marshmellow", "Wolves",
              R.drawable.marshmello_image, "feat: Selena Gomez"));
      songItems.add(new song("Zedd", "The Middle",
              R.drawable.zedd_image, "feat: Maren Morris"));
      songItems.add(new song("Avicii", "Wake Me Up",
              R.drawable.avicii_image, "feat: "));
      songItems.add(new song("The Chainsmokers", "Don't Let Me Down",
              R.drawable.chainsmokers_image, "feat: Daya"));
      return songItems;

  }

}
