//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Catalogo catalogo = new Catalogo();

        // Creaacion de 3 objetos pelicula
        Pelicula pelicula1 = new Pelicula("Iron Man", "Jon favreau", 2008, "Acción", 126);
        Pelicula pelicula2 = new Pelicula("Spider-Man", "Sam Raimi", 2002, "Acción", 121);
        Pelicula pelicula3 = new Pelicula("Doctor Strange: Hechicero supremo", "Scott Derrickson", 2016, "Superhéroes", 115);

        // Añadiendolos a un objeto catalogo
        catalogo.agregarPelicula(pelicula1);
        catalogo.agregarPelicula(pelicula2);
        catalogo.agregarPelicula(pelicula3);

        // Utilizando getPeliculas() para mostrar toda la informacion
        System.out.println("Lista del catálogo");
        System.out.println(catalogo.getPeliculas());

        // Buscar pelicula con el metodo buscarPeliculaPorTitulo()
        System.out.println("\nResultado de la búsqueda");
        catalogo.buscarPeliculaPorTitulo("Iron Man");
    }
}
