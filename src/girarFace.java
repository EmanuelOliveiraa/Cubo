public class girarFace {
public  static class Face {
  private char[][] matriz;

  public Face(char cor) {
      matriz = new char[3][3];
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              matriz[i][j] = cor;
          }
      }
  }

  public char[][] getMatriz() {
      return matriz;
  }

  // Gira a face no sentido horário
  public void girarHorario() {
      char[][] nova = new char[3][3];
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              nova[j][2 - i] = matriz[i][j];
          }
      }
      matriz = nova;
  }

  // Gira a face no sentido anti-horário
  public void girarAntiHorario() {
      char[][] nova = new char[3][3];
      for (int i = 0; i < 3; i++) {
          for (int j = 0; j < 3; j++) {
              nova[2 - j][i] = matriz[i][j];
          }
      }
      matriz = nova;
  }
}

  public static class CuboMagico {
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

  // Exibir o cubo (mesma lógica que você já tinha no display())
  public void exibir() {
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
  public void moverFa() {
      frente.girarAntiHorario();

      // Manipular as bordas das faces adjacentes
      char[] temp = new char[3];

      char[][] cimaM = cima.getMatriz();
      char[][] baixoM = baixo.getMatriz();
      char[][] esquerdaM = esquerda.getMatriz();
      char[][] direitaM = direita.getMatriz();

      // Salvar linha inferior da face de cima
      for (int i = 0; i < 3; i++) {
          temp[i] = cimaM[2][i];
      }

      // cima ← esquerda (coluna direita invertida)
      for (int i = 0; i < 3; i++) {
          cimaM[2][i] = direitaM[2 - i][0];
      }

      // esquerda ← baixo (linha superior)
      for (int i = 0; i < 3; i++) {
          direitaM[i][0] = baixoM[0][i];
      }

      // baixo ← direita (coluna esquerda invertida)
      for (int i = 0; i < 3; i++) {
          baixoM[0][i] = esquerdaM[2 - i][2];
      }

      // direita ← temp (linha salva da cima)
      for (int i = 0; i < 3; i++) {
          esquerdaM[i][2] = temp[i];
      }
  }

  // Exemplo de movimento: girar a face da frente no sentido horário
  public void moverF() {
      frente.girarHorario();

      // Manipular as bordas das faces adjacentes
      char[] temp = new char[3];

      char[][] cimaM = cima.getMatriz();
      char[][] baixoM = baixo.getMatriz();
      char[][] esquerdaM = esquerda.getMatriz();
      char[][] direitaM = direita.getMatriz();

      // Salvar linha inferior da face de cima
      for (int i = 0; i < 3; i++) {
          temp[i] = cimaM[2][i];
      }

      // cima ← esquerda (coluna direita invertida)
      for (int i = 0; i < 3; i++) {
          cimaM[2][i] = esquerdaM[2 - i][2];
      }

      // esquerda ← baixo (linha superior)
      for (int i = 0; i < 3; i++) {
          esquerdaM[i][2] = baixoM[0][i];
      }

      // baixo ← direita (coluna esquerda invertida)
      for (int i = 0; i < 3; i++) {
          baixoM[0][i] = direitaM[2 - i][0];
      }

      // direita ← temp (linha salva da cima)
      for (int i = 0; i < 3; i++) {
          direitaM[i][0] = temp[i];
      }
  }

   public void moverD() {
      direita.girarHorario();

      // Manipular as bordas das faces adjacentes
      char[] temp = new char[3];

      char[][] cimaM = cima.getMatriz();
      char[][] baixoM = baixo.getMatriz();
      char[][] frenteM = frente.getMatriz();
      char[][] trasM = tras.getMatriz();

      // Salvar linha inferior da face de cima
      for (int i = 0; i < 3; i++) {
          temp[i] = cimaM[i][2];
      }

      // cima ← esquerda (coluna direita invertida)
      for (int i = 0; i < 3; i++) {
          cimaM[i][2] = frenteM[i][2];
      }

      // esquerda ← baixo (linha superior)
      for (int i = 0; i < 3; i++) {
          frenteM[i][2] = baixoM[i][2];
      }

      // baixo ← direita (coluna esquerda invertida)
      for (int i = 0; i < 3; i++) {
          baixoM[2 - i][2] = trasM[i][0];
      }

      // direita ← temp (linha salva da cima)
      for (int i = 0; i < 3; i++) {
          trasM[i][0] = temp[i];
      }
  }


  // Implementar moverFi(), moverU(), moverUi(), etc...
}


  public static void main(String[] args) {
      CuboMagico cubo = new CuboMagico();
      
      cubo.exibir();
      
      cubo.moverD();
    cubo.exibir();
    cubo.moverD();
    cubo.exibir();

      cubo.moverD();// Faz um movimento na frente
      
      cubo.exibir();
  }
}
