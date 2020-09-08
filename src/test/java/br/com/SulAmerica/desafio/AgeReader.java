package br.com.SulAmerica.desafio;


import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class AgeReader {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ente o dia do seu aniversário: ");
//        int dia = scanner.nextInt();
//
//        System.out.println("Ente o mês do seu aniversário:");
//        int mes = scanner.nextInt();
//
//        System.out.println("Ente o ano do seu aniversário:");
//        int ano = scanner.nextInt();
//
//        StringBuilder builder = new StringBuilder();
//        builder.append(dia).append("/").append(mes).append("/").append(ano);
//        System.out.println("Você nasceu em "+builder.toString());
//
//        LocalDate birthday = LocalDate.of(ano, mes,dia);
//        Period period = Period.between(birthday, LocalDate.now());
//
//        System.out.println("Você viveu "+ ChronoUnit.DAYS.between(birthday, LocalDate.now()) +" dias.");
//    }

    public static void main(String[] args) {
        String x = "1234567890";
        x = x.substring(4, 6);
        char y = x.charAt(1);

        x = y+x;
        System.out.println(x);
    }

}
