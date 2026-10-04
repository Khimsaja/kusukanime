package w0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y0.C2349D;

/* renamed from: w0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2204w implements b0, InterfaceC2175J {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2206y f16884k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2169D f16885l;

    public C2204w(C2169D c2169d) {
        this.f16885l = c2169d;
        this.f16884k = c2169d.f16823r;
    }

    @Override // T0.b
    public final int H(long j7) {
        return this.f16884k.H(j7);
    }

    @Override // T0.b
    public final float I(long j7) {
        return this.f16884k.I(j7);
    }

    @Override // w0.InterfaceC2175J
    public final InterfaceC2174I L(int i7, int i8, Map map, e4.k kVar) {
        return this.f16884k.L(i7, i8, map, kVar);
    }

    @Override // T0.b
    public final int O(float f5) {
        return this.f16884k.O(f5);
    }

    @Override // w0.InterfaceC2175J
    public final InterfaceC2174I T(int i7, int i8, Map map, e4.k kVar) {
        return this.f16884k.L(i7, i8, map, kVar);
    }

    @Override // T0.b
    public final float a() {
        return this.f16884k.f16892l;
    }

    @Override // T0.b
    public final long a0(long j7) {
        return this.f16884k.a0(j7);
    }

    @Override // T0.b
    public final float d0(long j7) {
        return this.f16884k.d0(j7);
    }

    @Override // w0.InterfaceC2197o
    public final T0.k getLayoutDirection() {
        return this.f16884k.f16891k;
    }

    @Override // T0.b
    public final long k0(float f5) {
        return this.f16884k.k0(f5);
    }

    @Override // T0.b
    public final float n() {
        return this.f16884k.f16893m;
    }

    @Override // w0.b0
    public final List o(Object obj, e4.n nVar) {
        C2169D c2169d = this.f16885l;
        C2349D c2349d = (C2349D) c2169d.f16822q.get(obj);
        List listM = c2349d != null ? c2349d.m() : null;
        if (listM != null) {
            return listM;
        }
        Q.d dVar = c2169d.f16828w;
        int i7 = dVar.f7829m;
        int i8 = c2169d.f16820o;
        if (i7 < i8) {
            throw new IllegalArgumentException("Error: currentPostLookaheadIndex cannot be greater than the size of thepostLookaheadComposedSlotIds list.");
        }
        if (i7 == i8) {
            dVar.b(obj);
        } else {
            Object[] objArr = dVar.f7827k;
            Object obj2 = objArr[i8];
            objArr[i8] = obj;
        }
        c2169d.f16820o++;
        HashMap map = c2169d.f16825t;
        if (!map.containsKey(obj)) {
            c2169d.f16827v.put(obj, c2169d.g(obj, nVar));
            C2349D c2349d2 = c2169d.f16816k;
            if (c2349d2.f17661H.f17746c == 3) {
                c2349d2.Q(true);
            } else {
                C2349D.R(c2349d2, true, 6);
            }
        }
        C2349D c2349d3 = (C2349D) map.get(obj);
        if (c2349d3 == null) {
            return P3.y.f7779k;
        }
        List listN0 = c2349d3.f17661H.f17761r.n0();
        Q.a aVar = (Q.a) listN0;
        int i9 = aVar.f7821k.f7829m;
        for (int i10 = 0; i10 < i9; i10++) {
            ((y0.J) aVar.get(i10)).f17733P.f17745b = true;
        }
        return listN0;
    }

    @Override // T0.b
    public final float q0(int i7) {
        return this.f16884k.q0(i7);
    }

    @Override // T0.b
    public final float r0(float f5) {
        return f5 / this.f16884k.a();
    }

    @Override // w0.InterfaceC2197o
    public final boolean s() {
        return this.f16884k.s();
    }

    @Override // T0.b
    public final long v(float f5) {
        return this.f16884k.v(f5);
    }

    @Override // T0.b
    public final long w(long j7) {
        return this.f16884k.w(j7);
    }

    @Override // T0.b
    public final float x(float f5) {
        return this.f16884k.a() * f5;
    }
}
