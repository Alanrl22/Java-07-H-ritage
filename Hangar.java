public class Hangar { 


    public static void main(String args[]) {
        Car punto = new Car("Punto");
        Boat penduick = new Boat("Penduick");

        System.out.println(punto.doStuff());
        System.out.println(penduick.doStuff());
    }
}