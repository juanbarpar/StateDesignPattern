package States;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola");
        Lavadora lavadora = new Lavadora();
        System.out.println(lavadora.isFuncionando());


        do {
            System.out.println(lavadora.getState().lavado());
            System.out.println(lavadora.getState().enjuague());
            System.out.println(lavadora.getState().centrifugado());
            System.out.println(lavadora.getTiempoDeEstado());
            System.out.println("-----------");
        }while(lavadora.getTiempoDeEstado()!=3);
    }
}
