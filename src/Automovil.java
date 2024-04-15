//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Automovil {

    // Atributos
    String marca;
    int año;
    double precio;

    //Constructor
    public Automovil(String marca, int año, double precio) {
        this.marca = marca;
        this.año = año;
        this. precio = precio;

    }
    //Método para arracncar el automovil
    void arrancar () {
        System.out.println("El automovil " + marca + " está arrancando.");
    }
    void monstrarInfo() {
        System.out.println("Marca: " + marca + ", Año; " + año + ", Precio: $" + precio );
    }

    public static void main(String[] args) {
        Automovil miAuto = new Automovil("Toyota", 2021, 30000);
        miAuto.arrancar();
        miAuto.monstrarInfo();



    }
}