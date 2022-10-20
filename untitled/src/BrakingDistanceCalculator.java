import java.util.Scanner;

public class BrakingDistanceCalculator {
    double S;

    public double brakingDistanceCalculator(int Speed, int Condotion, int TypeOfRoad) {
        if (Condotion == 1) {
            switch (TypeOfRoad) {
                case 1:
                    S = (1 * (Speed * Speed)) / (254 * 0.75);
                    break;
                case 2:
                    S = (1 * (Speed * Speed)) / (254 * 0.75);
                    break;
                case 3:
                    S = (1 * (Speed * Speed)) / (254 * 0.65);
                    break;
                case 4:
                    S = (1 * (Speed * Speed)) / (254 * 0.55);
                    break;
                case 5:
                    S = (1 * (Speed * Speed)) / (254 * 0.5);
                    break;
            }
        }
        if(Condotion == 2){
            switch (TypeOfRoad){
                case 1:
                    S = (1 * (Speed * Speed)) / (254 * 0.50);
                    break;
                case 2:
                    S = (1 * (Speed * Speed)) / (254 * 0.60);
                    break;
                case 3:
                    S = (1 * (Speed * Speed)) / (254 * 0.45);
                    break;
                case 4:
                    S = (1 * (Speed * Speed)) / (254 * 0.45);
                    break;
                case 5:
                    S = (1 * (Speed * Speed)) / (254 * 0.3);
                    break;
                case 6:
                    S = (1 * (Speed * Speed)) / (254 * 0.2);
                    break;
                case 7:
                    S = (1 * (Speed * Speed)) / (254 * 0.2);
                    break;
            }
        }
        return S;
    }
}
