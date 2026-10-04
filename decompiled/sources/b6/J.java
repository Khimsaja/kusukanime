package b6;

import Z5.A0;
import Z5.D0;
import Z5.G0;
import Z5.x0;
import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public abstract class J {
    public static final Set a = P3.m.v0(new SerialDescriptor[]{A0.f10280b, D0.f10286b, x0.f10369b, G0.f10292b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        kotlin.jvm.internal.l.f("<this>", serialDescriptor);
        return serialDescriptor.isInline() && a.contains(serialDescriptor);
    }
}
