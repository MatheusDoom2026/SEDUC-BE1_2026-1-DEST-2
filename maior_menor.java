import static java.lang.IO.*;

void main() {

    IO.print("Digite um número ");
    int varA = Integer.parseInt(readln("Digite um número: "));
    int varB = Integer.parseInt(readln( "Digite agora outro número: "));

    int varC = Integer.parseInt((readln( "Digite o valor de C: ")));

    if(varA > varB) {
        IO.print(varA + "-" + varB + "=" + (varA - varB));
    } else if(varB == varA) {
        IO.print(varB + "-" + varA + "=" + ((varB - varA)));
    } else {
        IO.print(varB + "-" + varA + "=" + varA);

    }

}