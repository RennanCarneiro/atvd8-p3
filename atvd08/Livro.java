package atvd08;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        if(anoPublicacao > 0)
        this.anoPublicacao = anoPublicacao;
        else
        System.out.println("data inválida");
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    

    
}
