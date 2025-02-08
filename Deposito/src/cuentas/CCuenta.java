package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria que contiene información sobre el titular, 
 * el número de cuenta, el saldo y el tipo de interés. Esta clase permite realizar operaciones 
 * de ingreso, retiro y consulta del saldo.
 * 
 * @author Salva
 */
public class CCuenta {

    /**
     * El nombre del titular de la cuenta.
     */
    private String nombre;

    /**
     * El número de la cuenta bancaria.
     */
    private String cuenta;

    /**
     * El saldo actual disponible en la cuenta bancaria.
     */
    private double saldo;

    /**
     * El tipo de interés asociado a la cuenta bancaria.
     */
    private double tipoInterés;

    /**
     * Constructor vacío de la clase CCuenta. 
     * Este constructor no inicializa ningún atributo.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase CCuenta con parámetros para inicializar todos los atributos.
     * 
     * @param nom El nombre del titular de la cuenta.
     * @param cue El número de la cuenta bancaria.
     * @param sal El saldo inicial de la cuenta.
     * @param tipo El tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Obtiene el nombre del titular de la cuenta.
     * 
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta.
     * 
     * @param nombre El nombre del titular de la cuenta.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de la cuenta bancaria.
     * 
     * @return El número de la cuenta bancaria.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de la cuenta bancaria.
     * 
     * @param cuenta El número de la cuenta bancaria.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     * 
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo actual de la cuenta.
     * 
     * @param saldo El saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta.
     * 
     * @return El tipo de interés de la cuenta.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     * 
     * @param tipoInterés El tipo de interés de la cuenta.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * 
     * @return El saldo de la cuenta.
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Realiza un ingreso de una cantidad en la cuenta.
     * Si la cantidad es negativa, se lanza una excepción.
     * 
     * @param cantidad La cantidad a ingresar en la cuenta.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Realiza un retiro de una cantidad en la cuenta.
     * Si la cantidad es negativa o si el saldo es insuficiente, se lanza una excepción.
     * 
     * @param cantidad La cantidad a retirar de la cuenta.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
