package ${groupId}.server;

import no.bbs.shared.server.core.DataSourceWebServer;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

public class TestBatchServerWrapper {
    public static void main(String[] args) {
        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
        EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL).build();

        DataSourceWebServer server = new DataSourceWebServer();
        server.addPrimaryDataSource(db);
        server.addLocalWebContext("/batch");
        server.start();
    }
}
