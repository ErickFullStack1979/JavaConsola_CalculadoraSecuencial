package com.company;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      int n1;
      int n2;
      String signo;
      Scanner asignar = new Scanner(System.in);

      System.out.println("============================== ==============================");
      System.out.println("*** Calculadora basica secuencial ***");
      System.out.println("============================== ==============================");
      System.out.println("Ingrese el primer numero entero que desea operar:");
      n1 = asignar.nextInt();

      System.out.println("============================== ==============================");
      System.out.println("Ingrese el segundo numero entero que desea operar:");
      n2 = asignar.nextInt();

      System.out.println("============================== ==============================");
      System.out.println("Escriba el signo de la operacion que desea realizar:");
      System.out.println("Suma(+) Resta(-) Multiplicacion(x) Division(:) Modulo(/)");
      asignar.nextLine();
      signo = asignar.nextLine();
      while (!signo.equals("+") &&
             !signo.equals("-") &&
             !signo.equals("x") &&
             !signo.equals("X") &&
             !signo.equals(":") &&
             !signo.equals("/")) {
         System.out.println("Dato no valido, ingrese correctamente el signo quer desea operar:");
         signo = asignar.nextLine();
      }

      System.out.println("============================== ==============================");
      if (signo.equals("+")) {
         System.out.println("El resultado de la suma es:");
         System.out.println(n1 + n2);
      } else if (signo.equals("-")) {
         System.out.println("El resultado de la resta es:");
         System.out.println(n1 - n2);
      } else if (signo.equals("x") || signo.equals("X")) {
         System.out.println("El resultado de la multiplicacion es:");
         System.out.println(n1 * n2);
      } else if (signo.equals(":")) {
         System.out.println("El resultado de la division es:");
         System.out.println((float)n1 / (float)n2);
      } else if (signo.equals("/")) {
         System.out.println("El modulo resultante es:");
         System.out.println(n1 % n2);
      }
      System.out.println("============================== ==============================");

   }
}