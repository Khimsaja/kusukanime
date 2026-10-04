package D;

import B1.C0017d;
import java.util.List;
import w0.InterfaceC2173H;
import w0.InterfaceC2197o;

/* renamed from: D.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077v implements InterfaceC2173H {
    public final /* synthetic */ C0053g0 a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f1296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N0.w f1297c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N0.q f1298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ T0.b f1299e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1300f;

    /* JADX WARN: Multi-variable type inference failed */
    public C0077v(C0053g0 c0053g0, e4.k kVar, N0.w wVar, N0.q qVar, T0.b bVar, int i7) {
        this.a = c0053g0;
        this.f1296b = (kotlin.jvm.internal.m) kVar;
        this.f1297c = wVar;
        this.f1298d = qVar;
        this.f1299e = bVar;
        this.f1300f = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0134  */
    /* JADX WARN: Type inference failed for: r2v22, types: [e4.k, kotlin.jvm.internal.m] */
    @Override // w0.InterfaceC2173H
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w0.InterfaceC2174I b(w0.InterfaceC2175J r24, java.util.List r25, long r26) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D.C0077v.b(w0.J, java.util.List, long):w0.I");
    }

    @Override // w0.InterfaceC2173H
    public final int c(InterfaceC2197o interfaceC2197o, List list, int i7) {
        C0053g0 c0053g0 = this.a;
        c0053g0.a.a(interfaceC2197o.getLayoutDirection());
        C0017d c0017d = c0053g0.a.f1262j;
        if (c0017d != null) {
            return AbstractC0047d0.k(c0017d.c());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }
}
