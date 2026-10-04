package H0;

import b1.AbstractC0703b;
import p.AbstractC1755i;

/* loaded from: classes.dex */
public final class s {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3145b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3146c;

    /* renamed from: d, reason: collision with root package name */
    public final S0.o f3147d;

    /* renamed from: e, reason: collision with root package name */
    public final u f3148e;

    /* renamed from: f, reason: collision with root package name */
    public final S0.g f3149f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3150g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3151h;

    /* renamed from: i, reason: collision with root package name */
    public final S0.p f3152i;

    public s(int i7, int i8, long j7, S0.o oVar, u uVar, S0.g gVar, int i9, int i10, S0.p pVar) {
        this.a = i7;
        this.f3145b = i8;
        this.f3146c = j7;
        this.f3147d = oVar;
        this.f3148e = uVar;
        this.f3149f = gVar;
        this.f3150g = i9;
        this.f3151h = i10;
        this.f3152i = pVar;
        if (T0.m.a(j7, T0.m.f8848c) || T0.m.c(j7) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + T0.m.c(j7) + ')').toString());
    }

    public final s a(s sVar) {
        if (sVar == null) {
            return this;
        }
        return t.a(this, sVar.a, sVar.f3145b, sVar.f3146c, sVar.f3147d, sVar.f3148e, sVar.f3149f, sVar.f3150g, sVar.f3151h, sVar.f3152i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a == sVar.a && this.f3145b == sVar.f3145b && T0.m.a(this.f3146c, sVar.f3146c) && kotlin.jvm.internal.l.a(this.f3147d, sVar.f3147d) && kotlin.jvm.internal.l.a(this.f3148e, sVar.f3148e) && kotlin.jvm.internal.l.a(this.f3149f, sVar.f3149f) && this.f3150g == sVar.f3150g && this.f3151h == sVar.f3151h && kotlin.jvm.internal.l.a(this.f3152i, sVar.f3152i);
    }

    public final int hashCode() {
        int iA = AbstractC1755i.a(this.f3145b, Integer.hashCode(this.a) * 31, 31);
        T0.n[] nVarArr = T0.m.f8847b;
        int iC = AbstractC0703b.c(iA, 31, this.f3146c);
        S0.o oVar = this.f3147d;
        int iHashCode = (iC + (oVar != null ? oVar.hashCode() : 0)) * 31;
        u uVar = this.f3148e;
        int iHashCode2 = (iHashCode + (uVar != null ? uVar.hashCode() : 0)) * 31;
        S0.g gVar = this.f3149f;
        int iA2 = AbstractC1755i.a(this.f3151h, AbstractC1755i.a(this.f3150g, (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31, 31), 31);
        S0.p pVar = this.f3152i;
        return iA2 + (pVar != null ? pVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) S0.i.a(this.a)) + ", textDirection=" + ((Object) S0.k.a(this.f3145b)) + ", lineHeight=" + ((Object) T0.m.d(this.f3146c)) + ", textIndent=" + this.f3147d + ", platformStyle=" + this.f3148e + ", lineHeightStyle=" + this.f3149f + ", lineBreak=" + ((Object) S0.e.a(this.f3150g)) + ", hyphens=" + ((Object) S0.d.a(this.f3151h)) + ", textMotion=" + this.f3152i + ')';
    }
}
