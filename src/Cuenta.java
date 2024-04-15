public class Cuenta {

    // Atrubutos privados
    private String nombre;
    private double saldo;


    // Constructor
    public Cuenta (String nombre, double saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    // Getter para nombre
    public String getNombre() {

        return nombre;
    }

    // Setter para nombre
    public  void  setNombre(String nombre) {

        this.nombre = nombre;
            }
    //Getter para saldo
    public double getSaldo(){
        return saldo;
    }

    //Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public static void main(String [] args) {
        Cuenta miCuenta = new Cuenta("Juan Pérez ", 1000.00);
        miCuenta.depositar(500.00);
        System.out.println("Nombre de la cuenta: " + miCuenta.getNombre() + ", Saldo; " + miCuenta.getSaldo());
    }

}
