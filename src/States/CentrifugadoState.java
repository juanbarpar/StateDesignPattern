package States;

public class CentrifugadoState extends State{


    CentrifugadoState(Lavadora lavadora) {
        super(lavadora);
        lavadora.setTiempoDeEstado(3);
        lavadora.setGirando(true);
        lavadora.setRevoluciones(1000);
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

        lavadora.setNextState(new PausaState(this));
        if(isPasarsiguienteEstado()){
            lavadora.changeState();
        }

        return "No puedo entrar a fase de centrifugado";
    }

    @Override
    public String pausa() {
        return "permitido pausar";

    }

    @Override
    public String reanudar() {
        return "En ejecucion de una fase...";
    }
}
