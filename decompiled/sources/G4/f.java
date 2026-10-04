package G4;

import java.util.ArrayList;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.y;

/* loaded from: classes.dex */
public final class f implements F4.g {

    /* renamed from: c, reason: collision with root package name */
    public static final F4.d f2866c = new F4.d(y.a.b(f.class));
    public boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2867b = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d("null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension", obj);
        f fVar = (f) obj;
        return this.a == fVar.a && l.a(this.f2867b, fVar.f2867b);
    }

    @Override // F4.c
    public final F4.d getType() {
        return f2866c;
    }

    public final int hashCode() {
        return this.f2867b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
