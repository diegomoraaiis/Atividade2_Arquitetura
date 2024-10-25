/**
 *
 * @author diego
 */
public class Principal {
        public static void main(String[] args) {
        ViagemFacade viagemFacade = new ViagemFacade();

        // Cliente utilizando a ViagemFacade para fazer uma reserva completa
        viagemFacade.reservarViagem(
            "Londrina", "Curitiba", "2024-11-10",  
            "Curitiba", "2024-11-10", "2024-11-15",
            "Curitba", "2024-11-10", "2024-11-15"
        );
    }
    
}
