void main(){

//Crie um projeto chamado Spotfify & criar 3 classes com seus atributos.
//Solicitar ao usuário para cadastrar 3 músicas e mostrar em ordem alfabética.


}

public class Veiculo {

    public String cor;
    public String marca;
    public String modelo;

    public String acelerar(){
        return "vruuuummm";
    }

    public String freiar(){
        return "Hee Hee";
    }

    public Veiculo(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}


