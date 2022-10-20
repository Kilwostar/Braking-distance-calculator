import java.util.Scanner;

public class brakingDistance {
    int brakingFactor = 1;
    double s;

    public double brakingDistance(int Speed, int Condotion, int TypeOfRoad) {
        if (Condotion == 1) {
            switch (TypeOfRoad) {
                case 1:
                    s = (brakingFactor * (Speed * Speed)) / (254 * 0.75);
                    break;
                case 2:
                    s = (brakingFactor * (Speed * Speed)) / (254 * 0.75);
                    break;
                case 3:
                    s = (brakingFactor * (Speed * Speed)) / (254 * 0.65);
                    break;
                case 4:
                    s = (brakingFactor * (Speed * Speed)) / (254 * 0.55);
                    break;
                case 5:
                    s = (brakingFactor * (Speed * Speed)) / (254 * 0.5);
                    break;
            }
        }
        return 0;
    }
}