# Convenção de Commits - `12-semanas-dev`

Decidido em 30/07/2026. Vale a partir do Dia 4.
Escopo: **só mensagem de commit.** Branch e versionamento ficam de fora de propósito, ver seção 7.

---

## 1. Por que convencionar aqui

O argumento clássico a favor de Conventional Commits é automação: changelog, versão e deploy calculados sozinhos. **Nenhum desses existe neste repo**, e é por isso que a seção 7 rejeita SemVer e branch. Dois outros motivos sustentam a adoção:

**Log legível sem abrir arquivo.** O formato anterior era `Dia N (DD/MM) | Exercícios: X (resolvidos: Y, travei: Z)`, uma coluna de contadores que obrigava a abrir o `diario.md` para saber o que tinha sido feito. Com tipo e escopo, o `git log --oneline` basta.

**Métrica não pertence à mensagem de commit.** Contagem de exercícios já vive no `diario.md` e no Sheets. Um terceiro lugar passa a mentir assim que um número for corrigido, porque mensagem publicada não se reescreve sem `--force`.

A mensagem responde uma pergunta só: **o que mudou neste commit.**

---

## 2. A gramática

```
tipo(escopo): descrição no infinitivo

corpo opcional, explicando o porquê
```

- `tipo` - obrigatório, minúsculo, da lista da seção 3.
- `(escopo)` - opcional, da lista da seção 4. Usar sempre que houver um que sirva.
- `descrição` - infinitivo, minúscula inicial, sem ponto final, sem acento, até ~50 caracteres.
- `corpo` - raro. Só quando o porquê não é óbvio. Linha em branco antes.

**Infinitivo, não terceira pessoa nem passado.** O teste é "se aplicado, este commit irá ___":

> "Se aplicado, este commit irá **resolver** 1001."

`resolver` passa. `resolve` e `resolvido` não. Em inglês a especificação pede imperativo porque lá o imperativo é o verbo nu (`add`); em português o equivalente funcional é o infinitivo.

**Sem acento.** Git Bash no Windows às vezes grava em latin1 e o GitHub renderiza `cabeçalho` como `cabeÃ§alho`.

---

## 3. Os seis tipos

Lista fechada.

| Tipo | Significa | Neste repo |
|---|---|---|
| `feat` | funcionalidade nova | exercício resolvido, reconstrução que funcionou |
| `fix` | corrige algo que existia e estava quebrado | exercício com resultado errado que passou a acertar |
| `refactor` | estrutura muda, comportamento não | reescrever a solução sem mudar a saída |
| `test` | testes | Fase 3, JUnit e Mockito na API |
| `docs` | documentação | `diario.md`, `README.md`, este arquivo |
| `chore` | manutenção sem efeito em comportamento | `.gitignore`, criar pasta, mover arquivo, config de IDE |

**`feat` ou `fix`: o verbo decide.** Coisa nova vira `feat`. Coisa que existia e estava errada vira `fix`. Exercício resolvido pela primeira vez é sempre `feat`, mesmo que o enunciado diga "corrija" - o que importa é o que mudou neste repositório, não o texto do problema.

**`feat` ou `chore`.** Criar a pasta vazia é `chore`. Colocar o arquivo rodando dentro dela é `feat`.

---

## 4. Os escopos

| Escopo | Cobre |
|---|---|
| `beecrowd` | `pratica/src/beecrowd/` |
| `exercism` | `pratica/src/exercism/` |
| `javanauta` | `pratica/src/javanauta/`, reconstruções e exercícios do curso, sempre escritos do zero |
| `diario` | `diario.md` |
| *(sem escopo)* | raiz: `.gitignore`, `README.md`, config |

O escopo é o que impede o `feat:` de virar ruído num repo onde quase todo commit é exercício. Ele também habilita `git log --oneline --grep="beecrowd"`.

Pasta nova entra nesta tabela antes de virar escopo. Escopo inventado na hora do commit é escopo que ninguém encontra depois.

---

## 5. Um exercício, um commit

**Não agrupar dois exercícios numa mensagem só.**

- `git revert` e `git bisect` passam a operar na unidade certa.
- A contagem de commits `feat` vira a métrica, sem contador dentro da mensagem.
- Obriga a commitar durante o bloco, não empilhado no Fechamento.

O limite: atômico é uma unidade de trabalho concluída, não o menor diff possível. Se um exercício exigiu três arquivos, os três vão no mesmo commit.

---

## 6. O Fechamento de um dia

Código primeiro, registro depois:

```bash
git add pratica/src/beecrowd/Bee1004.java
git commit -m "feat(beecrowd): resolver 1004"

git add pratica/src/beecrowd/Bee1005.java
git commit -m "feat(beecrowd): resolver 1005"

git add diario.md
git commit -m "docs(diario): registrar dia 5"

git push
```

Dia sem exercício resolvido tem um commit só, e isso é o dado:

```
docs(diario): registrar dia 7 sem exercicio concluido
```

Commit de estrutura fica separado do commit do dia:

```
chore: adicionar .gitignore
```

---

## 7. O que não se adota aqui

**Semantic Versioning.** `MAJOR.MINOR.PATCH` numera um artefato que alguém consome e cuja compatibilidade pode quebrar. Um caderno de exercícios não tem release, consumidor nem compatibilidade.

**Estratégia de branch.** Uma `main`, dev solo, sem revisor. Isso já é trunk-based; nomear não muda nada.

**Onde os dois entram:** no projeto da Fase 2, a API de controle de leituras. Ali existe produto, endpoint público e deploy, e aí SemVer e branch passam a ter função.

---

## 8. Erros a evitar

| Erro | Por quê |
|---|---|
| `ajustes`, `wip`, `update` | não dizem o quê nem por quê |
| `feat(beecrowd): resolver 3 exercicios` | quantos não é o que mudou, quais é |
| `feat(beecrowd): resolver 1001 e 1003` | dois entregáveis independentes são dois commits |
| `feat(beecrowd): resolvido 1007` | passado falha no teste "este commit irá ___" |
| `git add .` no fim do dia | junta exercício, diário e config e destrói a distinção |
| tipo escolhido pelo tamanho do diff | `chore` não é "commit pequeno" nem `feat` é "commit importante" |

---

## 9. Referência rápida

```
feat(escopo): descricao        exercicio resolvido, capacidade nova
fix(escopo): descricao         existia e estava errado
refactor(escopo): descricao    estrutura muda, comportamento nao
test(escopo): descricao        Fase 3, semana 9
docs(escopo): descricao        diario, README, este arquivo
chore: descricao               config, pasta, arquivo movido

escopos: beecrowd | exercism | javanauta | diario | (nenhum, para a raiz)
regras:  infinitivo · minuscula · sem ponto final · sem acento · ~50 chars
         1 exercicio = 1 commit · teste: "este commit ira ___"
```
