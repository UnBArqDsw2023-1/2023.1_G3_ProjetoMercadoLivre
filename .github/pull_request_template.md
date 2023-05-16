
Antes:
- Nomeie o pull request de forma clara e objetiva, de modo que seja fácil identificar o que ele se trata.
- Adicione assignees, pessoas que trabalharam na issue.
- Adicione reviewers (pelo menos quatro), pessoas que irão revisar as alterações, e aguardar a aprovação de todas elas antes de fazer o merge.
- Adicione labels que identifiquem o tipo de pull request.
    - Caso o pull request não esteja pronto para ser revisado, adicione o label `WIP` (work in progress).
- Adicione a pull request a uma milestone, caso ela esteja relacionada a alguma.

Apague tudo que estiver acima desta linha e preencha o template abaixo.

----------------------------------------------------------------------------------------------------------------------------
# Descrição
Descreva aqui o que foi feito no pull request, qual issue ele resolve e quais tarefas (tasks) forams feitas, etc. Seja o mais claro possível.

## Issues relacionadas
Adicione aqui as issues relacionadas a esse pull request, utilizando o formato `#<numero da issue>`. Se houver mais de uma, separe-as por vírgula. Exemplo: `#1, #2, #3`. Isso irá linkar as issues ao pull request e garantir que elas sejam fechadas quando o pull request for fechado.

### Tipo de mudança
Qual tipo de mudança sua branch introduz no projeto?
_Ponha um `x` nas caixas que se aplicam_ e apague o que não se aplicar.

- [ ] Bugfix (mudança que não quebra o código e resolve um problema)
- [ ] Nova funcionalidade (mudança que não quebra o código e adiciona uma funcionalidade)
- [ ] Mudança que quebra o código (mudança que quebra o código ou que faz com que uma funcionalidade existente não funcione como esperado)
- [ ] Atualização de documentação (se nenhuma das outras opções se aplicar)

A mudança requer atualização de documentação? Se sim, qual?

## Checklist
_Ponha um `x` nas caixas que se aplicam. Você também pode preencher depois de criar o pull request._

- [ ] Li o documento [CONTRIBUTING.md](../CONTRIBUTING.md).
- [ ] Documentei minhas mudanças (se necessário).
- [ ] Todos os documentos possuem Histórico de Versão e estão atualizados (se necessário).
- [ ] Todos os documentos possuem as referências corretas (se necessário).
- [ ] Adicionei testes relacionados as minhas mudanças e todos os testes estão passando (se necessário).
- [ ] Revisei minhas alterações.
- [ ] Resolvi eventuais conflitos de merge com a branch que quero mesclar.

## Screenshots (se aplicável)
Adicione aqui screenshots que sejam relevantes para o pull request.

## Testes realizados (se aplicável)
Descreva aqui os testes que você realizou, sejam eles de aceitação, de unidade, etc. Se um teste falhou, descreva o que aconteceu.

Descreva também como executar os testes. Caso tenha utilizado alguma ferramenta automatizada para testes, especifique qual. 

## Comentários adicionais (opcional)
Pode ser qualquer coisa, desde que seja relevante para o pull request. Como o porquê de ter escolhido uma solução, o que você considerou, etc.

Como o pull request é um ambiente de discussão, você pode colocar aqui também dúvidas que você tenha, ou queira discutir com os revisores. it fixes a bug or resolves a feature request, be sure to link to that issue.
