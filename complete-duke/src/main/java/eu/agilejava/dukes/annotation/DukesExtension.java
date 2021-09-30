package eu.agilejava.dukes.annotation;

import jakarta.enterprise.event.Observes;
import jakarta.enterprise.inject.spi.Extension;
import jakarta.enterprise.inject.spi.ProcessAnnotatedType;
import jakarta.enterprise.inject.spi.WithAnnotations;

import java.util.logging.Logger;

public class DukesExtension implements Extension {

    private static final Logger LOGGER = Logger.getLogger("eu.agilejava.dukes");

    <T> void processAnnotatedType(@Observes @WithAnnotations(Dukes.class) ProcessAnnotatedType<T> dukeAnnotated) {

        LOGGER.config(() -> "==============================================================================");
        LOGGER.config(() -> "Found @Dukes annotated class:" + dukeAnnotated.getAnnotatedType().getJavaClass().getName());
        LOGGER.config(() -> "Dukes message is: " + dukeAnnotated.getAnnotatedType().getAnnotation(Dukes.class).message());
        LOGGER.config(() -> "==============================================================================");
    }
}
