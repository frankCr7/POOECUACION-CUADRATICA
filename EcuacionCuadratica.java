package Clase02;

class EcuacionCuadratica
{
    void valora()
    {
        system.out.println("Ingrese el valor de a:")
    }

    void valorb()
    {
        system.out.println("Ingrese el valor de b:")
    }

    void valorc()
    {
        system.out.println("Ingrese el valor de c:")
    }

    public static void main(string[] args)
    {
        EcuacionCuadratica ecuacioncuadratica = new EcuacionCuadratica

        system.out.println("Ingrese el valor de a:")
        double a = ecuacioncuadratica.nextDouble();

        system.out.println("Ingrese el valor de b:")
        double b = ecuacioncuadratica.nextDouble();

        system.out.println("Ingrese el valor de c:")
        double c = ecuacioncuadratica.nextDouble();

        double discriminante = calcularDiscriminante(a, b, c);

        if(discriminante < 0)
        {
            system.out.println("No tiene raices")
        }else
        {
            calcularRaices(a, b, discriminante);
        }
         
         scanner.close();
    }

    private static double calcularDiscriminante(double a, double b, double c)
    {
        return  (b * b)- 4 * a * c; 
    }

    private static void calcularRaices(double a, double b, double discriminante)
    {
       double x1= (-b + Math.sqrt(discriminante)) / (2 * a);
       double x2= (-b - Math.sqrt(discriminante)) / (2 * a);

       if (x1 = x2)
       {
           system.out.println("x1 y x2 = " + x1);
       }else
       {
           system.out.println("El valor de x1 =" + x1  + "y el valor de x2 =" + x2);

       }
    }
}