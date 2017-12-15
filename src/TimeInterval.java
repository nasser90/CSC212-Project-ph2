public class TimeInterval implements Comparable<TimeInterval> {
	
	private Integer startTime;
	private Integer endTime;
	
	
	
	
	public TimeInterval(Integer startTime, Integer endTime) {
		super();
		this.startTime = startTime;
		this.endTime = endTime;
	}

	@Override
	public int compareTo(TimeInterval that) {
		if (startTime.compareTo(that.endTime) > 0) {
			return 1;
		}
		if (endTime.compareTo(that.startTime) < 0) {
			return -1;
		}
		return 0;
	}

	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}
	
	
}
