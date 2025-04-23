public class EjercicioPOO {
    
    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("No se han introducido argumentos.");
            return;
        }
        int suma = 0;
        int sumados = 0;

        for(int i = 0; i < args.length; i++){
            int numero = Integer.parseInt(args[i]);
            if(numero >= 0 && numero <= 10){
                suma += Integer.parseInt(args[i]);
                sumados++;
            }
        }
        System.out.println("El promedio de las notas es: " + (suma / sumados));
    }
}
