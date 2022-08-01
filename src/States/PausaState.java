package States;

public class PausaState extends State{


    PausaState(Lavadora lavadora) {
        super(lavadora);
        lavadora.setGirando(false);
        lavadora.setRevoluciones(0);
    }

    @Override
    public String lavado() {
        return "blocked";
    }

    @Override
    public String enjuague() {
        return "blocked";
    }

    @Override
    public String centrifugado() {
        return "blocked";
    }

    @Override
    public String pausa() {
        return "Pausado";
    }

    @Override
    public String reanudar() {
        return "listo para reanudar";
    }
}
