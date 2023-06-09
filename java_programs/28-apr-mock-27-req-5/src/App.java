import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		List<Artist> allArtists = Artist.prefill();
		System.out.println("Enter the number of songs:");
		int noOfSongs=sc.nextInt();
		List<Song> songList=new ArrayList<>();
		for(int i=0;i<noOfSongs;i++)
		{
			String detail=sc.nextLine();
			if(detail.equals(""))
				detail=sc.nextLine();
			String[] arr = detail.split(",");
//			Shape of You,Pop,03:53,4.9,Ed Sheeran-Steve Mac-Burruss
			Song song=new Song();
			song.setTitle(arr[0]);
			song.setGenre(arr[1]);
			SimpleDateFormat sdf=new SimpleDateFormat("hh:mm");
			song.setDuration(sdf.parse(arr[2]));
			song.setRating(Double.parseDouble(arr[3]));
			String[] aarr = arr[4].split("-");
			List<Artist> artistList=new ArrayList<>();
			for(String aName:aarr)
			{
				//find artist object from prefill using aName
				for(Artist a : allArtists)
				{
					if(a.getName().equals(aName))
					{
						a.getSongList().add(song);
						artistList.add(a);
					}
						
				}
			}
			song.setArtistList(artistList);
			songList.add(song);
		}
		System.out.println("Enter the gender of singer:");
		String gender=sc.next();
		Artist result = Artist.bestSinger(gender, allArtists);
		System.out.println("The best "+gender+" singer is "+result.getName());
	}

}
