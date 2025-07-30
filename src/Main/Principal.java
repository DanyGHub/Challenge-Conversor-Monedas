package Main;

import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import Class.Conversion;
import Class.Consulta;

public class Principal {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int aux = 1;
        Double valor = 0.0;
        Double valorFinal = 0.0;
        String input1 = "";
        String input2 = "";
        Boolean flag = false;

        Consulta consulta= new Consulta();
        Conversion conversion =  consulta.search("AED");

        System.out.println();
        System.out.println("*****CONVERSOR DE MONEDAS*****");
        System.out.println();

        System.out.println("-------------------------MONEDAS-------------------------");
        for (Map.Entry<String, Double> entrada : conversion.valores().entrySet()){
            System.out.print("  '" + entrada.getKey() + "' ");
            if(aux % 15 == 0){
                System.out.println();
                aux = 1;
            }else{
                aux++;
            }
        }

        while (true){
            try{
                System.out.println();
                System.out.print("Seleccione la Moneda a convertir o coloque [Salir] para terminar el programa: ");
                input1 = teclado.next().toUpperCase();  teclado.nextLine();

                if(input1.equalsIgnoreCase("salir")){
                    flag = true;
                    break;
                }

                System.out.print("Ingresa el valor [" + input1 +"]: ");
                valor = teclado.nextDouble();

                System.out.print("Seleccione la Moneda a cambiar: ");
                input2 = teclado.next().toUpperCase();


                conversion =  consulta.search(input1);

                valorFinal = valor * conversion.valores().get(input2);
                System.out.println();
                System.out.println("---Conversion---");
                System.out.printf("$%.2f [%s] ==> $%.2f [%s]%n", valor, input1, valorFinal, input2);

            } catch (InputMismatchException e ){
                System.out.println("ERROR: El valor ingresado NO es valido");
            } catch (NullPointerException e){
                System.out.println("ERROR: No se encontró la conversion entre las monedas [" + input1 + "] ==> [" + input2 + "]");
            } catch (Exception e){
                System.out.println(e);
                teclado.nextLine();
            } finally {
                if(!flag){
                    System.out.println("Cargando...");
                    aux = 1;
                    if (teclado.hasNextLine()) teclado.nextLine();
                    pause(2000);
                }
            }
        }

        System.out.println();
        System.out.println("Finalizando Programa.....");
    }

     public static void pause(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            System.out.println("La espera fue interrumpida");
        }
    }
}
