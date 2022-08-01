package States;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola");
        Lavadora lavadora = new Lavadora();
        System.out.println(lavadora.isFuncionando());

        int t = 0;
        do {

            System.out.println("Info/ revoluciones: " + lavadora.getRevoluciones() + " Tiempo restante: " + lavadora.getTiempoDeEstado());
            System.out.println(lavadora.getState().lavado());
            System.out.println(lavadora.getState().enjuague());
            System.out.println(lavadora.getState().centrifugado());
            System.out.println("-----------");
            t++;
        }while(lavadora.isFuncionando());
    }
}
