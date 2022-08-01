package States;

public class EnjuagueState extends State{


    EnjuagueState(Lavadora lavadora) {
        super(lavadora);
        lavadora.setTiempoDeEstado(2);
        lavadora.setGirando(true);
        lavadora.setRevoluciones(2);

    }

    @Override
    public String lavado() {
        return "blocked";
    }

    @Override
    public String enjuague() {

        lavadora.setNextState(new CentrifugadoState(this));
        if(isPasarsiguienteEstado()){
            lavadora.changeState();
        }
        return "Estoy en fase de enjuague...";

    }

    @Override
    public String centrifugado() {
        return "Siguiente...";
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
