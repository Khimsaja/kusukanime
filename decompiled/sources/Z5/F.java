package Z5;

import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public interface F extends KSerializer {
    KSerializer[] childSerializers();

    KSerializer[] typeParametersSerializers();
}
