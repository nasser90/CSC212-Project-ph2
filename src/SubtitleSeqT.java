
public class SubtitleSeqT implements SubtitleSeq {
	
	private SortedBST<TimeInterval, Subtitle> s;
	
	public SubtitleSeqT(){
		s = new SortedBST<>();
	}
	
	// It works.
	public void addSubtitle(Subtitle st) {
		TimeInterval k = new TimeInterval(convertToMS(st.getStartTime()),convertToMS(st.getEndTime()));
		s.insert(k, st);
	}

	
	public List<Subtitle> getSubtitles() {
		
		List<Subtitle> l = new LinkedListWC<>();
		
		
		
		return l;
	}
	
	
	// It works.
	public Subtitle getSubtitle(Time time) {
		
		TimeInterval key = new TimeInterval(convertToMS(time),convertToMS(time));
		
		List<Pair<TimeInterval, Subtitle>> l = s.inRange(key, key);
		
		if(!l.empty()){
			l.findFirst();
			return	l.retrieve().second;
		}
		
		
		return null;
	}
	
	//It works.
	public int nbNodesInSearchPath(Time time) {
		
		TimeInterval key = new TimeInterval(convertToMS(time),convertToMS(time));
		
		return s.nbNodesInSearchPath(key);
	}
	
	//
	public List<Subtitle> getSubtitles(Time startTime, Time endTime) {
		
		TimeInterval key1 = new TimeInterval(convertToMS(startTime),convertToMS(endTime));
		TimeInterval key2 = new TimeInterval(convertToMS(startTime),convertToMS(endTime));
		
		List<Pair<TimeInterval, Subtitle>> l = s.inRange(key1, key2);
		List<Subtitle> ll = new LinkedListWC<>();
		
		if(!l.empty()){
			l.findFirst();
			while(!l.last())
				ll.insert(l.retrieve().second);;
		}
		ll.insert(l.retrieve().second);;
		
		return ll;
	}

	public void shift(int offset) {
		
	}
	
	public static int convertToMS(Time t){
		
		return  (t.getHH() * 60 * 60 * 1000) +
				(t.getMM() * 60 * 1000) +
				(t.getSS() * 1000) +
				t.getMS();
	}

}
