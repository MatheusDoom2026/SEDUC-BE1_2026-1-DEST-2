import static java.lang.IO.print;
import static java.lang.IO.readln;

void main() {

    int num = Integer.parseInt(readln( "Digite um número inteiro de 1 a 9: "));



    if (num >= 1 && num <= 9) {
        print("Valor está na faixa permitida.");

    } else {
        print("O valor está fora da da faixa");
    }


}