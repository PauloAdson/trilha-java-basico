package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // ações que não precisam estarem disponíveis para toda a aplicação
        // cozinheiro.lavarIngredientes();
        // cozinheiro.baterVitaminaLiquidificador();
        // cozinheiro.selecionarIngredientesVitamina();
        // cozinheiro.prepararLanche();
        // cozinheiro.prepararVitamina();
        // cozinheiro.prepararVitamina();

        // ações que estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        //// O estabelecimento não precisa saber o que acontece no almoxarife, por isso
        //// não é necessário chamar ele no estabelecimento
        // Almoxarife almoxarife = new Almoxarife();
        // ações que não precisam estarem disponíveis para toda a aplicação
        // almoxarife.controlarEntrada();
        // almoxarife.controlarSaida();
        // // ação que somente o seu pacote cozinha precisa conhecer (default)
        // almoxarife.entregarIngredientes();
        // almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        // atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        // // ação que somente o seu pacote cozinha precisa conhecer (default)
        // atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // esta ação é muito sigilosa, qua tal ser privada ?
        // cliente.consultarSaldoAplicativo();

        // já pensou os clientes ouvindo que o gás acabou ?
        // cozinheiro.pedirParaTrocarGas(atendente);
        // cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}