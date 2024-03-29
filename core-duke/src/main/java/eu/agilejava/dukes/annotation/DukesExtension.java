package eu.agilejava.dukes.annotation;


import eu.agilejava.dukes.greeting.HelloDukeResource;
import jakarta.enterprise.inject.build.compatible.spi.BuildCompatibleExtension;
import jakarta.enterprise.inject.build.compatible.spi.ClassConfig;
import jakarta.enterprise.inject.build.compatible.spi.Enhancement;

import java.util.logging.Logger;

public class DukesExtension implements BuildCompatibleExtension {

    private static final Logger LOGGER = Logger.getLogger("eu.agilejava.dukes");

    @Enhancement(types = HelloDukeResource.class, withAnnotations = Dukes.class)
    public void enhanceDuke(ClassConfig dukeAnnotated) {

        LOGGER.config(() -> "==============================================================================");
        LOGGER.config(() -> "Found @Dukes annotated class:" + dukeAnnotated.info().name());
        LOGGER.config(() -> "Dukes message is: " + dukeAnnotated.info().annotation(Dukes.class).member("message").asString());
        LOGGER.config(() -> "==============================================================================");
    }
}


