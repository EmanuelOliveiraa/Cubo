package jaj.src;


public class CuboMagico {
    private Face cima;
    private Face baixo;
    private Face frente;
    private Face tras;
    private Face esquerda;
    private Face direita;

    public CuboMagico() {
        cima = new Face('C');
        baixo = new Face('B');
        frente = new Face('F');
        tras = new Face('T');
        esquerda = new Face('E');
        direita = new Face('D');
  }
    public void exibir() {
        char[][] cimaM = cima.getMatriz();
        char[][] baixoM = baixo.getMatriz();
        char[][] frenteM = frente.getMatriz();
        char[][] trasM = tras.getMatriz();
        char[][] esquerdaM = esquerda.getMatriz();
        char[][] direitaM = direita.getMatriz();

    for (int i = 0; i < 3; i++) {
        System.out.print("        ");
        for (int j = 0; j < 3; j++) {
            System.out.print(cimaM[i][j] + " ");
        }
        System.out.println();
    }

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

    for (int i = 0; i < 3; i++) {
        System.out.print("        ");
        for (int j = 0; j < 3; j++) {
            System.out.print(baixoM[i][j] + " ");
        }
        System.out.println();
    }

    System.out.println();
 }

  
    public void moverFa() {
        frente.girarAntiHorario();

        char[] temp = new char[3];

        char[][] cimaM = cima.getMatriz();
        char[][] baixoM = baixo.getMatriz();
        char[][] esquerdaM = esquerda.getMatriz();
        char[][] direitaM = direita.getMatriz();

        for (int i = 0; i < 3; i++) {
            temp[i] = cimaM[2][i];
        }

        for (int i = 0; i < 3; i++) {
            cimaM[2][2 - i] = direitaM[2 - i][0];
        }

        for (int i = 0; i < 3; i++) {
            direitaM[i][0] = baixoM[0][i];
        }

        for (int i = 0; i < 3; i++) {
            baixoM[0][2 - i] = esquerdaM[2 - i][2];
        }

        for (int i = 0; i < 3; i++) {
            esquerdaM[i][2] = temp[i];
        }
    }

    public void moverF() {
        frente.girarHorario();

        char[] temp = new char[3];

        char[][] cimaM = cima.getMatriz();
        char[][] baixoM = baixo.getMatriz();
        char[][] esquerdaM = esquerda.getMatriz();
        char[][] direitaM = direita.getMatriz();

        for (int i = 0; i < 3; i++) {
            temp[i] = cimaM[2][i];
        }

        for (int i = 0; i < 3; i++) {
            cimaM[2][i] = esquerdaM[2 - i][2];
        }

        for (int i = 0; i < 3; i++) {
            esquerdaM[i][2] = baixoM[0][i];
        }

        for (int i = 0; i < 3; i++) {
            baixoM[0][i] = direitaM[2 - i][0];
        }

        for (int i = 0; i < 3; i++) {
            direitaM[i][0] = temp[i];
        }
    }

    public void moverD() {
        direita.girarHorario();

        char[] temp = new char[3];

        char[][] cimaM = cima.getMatriz();
        char[][] baixoM = baixo.getMatriz();
        char[][] frenteM = frente.getMatriz();
        char[][] trasM = tras.getMatriz();

        for (int i = 0; i < 3; i++) {
            temp[i] = cimaM[i][2];
        }

        for (int i = 0; i < 3; i++) {
            cimaM[i][2] = frenteM[i][2];
        }

        for (int i = 0; i < 3; i++) {
            frenteM[i][2] = baixoM[i][2];
        }

        for (int i = 0; i < 3; i++) {
            baixoM[2 - i][2] = trasM[i][0];
        }

        for (int i = 0; i < 3; i++) {
            trasM[i][0] = temp[i];
        }
    }
    public void moverDa() {
        direita.girarAntiHorario();

        char[] temp = new char[3];

        char[][] cimaM = cima.getMatriz();
        char[][] baixoM = baixo.getMatriz();
        char[][] frenteM = frente.getMatriz();
        char[][] trasM = tras.getMatriz();

        for (int i = 0; i < 3; i++) {
            temp[i] = cimaM[i][2];
        }

        for (int i = 0; i < 3; i++) {
            cimaM[i][2] = trasM[i][0];
        }

        for (int i = 0; i < 3; i++) {
            trasM[i][0] = baixoM[2 - i][2];
        }

        for (int i = 0; i < 3; i++) {
            baixoM[i][2] = frenteM[i][2];
        }

        for (int i = 0; i < 3; i++) {
            frenteM[i][2] = temp[i];
        }
    }


}


