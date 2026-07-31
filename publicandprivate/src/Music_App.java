void main (){


//Crie um projeto chamado Spotfify & criar 3 classes com seus atributos.
//Solicitar ao usuário para cadastrar 3 músicas e mostrar em ordem alfabética.

IO.println("======= Cadastre a Sua Música =======");
    Scanner sc = new Scanner(System.in);
    String[] musica = new String[3];

    for(int i = 0; i <musica.length; i++){
        IO.println("Digite sua "+ (i+1)+"º Musica: ");
        musica[i] = sc.nextLine();
    }
    Arrays.sort(musica);

    IO.println("Sua Playlist: ");
    for (String playlist : musica){
        IO.println("-"+playlist);
    }

}