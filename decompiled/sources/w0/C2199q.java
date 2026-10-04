package w0;

import f6.AbstractC0905c;
import java.util.Map;

/* renamed from: w0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2199q implements InterfaceC2175J, InterfaceC2197o {

    /* renamed from: k, reason: collision with root package name */
    public final T0.k f16875k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2197o f16876l;

    public C2199q(InterfaceC2197o interfaceC2197o, T0.k kVar) {
        this.f16875k = kVar;
        this.f16876l = interfaceC2197o;
    }

    @Override // T0.b
    public final int H(long j7) {
        return this.f16876l.H(j7);
    }

    @Override // T0.b
    public final float I(long j7) {
        return this.f16876l.I(j7);
    }

    @Override // w0.InterfaceC2175J
    public final InterfaceC2174I L(int i7, int i8, Map map, e4.k kVar) {
        if (i7 < 0) {
            i7 = 0;
        }
        if (i8 < 0) {
            i8 = 0;
        }
        if ((i7 & (-16777216)) == 0 && ((-16777216) & i8) == 0) {
            return new C2198p(i7, i8, map);
        }
        AbstractC0905c.C("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // T0.b
    public final int O(float f5) {
        return this.f16876l.O(f5);
    }

    @Override // T0.b
    public final float a() {
        return this.f16876l.a();
    }

    @Override // T0.b
    public final long a0(long j7) {
        return this.f16876l.a0(j7);
    }

    @Override // T0.b
    public final float d0(long j7) {
        return this.f16876l.d0(j7);
    }

    @Override // w0.InterfaceC2197o
    public final T0.k getLayoutDirection() {
        return this.f16875k;
    }

    @Override // T0.b
    public final long k0(float f5) {
        return this.f16876l.k0(f5);
    }

    @Override // T0.b
    public final float n() {
        return this.f16876l.n();
    }

    @Override // T0.b
    public final float q0(int i7) {
        return this.f16876l.q0(i7);
    }

    @Override // T0.b
    public final float r0(float f5) {
        return this.f16876l.r0(f5);
    }

    @Override // w0.InterfaceC2197o
    public final boolean s() {
        return this.f16876l.s();
    }

    @Override // T0.b
    public final long v(float f5) {
        return this.f16876l.v(f5);
    }

    @Override // T0.b
    public final long w(long j7) {
        return this.f16876l.w(j7);
    }

    @Override // T0.b
    public final float x(float f5) {
        return this.f16876l.x(f5);
    }
}
