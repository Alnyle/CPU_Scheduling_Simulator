import java.util.ArrayList;

public class Scheduler {

    ArrayList<Process> processes;

    int completionTime;

    int currentTime;

    int totalBurstTime;

    float avgWaitingTime;
    float avgTurnAround;

    int totalWaitingTime;

    int totalTurnAround;

    public float getAvgWaitingTime() {
        return avgWaitingTime;
    }

    public void setAvgWaitingTime(float avgWaitingTime) {
        this.avgWaitingTime = avgWaitingTime;
    }

    public float getAvgTurnAround() {
        return avgTurnAround;
    }

    public void setAvgTurnAround(float avgTurnAround) {
        this.avgTurnAround = avgTurnAround;
    }

    public int getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(int completionTime) {
        this.completionTime = completionTime;
    }

    public int getTotalTurnAround() {
        return totalTurnAround;
    }

    public void setTotalTurnAround(int totalTurnAround) {
        this.totalTurnAround = totalTurnAround;
    }

    public int getTotalBurstTime() {
        return totalBurstTime;
    }

    public void setTotalBurstTime(int totalBurstTime) {
        this.totalBurstTime = totalBurstTime;
    }

    public int getTotalWaitingTime() {
        return totalWaitingTime;
    }

    public void setTotalWaitingTime(int totalWaitingTime) {
        this.totalWaitingTime = totalWaitingTime;
    }

    public Scheduler(ArrayList<Process> processes) {
        this.processes = processes;
        avgTurnAround = 0;
        avgWaitingTime = 0;
        totalBurstTime = 0;
        completionTime = 0;
        totalWaitingTime = 0;
        totalTurnAround = 0;
        currentTime = 0;
    }
}
