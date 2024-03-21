//package com.bank.aulas;
//
//import java.util.Scanner;
//
//public class Calendario {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Obtendo o número de dias do mês e o dia da semana correspondente ao primeiro dia do mês
//        System.out.print("Digite o número de dias do mês: ");
//        int numDias = scanner.nextInt();
//        System.out.print("Digite o dia da semana correspondente ao primeiro dia do mês (0 - Domingo, 1 - Segunda, ..., 6 - Sábado): ");
//        int diaSemana = scanner.nextInt();
//
//        // Imprimindo o cabeçalho do calendário
//        System.out.println("Dom Seg Ter Qua Qui Sex Sáb");
//
//        // Variável para controlar a impressão dos dias do mês
//        int contador = 0;
//
//        // Imprimindo os espaços em branco até o primeiro dia do mês
//        for (int i = 0; i < diaSemana; i++) {
//            System.out.print("    ");
//            contador++;
//        }
//
//        // Imprimindo os dias do mês
//        for (int i = 1; i <= numDias; i++) {
//            System.out.printf("%3d ", i);
//            contador++;
//
//            // Quebra de linha a cada semana
//            if (contador % 7 == 0) {
//                System.out.println();
//            }
//        }
//
//        // Imprimindo quebras de linha caso necessário para completar a última semana
//        if (contador % 7 != 0) {
//            System.out.println();
//        }
//
//        scanner.close();
//    }
//}

