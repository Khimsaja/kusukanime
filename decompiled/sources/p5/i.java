package p5;

import g5.o;
import java.util.Arrays;
import java.util.List;
import n5.AbstractC1586x;
import n5.B;
import n5.I;
import n5.M;
import n5.a0;
import o5.C1706f;

/* loaded from: classes.dex */
public final class i extends B {

    /* renamed from: l, reason: collision with root package name */
    public final M f14416l;

    /* renamed from: m, reason: collision with root package name */
    public final g f14417m;

    /* renamed from: n, reason: collision with root package name */
    public final k f14418n;

    /* renamed from: o, reason: collision with root package name */
    public final List f14419o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f14420p;

    /* renamed from: q, reason: collision with root package name */
    public final String[] f14421q;

    /* renamed from: r, reason: collision with root package name */
    public final String f14422r;

    public i(M m7, g gVar, k kVar, List list, boolean z7, String... strArr) {
        kotlin.jvm.internal.l.f("kind", kVar);
        kotlin.jvm.internal.l.f("arguments", list);
        kotlin.jvm.internal.l.f("formatParams", strArr);
        this.f14416l = m7;
        this.f14417m = gVar;
        this.f14418n = kVar;
        this.f14419o = list;
        this.f14420p = z7;
        this.f14421q = strArr;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        this.f14422r = String.format(kVar.f14453k, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // n5.B
    /* renamed from: A0 */
    public final B x0(boolean z7) {
        String[] strArr = this.f14421q;
        return new i(this.f14416l, this.f14417m, this.f14418n, this.f14419o, z7, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // n5.B
    /* renamed from: B0 */
    public final B z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        return this;
    }

    @Override // n5.AbstractC1586x
    public final o k0() {
        return this.f14417m;
    }

    @Override // n5.AbstractC1586x
    public final List q0() {
        return this.f14419o;
    }

    @Override // n5.AbstractC1586x
    public final I s0() {
        I.f13362l.getClass();
        return I.f13363m;
    }

    @Override // n5.AbstractC1586x
    public final M t0() {
        return this.f14416l;
    }

    @Override // n5.AbstractC1586x
    public final boolean u0() {
        return this.f14420p;
    }

    @Override // n5.AbstractC1586x
    /* renamed from: v0 */
    public final AbstractC1586x y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        return this;
    }

    @Override // n5.a0
    public final a0 y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        return this;
    }

    @Override // n5.B, n5.a0
    public final a0 z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        return this;
    }
}
