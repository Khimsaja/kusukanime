package v4;

import P3.x;
import f6.AbstractC0915m;
import java.util.Iterator;

/* renamed from: v4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2158f implements h {
    @Override // v4.h
    public final /* bridge */ boolean d(W4.c cVar) {
        return AbstractC0915m.x(this, cVar);
    }

    @Override // v4.h
    public final boolean isEmpty() {
        return true;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return x.f7778k;
    }

    @Override // v4.h
    public final InterfaceC2154b l(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        return null;
    }

    public final String toString() {
        return "EMPTY";
    }
}
