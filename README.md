# Lab Project: Abstraindo formações da DIO usando Orientação a Objetos com Kotlin

## Implementado

* Além das classes indicadas no arquivo de exemplo, foi implementada a classe Atividades
* Na verdade, outras classes foram pensadas, já que a estrutura das formações da DIO parece ter 4 níveis: formação, conteúdos (cursos), tópicos (repositório de aulas) e atividades (aulas, material e teste)
* Ao invés de criar várias classes, optei por manter os tópicos e atividades na classe Atividades, usando o campo 'tipoAtividade' para diferenciá-los
* Também foi criado um OBJETO para manter os ids das instâncias criadas. A ideia seria poder reaproveitar as aulas em várias formações
* Algumas classes ENUM foram criadas para parametrizar algumas informações
* Optei por usar 'data class' ao invés de 'class' para tirar proveito da implementação default de alguns métodos
* As atividades podem ser relacionadas entre si através da propriedade 'pai', que indica o nível anterior de uma atividade. O valor 0 (zero) indica o primeiro nível. Qualquer outro valor indica que é o segundo nível e está associado à atividade PAI anterior.
* É possível incluir uma AULA como atividade-pai. Neste caso, não faz sentido incluir outra AULA como filha dessa atividade pai. Isso pode ser um ponto de vulnerabilidade

## Limitações
* Há uma limitação de níveis de atividade. Só são possíveis dois níveis (pai e filho). Inclusive, a exibição da 'árvore' da Formação exemplifica bem esta característica/limitação.
* Outra limitação é que não há uma validação sobre qual atividade-filha está associada a qual atividade-pai. Para fazer sentido, as atividades devem ser inseridas na ordem em que devem aparecer na listagem (TREE)
* Não está sendo feita nenhuma validação e espera-se que o usuário insira os dados na sequência correta.