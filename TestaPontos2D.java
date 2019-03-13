public class TestaPontos2D extends Ponto2D{
    public static void main(String[] args){
        Ponto2D coordenada0 = new Ponto2D();
        Ponto2D coordenada1 = new Ponto2D(1,1);
        System.out.println("Coordenada 0: (" + coordenada0.getCoordenadaX() + "," + coordenada0.getCoordenadaY() + ")");
        System.out.println("Coordenada 1: (" + coordenada1.getCoordenadaX() + "," + coordenada1.getCoordenadaY() + ")");
        System.out.println("Numero de instancias do tipo Ponto2D: " + Ponto2D.getContador());
    }
}
