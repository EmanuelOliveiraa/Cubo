import jaj.*;


class Main {
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
