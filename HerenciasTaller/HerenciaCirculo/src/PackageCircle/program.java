package PackageCircle;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Ingrese el radio del círculo:");
        double radius1 = scanner.nextDouble();
        scanner.nextLine();  
        
        System.out.println("Ingrese el color del círculo:");
        String color1 = scanner.nextLine();
        
        Circle circle = new Circle(radius1, color1);
        System.out.println("El círculo ha sido creado. Área: " + circle.getArea());
        
        System.out.println("Ingrese la altura del cilindro:");
        double height2 = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.println("Ingrese el color del cilindro:");
        String color2 = scanner.nextLine();
        
        System.out.println("Ingrese el radio del cilindro:");
        double radius2 = scanner.nextDouble();
        
        Cylinder cylinder1 = new Cylinder(radius2, height2, color2);
        System.out.println("El cilindro ha sido creado. Volumen: " + cylinder1.getVolume());
    }

}
