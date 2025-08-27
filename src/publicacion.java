public class Publicacion {
    String titulo;
    String autor;

    public Publicacion (String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
}

public void mostrarFicha() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    }
}   