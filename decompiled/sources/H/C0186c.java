package H;

import O.C0486d;
import O.C0502l;
import O.C0510p;
import O.InterfaceC0501k0;
import b1.AbstractC0703b;
import e4.InterfaceC0821a;
import v.AbstractC2123b;
import v.e0;
import v.f0;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: H.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186c extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f2954l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2955m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ a0.q f2956n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0196m f2957o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0186c(long j7, boolean z7, a0.q qVar, InterfaceC0196m interfaceC0196m) {
        super(2);
        this.f2954l = j7;
        this.f2955m = z7;
        this.f2956n = qVar;
        this.f2957o = interfaceC0196m;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            long j7 = this.f2954l;
            O.T t7 = C0502l.a;
            InterfaceC0196m interfaceC0196m = this.f2957o;
            boolean z7 = this.f2955m;
            if (j7 != 9205357640488583168L) {
                c0510p.R(-837727128);
                v.M m7 = z7 ? AbstractC2123b.f16430b : AbstractC2123b.a;
                a0.q qVarI = androidx.compose.foundation.layout.c.i(this.f2956n, Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j7 & 4294967295L)), 0.0f, 0.0f, 12);
                f0 f0VarB = e0.b(m7, a0.b.f10390t, c0510p, 0);
                int i7 = c0510p.f7128P;
                InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
                a0.q qVarC = a0.a.c(c0510p, qVarI);
                InterfaceC2364k.f17877j.getClass();
                C2362i c2362i = C2363j.f17871b;
                c0510p.V();
                if (c0510p.f7127O) {
                    c0510p.l(c2362i);
                } else {
                    c0510p.e0();
                }
                C0486d.R(c0510p, C2363j.f17875f, f0VarB);
                C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
                C2361h c2361h = C2363j.f17876g;
                if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
                    AbstractC0703b.u(i7, c0510p, i7, c2361h);
                }
                C0486d.R(c0510p, C2363j.f17873d, qVarC);
                a0.n nVar = a0.n.a;
                boolean zH = c0510p.h(interfaceC0196m);
                Object objH = c0510p.H();
                if (zH || objH == t7) {
                    objH = new C0185b(interfaceC0196m, 0);
                    c0510p.b0(objH);
                }
                android.support.v4.media.session.b.h(nVar, (InterfaceC0821a) objH, z7, c0510p, 6);
                c0510p.p(true);
                c0510p.p(false);
            } else {
                c0510p.R(-836867312);
                boolean zH2 = c0510p.h(interfaceC0196m);
                Object objH2 = c0510p.H();
                if (zH2 || objH2 == t7) {
                    objH2 = new C0185b(interfaceC0196m, 1);
                    c0510p.b0(objH2);
                }
                android.support.v4.media.session.b.h(this.f2956n, (InterfaceC0821a) objH2, z7, c0510p, 0);
                c0510p.p(false);
            }
        }
        return O3.C.a;
    }
}
