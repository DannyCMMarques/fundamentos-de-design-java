import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

public class CSVReportGenerator implements ReportGeneratorInterface {

    @Override
    public String generator() {
        // 🟩 Código para gerar o Relatório em CSV
        String fileName = "report_" + UUID.randomUUID() + ".csv";
        String path = "reports/" + fileName;

        try {
            Files.createDirectories(Path.of("reports"));
            Files.writeString(Path.of(path), "coluna1,coluna2,coluna3\nvalor1,valor2,valor3");
        } catch (IOException e) {
            throw new RuntimeException("Erro ao gerar relatório CSV", e);
        }

        return path;
    }
}
