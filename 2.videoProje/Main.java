
public class Main {

	public static void main(String[] args) {
		
		Spotify music1 = new Spotify(1,"Gitme","Dolu Kadehi Ters Tut",3.27);
		
		Spotify music2 = new Spotify(2,"Blinding Lights","The Weekend",3.20);

		Spotify music3 = new Spotify(3,"Galiba Sevmiyorlar","Son Feci Bisiklet",3.0);

	
		Spotify[] musics= {music1,music2,music3};
		
		for(Spotify spotify:musics)
			System.out.println(spotify.name);
		
		
		Album album1=new Album();
		
		album1.id=32462;
		album1.name="begendigim şarkılar";
		
		Album album2=new Album();
		
		album2.id=316436;
		album2.name="sporda dinlediklerim";
		
		
		
		SpotifyManager spotifyManager= new SpotifyManager();
		
		spotifyManager.addTo(music1);
		spotifyManager.addTo(music2);
		spotifyManager.addTo(music3);

		spotifyManager.followTo(music1);
	
		
	}
	


}
