
public class SubtitleSeqT<K extends Comparable<K>, T> implements SubtitleSeq {
	
	private SortedBST<K, T> sbst;
	
	public SubtitleSeqT(){
		sbst = new SortedBST<>();
	}

	public void addSubtitle(Subtitle st) {
		sbst.insert(, st);
	}

	public List<Subtitle> getSubtitles() {
		return null;
	}

	public Subtitle getSubtitle(Time time) {
		return null;
	}

	public int nbNodesInSearchPath(Time time) {
		return 0;
	}

	public List<Subtitle> getSubtitles(Time startTime, Time endTime) {
		return null;
	}

	public void shift(int offset) {
		
	}

}
