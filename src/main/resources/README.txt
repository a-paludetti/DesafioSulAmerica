APLICACAO REST EM JAVA 11, NECESSÁRIO JDK11 PARA RODAR

ARQUIVO data.sql CONTÉM O ESQUEMA DE INICIAÇÃO DO BANCO DE DADOS.

NOVOS USUÁRIOS DEVEM SER ENVIADOS EM ARQUIVO JSON, EXEMPLO NO ARQUIVO userExample.txt

MÉTODOS:
listagem de usuários: GET: localhost:#/api/desafio/user/
cadastro de novos usuarios: POST: localhost:#/api/desafio/user/
procura por CPF: GET: localhost:#/api/desafio/user/(cpf)
procura por genero e idade: GET localhost:#/api/desafio/user/(genero)/(idade)
procura por cargo: GET: localhost:#/api/desafio/user/(cargo)
procura por posicao: GET: localhost:#/api/desafio/user/(posicao)
procura por usuários ativos: GET: localhost:#/api/desafio/user/(true)

nota:
# = número da porta a ser utilizada
() = parametro necessário