public class App {
    public static void main(String[] args) throws Exception {
        try {
            Circulo circulo = new Circulo(6.0, 1, 1);
            circulo.aumentarRaio(50);
            System.out.printf("Posição: (%d, %d)\n", circulo.getX(), circulo.getY());
            System.out.println("Raio: " + circulo.getRaio());
            System.out.println("Compri. da Circunferência: " + circulo.getComprimentoCircunferencia());
            circulo.setCentro(3, 10);
            System.out.printf("Nova Posição: (%d, %d)\n", circulo.getX(), circulo.getY());
            System.out.println("Área do Círculo: " + circulo.getAreaCirculo());
        } catch (RaioNotPositiveException e) {
            System.out.println(e.getMessage());
        }
    }
}
