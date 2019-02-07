package app;

public class AlgorithmTimer {
    private long startTime;
    private long endTime;

    public void start(){
        startTime = System.currentTimeMillis();
    }

    public void end(){
        endTime = System.currentTimeMillis();
    }

    public String benchmarkResults(){
        return (endTime - startTime)/1000.0 + "s";
    }
}
