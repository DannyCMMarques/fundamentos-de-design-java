import java.util.UUID;

public class S3ReportGenerator implements ReportGeneratorInterface {

    @Override
    public String generator() {
        // Código para gerar o relatório e salvar no S3 (simulado)
        String fileKey = "s3_report_" + UUID.randomUUID() + ".txt";

        // Pós-condição: o método sempre retorna a URL do arquivo gerado
        return "https://s3.amazonaws.com/mybucket/" + fileKey;
    }
}
