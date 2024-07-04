public class Songs {
public static boolean melody=true;
public static boolean playing=true;  
public static int likedSongs=102;
  public static void type(String ... type){   
    System.out.println("Types of Songs are: \n");
	for(int p=1;p<type.length;p++){
    System.out.println(" "+p+". "+type[p]);
	}
}

  public static int PlaylistSongs(int q) {
    if (q >180) {
      System.out.println("Great Collection");
    } else  if(q==0)
      System.out.println("Create your Playlist");
      return q;
  }

  public static void songStatus() {
    if (playing==true) {
      System.out.println("Audio Player is running\n");
    } else {
      System.out.println("Play ur Song\n");
    }
  }
  public static int likedSongs(){
	if (likedSongs>=80)
	{
		System.out.println("Liked list is long Running");
	}
	else
		System.out.println("Add more songs");
		return 0;
  }
}
