# Fase 1 — Diagnóstico: enunciados detalhados

Versão expandida das 6 tarefas do diagnóstico do plano de 12 semanas.
Mesmas tarefas, mesma ordem, mesma regra: **sem IA, sem Stack Overflow, sem autocomplete**. Permitido: Oracle Java Docs.

Regras que valem para as 6:
- Uma tarefa por vez, na ordem. Só passa para a seguinte quando a anterior compila e roda.
- Cada tarefa é um arquivo novo, do zero. Não copiar o arquivo anterior e editar — o objetivo é justamente vencer o arquivo vazio.
- Nada de recurso extra (menu, validação, formatação bonita) que o enunciado não pediu.
- Onde travar por 15 min sem sair: anotar a dúvida e parar ali. **Onde parou é o diagnóstico.**

---

## 1. Olá na tela

**Objetivo:** provar que o ferramental funciona e que você escreve a estrutura mínima de um programa Java de memória.

**O que fazer:** um programa que, ao ser executado, imprime a palavra `Olá` no terminal e termina.

**Pronto quando:** compila sem erro e a saída no terminal é exatamente `Olá`.

**Armadilha:** o teste real aqui não é o texto, é lembrar sozinho a assinatura do método que inicia o programa e o nome do arquivo bater com o nome da classe. Se você precisou consultar isso, anote — é um dado do diagnóstico.

---

## 2. Soma de 5 números digitados

**Objetivo:** entrada do usuário + repetição.

**O que fazer:** o programa pede 5 números inteiros ao usuário, um de cada vez, lidos do teclado. Ao final, imprime a soma dos cinco.

**Entrada:** 5 inteiros digitados pelo usuário (um por linha).
**Saída:** uma linha com a soma, no formato `Soma: 42`.

**Restrições:**
- A leitura tem que estar dentro de um laço que roda 5 vezes. Cinco leituras copiadas e coladas não valem.
- A quantidade `5` deve aparecer em um único lugar do código — se você trocar para 10, só um número muda.
- Sem validação de entrada. Se digitarem letra, o programa pode quebrar. Não é o exercício.

**Pronto quando:** você roda, digita 1 2 3 4 5 e sai `Soma: 15`.

**Saber explicar:** por que a variável que acumula a soma precisa existir *antes* do laço.

---

## 3. Classe Item

**Objetivo:** materializar uma classe — a parte de POO que você reconhece na teoria mas não escreve de cabeça.

**O que fazer:** criar uma classe chamada `Item` que representa um item de uma lista de compras. Ela tem três características: `nome` (texto), `categoria` (texto) e `valor` (número com casas decimais).

A classe precisa ter:
- os três campos, privados;
- um construtor que recebe os três de uma vez e preenche o objeto;
- um método de leitura (getter) para cada campo;
- **nenhum setter** — o item nasce pronto e não muda.

**Pronto quando:** no programa principal você cria dois itens diferentes com o construtor e imprime o nome de cada um usando o getter. Compila e roda.

**Armadilha:** usar `double` para dinheiro é errado em sistema real (ver `ponto-flutuante-e-valores-monetarios.md` neste projeto). Aqui está liberado de propósito — o exercício é a classe, não a precisão. Mas é exatamente o tipo de pergunta que cai em entrevista: saiba dizer por que `double` não serve para valor monetário.

---

## 4. Lista de itens

**Objetivo:** coleção + laço sobre objetos.

**O que fazer:** no programa principal, criar uma lista de `Item` (tipo `List<Item>`), adicionar 5 itens escritos direto no código — sem pedir nada ao usuário — e depois percorrer a lista imprimindo uma linha por item.

**Dados sugeridos** (use estes, para as tarefas 5 e 6 baterem):

| nome | categoria | valor |
|---|---|---|
| Arroz | comida | 25.90 |
| Sabão | limpeza | 12.50 |
| Feijão | comida | 9.80 |
| Detergente | limpeza | 3.20 |
| Café | comida | 18.00 |

**Saída esperada:** 5 linhas, no formato `Arroz - comida - 25.9`.

**Restrições:** os 5 itens entram na lista com o construtor da tarefa 3. A impressão é feita percorrendo a lista, não com 5 comandos de impressão.

**Pronto quando:** roda e imprime as 5 linhas na ordem em que foram adicionadas.

**Saber explicar:** por que se declara a variável como `List` e se cria como `ArrayList`.

---

## 5. Total de uma categoria fixa

**Objetivo:** decisão dentro do laço — filtrar enquanto percorre.

**O que fazer:** partindo do programa da tarefa 4, percorrer a lista uma única vez e somar o `valor` apenas dos itens cuja categoria seja `"comida"`. Imprimir o total no final.

A categoria procurada fica em uma constante no topo — trocar `"comida"` por `"limpeza"` deve exigir mudar **um** lugar só.

**Saída esperada:** uma linha, `Total de comida: 53.7`.

**Restrições:**
- Um laço só. Não filtrar antes criando outra lista.
- Comparação de texto em Java **não é** com `==`. Se você usou `==` e funcionou, funcionou por acidente — anote isso, é assunto de entrevista.

**Pronto quando:** com os dados da tabela acima, o total de `comida` dá 53.70 e o de `limpeza` dá 15.70 ao trocar a constante.

---

## 6. Total de todas as categorias

**Objetivo:** agrupamento. É aqui que se separa "sei as peças" de "sei montar".

**O que fazer:** mesmo programa, sem categoria fixa. Percorrendo a lista **uma única vez**, produzir o total gasto em **cada** categoria que existir na lista, e imprimir todos ao final.

O resultado é acumulado em um `HashMap<String, Double>`: a chave é a categoria, o valor é o total daquela categoria até ali.

**Saída esperada** (ordem não importa):
```
comida: 53.7
limpeza: 15.7
```

**Restrições:**
- O programa não pode saber de antemão quais categorias existem. Se eu acrescentar um item de categoria `"higiene"`, ele tem que aparecer na saída sem você mudar uma linha de código. Esse é o teste de verdade da tarefa.
- Um laço para acumular, e depois um laço para imprimir. Nada de percorrer a lista uma vez por categoria.

**O ponto onde quase todo mundo trava:** quando você chega em um item, a categoria dele pode já estar no mapa ou não. Você precisa tratar os dois casos — o que fazer na primeira vez que uma categoria aparece, e o que fazer nas seguintes. Se travar, é aqui. Escreva em português o que deve acontecer com cada item antes de escrever Java.

**Pronto quando:** acrescentar um sexto item de categoria nova e a saída ganhar uma linha sozinha.

---

## Como registrar o resultado

Para cada tarefa, no `diario.md`: número da tarefa, saiu sozinho (sim/não), onde travou, quanto tempo levou. Onde a sequência parou é o diagnóstico descrito no plano (sintaxe / POO / decomposição).