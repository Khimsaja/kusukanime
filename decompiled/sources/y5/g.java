package y5;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class g implements h {
    public final h a;

    /* renamed from: b, reason: collision with root package name */
    public final e4.k f18383b;

    /* renamed from: c, reason: collision with root package name */
    public final e4.k f18384c;

    public g(h hVar, e4.k kVar, e4.k kVar2) {
        kotlin.jvm.internal.l.f("sequence", hVar);
        kotlin.jvm.internal.l.f("transformer", kVar);
        this.a = hVar;
        this.f18383b = kVar;
        this.f18384c = kVar2;
    }

    @Override // y5.h
    public final Iterator iterator() {
        return new e(this);
    }
}
