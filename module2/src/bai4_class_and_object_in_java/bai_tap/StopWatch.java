package bai4_class_and_object_in_java.bai_tap;

public class StopWatch {
    private long starTime;
    private long endTime;

    public StopWatch() {
    }

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {

        return endTime;
    }

    public StopWatch(long starTime, long endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }
    public void StarTime() {
        starTime = System.currentTimeMillis();
    }
    public  void EndTime() {
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return  endTime - starTime;
    }

}