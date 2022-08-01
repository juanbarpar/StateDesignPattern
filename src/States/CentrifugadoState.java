package States;

public class CentrifugadoState extends State{


    CentrifugadoState(Lavadora lavadora) {
        super(lavadora);
        lavadora.setPasarsiguienteEstado(false);
        lavadora.setTiempoDeEstado(10);
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


        if(lavadora.isPasarsiguienteEstado()) {
            System.out.println("termino esta fase....");


            lavadora.setFuncionando(false);

        }

        return "Estoy en centrifugado";
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
