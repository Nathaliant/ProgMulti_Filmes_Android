package com.example.nathalia.filmesdb;

/*
 *Nathalia Nogueira Torres - 816114445
*/

public class FilmeDAO {
    private static Filme[] filmes;

    public FilmeDAO(){

    }

    public static Filme[] getFilmes(){
        if(filmes == null){
            filmes = new Filme[2];
            filmes[0] = new Filme(1,"ToyStory","A volta dos que nao foram","UP Altas Aventuras","Venom", 10);
            filmes[1] = new Filme(2,"Harry Potter","Pe Grande","O Retorno","Venom", 10);
            filmes[1] = new Filme(3,"O Encontro","22 Milhas","UP Altas Aventuras","Harry Potter", 10);
        }

        return filmes;
    }



}
