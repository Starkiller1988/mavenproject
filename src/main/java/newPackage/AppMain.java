package newPackage;

public class AppMain {
    public static void main(String[] args){
        double roundOne = 34.347996492;
        double roundDbl = Math.round(roundOne*100.0)/100.0;
        System.out.println(roundDbl);
    }
}
