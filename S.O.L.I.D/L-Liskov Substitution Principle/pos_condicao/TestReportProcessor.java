
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestReportProcessor {

    public void process(ReportGeneratorInterface reportGenerator) {
        String path = reportGenerator.generator();

        // 🚫 Viola o Princípio de Liskov (LSP):
        // Se a implementação for S3ReportGenerator, o path será uma URL da web
        // E Files.exists(path) lançará erro pois espera um caminho local

        if (!Files.exists(Paths.get(path))) {
            // ❌ Lança exceção indevida ao usar uma subclasse legítima
            throw new IllegalStateException("O arquivo não existe");
        }

        // ✅ Lógica para processar o arquivo (somente funciona com arquivos locais)
        System.out.println("Processando relatório em: " + path);
    }
}
