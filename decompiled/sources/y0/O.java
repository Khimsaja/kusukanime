package y0;

import java.util.LinkedHashMap;
import l4.AbstractC1420H;
import w0.C2171F;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;

/* loaded from: classes.dex */
public abstract class O extends N implements InterfaceC2172G {

    /* renamed from: v, reason: collision with root package name */
    public final Y f17777v;

    /* renamed from: x, reason: collision with root package name */
    public LinkedHashMap f17779x;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC2174I f17781z;

    /* renamed from: w, reason: collision with root package name */
    public long f17778w = 0;

    /* renamed from: y, reason: collision with root package name */
    public final C2171F f17780y = new C2171F(this);

    /* renamed from: A, reason: collision with root package name */
    public final LinkedHashMap f17776A = new LinkedHashMap();

    public O(Y y7) {
        this.f17777v = y7;
    }

    public static final void D0(O o7, InterfaceC2174I interfaceC2174I) {
        O3.C c2;
        LinkedHashMap linkedHashMap;
        if (interfaceC2174I != null) {
            o7.l0(AbstractC1420H.a(interfaceC2174I.l(), interfaceC2174I.e()));
            c2 = O3.C.a;
        } else {
            c2 = null;
        }
        if (c2 == null) {
            o7.l0(0L);
        }
        if (!kotlin.jvm.internal.l.a(o7.f17781z, interfaceC2174I) && interfaceC2174I != null && ((((linkedHashMap = o7.f17779x) != null && !linkedHashMap.isEmpty()) || !interfaceC2174I.m().isEmpty()) && !kotlin.jvm.internal.l.a(interfaceC2174I.m(), o7.f17779x))) {
            I i7 = o7.f17777v.f17825v.f17661H.f17762s;
            kotlin.jvm.internal.l.c(i7);
            i7.f17701A.f();
            LinkedHashMap linkedHashMap2 = o7.f17779x;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                o7.f17779x = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC2174I.m());
        }
        o7.f17781z = interfaceC2174I;
    }

    @Override // y0.N
    public final long A0() {
        return this.f17778w;
    }

    @Override // y0.N
    public final void C0() {
        j0(this.f17778w, 0.0f, null);
    }

    public void E0() {
        y0().n();
    }

    public final void F0(long j7) {
        if (!T0.h.a(this.f17778w, j7)) {
            this.f17778w = j7;
            Y y7 = this.f17777v;
            I i7 = y7.f17825v.f17661H.f17762s;
            if (i7 != null) {
                i7.u0();
            }
            N.B0(y7);
        }
        if (this.f17772r) {
            return;
        }
        p0(new i0(y0(), this));
    }

    public final long G0(O o7, boolean z7) {
        long jC = 0;
        O oN0 = this;
        while (!oN0.equals(o7)) {
            if (!oN0.f17770p || !z7) {
                jC = T0.h.c(jC, oN0.f17778w);
            }
            Y y7 = oN0.f17777v.f17827x;
            kotlin.jvm.internal.l.c(y7);
            oN0 = y7.N0();
            kotlin.jvm.internal.l.c(oN0);
        }
        return jC;
    }

    @Override // T0.b
    public final float a() {
        return this.f17777v.a();
    }

    @Override // w0.InterfaceC2197o
    public final T0.k getLayoutDirection() {
        return this.f17777v.f17825v.f17656C;
    }

    @Override // w0.S, w0.InterfaceC2172G
    public final Object h() {
        return this.f17777v.h();
    }

    @Override // w0.S
    public final void j0(long j7, float f5, e4.k kVar) {
        F0(j7);
        if (this.f17771q) {
            return;
        }
        E0();
    }

    @Override // T0.b
    public final float n() {
        return this.f17777v.n();
    }

    @Override // y0.N, w0.InterfaceC2197o
    public final boolean s() {
        return true;
    }

    @Override // y0.N
    public final N u0() {
        Y y7 = this.f17777v.f17826w;
        if (y7 != null) {
            return y7.N0();
        }
        return null;
    }

    @Override // y0.N
    public final w0.r v0() {
        return this.f17780y;
    }

    @Override // y0.N
    public final boolean w0() {
        return this.f17781z != null;
    }

    @Override // y0.N
    public final C2349D x0() {
        return this.f17777v.f17825v;
    }

    @Override // y0.N
    public final InterfaceC2174I y0() {
        InterfaceC2174I interfaceC2174I = this.f17781z;
        if (interfaceC2174I != null) {
            return interfaceC2174I;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // y0.N
    public final N z0() {
        Y y7 = this.f17777v.f17827x;
        if (y7 != null) {
            return y7.N0();
        }
        return null;
    }
}
