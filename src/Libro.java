public class Libro {

    // Atributos
    String titulo;
    String autor;
    int ISBN;
    double precio;

    // Constructor sin parametro (eliminado o modificado)
    public Libro() {

    }

    // Constructor con parametro
    public Libro(String titulo, String autor, int ISBN, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
    }

    // Métodos
    public void mostrarDetalles() {
        System.out.println("Estos son los detalles de mi libro: Título:" + titulo + ", Autor: " + autor + ", IBSN: " + ISBN + ", Precios: " + precio);
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio += nuevoPrecio;
    }

    public static void main(String[] args) {
        // Crear un objeto usando constructor con parametro
        Libro miLibro1 = new Libro("Astronomia", "Micheel Jordan", 455454654, 79.5);
        miLibro1.mostrarDetalles();
        // Crear un objeto usando constructor con parametro
        Libro miLibro2 = new Libro("La luna", "Juan Pérez", 45678585, 154.8);
        miLibro2.mostrarDetalles();
        miLibro2.actualizarPrecio(39.8);
    }
}
