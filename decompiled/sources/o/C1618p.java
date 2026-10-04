package o;

import h0.AbstractC0968M;
import h0.C0976V;
import h0.C0998u;
import i0.C1020d;
import io.ktor.util.GzipHeaderFlags;
import p.AbstractC1745d;
import p.C1763o;
import p.C1765q;

/* renamed from: o.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1618p extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: m, reason: collision with root package name */
    public static final C1618p f13526m = new C1618p(1, 0);

    /* renamed from: n, reason: collision with root package name */
    public static final C1618p f13527n = new C1618p(1, 1);

    /* renamed from: o, reason: collision with root package name */
    public static final C1618p f13528o = new C1618p(1, 2);

    /* renamed from: p, reason: collision with root package name */
    public static final C1618p f13529p = new C1618p(1, 3);

    /* renamed from: q, reason: collision with root package name */
    public static final C1618p f13530q = new C1618p(1, 4);

    /* renamed from: r, reason: collision with root package name */
    public static final C1618p f13531r = new C1618p(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f13532l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1618p(int i7, int i8) {
        super(i7);
        this.f13532l = i8;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f13532l) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                long jA = C0998u.a(((C0998u) obj).a, C1020d.f11886t);
                return new C1765q(C0998u.d(jA), C0998u.h(jA), C0998u.g(jA), C0998u.e(jA));
            case 2:
                long j7 = ((C0976V) obj).a;
                return new C1763o(C0976V.b(j7), C0976V.c(j7));
            case 3:
                C1763o c1763o = (C1763o) obj;
                return new C0976V(AbstractC0968M.i(c1763o.a, c1763o.f14083b));
            case GzipHeaderFlags.EXTRA /* 4 */:
                return AbstractC1745d.p(7, null);
            default:
                return AbstractC1628z.f13552c;
        }
    }
}
