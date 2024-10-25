
/**
 *
 * @author diego
 */
public class ViagemFacade {

    private ReservaDeVoo reservaDeVoo;
    private ReservaDeHotel reservaDeHotel;
    private AluguelDeCarro aluguelDeCarro;

    public ViagemFacade() {
        this.reservaDeVoo = new ReservaDeVoo();
        this.reservaDeHotel = new ReservaDeHotel();
        this.aluguelDeCarro = new AluguelDeCarro();
    }

    public void reservarViagem(String origem, String destino, String dataVoo,
            String localHotel, String dataEntradaHotel, String dataSaidaHotel,
            String localCarro, String dataInicioCarro, String dataFimCarro) {
        String voo = reservaDeVoo.reservarVoo(origem, destino, dataVoo);
        String hotel = reservaDeHotel.reservarHotel(localHotel, dataEntradaHotel, dataSaidaHotel);
        String carro = aluguelDeCarro.alugarCarro(localCarro, dataInicioCarro, dataFimCarro);

        System.out.println(voo);
        System.out.println(hotel);
        System.out.println(carro);
    }
}
