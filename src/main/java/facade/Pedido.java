package facade;

public class Pedido {
    public boolean confirmar() {
        return PedidoFacade.verificarPendenciaConfirmacao(this);
    }

}
