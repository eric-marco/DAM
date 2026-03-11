package Trimestre2.Refactorizacion;

import java.util.List;

public class ProcesadorPedidos {

	// Constantes (números mágicos extraídos)
	private static final double PESO_POR_PRODUCTO = 1.5;
	private static final double DESC_VIP = 0.15;
	private static final double DESC_COMPRA_GRANDE = 0.05;
	private static final double UMBRAL_COMPRA_GRANDE = 200.0;
	private static final double COSTO_BASE_CERCANO = 5.0;
	private static final double COSTO_BASE_LEJANO = 10.0;
	private static final double COSTO_POR_KM_EXTRA = 0.10;
	private static final double UMBRAL_SOBREPESO = 10.0;
	private static final double RECARGO_SOBREPESO = 20.0;

	// Atributos privados (promoción de variables)
	private double subtotal;
	private double descuento;
	private double costoEnvio;
	private double pesoTotal;
	private double totalPagar;

	/**
	 * Método principal que orquesta todo el proceso
	 */
	public void procesar(List<Double> preciosProductos, boolean esClienteVip, int distanciaKm) {
		calcularTotalesBase(preciosProductos);
		calcularDescuento(esClienteVip);
		calcularCostoEnvio(distanciaKm);
		calcularTotalFinal();
		imprimirTicket();
	}

	/**
	 * Paso 3: Calcula el subtotal y peso total recorriendo la lista de productos
	 */
	private void calcularTotalesBase(List<Double> preciosProductos) {
		subtotal = 0;
		pesoTotal = 0;

		for (Double precio : preciosProductos) {
			subtotal += precio;
			pesoTotal += PESO_POR_PRODUCTO;
		}
	}

	/**
	 * Paso 4: Calcula el descuento según si el cliente es VIP o supera el umbral
	 */
	private void calcularDescuento(boolean esClienteVip) {
		descuento = 0;

		if (esClienteVip) {
			descuento = subtotal * DESC_VIP;
		} else if (subtotal > UMBRAL_COMPRA_GRANDE) {
			descuento = subtotal * DESC_COMPRA_GRANDE;
		}
	}

	/**
	 * Paso 5: Calcula el costo de envío basado en distancia y aplica recargo por
	 * sobrepeso
	 */
	private void calcularCostoEnvio(int distanciaKm) {
		// Cálculo base según distancia
		if (distanciaKm < 50) {
			costoEnvio = COSTO_BASE_CERCANO;
		} else {
			costoEnvio = COSTO_BASE_LEJANO + (distanciaKm * COSTO_POR_KM_EXTRA);
		}

		// Recargo por sobrepeso
		if (pesoTotal > UMBRAL_SOBREPESO) {
			costoEnvio += RECARGO_SOBREPESO;
		}
	}

	/**
	 * Paso 6: Calcula el total final a pagar
	 */
	private void calcularTotalFinal() {
		totalPagar = subtotal - descuento + costoEnvio;
	}

	/**
	 * Paso 7: Imprime el ticket desglosado
	 */
	private void imprimirTicket() {
		System.out.println("=== RESUMEN DEL PEDIDO ===");
		System.out.println("Subtotal: " + subtotal);
		System.out.println("Descuento aplicado: " + descuento);
		System.out.println("Costo de Envío: " + costoEnvio);
		System.out.println("==========================");
		System.out.println("TOTAL A PAGAR: " + totalPagar);
	}
}