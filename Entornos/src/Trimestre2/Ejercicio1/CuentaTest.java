package Trimestre2.Ejercicio1;

import org.junit.Before;
import org.junit.Test;

class TransferenciasTest {

    private Cuenta cuentaOrigen;
    private Cuenta cuentaDestino;

    @Before
    void setUp() {
        cuentaOrigen = new Cuenta("Origen", 1000);
        cuentaDestino = new Cuenta("Destino", 0);
     }

    @Test
    void testTransferenciaNormal() {
        System.out.println("Probando: transferir 500€");
        cuentaOrigen.transferir(500, cuentaDestino);
        System.out.println("Saldo origen: " + cuentaOrigen.getSaldo());
        System.out.println("Saldo destino: " + cuentaDestino.getSaldo());
    }

    @Test
    void testTransferenciaSinSaldo() {
        System.out.println("Probando: transferir 1500€ (no hay suficiente)");
        cuentaOrigen.transferir(1500, cuentaDestino);
        System.out.println("Saldo origen: " + cuentaOrigen.getSaldo());
        System.out.println("Saldo destino: " + cuentaDestino.getSaldo());
    }

    @Test
    void testTransferenciaNegativa() {
        System.out.println("Probando: transferir -100€");
        cuentaOrigen.transferir(-100, cuentaDestino);
        System.out.println("Saldo origen: " + cuentaOrigen.getSaldo());
        System.out.println("Saldo destino: " + cuentaDestino.getSaldo());
    }

    @Test
    void testTransferenciaCero() {
        System.out.println("Probando: transferir 0€");
        cuentaOrigen.transferir(0, cuentaDestino);
        System.out.println("Saldo origen: " + cuentaOrigen.getSaldo());
        System.out.println("Saldo destino: " + cuentaDestino.getSaldo());
    }
}