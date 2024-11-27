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
        currentTime += completionTime;

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


        printTableInfo();
        printProcess(firstProcess);



        while (!processes.isEmpty()) {


            int MinArrivalTime = processes.getFirst().getArrivalTime();
            Process currentProcess = null;

            ArrayList<Process> readyQueue = new ArrayList<>();
            for (Process process: processes) {
                // process don't arrived yet to ready queue
                if (currentTime < process.getArrivalTime()) {
                    MinArrivalTime = Math.min(MinArrivalTime, process.getArrivalTime());
                    continue;
                } else {
                    // get the process with the highest priority process if there process or more arrived to ready queue
                    currentProcess = process;
                    break;
                }
            }


            if (currentProcess != null) {
                processes.sort(new sortBasedPriority());
//                completionTime += currentProcess.getBurstTime();
                currentTime += currentProcess.getBurstTime();
                // calculate Turn around for first process => Turn Around Time = Completion Time - Arrival Time
                turnAround = currentTime - currentProcess.arrivalTime;


                // calculate waiting time for first process => Waiting Time = Turn Around Time - Burst Time
                waitingTime = turnAround - currentProcess.getBurstTime();

                // increase total Turn Around time
                totalTurnAround += turnAround;

                // increase total waiting Time
                totalWaitingTime += turnAround;

                currentProcess.setWaitingTime(waitingTime);
                currentProcess.setTurnAround(turnAround);


                printProcess(currentProcess);

                // remove process from CPU after finishing
                processes.remove(currentProcess);
                // sort other process based on there Priority

            } else {
                currentTime = MinArrivalTime;
                continue;
            }

        }
    }

    void printTableInfo() {
        System.out.println("Processes" + "     Priority   " + "    ArrivalT Time     " +  "    BurstTime     " +  "     Turnaround Time   " + "    Waiting Time     ");
    }

    void printProcess(Process process) {
        System.out.println(process.getProcessId() + "                " + process.getPriority() + "        " + "       " + process.getArrivalTime() + "                " + "    " + process.getBurstTime() + "             " + "        " + process.getTurnAround() + "    " + "                " + process.getWaitingTime() + "    ");

    }
}
