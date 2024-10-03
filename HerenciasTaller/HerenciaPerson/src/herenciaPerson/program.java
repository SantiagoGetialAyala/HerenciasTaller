package herenciaPerson;

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String personName = scanner.nextLine();
        
        System.out.println("Ingrese la dirección de la persona:");
        String personAddress = scanner.nextLine();

        Person person = new Person(personName, personAddress);
        System.out.println("Datos de la persona: " + person.toString());

        System.out.println("\nIngrese el nombre del estudiante:");
        String studentName = scanner.nextLine();
        
        System.out.println("Ingrese la dirección del estudiante:");
        String studentAddress = scanner.nextLine();
        
        System.out.println("Ingrese el programa del estudiante:");
        String programa = scanner.nextLine();
        
        System.out.println("Ingrese el año del estudiante:");
        int year = scanner.nextInt();
        
        System.out.println("Ingrese la tarifa de inscripción del estudiante:");
        double feet = scanner.nextDouble();
        scanner.nextLine();

        Student student = new Student(studentName, studentAddress, programa, year, feet);
        System.out.println("Datos del estudiante: " + student.toString());

        System.out.println("\nIngrese el nombre del personal:");
        String staffName = scanner.nextLine();
        
        System.out.println("Ingrese la dirección del personal:");
        String staffAddress = scanner.nextLine();
        
        System.out.println("Ingrese la escuela del personal:");
        String school = scanner.nextLine();
        
        System.out.println("Ingrese el salario del personal:");
        double pay = scanner.nextDouble();

        Staff staff = new Staff(staffName, staffAddress, school, pay);
        System.out.println("Datos del personal: " + staff.toString());

    }
}
