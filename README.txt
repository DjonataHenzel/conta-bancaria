Observação: Atividade realizada para apreendizagem

Configurações:
-> Eclipse
-> JDK 16

Detalhamento do projeto
-> Projeto realizado para apreendizagem, no qual encontramos como correntistas (clientes do banco) tanto pessoas físicas (cidadãos comuns) quanto pessoas jurídicas (empresas), porém, toda empresa
terá uma pessoa física responsável (um funcionário) por sua conta bancária:
-> Importante:
I) No diagrama há sinais que indicam se os membros das classes são: “ - ” privados ou “+” públicos;
II) Perceba que só há associações da classe TstConta com apenas 2 outras classes: PessoaJuridica e NumException. Sendo assim, na classe TstConta, só haverá estes 2 tipos de objetos;
III) Métodos Construtores: excepcionalmente nesta prova não serão desenvolvidos os métodos construtores. Desta forma, a instanciação de cada atributo será feita (obrigatoriamente) na mesma
linha de sua declaração e da seguinte maneira:
- Os de tipos numerais com zeros;
- Os de tipos literais com espaço em branco;
- E, quando forem objetos, instancie com o seu respectivo tipo;
VI) O diagrama de classes descreve as únicas classes que deverá construir para resolução da prova;

Observações:
-> As classes Endereco, PessoaFisica e PessoaJuridica NÃO poderão ser herdadas (será descontado 0,15 ponto de
cada classe que não atender esta colocação).
-> A classe NumException, trata-se de uma classe de exceção do tipo verificada. Esta classe contém (apenas) o
método chamado impMsg() que, ao ser chamado, imprimirá a mensagem: “ERRO: Não pode haver Número
Negativo para conta!”. O método impMsg() será utilizado na classe TstConta.
-> Interface Verifica: contém um método chamado validar(), que não tem retorno e não recebe parâmetros. Quando
implementado deverá verificar o Número da Conta e imprimir na tela se este é par ou é ímpar;
-> A classe ClienteBanco é abstrata e contém:
D1) um método abstrato chamado “verifDoc” o qual verificará:
a) Em PessoaFisica: se o valor informado para o atributo CPF está entre 10 e 20. Caso o valor esteja fora
desta escala, informará na tela a mensagem “CPF inválido”, se não, informará na tela a mensagem
“CPF válido”;
-> Em PessoaJuridica: se a quantidade de letras do nome do “responsavel” é maior que 30, caso seja
deverá informar na tela a mensagem “Nome inválido para Responsável”, se não, informará na tela a
mensagem “Nome válido para Responsável”;
-> O seu método setNumeroConta: se valor informado for positivo, atribuirá este valor ao atributo
numeroConta, se não, deverá disparar uma exceção do tipo NumException;
-> Contém um atributo chamado ender, que define os dados cadastrais dos clientes do banco, seja esta pessoa
física ou jurídica;
-> A classe PessoaJuridica contém um atributo denominado responsavel, este indica uma pessoa física da empresa
incumbida de gerenciar a conta.