package y;

import O1.W;
import m.AbstractC1474D;
import m.C1503x;

/* renamed from: y.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2306F {
    public final kotlin.jvm.internal.m a;

    /* renamed from: b, reason: collision with root package name */
    public final W f17576b;

    /* renamed from: c, reason: collision with root package name */
    public B2.l f17577c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2306F(e4.k kVar) {
        this.a = (kotlin.jvm.internal.m) kVar;
        W w7 = new W();
        int i7 = AbstractC1474D.a;
        w7.f7368m = new C1503x(6);
        w7.f7369n = new C1503x(6);
        this.f17576b = w7;
    }

    public final InterfaceC2305E a(int i7, long j7) {
        B2.l lVar = this.f17577c;
        if (lVar == null) {
            return C2325f.a;
        }
        C2316P c2316p = new C2316P(lVar, i7, j7, this.f17576b);
        ((InterfaceC2317Q) lVar.f418n).c(c2316p);
        return c2316p;
    }
}
