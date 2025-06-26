# Princípio da Substituição de Liskov (LSP) — Pós-condição

## 🧠 Contexto

No exemplo analisado, temos uma interface `ReportGeneratorInterface` com implementações como:

- `CSVReportGenerator`
- `PDFReportGenerator`
- `S3ReportGenerator`

Todas implementam o método `generate()`, que deve retornar um caminho para o relatório gerado.

## ❌ Violação da Pós-condição

Segundo o **LSP**, uma **subclasse deve manter as garantias da classe base**.

Uma das regras do LSP é a **Pós-condição**:

> **Pós-condição:**  
> *A subclasse **não pode reduzir** as garantias fornecidas pela classe base após a execução do método.*

No nosso caso:

- A classe base (ex: `CSVReportGenerator`) garante que:
  - O caminho retornado é um **arquivo local**.
  - O **arquivo existe** após `generate()`.

No entanto, `S3ReportGenerator` retorna uma **URL na nuvem**, e não um arquivo local.  
Se outra parte do sistema usa `fileExists(path)` ou `Files.readAllBytes(path)`, isso **quebra**.

### 📌 Resultado:
- A subclasse **não mantém as garantias da base**.
- Portanto, **viola o LSP**, especificamente a **pós-condição**.

## ✅ Solução com Segregação de Interface (ISP)

Uma solução adequada é **separar as responsabilidades em duas interfaces**:

```java
public interface LocalReportGenerator {
    Path generateLocal(); // Garante arquivo local
}

public interface CloudReportGenerator {
    URL generateUrl(); // Garante recurso acessível via rede
}

