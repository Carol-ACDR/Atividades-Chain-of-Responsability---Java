public abstract class Correntedeleitura{
 
    protected Correntedeleitura proximo;
    protected Cleitura idTipodeLeitura;
 
    public Correntedeleitura(Cleitura id) {
        proximo = null;
        idTipodeLeitura = id;
    }
 
    public void setProximo(Correntedeleitura Proxid) {
        if (proximo == null) {
            proximo = Proxid;
        } else {
            proximo.setProximo(Proxid);
        }
    }
}