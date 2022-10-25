import Decorator.Decomain;
import FactoryPattern.Dish;
import FactoryPattern.PastaMammaMiaApp;
import Observer.ObserverPatternTest;
import Singleton.UISetting;

import java.util.Scanner;

public class ApplicationsUI {
    Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("\nCookid initializing....");
        System.out.println("Welcome!");
        whileStatement:
        while (true){
            System.out.println("\nApp list:");
            System.out.println("1. PastaMammaMia Application");
            System.out.println("2. Settings-My IMEI");
            System.out.println("3. Decorate Christmas Tree!");
            System.out.println("4. Moodle");
            System.out.println("5. ********");
            System.out.println("0. Turn off device");

            System.out.print("\nEnter option (1-5): ");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    PastaMammaMiaApp pastaMammaMiaApp = new PastaMammaMiaApp();
                    pastaMammaMiaApp.start();
                    break;
                case 2:
                    UISetting uiSetting = new UISetting();
                    uiSetting.start();
                case 3:
                    Decomain deco=new Decomain();
                    deco.start();
                    break;
                case 4:
                    ObserverPatternTest observer=new ObserverPatternTest();
                    observer.beginnnn();
                    break;
                case 5:
                    System.out.println("App does not exists!");
                    break;
                case 0:
                    System.out.println("\nCookid shutdown....");
                    break whileStatement;
                default:
                    System.out.println("\nPlease, enter valid number or app does not exists");
                    break;
            }
            System.out.println("\n*************************");
        }
    }
}
