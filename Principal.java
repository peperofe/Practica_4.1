import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca un número de usuarios que va a crear:");
        int cantidadUsuarios = scanner.nextInt();

        Usuario[] usuarios = new Usuario[cantidadUsuarios];

        for (int i = 0; i < cantidadUsuarios; i++) {
            System.out.println("Introduzca los datos del usuario " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("Apellidos: ");
            String apellidos = scanner.next();
            System.out.print("Email: ");
            String email = scanner.next();

            usuarios[i] = new Usuario(nombre, apellidos, email);
        }

        System.out.println("Usuarios creados:");
        for (Usuario usuario : usuarios) {
            System.out.println("Nombre: " + usuario.nombre);
            System.out.println("Apellidos: " + usuario.apellidos);
            System.out.println("Email: " + usuario.email);
            System.out.println();
        }
    }
}

class Usuario {
    public String nombre;
    public String apellidos;
    public String email;

    public Usuario() {
    }

    public Usuario(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }
}
