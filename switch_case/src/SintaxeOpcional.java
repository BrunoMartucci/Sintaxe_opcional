import java.util.Scanner;

public class SintaxeOpcional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			int x =sc.nextInt();
			String dia;
			
		switch (x) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Ter�a";
			break;
		case 4:
			dia  = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
			default:
				dia = "Valor Invalido";
		}
		
		System.out.println("Dia da semana: " + dia);
		sc.close();
	}
}
