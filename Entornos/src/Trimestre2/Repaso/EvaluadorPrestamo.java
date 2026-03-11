package Trimestre2.Repaso;
public class EvaluadorPrestamo {

    /**
     * Calcula la tasa de interés final para un préstamo.
     * La tasa base es del 10%.
     * @param sueldoMensual Double que indica los ingresos del usuario.
     * @param tieneAval Booleano que indica si el usuario presenta un avalista.
     * @param esClienteVip Booleano que indica si el usuario ya tiene historial VIP en el banco.
     * @return Devuelve la tasa de interés final o -1 si el sueldo es insuficiente para pedir nada.
     */
    public double calcularInteres(double sueldoMensual, boolean tieneAval, boolean esClienteVip) {
        double tasaInteres = 10.0; // Tasa base estándar

        if (sueldoMensual < 1000) {
            return -1.0; // Rechazado automáticamente
        }

        if (tieneAval) {
            tasaInteres = tasaInteres - 2.0; // Se reduce la tasa un 2%
        }
p
        if (esClienteVip) {
            tasaInteres = tasaInteres - 3.0; // Se reduce la tasa un 3% extra
        }

        return tasaInteres;
    }
}