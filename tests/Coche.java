public class Coche {
    public int velocidad;

    public void acelerar_CarlosBlascoEspada(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_CarlosBlascoEspada(int deceleracion) {
        velocidad -= deceleracion;
        if (velocidad <0) velocidad = 0;
    }
}
