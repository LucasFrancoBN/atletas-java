# Desafio: Atletas

Proposta apresentada pelo curso DevSuperior, o desafio tem como objetivo ler e analisar dados os de N atletas e exibir um relatório dos dados obtidos. Abaixo estão as regras do desafio:

1. **Relatório:**
   
   O relatório deve conter os dados:
   - Peso médio dos atletas.
   - Nome do atleta mais alto.
   - Porcentagem de  homens.
   - Altura média das mulheres

2. **Não há mulheres:**
   
   Se não haver mulheres cadastradas no programa, o cálculo de média não deverá ser realizado e exibir no console "Não há mulheres cadastradas".

3. **Demais validações:**
   
   Fazer as validações para:
   - Altura e peso (não permitir valores negativos).
   - Permitir a entrada de apenas 'F' ou 'M' para o sexo do atleta.

## Exemplo
```plaintext
Qual a quantidade de atletas? 3

Digite os dados do atleta numero 1:
Nome: Carlos Silva
Sexo: M
Altura: -1.5
Valor invalido! Favor digitar um valor positivo: 0
Valor invalido! Favor digitar um valor positivo: 1.75
Peso: 84.8

Digite os dados do atleta numero 2:
Nome: Maria José
Sexo: F
Altura: 1.71
Peso: 64.5

Digite os dados do atleta numero 3:
Nome: Teresa Borges
Sexo: R
Valor invalido! Favor digitar F ou M: S
Valor invalido! Favor digitar F ou M: F
Altura: 1.65
Peso: 0
Valor invalido! Favor digitar um valor positivo: -60
Valor invalido! Favor digitar um valor positivo: 54.3

RELATÓRIO:
Peso médio dos atletas: 67.87
Atleta mais alto: Carlos Silva
Porcentagem de homens: 33.3 %
Altura média das mulheres: 1.68
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/atletas-java.git

# Acesse o diretório do projeto
cd atletas-java/src
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java

# Execute o programa
java Program
```
