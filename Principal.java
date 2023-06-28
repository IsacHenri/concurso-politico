class Principal {

    public static void main(String[] args) {

        Concurso concurso = new Concurso();
        concurso.nome = "Aluno/a mais bonito/a";

        Candidato c1 = new Candidato();
        c1.nome = "Joaozinho";
        c1.urlFoto = "https://via.placeholder.com/300x300?text=Joaozinho";
        c1.descricao = "...";
        c1.concurso = concurso;
        concurso.candidatos.add(c1);

        Candidato c2 = new Candidato();
        c2.nome = "Mariazinha";
        c2.urlFoto = "https://via.placeholder.com/300x300?text=Mariazinha"; 
        c2.descricao = "...";
        c2.concurso = concurso;
        concurso.candidatos.add(c2);

        Votante v1 = new Votante();
        v1.cpf = "0123";
        v1.nome = "Votante 1";
        v1.email = "votante1@gmail.com";
        v1.candidatoVotado = c1;
        concurso.registrarVoto(v1);

        Votante v2 = new Votante();
        v2.cpf = "01234";
        v2.nome = "Votante 2";
        v2.email = "votante2@gmail.com";
        v2.candidatoVotado = c1;
        concurso.registrarVoto(v2);

        Votante v3 = new Votante();
        v3.cpf = "012345";
        v3.nome = "Votante 3";
        v3.email = "votante3@gmail.com";
        v3.candidatoVotado = c2;
        concurso.registrarVoto(v3);

        System.out.println("Votos:");
        for(int i = 0; i < concurso.candidatos.size(); i++) {
            System.out.println(concurso.candidatos.get(i).nome + ": " + concurso.candidatos.get(i).qtdeVotos);
        }

        System.out.println("");
        Candidato vencedor = concurso.quemVenceu();
        System.out.println("Quem ganhou:");
        System.out.println(vencedor.nome);


    }

}