package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTercerizado;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Funcionario> lista = new ArrayList<>();

		System.out.println("informe o numero de Funcionario:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Funcionario #" + i + ":");
			
			System.out.println("Tecerizado: (y/n):");
			char ch = sc.next().charAt(0);

			System.out.println("Nome: ");
			String nome = sc.next();

			System.out.println("Horas: ");
			int hora = sc.nextInt();

			System.out.println("Valor por horas:");
			Double ValorPorHoras = sc.nextDouble();

			if (ch == 'y') {
				System.out.println("Dispesa adicional:");
				Double DispesaAdicional = sc.nextDouble();
				
				Funcionario funcionario = new FuncionarioTercerizado(nome, hora, ValorPorHoras, DispesaAdicional);
				
				lista.add(funcionario);
			} else {
				Funcionario funcionario = new Funcionario(nome, hora, ValorPorHoras);
				
				lista.add(funcionario);
			}
		}
		System.out.println();

		System.out.println("Pagamentos:");
		
		for (Funcionario funcionario : lista) {
			System.out.println(funcionario.getNome() + " - $ " + String.format("%.2f", funcionario.Pagamento()));
		}

		sc.close();
	}
}
