import java.util.Comparator;

public class Process {

    int processId;
    int BurstTime;
    int arrivalTime;
    int Priority;
    int Quantum;


    int waitingTime;
    int turnAround;

    int completionTime;

    public int getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(int completionTime) {
        this.completionTime = completionTime;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {
        this.waitingTime = waitingTime;
    }

    public int getTurnAround() {
        return turnAround;
    }

    public void setTurnAround(int turnAround) {
        this.turnAround = turnAround;
    }

    public Process(int processId, int burstTime, int arrivalTime, int priority, int quantum) {
        this.processId = processId;
        BurstTime = burstTime;
        this.arrivalTime = arrivalTime;
        Priority = priority;
        Quantum = quantum;
        waitingTime = 0;
        turnAround = 0;
        completionTime = 0;
    }

    public int getProcessId() {
        return processId;
    }

    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public int getBurstTime() {
        return BurstTime;
    }

    public void setBurstTime(int burstTime) {
        BurstTime = burstTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int priority) {
        Priority = priority;
    }

    public int getQuantum() {
        return Quantum;
    }

    public void setQuantum(int quantum) {
        Quantum = quantum;
    }

}

class sortBasedPriority implements Comparator<Process> {
    public int compare(Process o1, Process o2) {
        return o1.getPriority() - o2.getPriority();
    }
}

class sortBasedArrivalTime implements Comparator<Process>  {

    @Override
    public int compare(Process o1, Process o2) {
        return o1.getArrivalTime() - o2.getArrivalTime();
    }
}


