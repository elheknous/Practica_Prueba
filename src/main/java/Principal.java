public class Principal {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("La suma total es de: "+ suma(a,b));
        System.out.println("El producto es de: "+multiplicar(a,b));
        System.out.println("Hasta pronto, gracia por participar :D");
        System.out.println("######################################");
    }

    private static int multiplicar(int a, int b) {
        return a * b;
    }

    private static int suma(int a, int b) {
        return a +b;
    }
}
