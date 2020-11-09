package eu.agilejava.dukes;

import javax.enterprise.event.Observes;
import javax.enterprise.inject.spi.Extension;
import javax.enterprise.inject.spi.ProcessAnnotatedType;
import javax.enterprise.inject.spi.WithAnnotations;
import java.util.logging.Logger;

public class DukesExtension implements Extension {

    private static final Logger LOGGER = Logger.getLogger("eu.agilejava.dukes");

    <T> void processAnnotatedType(@Observes @WithAnnotations(DukesAnnotation.class) ProcessAnnotatedType<T> dukeAnnotated) {

        LOGGER.config(() -> "==============================================================================");
        LOGGER.config(() -> "Found @DukesAnnotation annotated class:" + dukeAnnotated.getAnnotatedType().getJavaClass().getName());
        LOGGER.config(() -> "Dukes message is: " + dukeAnnotated.getAnnotatedType().getAnnotation(DukesAnnotation.class).dukeMessage());
        LOGGER.config(() -> "==============================================================================");
    }
}
