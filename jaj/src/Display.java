import jaj.*;
class Display {
    char[][] cimaM = cima.getMatriz();
    char[][] baixoM = baixo.getMatriz();
    char[][] frenteM = frente.getMatriz();
    char[][] trasM = tras.getMatriz();
    char[][] esquerdaM = esquerda.getMatriz();
    char[][] direitaM = direita.getMatriz();

    // Face de cima
    for (int i = 0; i < 3; i++) {
        System.out.print("        ");
        for (int j = 0; j < 3; j++) {
            System.out.print(cimaM[i][j] + " ");
        }
        System.out.println();
    }

    // Faces laterais
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) System.out.print(esquerdaM[i][j] + " ");
        System.out.print("  ");
        for (int j = 0; j < 3; j++) System.out.print(frenteM[i][j] + " ");
        System.out.print("  ");
        for (int j = 0; j < 3; j++) System.out.print(direitaM[i][j] + " ");
        System.out.print("  ");
        for (int j = 0; j < 3; j++) System.out.print(trasM[i][j] + " ");
        System.out.println();
    }

    // Face de baixo
    for (int i = 0; i < 3; i++) {
        System.out.print("        ");
        for (int j = 0; j < 3; j++) {
            System.out.print(baixoM[i][j] + " ");
        }
        System.out.println();
    }

    System.out.println();
 }