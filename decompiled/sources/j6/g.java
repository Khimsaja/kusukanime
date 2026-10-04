package j6;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g extends WeakReference {
    public final Object a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, Object obj) {
        super(iVar);
        kotlin.jvm.internal.l.f("referent", iVar);
        this.a = obj;
    }
}
