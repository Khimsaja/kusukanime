package o5;

import P3.y;
import java.util.List;
import n5.B;
import n5.I;
import n5.M;
import n5.Q;
import n5.a0;

/* renamed from: o5.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1708h extends B implements q5.c {

    /* renamed from: l, reason: collision with root package name */
    public final q5.b f13799l;

    /* renamed from: m, reason: collision with root package name */
    public final C1709i f13800m;

    /* renamed from: n, reason: collision with root package name */
    public final a0 f13801n;

    /* renamed from: o, reason: collision with root package name */
    public final I f13802o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f13803p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f13804q;

    public C1708h(q5.b bVar, C1709i c1709i, a0 a0Var, I i7, boolean z7, boolean z8) {
        kotlin.jvm.internal.l.f("captureStatus", bVar);
        kotlin.jvm.internal.l.f("constructor", c1709i);
        kotlin.jvm.internal.l.f("attributes", i7);
        this.f13799l = bVar;
        this.f13800m = c1709i;
        this.f13801n = a0Var;
        this.f13802o = i7;
        this.f13803p = z7;
        this.f13804q = z8;
    }

    @Override // n5.B
    /* renamed from: A0 */
    public final B x0(boolean z7) {
        return new C1708h(this.f13799l, this.f13800m, this.f13801n, this.f13802o, z7, 32);
    }

    @Override // n5.B
    /* renamed from: B0 */
    public final B z0(I i7) {
        kotlin.jvm.internal.l.f("newAttributes", i7);
        return new C1708h(this.f13799l, this.f13800m, this.f13801n, i7, this.f13803p, this.f13804q);
    }

    @Override // n5.a0
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public final C1708h y0(C1706f c1706f) {
        kotlin.jvm.internal.l.f("kotlinTypeRefiner", c1706f);
        C1709i c1709i = this.f13800m;
        c1709i.getClass();
        Q qD = c1709i.a.d(c1706f);
        A3.q qVar = c1709i.f13805b != null ? new A3.q(16, c1709i, c1706f) : null;
        C1709i c1709i2 = c1709i.f13806c;
        if (c1709i2 == null) {
            c1709i2 = c1709i;
        }
        C1709i c1709i3 = new C1709i(qD, qVar, c1709i2, c1709i.f13807d);
        a0 a0Var = this.f13801n;
        return new C1708h(this.f13799l, c1709i3, a0Var != null ? a0Var : null, this.f13802o, this.f13803p, 32);
    }

    @Override // n5.AbstractC1586x
    public final g5.o k0() {
        return p5.l.a(p5.h.f14409l, true, new String[0]);
    }

    @Override // n5.AbstractC1586x
    public final List q0() {
        return y.f7779k;
    }

    @Override // n5.AbstractC1586x
    public final I s0() {
        return this.f13802o;
    }

    @Override // n5.AbstractC1586x
    public final M t0() {
        return this.f13800m;
    }

    @Override // n5.AbstractC1586x
    public final boolean u0() {
        return this.f13803p;
    }

    @Override // n5.B, n5.a0
    public final a0 x0(boolean z7) {
        return new C1708h(this.f13799l, this.f13800m, this.f13801n, this.f13802o, z7, 32);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1708h(q5.b bVar, C1709i c1709i, a0 a0Var, I i7, boolean z7, int i8) {
        if ((i8 & 8) != 0) {
            I.f13362l.getClass();
            i7 = I.f13363m;
        }
        this(bVar, c1709i, a0Var, i7, (i8 & 16) != 0 ? false : z7, false);
    }
}
