import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Pelicula> peliculas;

    public Catalogo(){
        this.peliculas = new ArrayList<Pelicula>();
    }

    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.add(pelicula);
    }

    /**
     * Metodo que regresa una cadena con la información de todas las peliculas
     * @return listaPeliculas
     */
    public String getPeliculas(){
        String listaPeliculas = ""; //cadena vacia
        for(int i = 0; i < peliculas.size(); i++){
            listaPeliculas = listaPeliculas + peliculas.get(i).getInformacion() + "\n";
        }
        return listaPeliculas;

    }

    public void buscarPeliculaPorTitulo(String titulo){
        boolean peliculaEncontrada = false;
        for(int i = 0; i < peliculas.size(); i++){
            Pelicula pelicula = peliculas.get(i);
            if(pelicula.getTitulo().equals(titulo)){
                System.out.println(pelicula.getInformacion());
                peliculaEncontrada = true;
            }
        }
        if (!peliculaEncontrada) {
            System.out.println("La pelicula no fue encontrada.");
        }

    }

    public String toString(){
        return "Catalogo de peliculas.\n" + "Cantidad actual de peliculas: " + peliculas.size() + "\n" + getPeliculas();
    }

}
