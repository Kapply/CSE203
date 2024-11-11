public class Main {
    public static void main(String[] args) {

        Ship ship = new Ship(" TITANIC ", "1911");
        CruiseShip cruiseShip = new CruiseShip(" Dota", "2008", 5000);
        CargoShip cargoShip = new CargoShip(" LOL  ", "2010", 70000);

        Ship[] shiparray = new Ship[3];
        shiparray[0] = ship;
        shiparray[1] = cruiseShip;
        shiparray[2] = cargoShip;

        for (Ship Marine : shiparray) {
            System.out.println(Marine.toString());

        }
    }
}
