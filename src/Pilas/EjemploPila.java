package Pilas;

import java.util.Stack;

public class EjemploPila {
    public static void main(String[] args) {
        Stack<String> historial = new Stack<>();
        historial.push("google.com");
        historial.push("github.com");
        historial.push("stackoverflow.com");
        System.out.println("Página actual: " + historial.peek());
        String paginaEliminada = historial.pop();
        System.out.println("Página retirada: " + paginaEliminada);
        System.out.println("Página anterior: " + historial.peek());
        System.out.println("Elementos: " + historial.size());
        System.out.println("¿Está vacía?: " + historial.empty());
    }
}