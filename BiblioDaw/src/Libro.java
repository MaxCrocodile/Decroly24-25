public class Libro {
    private String isbn;
    private int edicion;
    private String autor;
    private String titulo;
    private String editorial;
    private int nPaginas;
    private Sting fechaPublication;
}

//Constructores 
public Libro(String titulo, String autor, String isbn, String fechaPublication,){
    this.titulo = titulo;
    this.autor = autor;
    this.isbn = isbn;
    this.fechaPublication = fechaPublication;
    this.nPaginas = 1;
    this.edicion = 1;
    this.editorial = editorial;
}