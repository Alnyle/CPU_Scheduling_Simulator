import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class PriorityScheduler extends Scheduler{


    public PriorityScheduler(ArrayList<Process> processes) {
        super(processes);
    }


    void schedule() {

        // sort processes based arrival time
        processes.sort(new sortBasedArrivalTime());

        // remove process from ready queue to CPU
        Process firstProcess = this.processes.removeFirst();

        // sort other process based on there Priority
        processes.sort(new sortBasedPriority());

        // calculate Completion for first process =
        completionTime = firstProcess.getBurstTime() + firstProcess.arrivalTime;

        // calculate Turn around for first process => Turn Around Time = Completion Time - Arrival Time
        int turnAround = completionTime - firstProcess.arrivalTime;


        // calculate waiting time for first process => Waiting Time = Turn Around Time - Burst Time
        int waitingTime = turnAround - firstProcess.getBurstTime();

        // increase total Turn Around time
        totalTurnAround += turnAround;

        // increase total waiting Time
        totalWaitingTime += turnAround;

        firstProcess.setWaitingTime(waitingTime);
        firstProcess.setTurnAround(turnAround);



        System.out.println("Processes" + "     Priority   " + "    ArrivalT Time     " +  "    BurstTime     " +  "     Turnaround Time   " + "    Waiting Time     ");
        System.out.println(firstProcess.getProcessId() + "                " + firstProcess.getPriority() + "        " + "       " + firstProcess.getArrivalTime() + "                " + "    " + firstProcess.getBurstTime() + "             " + "        " + firstProcess.getTurnAround() + "    " + "                " + firstProcess.getWaitingTime() + "    ");

//        for (Process process : processes) {
//            System.out.println(process.Priority);
//        }
    }
}
