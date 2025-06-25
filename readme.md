# Design Java - Boas Práticas

## Índice

1. [🔹 Princípios de Design](#1-princípios-de-design)
2. [🔹 Padrões de Projeto (Design Patterns)](#2-padrões-de-projeto-design-patterns)

---

## 1. Princípios de Design

### I. KISS (Keep It Simple, Stupid)

**Mantenha a simplicidade.** A maioria dos sistemas funciona melhor e é mais compreendida quando mantidos simples em vez de complexos.

#### Por que aplicar:
- Menos código leva menos tempo para ser escrito.
- Código simples tem menos bugs.
- É mais fácil de modificar e evoluir.
- "Simplicidade é a máxima sofisticação." – Leonardo da Vinci

> 💡 *"Parece que a perfeição é alcançada, não quando não há mais nada a adicionar, mas quando não há mais nada a tirar."* – Antoine de Saint-Exupéry

#### Como aplicar:
- Escreva programas menores
- Remova métodos e instâncias não utilizados
- Escreva código legível e transparente
- Use composição para reaproveitamento de código
- Pratique programação modular

> Outras variações de KISS:  
> "Keep it short and simple",  
> "Keep it smart and simple",  
> "Keep it simple and straight"

📚 Referência:  
- http://principles-wiki.net/principles:keep_it_simple_stupid  
- https://medium.com/@hlfdev/

---

### II. YAGNI (You Aren't Gonna Need It)

**"Você não vai precisar disso."** Não implemente algo até que realmente seja necessário.

#### Por que:
- Implementar funcionalidades antecipadas desperdiça esforço.
- Contribui para o inchaço e complexidade do código.
- Adiciona risco desnecessário à manutenção.

#### Como aplicar:
- Implemente **somente** quando for realmente necessário.
- Evite "adivinhar" funcionalidades futuras.

📚 Referência:  
- https://medium.com/@hlfdev/kiss-dry-solid-yagni-guia-simples-de-alguns-princ%C3%ADpios-de-clean-code-b3e4d9218c66

---

### III. Do The Simplest Thing That Could Possibly Work

**"Faça a coisa mais simples que poderia funcionar."**

#### Por que:
- O progresso real é alcançado quando se trabalha no problema real — sem adicionar complexidade desnecessária.

#### Como aplicar:
- Pergunte a si mesmo: *"Qual é a coisa mais simples que poderia funcionar?"*

> 💬 *"Simplicidade e elegância são impopulares porque exigem trabalho duro e disciplina para serem alcançadas, e educação para serem apreciadas."*  
> – Edsger W. Dijkstra

📚 Referência:  
- https://dev.to/scottshipp/the-simplest-thing-that-could-possibly-work-d6j

---

### IV. Separation of Concerns (Separação de Responsabilidades)

**Separar o sistema em seções que cuidam de interesses distintos.**

#### Exemplo:
- Interface do usuário (UI) x Lógica de negócios.

#### Por que:
- Facilita manutenção e evolução do software.
- Permite reutilização de partes do sistema.
- Evita que mudanças em uma parte impactem outra desnecessariamente.

#### Como aplicar:
- Divida a funcionalidade do programa em módulos com o mínimo de sobreposição possível.

> 💬 *"Focar a atenção em algum aspecto não significa ignorar os outros, mas sim fazer justiça ao fato de que, do ponto de vista daquele aspecto, os outros são irrelevantes."*  
> – Edsger W. Dijkstra (1974)

---

## 2. Padrões de Projeto (Design Patterns)

### Classificação dos Padrões

#### 👷‍♂️ Padrões Criacionais

- **Singleton**: Garante que apenas uma instância de uma classe seja criada.
- **Abstract Factory**: Cria famílias de objetos relacionados sem depender de classes concretas.
- **Builder**: Constrói objetos complexos passo a passo.
- **Prototype**: Cria objetos duplicando instâncias existentes.
- **Factory Method**: As subclasses decidem quais classes concretas serão instanciadas.

#### 🧩 Padrões Estruturais

- **Decorator**: Adiciona comportamento a objetos dinamicamente.
- **Proxy**: Controla o acesso a um objeto.
- **Flyweight**: Reutiliza instâncias para economizar memória.
- **Facade**: Simplifica interfaces complexas.
- **Composite**: Trata objetos e grupos de objetos de maneira uniforme.
- **Bridge**: Separa abstração da implementação.
- **Adapter**: Converte a interface de uma classe em outra esperada.

#### ⚙️ Padrões Comportamentais

- **Template Method**: Define o esqueleto de um algoritmo, delegando etapas às subclasses.
- **Visitor**: Adiciona novas operações sem alterar as classes dos elementos.
- **Command**: Encapsula uma requisição como um objeto.
- **Strategy**: Encapsula diferentes algoritmos intercambiáveis.
- **Chain of Responsibility**: Passa requisições por uma cadeia de manipuladores.
- **Iterator**: Percorre elementos de uma coleção sem expor sua estrutura.
- **Mediator**: Centraliza a comunicação entre objetos.
- **Memento**: Restaura um objeto a um estado anterior.
- **Interpreter**: Avalia sentenças de uma linguagem.
- **State**: Altera comportamento de um objeto conforme seu estado.
- **Observer**: Notifica objetos dependentes sobre mudanças de estado.

---

### Como saber se um padrão de design se aplica?

- Avalie a **aplicabilidade** do padrão ao seu problema
- Considere a **variabilidade dos serviços** (ex: microservices)
- Analise o **contexto real do software** (requisitos, manutenibilidade, extensibilidade)

---

.
