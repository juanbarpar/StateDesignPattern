package States;

public class LavadoState extends State{


    LavadoState(Lavadora lavadora) {

        super(lavadora);
        lavadora.setTiempoDeEstado(1);
        lavadora.setGirando(true);
        lavadora.setRevoluciones(500);
    }

    @Override
    public String lavado() {
        lavadora.setNextState(new EnjuagueState(this));
        if(isPasarsiguienteEstado()){
            lavadora.changeState();
        }
        return "Estoy en fase de lavado...";
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
        return "En ejecucion de una fase...";
    }
}
