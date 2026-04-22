import static java.lang.IO.*;

void main() {

    int varX = Integer.parseInt(readln("Digite o primeiro número: "));

    int varY = Integer.parseInt(readln("Digite agora o segundo número: "));

    int varZ = Integer.parseInt((readln("Digite agora o terceiro número: ")));

    int soma = varX + varY + varZ;
    if (soma >= 100) {
        IO.print("A soma é igual a 100! ");
    } else {
        IO.print("A soma não é equivalente a 100!");


    }
}