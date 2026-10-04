package H0;

import b1.AbstractC0703b;
import h0.AbstractC0993p;
import h0.C0972Q;
import h0.C0998u;
import j0.AbstractC1299e;

/* loaded from: classes.dex */
public final class B {
    public final S0.m a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3055b;

    /* renamed from: c, reason: collision with root package name */
    public final M0.u f3056c;

    /* renamed from: d, reason: collision with root package name */
    public final M0.q f3057d;

    /* renamed from: e, reason: collision with root package name */
    public final M0.r f3058e;

    /* renamed from: f, reason: collision with root package name */
    public final M0.j f3059f;

    /* renamed from: g, reason: collision with root package name */
    public final String f3060g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3061h;

    /* renamed from: i, reason: collision with root package name */
    public final S0.a f3062i;

    /* renamed from: j, reason: collision with root package name */
    public final S0.n f3063j;

    /* renamed from: k, reason: collision with root package name */
    public final O0.b f3064k;

    /* renamed from: l, reason: collision with root package name */
    public final long f3065l;

    /* renamed from: m, reason: collision with root package name */
    public final S0.j f3066m;

    /* renamed from: n, reason: collision with root package name */
    public final C0972Q f3067n;

    /* renamed from: o, reason: collision with root package name */
    public final v f3068o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC1299e f3069p;

    public B(long j7, long j8, M0.u uVar, M0.q qVar, M0.r rVar, M0.j jVar, String str, long j9, S0.a aVar, S0.n nVar, O0.b bVar, long j10, S0.j jVar2, C0972Q c0972q, v vVar) {
        this(j7 != 16 ? new S0.c(j7) : S0.l.a, j8, uVar, qVar, rVar, jVar, str, j9, aVar, nVar, bVar, j10, jVar2, c0972q, vVar, null);
    }

    public final boolean a(B b4) {
        if (this == b4) {
            return true;
        }
        return T0.m.a(this.f3055b, b4.f3055b) && kotlin.jvm.internal.l.a(this.f3056c, b4.f3056c) && kotlin.jvm.internal.l.a(this.f3057d, b4.f3057d) && kotlin.jvm.internal.l.a(this.f3058e, b4.f3058e) && kotlin.jvm.internal.l.a(this.f3059f, b4.f3059f) && kotlin.jvm.internal.l.a(this.f3060g, b4.f3060g) && T0.m.a(this.f3061h, b4.f3061h) && kotlin.jvm.internal.l.a(this.f3062i, b4.f3062i) && kotlin.jvm.internal.l.a(this.f3063j, b4.f3063j) && kotlin.jvm.internal.l.a(this.f3064k, b4.f3064k) && C0998u.c(this.f3065l, b4.f3065l) && kotlin.jvm.internal.l.a(this.f3068o, b4.f3068o);
    }

    public final boolean b(B b4) {
        return kotlin.jvm.internal.l.a(this.a, b4.a) && kotlin.jvm.internal.l.a(this.f3066m, b4.f3066m) && kotlin.jvm.internal.l.a(this.f3067n, b4.f3067n) && kotlin.jvm.internal.l.a(this.f3069p, b4.f3069p);
    }

