### 🔸 L — Liskov Substitution Principle (Princípio da Substituição de Liskov)

> “Seja q(x) uma propriedade que se pode provar do objeto x do tipo T.  
> Então, q(y) também é possível provar para o objeto y do tipo S, sendo S um subtipo de T.”  
> — *Barbara Liskov*

Classes filhas ou classes derivadas **nunca devem infringir comportamentos e definições de tipo** da classe base ou da interface à qual essas classes implementam.


**Pré-condição:**  
A subclasse **não pode exigir mais** do que a classe base exigia.

**Pós-condição:**  
A subclasse **não pode reduzir as garantias** fornecidas pela classe base após a execução do método.

**Invariância:**  
A subclasse **não pode alterar condições internas** que a classe base mantinha constantes.