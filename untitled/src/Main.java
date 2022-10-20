import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BrakingDistanceCalculator brakingDistanceCalculator = new BrakingDistanceCalculator();
        double S = 0;
        System.out.println("Enter speed: ");
        int carSpeed = in.nextInt();
        System.out.println("Enter Condotion\n(1) - Dry\n(2) - Wet\n  ");
        int roadCondotion = in.nextInt();
        if(roadCondotion == 1){
            System.out.println("Choose TypeofRoad");
            System.out.println("1. Asphalt, concrete");
            System.out.println("2. Sand road");
            System.out.println("3. Macadam");
            System.out.println("4. Dirt road");
            System.out.println("5. Cobblestone and paving stones");
            System.out.println("Enter:");
            int typeOfRoadSurface = in.nextInt();
            S = brakingDistanceCalculator.brakingDistanceCalculator(carSpeed, 1, typeOfRoadSurface);
        }
        if(roadCondotion == 2){
            System.out.println("Choose TypeofRoad");
            System.out.println("1. Asphalt, concrete");
            System.out.println("2. Sand road");
            System.out.println("3. Macadam");
            System.out.println("4. Dirt road");
            System.out.println("5. Cobblestone and paving stones");
            System.out.println("6. Snow covered road");
            System.out.println("7. Ice-crusted ground\n");
            System.out.println("Enter:");
            int typeOfRoadSurface = in.nextInt();
            S = brakingDistanceCalculator.brakingDistanceCalculator(carSpeed, 1, typeOfRoadSurface);
        }
        System.out.println(S);
    }
}