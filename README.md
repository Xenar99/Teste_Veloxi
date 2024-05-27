Para incrementação de dados correta "Em campo", remover as anotações comentadas como "<!-- Somente para testes -->" no arquivo persistence.xml 
em Web.xml alterar o contexto de parâmetro de
<context-param>
        <param-name> jakarta.faces.PROJECT_STAGE</param-name>
        <param-value>Development</param-value>
    </context-param>
Para:
<context-param>
        <param-name> jakarta.faces.PROJECT_STAGE</param-name>
        <param-value>Production</param-value>
    </context-param>

Detalhes do último Commit:

- Não foi possível configurar a visualização do Banco de dados no index.xhtml 
devido à inúmera quantidade de erros provenientes da não constatação do hibernate com a classe Entity_Equipamento.
- Botão cadastrar funcional, leva para a outra guia "Cadastro.xhtml"
- Guia de cadastro não incrementa os itens no banco de dados MySql, porém apresenta os erros e funcionalidades do PrimeFaces
