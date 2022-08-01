package States;

public class Lavadora {

    private boolean girando = false;

    private boolean funcionando = true;

    private int revoluciones;
    private State state;
    private State nextState;

    public State getNextState() {
        return nextState;
    }

    public void changeState(State state) {
        this.state=state;

    }

    private int tiempoDeEstado;

    private boolean pasarsiguienteEstado;


    public Lavadora() {
        this.state = new LavadoState(this);

    }

    public boolean isGirando() {
        return girando;
    }

    public void setGirando(boolean girando) {
        this.girando = girando;
    }


    public void setRevoluciones(int revolucione) {
        this.revoluciones = revolucione;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getRevoluciones() {
        return revoluciones;
    }

    public int getTiempoDeEstado() {
        return tiempoDeEstado;
    }

    public void setTiempoDeEstado(int tiempoDeEstado) {
        this.tiempoDeEstado = tiempoDeEstado;
    }

    public boolean isPasarsiguienteEstado(State state) {

        int min_val = 1;
        int max_val = 10;
        int randomNum = (int) (Math.random() * ( max_val - min_val ));

        if(randomNum==tiempoDeEstado){
            setPasarsiguienteEstado(true);
            changeState(state);

        }
        else{
            setPasarsiguienteEstado(false);
        }

        return pasarsiguienteEstado;

    }

    public boolean isFuncionando() {
        return funcionando;
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }

    public void setPasarsiguienteEstado(boolean pasarsiguienteEstado) {
        this.pasarsiguienteEstado = pasarsiguienteEstado;
    }
}
