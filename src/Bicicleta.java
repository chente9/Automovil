public class Bicicleta {

    //Atributos
    int marcha;
    int velocidad;

// Constructor
    public Bicicleta (int marcha, int velocidad) {
        this.marcha = marcha;
        this.velocidad = velocidad;
            }
// Método para aumentar la velicidad
void acelerar (int incremento){
        velocidad += incremento;
}
    //Metodos para aplicar frenos
    void  aplicarFrenos(int decremento){
        velocidad -= decremento;
    }

    void imprimirEstado(){
        System.out.println("      Marcha " + marcha + "       Velocidad " + velocidad);
    }
    public static void main(String[]args){
        //Crear un objeto usando el constructor
        Bicicleta miBici = new Bicicleta(3, 30);

        // LLamar a método en el objeto
        miBici.acelerar(10);
        miBici.aplicarFrenos(5);
        miBici.imprimirEstado();   //Salida: Marcha: 3 Velicidad 35


    }
}
