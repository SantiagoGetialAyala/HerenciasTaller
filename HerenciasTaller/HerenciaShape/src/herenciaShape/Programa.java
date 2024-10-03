package herenciaShape;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo: ");
        double circleRadius = scanner.nextDouble();
        System.out.print("Ingrese el color del círculo: ");
        String circleColor = scanner.next();
        
        Circle circle = new Circle(circleRadius, circleColor, true);
        System.out.println(circle);
        System.out.println("Área del círculo: " + circle.getArea());
        System.out.println("Perímetro del círculo: " + circle.getPerimeter());

        System.out.print("\nIngrese el ancho del rectángulo: ");
        double rectangleWidth = scanner.nextDouble();
        System.out.print("Ingrese la longitud del rectángulo: ");
        double rectangleLength = scanner.nextDouble();
        System.out.print("Ingrese el color del rectángulo: ");
        String rectangleColor = scanner.next();
        
        Rectangle rectangle = new Rectangle(rectangleWidth, rectangleLength, rectangleColor, true);
        System.out.println(rectangle);
        System.out.println("Área del rectángulo: " + rectangle.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangle.getPerimeter());

        System.out.print("\nIngrese el lado del cuadrado: ");
        double squareSide = scanner.nextDouble();
        System.out.print("Ingrese el color del cuadrado: ");
        String squareColor = scanner.next();
        
        Square square = new Square(squareSide, squareColor, true);
        System.out.println(square);
        System.out.println("Área del cuadrado: " + square.getArea());
        System.out.println("Perímetro del cuadrado: " + square.getPerimeter());

        scanner.close();
    }
}
