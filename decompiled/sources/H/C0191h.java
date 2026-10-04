package H;

import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import h0.C0985h;
import h0.C0990m;
import j0.C1296b;
import y0.C2351F;

/* renamed from: H.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191h extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0821a f2978l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2979m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0985h f2980n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0990m f2981o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0191h(InterfaceC0821a interfaceC0821a, boolean z7, C0985h c0985h, C0990m c0990m) {
        super(1);
        this.f2978l = interfaceC0821a;
        this.f2979m = z7;
        this.f2980n = c0985h;
        this.f2981o = c0990m;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        C2351F c2351f = (C2351F) obj;
        c2351f.b();
        if (((Boolean) this.f2978l.invoke()).booleanValue()) {
            boolean z7 = this.f2979m;
            C0990m c0990m = this.f2981o;
            C0985h c0985h = this.f2980n;
            C1296b c1296b = c2351f.f17696k;
            if (z7) {
                long jV = c1296b.V();
                B2.l lVar = c1296b.f12205l;
                long jA = lVar.A();
                lVar.t().l();
                try {
                    ((X4.y) lVar.f416l).E(-1.0f, 1.0f, jV);
                    c1296b.e(c0985h, c0990m);
                } finally {
                    AbstractC0703b.y(lVar, jA);
                }
            } else {
                c1296b.e(c0985h, c0990m);
            }
        }
        return O3.C.a;
    }
}
