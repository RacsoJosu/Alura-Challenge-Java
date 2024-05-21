import models.Monedas;
import servicios.Servicios;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Servicios servicio = new Servicios();
        int monedaConvertir =0;
        double montoConvertir = 0;

        int opcion =0;
        System.out.println("*****************************");
        System.out.println("Bienvenido");
        while(true){
            System.out.println("*****************************");

            System.out.println("Cual es tu moneda quieres convertir: ");

            monstrarMonedasDisponibles();
            System.out.println("0. Salir");
            opcion = entrada.nextInt();

            if (opcion==0){
                break;
            }

            switch (opcion){


                case 1:{

                    var conversionRate = servicio.obtenerDatos(Monedas.USD);
                    if (conversionRate== null){
                        System.out.println("Algo salio mal");
                        break;

                    }




                    System.out.println("*******************************");
                    System.out.println("Elige la moneda de cambio: ");
                    monstrarMonedasDisponibles();
                    monedaConvertir = entrada.nextInt();

                    Monedas valor = Monedas.values()[monedaConvertir- 1];
                    System.out.println("Ingresa el monto a convertir:");
                    montoConvertir = entrada.nextDouble();

                    System.out.printf("El valor es: %.4f USD \n", (Double.valueOf(conversionRate.conversion_rates().get(Monedas.USD.toString()))/Double.valueOf(conversionRate.conversion_rates().get(valor.toString()))) * montoConvertir );



                    break;
                }
                case 2:{



                    var conversionRate = servicio.obtenerDatos(Monedas.HNL);
                    if (conversionRate== null){
                        System.out.println("Algo salio mal");
                        break;

                    }




                    System.out.println("*******************************");
                    System.out.println("Elige la moneda de cambio: ");
                    monstrarMonedasDisponibles();
                    monedaConvertir = entrada.nextInt();

                    Monedas valor = Monedas.values()[monedaConvertir- 1];
                    System.out.println("Ingresa el monto a convertir:");
                    montoConvertir = entrada.nextDouble();

                    System.out.printf("El valor es: %.4f HNL \n", (Double.valueOf(conversionRate.conversion_rates().get(Monedas.HNL.toString()))/Double.valueOf(conversionRate.conversion_rates().get(valor.toString()))) * montoConvertir );


                    break;
                }
                case 3:{



                    var conversionRate = servicio.obtenerDatos(Monedas.ARS);
                    if (conversionRate== null){
                        System.out.println("Algo salio mal");
                        break;

                    }




                    System.out.println("*******************************");
                    System.out.println("Elige la moneda de cambio: ");
                    monstrarMonedasDisponibles();
                    monedaConvertir = entrada.nextInt();

                    Monedas valor = Monedas.values()[monedaConvertir- 1];
                    System.out.println("Ingresa el monto a convertir:");
                    montoConvertir = entrada.nextDouble();

                    System.out.printf("El valor es: %.4f ARS \n", (Double.valueOf(conversionRate.conversion_rates().get(Monedas.ARS.toString()))/Double.valueOf(conversionRate.conversion_rates().get(valor.toString()))) * montoConvertir );


                    break;
                }
                case 4:{



                    var conversionRate = servicio.obtenerDatos(Monedas.KPW);
                    if (conversionRate== null){
                        System.out.println("Algo salio mal");
                        break;

                    }




                    System.out.println("*******************************");
                    System.out.println("Elige la moneda de cambio: ");
                    monstrarMonedasDisponibles();
                    monedaConvertir = entrada.nextInt();

                    Monedas valor = Monedas.values()[monedaConvertir- 1];
                    System.out.println("Ingresa el monto a convertir:");
                    montoConvertir = entrada.nextDouble();

                    System.out.printf("El valor es: %.4f KPW \n", (Double.valueOf(conversionRate.conversion_rates().get(Monedas.KPW.toString()))/Double.valueOf(conversionRate.conversion_rates().get(valor.toString()))) * montoConvertir );


                    break;
                }
                case 5:
                {



                    var conversionRate = servicio.obtenerDatos(Monedas.VES);
                    if (conversionRate== null){
                        System.out.println("Algo salio mal");
                        break;

                    }




                    System.out.println("*******************************");
                    System.out.println("Elige la moneda de cambio: ");
                    monstrarMonedasDisponibles();
                    monedaConvertir = entrada.nextInt();

                    Monedas valor = Monedas.values()[monedaConvertir- 1];
                    System.out.println("Ingresa el monto a convertir:");
                    montoConvertir = entrada.nextDouble();

                    System.out.printf("El valor es: %.4f VES \n", (Double.valueOf(conversionRate.conversion_rates().get(Monedas.VES.toString()))/Double.valueOf(conversionRate.conversion_rates().get(valor.toString()))) * montoConvertir );


                    break;
                }
                case 6:{



                    var conversionRate = servicio.obtenerDatos(Monedas.ALL);
                    if (conversionRate== null){
                        System.out.println("Algo salio mal");
                        break;

                    }




                    System.out.println("*******************************");
                    System.out.println("Elige la moneda de cambio: ");
                    monstrarMonedasDisponibles();
                    monedaConvertir = entrada.nextInt();

                    Monedas valor = Monedas.values()[monedaConvertir- 1];
                    System.out.println("Ingresa el monto a convertir:");
                    montoConvertir = entrada.nextDouble();

                    System.out.printf("El valor es: %.4f ALL \n", (Double.valueOf(conversionRate.conversion_rates().get(Monedas.ALL.toString()))/Double.valueOf(conversionRate.conversion_rates().get(valor.toString()))) * montoConvertir );


                    break;
                }
                case 7:{



                    var conversionRate = servicio.obtenerDatos(Monedas.ANG);
                    if (conversionRate== null){
                        System.out.println("Algo salio mal");
                        break;

                    }




                    System.out.println("*******************************");
                    System.out.println("Elige la moneda de cambio: ");
                    monstrarMonedasDisponibles();
                    monedaConvertir = entrada.nextInt();

                    Monedas valor = Monedas.values()[monedaConvertir- 1];
                    System.out.println("Ingresa el monto a convertir:");
                    montoConvertir = entrada.nextDouble();

                    System.out.printf("El valor es: %.4f ANG \n", (Double.valueOf(conversionRate.conversion_rates().get(Monedas.ANG.toString()))/Double.valueOf(conversionRate.conversion_rates().get(valor.toString()))) * montoConvertir );


                    break;
                }
                case 8:{



                    var conversionRate = servicio.obtenerDatos(Monedas.AUD);
                    if (conversionRate== null){
                        System.out.println("Algo salio mal");
                        break;

                    }




                    System.out.println("*******************************");
                    System.out.println("Elige la moneda de cambio: ");
                    monstrarMonedasDisponibles();
                    monedaConvertir = entrada.nextInt();

                    Monedas valor = Monedas.values()[monedaConvertir- 1];
                    System.out.println("Ingresa el monto a convertir:");
                    montoConvertir = entrada.nextDouble();

                    System.out.printf("El valor es: %.4f AUD \n", (Double.valueOf(conversionRate.conversion_rates().get(Monedas.AUD.toString()))/Double.valueOf(conversionRate.conversion_rates().get(valor.toString()))) * montoConvertir );


                    break;
                }
                case 9:
                {



                    var conversionRate = servicio.obtenerDatos(Monedas.BRL);
                    if (conversionRate== null){
                        System.out.println("Algo salio mal");
                        break;

                    }




                    System.out.println("*******************************");
                    System.out.println("Elige la moneda de cambio: ");
                    monstrarMonedasDisponibles();
                    monedaConvertir = entrada.nextInt();

                    Monedas valor = Monedas.values()[monedaConvertir- 1];
                    System.out.println("Ingresa el monto a convertir:");
                    montoConvertir = entrada.nextDouble();

                    System.out.printf("El valor es: %.4f BRL \n", (Double.valueOf(conversionRate.conversion_rates().get(Monedas.BRL.toString()))/Double.valueOf(conversionRate.conversion_rates().get(valor.toString()))) * montoConvertir );


                    break;
                }
                case 10:
                {



                    var conversionRate = servicio.obtenerDatos(Monedas.CAD);
                    if (conversionRate== null){
                        System.out.println("Algo salio mal");
                        break;

                    }




                    System.out.println("*******************************");
                    System.out.println("Elige la moneda de cambio: ");
                    monstrarMonedasDisponibles();
                    monedaConvertir = entrada.nextInt();

                    Monedas valor = Monedas.values()[monedaConvertir- 1];
                    System.out.println("Ingresa el monto a convertir:");
                    montoConvertir = entrada.nextDouble();

                    System.out.printf("El valor es: %.4f CAD \n", (Double.valueOf(conversionRate.conversion_rates().get(Monedas.CAD.toString()))/Double.valueOf(conversionRate.conversion_rates().get(valor.toString()))) * montoConvertir );


                    break;
                }
                default:
                    break;

            }









        }



    }





    public static void monstrarMonedasDisponibles(){
        String[] monedasDisponibles = {
                "Dolar Americano",
                "Lempira Hondureño",
                "Peso Argentino",
                "Dolar Corea del Norte",
                "Dolar Albania",
                "Dolar Holandes",
                "Dolar Australiano",
                "Real Brasileño",
                "Dolar Canadiense"
        };
        int iterador =1;
        for (String moneda : monedasDisponibles) {
            System.out.printf("%d. %s\n", iterador++, moneda);
        }


    }
}