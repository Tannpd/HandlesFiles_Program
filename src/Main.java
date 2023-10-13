
import Controller.Manager;
public class Main {
    public static void main(String[] args) {
        String mChon[] = {"Find person info", "Copy Text to new file"};
        Manager manager = new Manager("Main Menu", mChon, "exit");
        manager.run();
    }
}
