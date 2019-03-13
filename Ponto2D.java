public class Ponto2D{
    private int coordenadaX;
    private int coordenadaY;
    private static int contador = 0;

    public Ponto2D(){
        coordenadaX = 0;
        coordenadaY = 0;
        contador++;
    }
    
    public Ponto2D(int coordenadaX1,int coordenadaY1){
        this.coordenadaX = coordenadaX1;
        this.coordenadaY = coordenadaY1;
        contador++;
    }
    
    public double getCoordenadaX(){
        return coordenadaX;
    }
    
    public double getCoordenadaY(){
        return coordenadaY;
    }
    
    public static int getContador(){
        return contador;
    }
}
