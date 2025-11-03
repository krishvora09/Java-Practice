public class Main {
    public static void main(String[] args) {

//        Movie theMovie = new Adventure("Star Wars");
//        theMovie.watchMovie();

        Movie theMovie = Movie.getMovie("Adventure", "Star Wars");
        theMovie.watchMovie();
    }
}
