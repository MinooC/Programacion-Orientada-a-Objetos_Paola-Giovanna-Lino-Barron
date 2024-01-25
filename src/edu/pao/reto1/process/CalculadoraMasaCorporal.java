package edu.pao.reto1.process;

/***
 * Esta clase sirve para realizar los cálculos de masa corporal.
 */
public class CalculadoraMasaCorporal
{
    /**
     * Este método sive para calcular el índice de masa corporal de una persona con base en su peso
     * y su estatura.
     * @param estatura del paciente en centímetros
     * @param peso del paciente en kilogramos
     * @param return índice de masa corporal
     **/
    public static void calcularIndiceDeMasaCorporal()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el peso en kg: ");
        double peso = scanner.nextToDouble();
        System.out.print("Ingrese la estatura en cm");
        double estatura = scanner.nextToDouble();

        double indiceDeMasaCorporal = peso / Math.pow(estatura / 100, 2);

    }
    public static String interpretarIndiceMasaCorporal(double imc)
        {
            String value = "";
            if (imc<18)
            {
                value = "Desnutrición";
            }
            else if (imc<=24.99)
            {
                value = "Normal";
                return value;
            }
            else if (imc<=29.99)
            {
                value = "Sobrepeso";
            }
            else if (imc<=34.99)
            {
                value = "Obesidad leve";
            }
            else if (imc<=39.99)
            {
                value = "Obesidad media";
            }
            else
            {
                value = "Obesidad morbida";
            }
        }
    public static void calcularMasaCorporalMagra()
    {
        Scanner scanner = new scanner (System.in);
        System.out.println("Ingrese el peso en kg");
        double peso = scanner.double();
        System.out.println("Ingrese la estatura en cm");
        double estatura = scanner.double();
        System.out.println("Ingrese el sexo (hombre o mujer)");
        String sexo = scanner.next();

        double masaMagra = (sexo.equalsIgnoreCase("Mujer")) ?
                (1.07 * peso) - 148 * (Math.pow(peso,2) / Math.pow(estatura,2));
                (1.10 * peso) - 128 * (Math.pow(peso, 2) / Math.pow(estatura, 2));

    }
}
