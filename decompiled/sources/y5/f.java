package y5;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements h {
    public final h a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18381b;

    /* renamed from: c, reason: collision with root package name */
    public final e4.k f18382c;

    public f(h hVar, boolean z7, e4.k kVar) {
        this.a = hVar;
        this.f18381b = z7;
        this.f18382c = kVar;
    }

    @Override // y5.h
    public final Iterator iterator() {
        return new e(this);
    }
}
