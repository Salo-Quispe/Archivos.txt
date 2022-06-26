public class documento {
    private String nombre;
    private String fecha;
    private int cantidad;
    private String genero;

    public documento(String nombre, String fecha, int cantidad, String genero) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void toString (int pelis){
        System.out.println("           |PELICULA "+(pelis+1)+"|   ");
        System.out.println("Pelicula: "+nombre+"\nTiempo de emision: "+fecha+"\nCantidad de peliculas: "+cantidad+"\nGenero: "+genero);
    }
}
