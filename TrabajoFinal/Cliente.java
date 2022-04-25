package TrabajoFinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    Scanner sc =  new Scanner(System.in);

    // Declarando variables
    String nombre;
    String dni;
    String password;

    // Inicializamos el metodo contructor
    public Cliente(String nombre , String dni, String password){
        this.nombre = nombre;
        this.dni = dni;
        this.password = password;
    }
}