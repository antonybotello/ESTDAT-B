import java.util.Scanner;

public class App {
    static Scanner teclado= new Scanner(System.in);
    static String[] estudiantes= new String[5];

    public static void main(String[] args) throws Exception {
        while (true) {
            arregloUnidimensional(); 
        }
    }

    public static void arregloUnidimensional(){
        System.out.println("Digite nombre ");
        String nombre= teclado.nextLine();
        System.out.println("Digite posición ");
        int posicion= teclado.nextInt();
        teclado.nextLine();
        agregarEstudiante(posicion, nombre);

        for (int i = 0; i < estudiantes.length; i++) {
             System.out.println(estudiantes[i]);
            
        }

    }

    public static void agregarEstudiante(int pos, String nombre){
        
        while (true) {
            if(estudiantes[pos]==null) {
                estudiantes[pos]= nombre;
                break;
            }else{
                pos++;
            }


        }
        

    }
}
