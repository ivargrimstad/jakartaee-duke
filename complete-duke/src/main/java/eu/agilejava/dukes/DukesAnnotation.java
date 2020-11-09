package eu.agilejava.dukes;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Stereotype;
import javax.enterprise.util.Nonbinding;
import java.lang.annotation.*;

@Stereotype
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ApplicationScoped
@Target(ElementType.TYPE)
public @interface DukesAnnotation {

    @Nonbinding
    String dukeMessage();
}
