import servlets.TestServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * Created by AKarasev on 05.10.2015.
 */
public class Main {

    public static void main(String[] args) throws Exception{

        TestServlet testServlet = new TestServlet();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(testServlet),"/index");

        Server server = new Server(8080);
        server.setHandler(context);
        server.start();
        server.join();

    }
}
