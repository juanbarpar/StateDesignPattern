package States;

public class LavadoState extends State{


    LavadoState(Lavadora lavadora) {

        super(lavadora);
        lavadora.setPasarsiguienteEstado(false);
        lavadora.setTiempoDeEstado(10);
        lavadora.setGirando(true);
        lavadora.setRevoluciones(500);

    }

    @Override
    public String lavado() {

        if(lavadora.isPasarsiguienteEstado()){
            lavadora.changeState(new EnjuagueState(lavadora));
            System.out.println("---termino esta fase---");
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
