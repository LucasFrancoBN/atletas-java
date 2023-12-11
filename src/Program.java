import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Qual a quantidade de atletas? ");
    byte numbersOfAthletes = sc.nextByte();
    float totalOfMass = 0f;
    float heightOfWomen = 0f;
    byte numbersOfWomen = 0;
    byte numbersOfMen = 0;
    float maxHeight = 0f;
    String tallestAthlete = "";

    while(numbersOfAthletes <= 0) {
      System.out.println("DIGITE UM NÚMERO MAIOR QUE 0 PARA QUANTIDADE DE ATLETAS");
      System.out.print("Digite o número de atletas: ");
      numbersOfAthletes = sc.nextByte();
    }

    for(int i = 0; i < numbersOfAthletes; i++) {
      System.out.printf("Digite os dados do atleta numero %d:%n", i + 1);
      sc.nextLine();
      System.out.print("Nome: ");
      String name = sc.nextLine();
      System.out.print("Sexo: ");
      char sex = sc.next().charAt(0);

      while(sex != 'F' && sex != 'M') {
        System.out.print("Valor inválido! Favor digitar F ou M: ");
        sex = sc.next().charAt(0);
      }

      System.out.print("Altura: ");
      float height = sc.nextFloat();

      while(height <= 0) {
        System.out.print("Valor inválido! Favor digitar um valor maior que 0: ");
        height = sc.nextFloat();
      }

      System.out.print("Peso: ");
      float mass = sc.nextFloat();

      while(mass <= 0) {
        System.out.print("Valor inválido! Favor digitar um valor maior que 0: ");
        mass = sc.nextFloat();
      }

      totalOfMass += mass;
      if(sex == 'F') {
        numbersOfWomen++;
        heightOfWomen += height;
      } else {
        numbersOfMen++;
      }

      if(maxHeight < height) {
        maxHeight = height;
        tallestAthlete = name;
      }
    }

    System.out.println();

    System.out.println("RELATÓRIO: ");
    System.out.printf("Peso médio dos atletas: %.2f%n", totalOfMass / numbersOfAthletes);
    System.out.printf("Atleta mais alto: %s%n", tallestAthlete);
    System.out.printf("Porcentagem de homens: %.1f%% %n", (float) numbersOfMen / numbersOfAthletes * 100);
    if(numbersOfWomen <= 0) {
      System.out.println("Não há mulheres cadastradas");
    } else {
      System.out.printf("Altura média das mulheres: %.2f", heightOfWomen / numbersOfWomen);
    }

  }
}
