package y5;

import i1.C1058k;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o implements h {
    public final h a;

    /* renamed from: b, reason: collision with root package name */
    public final e4.k f18392b;

    public o(h hVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("sequence", hVar);
        kotlin.jvm.internal.l.f("transformer", kVar);
        this.a = hVar;
        this.f18392b = kVar;
    }

    @Override // y5.h
    public final Iterator iterator() {
        return new C1058k(this);
    }
}
