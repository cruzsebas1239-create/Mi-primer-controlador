package model;

import controller.GamerController;

public class Main {
    public static void main(String[] args) {
        GamerController controller = new GamerController();

        System.out.println("--- Lista inicial de jugadores ---");
        for (Gamer g : controller.getGamerList()) {
            System.out.println(g);
        }

        // Probando buscar un usuario por ID
        System.out.println("\n--- Buscando jugador con ID 2 ---");
        Gamer encontrado = controller.searchGamer(2);
        System.out.println(encontrado);
    }
}
