package C;

import T0.k;
import f.AbstractC0841b;
import f6.AbstractC0915m;
import g0.f;
import h0.AbstractC0966K;
import h0.C0964I;
import h0.C0965J;
import h0.InterfaceC0973S;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class d implements InterfaceC0973S {

    /* renamed from: k, reason: collision with root package name */
    public final a f562k;

    /* renamed from: l, reason: collision with root package name */
    public final a f563l;

    /* renamed from: m, reason: collision with root package name */
    public final a f564m;

    /* renamed from: n, reason: collision with root package name */
    public final a f565n;

    public d(a aVar, a aVar2, a aVar3, a aVar4) {
        this.f562k = aVar;
        this.f563l = aVar2;
        this.f564m = aVar3;
        this.f565n = aVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [C.a] */
    /* JADX WARN: Type inference failed for: r3v2, types: [C.a] */
    public static d a(d dVar, b bVar, b bVar2, b bVar3, int i7) {
        b bVar4 = bVar;
        if ((i7 & 1) != 0) {
            bVar4 = dVar.f562k;
        }
        a aVar = dVar.f563l;
        b bVar5 = bVar2;
        if ((i7 & 4) != 0) {
            bVar5 = dVar.f564m;
        }
        dVar.getClass();
        return new d(bVar4, aVar, bVar5, bVar3);
    }

    @Override // h0.InterfaceC0973S
    public final AbstractC0966K c(long j7, k kVar, T0.b bVar) {
        float fA = this.f562k.a(j7, bVar);
        float fA2 = this.f563l.a(j7, bVar);
        float fA3 = this.f564m.a(j7, bVar);
        float fA4 = this.f565n.a(j7, bVar);
        float fC = f.c(j7);
        float f5 = fA + fA4;
        if (f5 > fC) {
            float f7 = fC / f5;
            fA *= f7;
            fA4 *= f7;
        }
        float f8 = fA2 + fA3;
        if (f8 > fC) {
            float f9 = fC / f8;
            fA2 *= f9;
            fA3 *= f9;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            throw new IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!").toString());
        }
        if (fA + fA2 + fA3 + fA4 == 0.0f) {
            return new C0964I(AbstractC0841b.c(0L, j7));
        }
        g0.d dVarC = AbstractC0841b.c(0L, j7);
        k kVar2 = k.f8844k;
        float f10 = kVar == kVar2 ? fA : fA2;
        long jA = AbstractC0915m.a(f10, f10);
        if (kVar == kVar2) {
            fA = fA2;
        }
        long jA2 = AbstractC0915m.a(fA, fA);
        float f11 = kVar == kVar2 ? fA3 : fA4;
        long jA3 = AbstractC0915m.a(f11, f11);
        if (kVar != kVar2) {
            fA4 = fA3;
        }
        return new C0965J(new g0.e(dVarC.a, dVarC.f11659b, dVarC.f11660c, dVarC.f11661d, jA, jA2, jA3, AbstractC0915m.a(fA4, fA4)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!l.a(this.f562k, dVar.f562k)) {
            return false;
        }
        if (!l.a(this.f563l, dVar.f563l)) {
            return false;
        }
        if (l.a(this.f564m, dVar.f564m)) {
            return l.a(this.f565n, dVar.f565n);
        }
        return false;
    }

    public final int hashCode() {
        return this.f565n.hashCode() + ((this.f564m.hashCode() + ((this.f563l.hashCode() + (this.f562k.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f562k + ", topEnd = " + this.f563l + ", bottomEnd = " + this.f564m + ", bottomStart = " + this.f565n + ')';
    }
}
