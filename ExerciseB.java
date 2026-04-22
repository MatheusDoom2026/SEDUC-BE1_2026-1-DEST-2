

import static java.lang.IO.readln;


void main() {
    int varN = Integer.parseInt(readln( "Digite um número: "));

    if(varN > 0) {
        IO.print("O número é positivo!");
    }else if (varN < 0) {
        IO.print("O número era negativo " + (varN * -1));
    }else {
        IO.print("Zero é neutro");

    }
}