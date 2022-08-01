package States;

public abstract class State{

    Lavadora lavadora;

    State(Lavadora lavadora) {
        this.lavadora = lavadora;
    }


    public abstract String lavado();
    public abstract String enjuague();
    public abstract String centrifugado();

    public abstract String pausa();
    public abstract String reanudar();


}
