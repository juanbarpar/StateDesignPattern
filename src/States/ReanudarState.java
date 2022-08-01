package States;

public class ReanudarState extends State{


    ReanudarState(Lavadora lavadora) {
        super(lavadora);
        lavadora.setGirando(true);
        lavadora.setRevoluciones(500);
    }

    @Override
    public String lavado() {
        return "blocked";
    }

    @Override
    public String enjuague() {
        return "Listo para entrar a fase enjuague...";
    }

    @Override
    public String centrifugado() {
        return "No puedo entrar a fase de centrifugado";
    }

    @Override
    public String pausa() {
        return "permitido pausar";
    }

    @Override
    public String reanudar() {




        return "Listo para entrar a reanudar";

    }
}
