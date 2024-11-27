import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Process> processes = getProcesses();

    }


    public static ArrayList<Process> getProcesses() {
        ArrayList<Process> processes = new ArrayList<>();
        processes.add(new Process(1, 17, 0, 4, 4));
        processes.add(new Process(2, 6, 3, 9, 3));
        processes.add(new Process(3, 10, 4, 3, 5));
        processes.add(new Process(4, 4, 29, 8, 2));

        return processes;
    }
}