public class Decisiones {

    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnELPlan = true;
        double notaDeLaPelícula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas más populares");
        } else {
            System.out.println("Peliculas retro que aún vale la pena ver");
        }

        if (incluidoEnELPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para su plan actual");
        }


    }
}
