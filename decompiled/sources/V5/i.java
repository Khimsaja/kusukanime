package V5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.KSerializer;

@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface i {
    Class with() default KSerializer.class;
}
