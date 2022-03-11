public class Circulo {
    private int x, y;
    private double raio;

    public Circulo(double raio, int x, int y) throws RaioNotPositiveException {
        if (raio <= 0.0) {
            throw new RaioNotPositiveException();
        } else {
            this.raio = raio;
            setCentro(x, y);
        }
    }

    public void setCentro(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void aumentarRaio(int percent) {
        this.raio += percent * this.raio / 100;
    }

    public double getAreaCirculo() {
        double raioAoQuadrado = Math.pow(this.raio, 2);
        return raioAoQuadrado * Math.PI;
    }

    public double getComprimentoCircunferencia() {
        return Math.PI * getDiametro();
    }

    private double getDiametro() {
        return this.raio * 2;
    }

    public int getX() {
        return x;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }
}
