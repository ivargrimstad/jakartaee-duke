package eu.agilejava.dukes;


import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.SeBootstrap;
import jakarta.ws.rs.core.Application;

import java.net.URI;

@ApplicationPath("")
public class CompleteDukeApplication extends Application {

    public static void main(String[] args) throws InterruptedException {

        Application app = new CompleteDukeApplication();
        SeBootstrap.Configuration config = SeBootstrap.Configuration.builder()
                .rootPath("booty-duke")
                .port(8081)
                .build();

        SeBootstrap.start(app, config).thenAccept(instance -> {
            instance.stopOnShutdown(stopResult -> stopResult.unwrap(Object.class));
            System.out.printf("\nBooty Duke running at %s\n", instance.configuration().baseUri());
            System.out.println("Send SIGKILL to shutdown.");
        });

        Thread.currentThread().join();
    }

}
