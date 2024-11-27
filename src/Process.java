public class Process {

    int processId;
    int BurstTime;
    int arrivalTime;
    int Priority;
    int Quantum;

    public Process(int processId, int burstTime, int arrivalTime, int priority, int quantum) {
        this.processId = processId;
        BurstTime = burstTime;
        this.arrivalTime = arrivalTime;
        Priority = priority;
        Quantum = quantum;
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
