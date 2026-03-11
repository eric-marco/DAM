package Trimestre2.Ejercicio2;

/**
 * Clase que representa a un empleado con sus datos básicos. Esta clase modela
 * la información de un empleado incluyendo su nombre, apellido, edad y salario,
 * proporcionando métodos para acceder y modificar estos datos.
 * 
 * @see <a href=
 *      "https://picodotdev.github.io/blog-bitix/2017/09/la-herramienta-de-documentacion-javadoc-de-java/">JAVADOC</a>
 * @author ZSS
 * @version 2025
 */
public class Empleado {

	/**
	 * Constante que define el salario base por defecto para un empleado. Valor: 600
	 * unidades monetarias.
	 */
	public static final double SALARIO_DEF = 600;

	/**
	 * Nombre del empleado.
	 */
	private String nombre;

	/**
	 * Apellido del empleado.
	 */
	private String apellido;

	/**
	 * Edad del empleado en años.
	 */
	private int edad;

	/**
	 * Salario actual del empleado.
	 */
	private double salario;

	/**
	 * Constructor por defecto que inicializa un empleado con valores
	 * predeterminados. Los valores iniciales son: nombre vacío, apellido vacío,
	 * edad 0 y salario por defecto.
	 */
	public Empleado() {
		this("", "", 0, SALARIO_DEF);
	}

	/**
	 * Constructor que inicializa un empleado con nombre, apellido y edad
	 * especificados, usando el salario por defecto.
	 * 
	 * @param nombre   Nombre del empleado
	 * @param apellido Apellido del empleado
	 * @param edad     Edad del empleado en años
	 */
	public Empleado(String nombre, String apellido, int edad) {
		this(nombre, apellido, edad, SALARIO_DEF);
	}

	/**
	 * Constructor completo que inicializa todos los atributos del empleado.
	 * 
	 * @param nombre   Nombre del empleado
	 * @param apellido Apellido del empleado
	 * @param edad     Edad del empleado en años
	 * @param salario  Salario inicial del empleado
	 */
	public Empleado(String nombre, String apellido, int edad, double salario) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
	}

	/**
	 * Devuelve el nombre del empleado.
	 * 
	 * @return El nombre del empleado
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el apellido del empleado.
	 * 
	 * @return El apellido del empleado
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * Devuelve la edad del empleado.
	 * 
	 * @return La edad del empleado en años
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Devuelve el salario actual del empleado.
	 * 
	 * @return El salario del empleado
	 */
	public double getSalario() {
		return salario;
	}

	/**
	 * Establece un nuevo nombre para el empleado.
	 * 
	 * @param nombre Nuevo nombre para el empleado
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Establece un nuevo apellido para el empleado.
	 * 
	 * @param apellido Nuevo apellido para el empleado
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * Establece una nueva edad para el empleado.
	 * 
	 * @param edad Nueva edad del empleado en años
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * Establece un nuevo salario para el empleado.
	 * 
	 * @param salario Nuevo salario del empleado
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Comprueba si el empleado está en edad de jubilarse. Considera la edad de
	 * jubilación en 65 años.
	 * 
	 * @return true si el empleado tiene 65 años o más, false en caso contrario
	 */
	public boolean estaJubilado() {
		return edad >= 65;
	}

	/**
	 * Aumenta el salario del empleado en un porcentaje específico.
	 * 
	 * @param porcentaje Porcentaje de aumento (ejemplo: 10 para 10%)
	 */
	public void aumentarSalario(double porcentaje) {
		salario += salario * (porcentaje / 100);
	}

	/**
	 * Devuelve una representación en formato String del empleado. El formato
	 * incluye nombre, apellido, edad y salario.
	 * 
	 * @return String con la información del empleado
	 */
	@Override
	public String toString() {
		return "Empleado{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' + ", edad=" + edad
				+ ", salario=" + salario + '}';
	}

	/**
	 * Compara si dos empleados son iguales basándose en su nombre y apellido.
	 * 
	 * @param obj Objeto a comparar
	 * @return true si los empleados tienen el mismo nombre y apellido, false en
	 *         caso contrario
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Empleado empleado = (Empleado) obj;
		return nombre.equals(empleado.nombre) && apellido.equals(empleado.apellido);
	}

	/**
	 * Devuelve el código hash del empleado basado en su nombre y apellido.
	 * 
	 * @return Código hash del empleado
	 */
	@Override
	public int hashCode() {
		return nombre.hashCode() + apellido.hashCode();
	}
}