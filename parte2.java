abstract class Figura {
    abstract double calcularArea();
}

interface Dibujable {
    void dibujar();
}

class Circulo extends Figura implements Dibujable {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo de radio " + radio);
    }
}

class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    double calcularArea() {
        return ancho * alto;
    }
}

class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }
}

public class parte2{
    public static void main(String[] args) {
       
        Figura[] figuras = {
            new Circulo(5.0),
            new Rectangulo(4.0, 6.0),
            new Triangulo(3.0, 4.0)
        };

        for (int i = 0; i < figuras.length; i++) {
            Figura f = figuras[i];
            System.out.println("Área de la figura " + (i + 1) + ": " + f.calcularArea());
        }

        Dibujable circuloDibujable = new Circulo(5.0);
        circuloDibujable.dibujar();
    }

}
