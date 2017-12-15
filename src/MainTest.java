import java.io.BufferedReader;
import java.io.FileReader;

public class MainTest {

	public static void printList(List<Subtitle> Subtitles){
		if (!Subtitles.empty()) {
			
			Subtitles.findFirst();
			
		
			while ( !Subtitles.last() ) {
				
				System.out.print(Subtitles.retrieve().getStartTime().getHH() + ":");
				
				System.out.print(Subtitles.retrieve().getStartTime().getMM() + ":");
				
				System.out.print(Subtitles.retrieve().getStartTime().getSS() + ",");
				
				System.out.print(Subtitles.retrieve().getStartTime().getMS()    );
				
				System.out.print("  --> ");
				
				System.out.print(Subtitles.retrieve().getEndTime().getHH() + ":");
				
				System.out.print(Subtitles.retrieve().getEndTime().getMM() + ":");
				
				System.out.print(Subtitles.retrieve().getEndTime().getSS() + ",");
				
				System.out.println(Subtitles.retrieve().getEndTime().getMS()    );
				
				
				System.out.println(Subtitles.retrieve().getText());
				System.out.println();
				
				Subtitles.findNext();
					
			}
			
			
			System.out.print(Subtitles.retrieve().getStartTime().getHH() + ":");
			
			System.out.print(Subtitles.retrieve().getStartTime().getMM() + ":");
			
			System.out.print(Subtitles.retrieve().getStartTime().getSS() + ",");
			
			System.out.print(Subtitles.retrieve().getStartTime().getMS()    );
			
			System.out.print("  --> ");
			
			System.out.print(Subtitles.retrieve().getEndTime().getHH() + ":");
			
			System.out.print(Subtitles.retrieve().getEndTime().getMM() + ":");
			
			System.out.print(Subtitles.retrieve().getEndTime().getSS() + ",");
			
			System.out.println(Subtitles.retrieve().getEndTime().getMS()    );
			
			
		
			System.out.println(Subtitles.retrieve().getText());
			System.out.println();
			
		}
	}
	
	public static void main(String[] args) {

		
		SubtitleSeqT x;
		
		x = new SubtitleSeqT();
		x.addSubtitle(new SubtitleSt(new TimeSt(0,0,13,1), new TimeSt(0,0,22,1), "YOU!!"));
		
		x.addSubtitle(new SubtitleSt(new TimeSt(0,0,25,1), new TimeSt(0,0,28,1), "Ok Ok OK"));
		
		x.addSubtitle(new SubtitleSt(new TimeSt(0,0,29,1), new TimeSt(0,0,30,1), "Ok1 Ok1 OK1"));
		
		x.addSubtitle(new SubtitleSt(new TimeSt(0,0,0,0), new TimeSt(0,0,10,1), "Hello World"));

		x.addSubtitle(new SubtitleSt(new TimeSt(0,0,31,1), new TimeSt(0,0,34,1), "YOU!! 2"));
		
		x.addSubtitle(new SubtitleSt(new TimeSt(0,0,40,1), new TimeSt(0,0,47,1), "Ok Ok OK 2"));
		
		x.addSubtitle(new SubtitleSt(new TimeSt(0,0,35,1), new TimeSt(0,0,37,1), "Ok1 Ok1 OK1 2"));
		
		x.addSubtitle(new SubtitleSt(new TimeSt(0,0,11,0), new TimeSt(0,0,12,1), "Hello World 2"));
		
		
		Subtitle s = x.getSubtitle(new TimeSt(0, 0, 11, 1));
		System.out.println(s.getText());
		System.out.println(x.nbNodesInSearchPath(new TimeSt(0, 0, 11, 1)));
		
		printList(x.getSubtitles(new TimeSt(0,0,0,0), new TimeSt(0,1,10,1)));
		

		
	}

}
