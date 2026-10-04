package H0;

import M.AbstractC0461t;
import b1.AbstractC0703b;
import h0.C0972Q;
import h0.C0998u;
import io.ktor.utils.io.ByteChannelKt;
import j0.AbstractC1299e;

/* loaded from: classes.dex */
public final class I {

    /* renamed from: d, reason: collision with root package name */
    public static final I f3093d = new I(0, 0, null, null, 0, 0, 0, 16777215);
    public final B a;

    /* renamed from: b, reason: collision with root package name */
    public final s f3094b;

    /* renamed from: c, reason: collision with root package name */
    public final w f3095c;

    public I(B b4, s sVar, w wVar) {
        this.a = b4;
        this.f3094b = sVar;
        this.f3095c = wVar;
    }

    public static I a(I i7, long j7, long j8, M0.u uVar, M0.j jVar, long j9, long j10, S0.g gVar, int i8) {
        S0.a aVar;
        S0.n nVar;
        long j11;
        w wVar = AbstractC0461t.a;
        long jB = (i8 & 1) != 0 ? i7.a.a.b() : j7;
        long j12 = (i8 & 2) != 0 ? i7.a.f3055b : j8;
        M0.u uVar2 = (i8 & 4) != 0 ? i7.a.f3056c : uVar;
        B b4 = i7.a;
        M0.q qVar = b4.f3057d;
        M0.r rVar = b4.f3058e;
        M0.j jVar2 = (i8 & 32) != 0 ? b4.f3059f : jVar;
        String str = b4.f3060g;
        long j13 = (i8 & 128) != 0 ? b4.f3061h : j9;
        S0.a aVar2 = b4.f3062i;
        S0.n nVar2 = b4.f3063j;
        O0.b bVar = b4.f3064k;
        long j14 = b4.f3065l;
        S0.j jVar3 = b4.f3066m;
        C0972Q c0972q = b4.f3067n;
        AbstractC1299e abstractC1299e = b4.f3069p;
        s sVar = i7.f3094b;
        int i9 = sVar.a;
        int i10 = sVar.f3145b;
        if ((i8 & 131072) != 0) {
            aVar = aVar2;
            nVar = nVar2;
            j11 = sVar.f3146c;
        } else {
            aVar = aVar2;
            nVar = nVar2;
            j11 = j10;
        }
        S0.o oVar = sVar.f3147d;
        w wVar2 = (i8 & 524288) != 0 ? i7.f3095c : wVar;
        return new I(new B(C0998u.c(jB, b4.a.b()) ? b4.a : jB != 16 ? new S0.c(jB) : S0.l.a, j12, uVar2, qVar, rVar, jVar2, str, j13, aVar, nVar, bVar, j14, jVar3, c0972q, wVar2 != null ? wVar2.a : null, abstractC1299e), new s(i9, i10, j11, oVar, wVar2 != null ? wVar2.f3155b : null, (i8 & ByteChannelKt.CHANNEL_MAX_SIZE) != 0 ? sVar.f3149f : gVar, sVar.f3150g, sVar.f3151h, sVar.f3152i), wVar2);
    }

    public static I e(I i7, long j7, long j8, M0.u uVar, long j9, int i8, long j10, int i9) {
        long j11 = (i9 & 2) != 0 ? T0.m.f8848c : j8;
        M0.u uVar2 = (i9 & 4) != 0 ? null : uVar;
        long j12 = (i9 & 128) != 0 ? T0.m.f8848c : j9;
        long j13 = C0998u.f11834g;
        int i10 = (32768 & i9) != 0 ? Integer.MIN_VALUE : i8;
        long j14 = (i9 & 131072) != 0 ? T0.m.f8848c : j10;
        B bA = C.a(i7.a, j7, null, Float.NaN, j11, uVar2, null, null, null, null, j12, null, null, null, j13, null, null, null, null);
        s sVarA = t.a(i7.f3094b, i10, Integer.MIN_VALUE, j14, null, null, null, 0, Integer.MIN_VALUE, null);
        return (i7.a == bA && i7.f3094b == sVarA) ? i7 : new I(bA, sVarA);
    }

