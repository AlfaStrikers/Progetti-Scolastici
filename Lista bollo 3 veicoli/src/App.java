public class App {
    public static void main(String[]args){

        System.out.println("Lista Bolli di 3 veicoli");

        Automobile automobile = new Automobile(500);
        System.out.println("Bollo Automobile: " + automobile.getBolloAuto());

        Camion camion = new Camion(1000);
        System.out.println("Bollo Camion: " + camion.getBolloCamion());

        Bicicletta bicicletta = new Bicicletta(0);
        System.out.println("Bollo Bicicletta: " + bicicletta.getBolloBici());

    }
}
