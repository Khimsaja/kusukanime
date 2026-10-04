package a5;

import P3.y;
import g5.o;
import java.util.List;
import kotlin.jvm.internal.l;
import n5.AbstractC1586x;
import n5.B;
import n5.I;
import n5.M;
import n5.Q;
import n5.a0;
import o5.C1706f;
import p5.h;

/* renamed from: a5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0667a extends B implements q5.c {

    /* renamed from: l, reason: collision with root package name */
    public final Q f10446l;

    /* renamed from: m, reason: collision with root package name */
    public final C0669c f10447m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f10448n;

    /* renamed from: o, reason: collision with root package name */
    public final I f10449o;

    public C0667a(Q q6, C0669c c0669c, boolean z7, I i7) {
        l.f("typeProjection", q6);
        l.f("attributes", i7);
        this.f10446l = q6;
        this.f10447m = c0669c;
        this.f10448n = z7;
        this.f10449o = i7;
    }

    @Override // n5.B
    /* renamed from: A0 */
    public final B x0(boolean z7) {
        if (z7 == this.f10448n) {
            return this;
        }
        return new C0667a(this.f10446l, this.f10447m, z7, this.f10449o);
    }

    @Override // n5.B
    /* renamed from: B0 */
    public final B z0(I i7) {
        l.f("newAttributes", i7);
        return new C0667a(this.f10446l, this.f10447m, this.f10448n, i7);
    }

    @Override // n5.AbstractC1586x
    public final o k0() {
        return p5.l.a(h.f14409l, true, new String[0]);
    }

    @Override // n5.AbstractC1586x
    public final List q0() {
        return y.f7779k;
    }

    @Override // n5.AbstractC1586x
    public final I s0() {
        return this.f10449o;
    }

    @Override // n5.AbstractC1586x
    public final M t0() {
        return this.f10447m;
    }

    @Override // n5.B
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f10446l);
        sb.append(')');
        sb.append(this.f10448n ? "?" : "");
        return sb.toString();
    }

    @Override // n5.AbstractC1586x
    public final boolean u0() {
        return this.f10448n;
    }

    @Override // n5.AbstractC1586x
    /* renamed from: v0 */
    public final AbstractC1586x y0(C1706f c1706f) {
        l.f("kotlinTypeRefiner", c1706f);
        return new C0667a(this.f10446l.d(c1706f), this.f10447m, this.f10448n, this.f10449o);
    }

    @Override // n5.B, n5.a0
    public final a0 x0(boolean z7) {
        if (z7 == this.f10448n) {
            return this;
        }
        return new C0667a(this.f10446l, this.f10447m, z7, this.f10449o);
    }

    @Override // n5.a0
    public final a0 y0(C1706f c1706f) {
        l.f("kotlinTypeRefiner", c1706f);
        return new C0667a(this.f10446l.d(c1706f), this.f10447m, this.f10448n, this.f10449o);
    }
}
