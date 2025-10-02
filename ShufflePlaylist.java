
public class ShufflePlaylist {
    /*
     * ShufflePlaylist
     * 
     * Name: Maxwell Noffsinger
     * 
     * Date: 10/2/2025
     * 
     * Description: Randomly shuffles a predefined playlist of terrible songs
     * then prints those "songs"
     */

     public static String[] shuffle(String[] playlist){
        for(int i = 0; i < playlist.length; i++){
        String temp = playlist[i];
        int j = (int)(Math.random()*playlist.length);
        playlist[i] = playlist[j];
        playlist[j] = temp;

        }
        return playlist;
     }




    public static void main(String[] args) {
        String[] playlist = {"Shake It Off - Taylor Swift",
    "I Love You - Barney",
    "Baby Shark - Pinkfong",
    "Never Gonna Give You Up - Rick Astley",
    "Axel F (Crazy Frog) - Crazy Frog",
    "Gangnam Style - PSY",
    "What Does the Fox Say? - Ylvis"};

    

    playlist = shuffle(playlist);
    System.out.println("Shuffled Playlist:");
    for (int i =0; i<playlist.length;i++){
        System.out.print((i+1) + ".");
        System.out.println(playlist[i]);
    };

}
}
