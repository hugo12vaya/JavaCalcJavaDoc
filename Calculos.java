package calculadora;

/**
 *
 * @author Hugo
 */
public class Calculos {

    /**
     * Primer número utilizado para los cálculos.
     */
    public double num1;

    /**
     * Segundo número utilizado para los cálculos.
     */
    public double num2;

    /**
     * Tercer número utilizado para los cálculos.
     */
    public double num3;

    /**
     * Almacena el resultado de los cálculos.
     */
    public double res;

    /**
     * Lee el primer número a utilizar en los cálculos.
     *
     * @param num1 Primer número a utilizar en los cálculos.
     */
    public void leer_datos(double num1) {
        this.num1 = num1;
    }

    /**
     * Lee el primer y segundo número a utilizar en los cálculos.
     *
     * @param num1 Primer número a utilizar en los cálculos.
     * @param num2 Segundo número a utilizar en los cálculos.
     */
    public void leer_datos(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    /**
     * Lee el primer, segundo y tercer número a utilizar en los cálculos.
     *
     * @param num1 Primer número a utilizar en los cálculos.
     * @param num2 Segundo número a utilizar en los cálculos.
     * @param num3 Tercer número a utilizar en los cálculos.
     */
    public void leer_datos(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    /**
     * Suma dos números.
     *
     * @return La suma de num1 y num2.
     */
    double sumar_dos() {
        res = num1 + num2;
        return res;
    }

    /**
     * Suma tres números.
     *
     * @return La suma de num1, num2 y num3.
     */
    double sumar_tres() {
        res = num1 + num2 + num3;
        return res;
    }

    /**
     * Calcula la raíz cuadrada de un número.
     *
     * @return La raíz cuadrada de num1.
     */
    double calcular_raiz_cuadrada() {
        res = Math.sqrt(num1);
        return res;
    }

    /**
     * Calcula la potencia de un número.
     *
     * @return num1 elevado a la potencia de num2.
     */
    double calcular_potencia() {
        res = Math.pow(num1, num2);
        return res;
    }

    /**
     * Calcula el promedio de tres números.
     *
     * @return El promedio de num1, num2 y num3.
     */
    double calcular_promedio() {
        res = (num1 + num2 + num3) / 3;
        return res;
    }

}
