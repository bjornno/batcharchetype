package ${groupId}.server;

import org.mortbay.jetty.Server;

public class JettyServer {
    public static void main(String[] args) {
//        EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//        EmbeddedDatabase db = builder.setType(EmbeddedDatabaseType.HSQL).build();

        Server server = new org.mortbay.jetty.Server(8080);
        server.addHandler(
                new org.mortbay.jetty.webapp.WebAppContext("src/main/webapp", "/batch"));
        try {
            server.start();
        } catch (Exception e) {
            System.exit(-1);
        }
    }
}
