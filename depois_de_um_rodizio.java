import static java.lang.IO.*;

void main() {
    int placa = Integer.parseInt(readln("Digite o número da placa do carro: "));

   String diaRodízio = switch (placa) {
       case 1, 2 -> "Segunda-Feira";
       case 3, 4 -> "Terça-Feira";
       case 5, 6 -> "Quarta-Feira";
       case 7, 8 -> "Quinta-Feira";
       case 9, 0 -> "Sexta-Feira";
       default -> "Placa Inválida";

   };print(diaRodízio);


   }








