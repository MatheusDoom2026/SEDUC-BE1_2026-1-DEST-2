import static java.lang.IO.*;

void main() {

    float kmh = Integer.parseInt(readln("Digite a velocidade percorrida: "));

    if (kmh <= 80) {
        IO.print("Velocidade percorrida corretamente. Sem multa!");


    } else if (kmh > 85 && kmh <= 95) {
        IO.print("Velocidade um pouco acima do normal. Multa leve!");

    } else {
        IO.print("Velocidade ultrapassada pra caramba amigo? Multa gravissíma!");


    }
}