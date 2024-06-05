 public class WatchMovie {
    public static void main(String[] args) {
        double ticketPrice = 12.0; // Preço do ingresso
        int movieRating = 5; // Classificação do filme

        // Condições para decidir se você está interessado em assistir o filme
        if (ticketPrice >= 12.0 && movieRating == 5) {
            System.out.println("Estou interessado em assistir o filme.");
        } else {
            System.out.println("Nao estou interessado em assistir o filme.");
        }
    }
}