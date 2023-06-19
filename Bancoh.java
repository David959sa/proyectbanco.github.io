import java.util.Scanner;
public class Bancoh
{
    public static void  main ( String [] args){
        Scanner entrar = new Scanner ( System.in );
        double a,b,c,d,totalsucursales=0;
        int cantidad,i;
        String identiasesor,nombreasesor;
        
        
        System.out.println ("Bienvenido Asesor, INGRESA LOS DATOS DE LOS PRESTAMOS A LA PLATAFORMA");
        System.out.println ("---------------------------------------------------------------");
        System.out.println ("Por favor asesor, ingrese tu identificación");
        identiasesor= entrar.next();
        System.out.println ("Por favor asesor, ingrese su nombre");
        nombreasesor= entrar.next();
        System.out.println ("Por favor asesor, ingrese la cantidad de sucursales que va hacer promedio");
        cantidad= entrar.nextInt();
            for(i=1; i<=cantidad;i++){
            System.out.println ("------SUCURSA NÚMERO "+i);
            System.out.println ("Por favor, ingrese el valor total de mes de PRESTAMOS DE VIVIENDA");
            a= entrar.nextDouble();
            System.out.println ("Por favor, ingrese el valor total de mes de PRESTAMOS DE ESTUDIO");
            b= entrar.nextDouble();
            System.out.println ("Por favor, ingrese el valor total de mes de PRESTAMOS DE COMPRA DE CARTERA");
            c= entrar.nextDouble();
            d=(a+b+c)/3;
            System.out.println ("------PROCESANDO INFORMACIÓN--------");
            System.out.println ("En total la sucursal"+i+ "tuvo  un promedio de los 3 tipos de prestamos de: "+d+"$ pesos Colombianos");
            totalsucursales=d+totalsucursales;
            }
        System.out.println ("----------------------PROMEDIO TOTAL DE SUCURSALES------------------");
        totalsucursales=totalsucursales/cantidad;
        System.out.println ("El promedio de prestamos de todas las sucursales es de "+totalsucursales);
        
    }
}