    public final B c(B b4) {
        if (b4 == null) {
            return this;
        }
        S0.m mVar = b4.a;
        return C.a(this, mVar.b(), mVar.c(), mVar.a(), b4.f3055b, b4.f3056c, b4.f3057d, b4.f3058e, b4.f3059f, b4.f3060g, b4.f3061h, b4.f3062i, b4.f3063j, b4.f3064k, b4.f3065l, b4.f3066m, b4.f3067n, b4.f3068o, b4.f3069p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b4 = (B) obj;
        return a(b4) && b(b4);
    }

    public final int hashCode() {
        S0.m mVar = this.a;
        long jB = mVar.b();
        int i7 = C0998u.f11835h;
        int iHashCode = Long.hashCode(jB) * 31;
        AbstractC0993p abstractC0993pC = mVar.c();
        int iHashCode2 = (Float.hashCode(mVar.a()) + ((iHashCode + (abstractC0993pC != null ? abstractC0993pC.hashCode() : 0)) * 31)) * 31;
        T0.n[] nVarArr = T0.m.f8847b;
        int iC = AbstractC0703b.c(iHashCode2, 31, this.f3055b);
        M0.u uVar = this.f3056c;
        int i8 = (iC + (uVar != null ? uVar.f6419k : 0)) * 31;
        M0.q qVar = this.f3057d;
        int iHashCode3 = (i8 + (qVar != null ? Integer.hashCode(qVar.a) : 0)) * 31;
        M0.r rVar = this.f3058e;
        int iHashCode4 = (iHashCode3 + (rVar != null ? Integer.hashCode(rVar.a) : 0)) * 31;
        M0.j jVar = this.f3059f;
        int iHashCode5 = (iHashCode4 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        String str = this.f3060g;
        int iC2 = AbstractC0703b.c((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f3061h);
        S0.a aVar = this.f3062i;
        int iHashCode6 = (iC2 + (aVar != null ? Float.hashCode(aVar.a) : 0)) * 31;
        S0.n nVar = this.f3063j;
        int iHashCode7 = (iHashCode6 + (nVar != null ? nVar.hashCode() : 0)) * 31;
        O0.b bVar = this.f3064k;
        int iC3 = AbstractC0703b.c((iHashCode7 + (bVar != null ? bVar.f7250k.hashCode() : 0)) * 31, 31, this.f3065l);
        S0.j jVar2 = this.f3066m;
        int i9 = (iC3 + (jVar2 != null ? jVar2.a : 0)) * 31;
        C0972Q c0972q = this.f3067n;
        int iHashCode8 = (i9 + (c0972q != null ? c0972q.hashCode() : 0)) * 31;
        v vVar = this.f3068o;
        int iHashCode9 = (iHashCode8 + (vVar != null ? vVar.hashCode() : 0)) * 31;
        AbstractC1299e abstractC1299e = this.f3069p;
        return iHashCode9 + (abstractC1299e != null ? abstractC1299e.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanStyle(color=");
        S0.m mVar = this.a;
        sb.append((Object) C0998u.i(mVar.b()));
        sb.append(", brush=");
        sb.append(mVar.c());
        sb.append(", alpha=");
        sb.append(mVar.a());
        sb.append(", fontSize=");
        sb.append((Object) T0.m.d(this.f3055b));
        sb.append(", fontWeight=");
        sb.append(this.f3056c);
        sb.append(", fontStyle=");
        sb.append(this.f3057d);
        sb.append(", fontSynthesis=");
        sb.append(this.f3058e);
        sb.append(", fontFamily=");
        sb.append(this.f3059f);
        sb.append(", fontFeatureSettings=");
        sb.append(this.f3060g);
        sb.append(", letterSpacing=");
        sb.append((Object) T0.m.d(this.f3061h));
        sb.append(", baselineShift=");
        sb.append(this.f3062i);
        sb.append(", textGeometricTransform=");
        sb.append(this.f3063j);
        sb.append(", localeList=");
        sb.append(this.f3064k);
        sb.append(", background=");
        AbstractC0703b.x(this.f3065l, ", textDecoration=", sb);
        sb.append(this.f3066m);
        sb.append(", shadow=");
        sb.append(this.f3067n);
        sb.append(", platformStyle=");
        sb.append(this.f3068o);
        sb.append(", drawStyle=");
        sb.append(this.f3069p);
        sb.append(')');
        return sb.toString();
    }

    public B(S0.m mVar, long j7, M0.u uVar, M0.q qVar, M0.r rVar, M0.j jVar, String str, long j8, S0.a aVar, S0.n nVar, O0.b bVar, long j9, S0.j jVar2, C0972Q c0972q, v vVar, AbstractC1299e abstractC1299e) {
        this.a = mVar;
        this.f3055b = j7;
        this.f3056c = uVar;
        this.f3057d = qVar;
        this.f3058e = rVar;
        this.f3059f = jVar;
        this.f3060g = str;
        this.f3061h = j8;
        this.f3062i = aVar;
        this.f3063j = nVar;
        this.f3064k = bVar;
        this.f3065l = j9;
        this.f3066m = jVar2;
        this.f3067n = c0972q;
        this.f3068o = vVar;
        this.f3069p = abstractC1299e;
    }

    public B(long j7, long j8, M0.u uVar, M0.q qVar, M0.r rVar, M0.j jVar, String str, long j9, S0.a aVar, S0.n nVar, O0.b bVar, long j10, S0.j jVar2, C0972Q c0972q, int i7) {
        this((i7 & 1) != 0 ? C0998u.f11834g : j7, (i7 & 2) != 0 ? T0.m.f8848c : j8, (i7 & 4) != 0 ? null : uVar, (i7 & 8) != 0 ? null : qVar, (i7 & 16) != 0 ? null : rVar, (i7 & 32) != 0 ? null : jVar, (i7 & 64) != 0 ? null : str, (i7 & 128) != 0 ? T0.m.f8848c : j9, (i7 & 256) != 0 ? null : aVar, (i7 & 512) != 0 ? null : nVar, (i7 & 1024) != 0 ? null : bVar, (i7 & 2048) != 0 ? C0998u.f11834g : j10, (i7 & 4096) != 0 ? null : jVar2, (i7 & 8192) != 0 ? null : c0972q, (v) null);
    }
}
