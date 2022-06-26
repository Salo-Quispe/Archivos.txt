import java.io.*;
public class principal {

    public static void main(String[] args) {
        final int MAX=10;
        documento pelis[] = new documento[MAX];
        leer(pelis);
    }

    public static void leer(documento pelis[]){
        int id = 0;
        try (BufferedReader br = new BufferedReader((new FileReader("C:\\Users\\wosun_hdy206c\\IdeaProjects\\tarea\\src\\archivo.txt")))){
            String nombre;
            String fecha;
            String genero;
            int cantidad;

            while ((nombre = br.readLine())!=null){
                fecha= br.readLine();
                cantidad= Integer.parseInt(br.readLine());
                genero= br.readLine();
                pelis[id] = new documento (nombre,fecha,cantidad,genero);
                pelis[id].toString(id);
                id++;
            }
        }catch (FileNotFoundException e){
            System.out.println("El archivo no existe o a cambiado de nombre");
            throw new RuntimeException(e);
        }catch (IOException e){
            System.out.println("¡¡ERROR!!");
            throw new RuntimeException(e);
        }
    }
}
