package States;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola");
        Lavadora lavadora = new Lavadora();


        while (lavadora.isFuncionando()){
            System.out.println(lavadora.getState().lavado());
            System.out.println(lavadora.getState().enjuague());
            System.out.println(lavadora.getState().centrifugado());
        }
    }
}