    public final long b() {
        return this.a.a.b();
    }

    public final boolean c(I i7) {
        if (this != i7) {
            return kotlin.jvm.internal.l.a(this.f3094b, i7.f3094b) && this.a.a(i7.a);
        }
        return true;
    }

    public final I d(I i7) {
        return (i7 == null || i7.equals(f3093d)) ? this : new I(this.a.c(i7.a), this.f3094b.a(i7.f3094b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i7 = (I) obj;
        return kotlin.jvm.internal.l.a(this.a, i7.a) && kotlin.jvm.internal.l.a(this.f3094b, i7.f3094b) && kotlin.jvm.internal.l.a(this.f3095c, i7.f3095c);
    }

    public final int hashCode() {
        int iHashCode = (this.f3094b.hashCode() + (this.a.hashCode() * 31)) * 31;
        w wVar = this.f3095c;
        return iHashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStyle(color=");
        sb.append((Object) C0998u.i(b()));
        sb.append(", brush=");
        B b4 = this.a;
        sb.append(b4.a.c());
        sb.append(", alpha=");
        sb.append(b4.a.a());
        sb.append(", fontSize=");
        sb.append((Object) T0.m.d(b4.f3055b));
        sb.append(", fontWeight=");
        sb.append(b4.f3056c);
        sb.append(", fontStyle=");
        sb.append(b4.f3057d);
        sb.append(", fontSynthesis=");
        sb.append(b4.f3058e);
        sb.append(", fontFamily=");
        sb.append(b4.f3059f);
        sb.append(", fontFeatureSettings=");
        sb.append(b4.f3060g);
        sb.append(", letterSpacing=");
        sb.append((Object) T0.m.d(b4.f3061h));
        sb.append(", baselineShift=");
        sb.append(b4.f3062i);
        sb.append(", textGeometricTransform=");
        sb.append(b4.f3063j);
        sb.append(", localeList=");
        sb.append(b4.f3064k);
        sb.append(", background=");
        AbstractC0703b.x(b4.f3065l, ", textDecoration=", sb);
        sb.append(b4.f3066m);
        sb.append(", shadow=");
        sb.append(b4.f3067n);
        sb.append(", drawStyle=");
        sb.append(b4.f3069p);
        sb.append(", textAlign=");
        s sVar = this.f3094b;
        sb.append((Object) S0.i.a(sVar.a));
        sb.append(", textDirection=");
        sb.append((Object) S0.k.a(sVar.f3145b));
        sb.append(", lineHeight=");
        sb.append((Object) T0.m.d(sVar.f3146c));
        sb.append(", textIndent=");
        sb.append(sVar.f3147d);
        sb.append(", platformStyle=");
        sb.append(this.f3095c);
        sb.append(", lineHeightStyle=");
        sb.append(sVar.f3149f);
        sb.append(", lineBreak=");
        sb.append((Object) S0.e.a(sVar.f3150g));
        sb.append(", hyphens=");
        sb.append((Object) S0.d.a(sVar.f3151h));
        sb.append(", textMotion=");
        sb.append(sVar.f3152i);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public I(B b4, s sVar) {
        v vVar = b4.f3068o;
        u uVar = sVar.f3148e;
        this(b4, sVar, (vVar == null && uVar == null) ? null : new w(vVar, uVar));
    }

    public I(long j7, long j8, M0.u uVar, M0.m mVar, long j9, int i7, long j10, int i8) {
        this(new B((i8 & 1) != 0 ? C0998u.f11834g : j7, (i8 & 2) != 0 ? T0.m.f8848c : j8, (i8 & 4) != 0 ? null : uVar, (M0.q) null, (M0.r) null, (i8 & 32) != 0 ? null : mVar, (String) null, (i8 & 128) != 0 ? T0.m.f8848c : j9, (S0.a) null, (S0.n) null, (O0.b) null, C0998u.f11834g, (S0.j) null, (C0972Q) null, (v) null), new s((32768 & i8) != 0 ? Integer.MIN_VALUE : i7, Integer.MIN_VALUE, (i8 & 131072) != 0 ? T0.m.f8848c : j10, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
