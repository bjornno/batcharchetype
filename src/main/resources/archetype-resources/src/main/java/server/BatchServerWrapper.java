package ${groupId}.server;

import no.bbs.shared.server.core.DataSourceWebServer;

public class BatchServerWrapper {

    public static void main(String[] args) {
        DataSourceWebServer server = new DataSourceWebServer();
        server.addDataSource("jdbc/primaryDs");
        server.addLocalWebContext("/batch");
        server.start();
    }
}