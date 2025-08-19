package jaj.src;
class Face {
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
  