package L;

import O.C0486d;
import O.C0510p;
import O.InterfaceC0501k0;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import b1.AbstractC0703b;
import h0.C0998u;
import java.util.concurrent.atomic.AtomicInteger;
import o.AbstractC1599K;
import p.AbstractC1745d;
import v.AbstractC2136o;
import w0.InterfaceC2173H;
import y0.C2361h;
import y0.C2362i;
import y0.C2363j;
import y0.InterfaceC2364k;

/* renamed from: L.o1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405o1 extends kotlin.jvm.internal.m implements e4.n {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0393l1 f5694l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f5695m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f5696n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ W.a f5697o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f5698p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W.a f5699q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0405o1(C0393l1 c0393l1, boolean z7, boolean z8, W.a aVar, boolean z9, W.a aVar2) {
        super(2);
        this.f5694l = c0393l1;
        this.f5695m = z7;
        this.f5696n = z8;
        this.f5697o = aVar;
        this.f5698p = z9;
        this.f5699q = aVar2;
    }

    @Override // e4.n
    public final Object invoke(Object obj, Object obj2) {
        a0.q clearAndSetSemanticsElement;
        C0510p c0510p = (C0510p) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && c0510p.y()) {
            c0510p.M();
        } else {
            C0393l1 c0393l1 = this.f5694l;
            boolean z7 = this.f5696n;
            boolean z8 = this.f5695m;
            O.R0 r0A = AbstractC1599K.a(!z7 ? c0393l1.f5647f : z8 ? c0393l1.a : c0393l1.f5645d, AbstractC1745d.q(100, 0, null, 6), c0510p, 48, 12);
            if (this.f5697o == null || !(this.f5698p || z8)) {
                clearAndSetSemanticsElement = a0.n.a;
            } else {
                AtomicInteger atomicInteger = F0.k.a;
                clearAndSetSemanticsElement = new ClearAndSetSemanticsElement();
            }
            InterfaceC2173H interfaceC2173HE = AbstractC2136o.e(a0.b.f10381k, false);
            int i7 = c0510p.f7128P;
            InterfaceC0501k0 interfaceC0501k0M = c0510p.m();
            a0.q qVarC = a0.a.c(c0510p, clearAndSetSemanticsElement);
            InterfaceC2364k.f17877j.getClass();
            C2362i c2362i = C2363j.f17871b;
            c0510p.V();
            if (c0510p.f7127O) {
                c0510p.l(c2362i);
            } else {
                c0510p.e0();
            }
            C0486d.R(c0510p, C2363j.f17875f, interfaceC2173HE);
            C0486d.R(c0510p, C2363j.f17874e, interfaceC0501k0M);
            C2361h c2361h = C2363j.f17876g;
            if (c0510p.f7127O || !kotlin.jvm.internal.l.a(c0510p.H(), Integer.valueOf(i7))) {
                AbstractC0703b.u(i7, c0510p, i7, c2361h);
            }
            C0486d.R(c0510p, C2363j.f17873d, qVarC);
            C0486d.a(X.a.a(new C0998u(((C0998u) r0A.getValue()).a)), this.f5699q, c0510p, 8);
            c0510p.p(true);
        }
        return O3.C.a;
    }
}
