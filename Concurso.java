import java.util.ArrayList;

class Concurso {

    String nome;
    ArrayList<Votante> votantes = new ArrayList<>();
    ArrayList<Candidato> candidatos = new ArrayList<>();

    void registrarVoto(Votante votante) {
        votantes.add(votante);
        votante.candidatoVotado.qtdeVotos++;
    }

    // Desconsidera empate
    Candidato quemVenceu() {
        if(candidatos.isEmpty()) {
            return null;
        }
        Candidato maisVotado = candidatos.get(0);
        for(int i = 1; i < candidatos.size(); i++) {
            if(candidatos.get(i).qtdeVotos > maisVotado.qtdeVotos) {
                maisVotado = candidatos.get(i);
            }
        }
        return maisVotado;
    }

}