import java.util.Scanner;

public class trapecio {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        float ultimoValor;
        float primerValor;
        int valor;
        double[] valores;
        System.out.println("ingrese primer valor de la funcion");
        primerValor = dato.nextFloat();
        System.out.println("ingrese ultimo valor de la funcion");
        ultimoValor = dato.nextFloat();
        System.out.println("ingrese cantidad de valores a cargar en el arreglo");
        valor = dato.nextInt();
        valores = new double[valor];
        for(int i=0; i < valores.length;i++) {
            System.out.println("ingrese valor de la tabla " + (i + 1));
            valores[i] =  dato.nextDouble();
        }
        for(int i=0; i < valores.length;i++) {
            System.out.println(valores[i]);
        }

        float h = (ultimoValor - primerValor) / valor;
        double integral = (h/2) * (valores[0] + valores[valores.length -1] + 2*(sumatoria(valores)));
        System.out.println("valor de la integral: " + integral);
    }
    
    public static double sumatoria(double[] tabla) {
        double sumatoria = 0;
        for (int i=0; i < tabla.length - 1; i++) {
            sumatoria += tabla[i+1];
        }
        return sumatoria;
    }
}
