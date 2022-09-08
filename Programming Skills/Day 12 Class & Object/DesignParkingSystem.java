public class DesignParkingSystem{
    public static void main(String[] args) {
        ParkingSystem obj = new ParkingSystem(1, 1,0);
        boolean param_1 = obj.addCar(1);
        boolean param_2 = obj.addCar(2);
        boolean param_3 = obj.addCar(3);
        boolean param_4 = obj.addCar(1);
        System.out.println(obj);
        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
        System.out.println(param_4);
    }
}

class ParkingSystem {

    int[] cars;

    public ParkingSystem(int big, int medium, int small) {
        cars = new int[]{big,medium,small};
    }
    
    public boolean addCar(int carType) {
        return cars[carType - 1]-- > 0;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
