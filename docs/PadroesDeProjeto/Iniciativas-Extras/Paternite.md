# Paternite

## Introdução

A palavra "Pattern" presente na obra que inaugurou boa parte dos padrões discutidos possui dois sinônimos em inglês com uma tradução elucidativa para o português: "standard" e "default". "Standard" representa um padrão oficial ou uma definição definitiva, enquanto "default" é uma escolha atribuída quando nenhuma é ativamente determinada. Por outro lado, "Pattern" simplesmente se refere a um comportamento repetitivo observado em contextos similares e não necessariamente representa o modo definitivo ou o melhor.

Historicamente, o livro da Gang of Four surgiu paralelamente à linguagem Java, o que inevitavelmente os atrelou bastante, levando muitos a entender que um não funcionasse de modo independente do outro. Conforme o Java crescia, começou a surgir um uso exagerado de padrões de projeto em muitos sistemas, mesmo em contextos nos quais os ganhos de extensibilidade e flexibilidade eram questionáveis.

Esse fenômeno ficou conhecido como paternite e até recebeu comentários de John Ousterhout, autor de "A Philosophy of Software Design".

> "O maior risco dos padrões de projeto é a sua superaplicação (over-application). Nem todo problema precisa ser resolvido por meio de padrões de projeto; portanto, não tente forçar um problema a se encaixar em um padrão de projeto quando uma abordagem tradicional funcionar melhor. O uso de padrões de projeto não melhora necessariamente o projeto de um sistema de software; isso só acontece se for justificado. Assim como ocorre com outros conceitos, a noção de que padrões de projeto são bons não significa que quanto mais padrões de projeto usarmos, melhor será nosso sistema.

A confusão surge da convicção de que "Pattern" é sinônimo de "Standard", representando assim o definitivo e, na maioria das vezes, o melhor.

## Dissertando sobre a crítica

O objetivo fundamental dos padrões é tornar o projeto mais flexível. Por exemplo, Factories facilitam a troca do tipo dos objetos manipulados, Decorators permitem personalizar a classe com novas funcionalidades e Strategies permitem configurar os algoritmos usados por uma classe, entre outros. No entanto, cada um desses padrões possui suas desvantagens. Strategies exigem a criação de uma classe abstrata e mais uma classe para CADA algoritmo, Factories exigem a implementação de, pelo menos, mais uma classe, e assim por diante. Portanto, é necessário realizar uma análise crítica ao utilizá-los.

É realmente necessário criar objetos de tipos diferentes no sistema? Esses objetos serão realmente necessários? São perguntas que devem ser feitas antes de criar uma Factory. Os algoritmos utilizados na implementação de uma classe precisam ser parametrizados? Existem usuários que realmente precisarão de algoritmos alternativos? São questionamentos que devem ocorrer antes de escrever o código de um Strategy, por exemplo.

Levando Ousterhout a aprofundar seu comentário, ele menciona que Decorators criam complexidade desnecessária para a criação de arquivos em Java, já que é uma regra a necessidade de buffers ao abrir qualquer arquivo. Portanto, classes como FileInputStream e BufferedInputStream poderiam ser unificadas.




