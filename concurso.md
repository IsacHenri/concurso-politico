      Lacuna semântica (o quão distante é o significado do problema e da solução)
Problema <-------> Solução

Na orientação a objetos, há uma redução da lacuna semântica. Em outras palavras, a solução é muito mais próximo do problema.

# Requisitos

Escreva um sistema orientado a objetos que permite que pessoas votem em candidatos de um concurso. Para as pessoas, será necessário armazenar o e-mail, o CPF e o nome. Para os candidatos, é necessário ter uma URL de uma foto, o nome e uma descrição. Um concurso tem um nome. Um CPF só pode votar em um candidato. No final da votação, devemos ser capazes de saber quem ganhou.

# Identificação de tipos

## Organização de dados

Nome do concurso
CPF de cada votante
Nome de cada votante
E-mail de cada votante
Em qual candidato o votante votou
URL da foto de cada candidato
Nome de cada candidato
Descrição de cada candidato
De qual concurso é o candidato

Votante: CPF, nome e e-mail, qual candidato votou
Concurso: nome, quais candidatos, votantes, quais foram os votos
Candidato: URL da foto, nome, descrição, qual concurso, quantos votos recebeu

## Para os tipos que eu identifiquei, eu posso precisar de várias variáveis?

Votante: sim
Concurso: sim
Candidato: sim

## Você poderia também procurar por substantivos no negócio/requisitos/...

# Em Java

## Arquivo Votante.java

Aqui você vai definir o tipo Votante.

## Arquivo Candidato.java

Aqui você vai definir o tipo Candidato.

## Arquivo Concurso.java

Aqui você vai definir o tipo Concurso.

## Arquivo Principal.java

Aqui você vai criar o programa principal.

# Usando o Java

Se tiver dificuldades, use um ambiente Java online.

1. Instalar o JDK (Kit de Desenvolvimento do Java)
2. Abre o terminal
3. Entra na pasta com os arquivos .java
4. Digita: javac *.java (gerou vários arquivos .class)
5. Digita: java Principal

IntelliJ
Eclipse
Netbeans
VSCode

## Como declarar uma classe:
class Nome {
}

## Como declarar um atributo (dado de uma classe):
(Entre as chaves da classe)
Tipo nome;
Ex:
String nome;
Candidato votado;

Se for array, adicionar [] após o tipo:
Candidato[] candidatos;

Se for usar lista (prefira), use ArrayList por ora:
ArrayList<Candidato> candidatos = new ArrayList<>();

Equivalência entre array e ArrayList:
candidatos[i] -> candidatos.get(i);
candidatos.length -> candidatos.size();
candidatos.length == 0 -> candidatos.isEmpty();
candidatos[i] = valor -> candidatos.add(valor);

## Métodos (procedimentos) - igual C (para o que foi visto)
Retorno nome(Parâmetros) {
}
Ex:
void registraVoto(Votante votante) {
}

double fazCalculo() {
    return ...;
}

## Principal
int main() {} -> public static void main(String[] args) {}