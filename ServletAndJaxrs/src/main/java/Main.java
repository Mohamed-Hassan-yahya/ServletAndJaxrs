//import org.glassfish.grizzly.http.server.HttpServer;
//import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
//import org.glassfish.jersey.server.ResourceConfig;
//
//import java.net.URI;
//
//public class Main {
//    public static final String BASE_URI = "http://localhost:8080/api/";
//
//    public static HttpServer startServer() {
//        // Scan default package (empty string)
//        final ResourceConfig config = new ResourceConfig().packages("");
//        return GrizzlyHttpServerFactory.createHttpServer(URI.create(BASE_URI), config);
//    }
//
//public static void main(String[] args) {
//        HttpServer server = startServer();
//        System.out.println("Server running at " + BASE_URI);
//        System.out.println("Press Enter to stop...");
//        try {
//            System.in.read();
//        } catch (Exception ignored) {}
//        server.shutdownNow();
//    }
//}
