public class Libro extends Publicacion {
    private int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarFicha() {
        super.mostrarFicha();
        System.out.println("Número de páginas: " + numPaginas);
    }
}