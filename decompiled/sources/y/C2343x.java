package y;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w0.InterfaceC2172G;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;
import w0.b0;

/* renamed from: y.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2343x implements InterfaceC2175J {

    /* renamed from: k, reason: collision with root package name */
    public final C2338s f17647k;

    /* renamed from: l, reason: collision with root package name */
    public final b0 f17648l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC2339t f17649m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f17650n = new HashMap();

    public C2343x(C2338s c2338s, b0 b0Var) {
        this.f17647k = c2338s;
        this.f17648l = b0Var;
        this.f17649m = (InterfaceC2339t) c2338s.f17640b.invoke();
    }

    @Override // T0.b
    public final int H(long j7) {
        return this.f17648l.H(j7);
    }

    @Override // T0.b
    public final float I(long j7) {
        return this.f17648l.I(j7);
    }

    @Override // w0.InterfaceC2175J
    public final InterfaceC2174I L(int i7, int i8, Map map, e4.k kVar) {
        return this.f17648l.L(i7, i8, map, kVar);
    }

    @Override // T0.b
    public final int O(float f5) {
        return this.f17648l.O(f5);
    }

    @Override // w0.InterfaceC2175J
    public final InterfaceC2174I T(int i7, int i8, Map map, e4.k kVar) {
        return this.f17648l.T(i7, i8, map, kVar);
    }

    @Override // T0.b
    public final float a() {
        return this.f17648l.a();
    }

    @Override // T0.b
    public final long a0(long j7) {
        return this.f17648l.a0(j7);
    }

    public final List b(int i7, long j7) {
        HashMap map = this.f17650n;
        List list = (List) map.get(Integer.valueOf(i7));
        if (list != null) {
            return list;
        }
        InterfaceC2339t interfaceC2339t = this.f17649m;
        Object objC = interfaceC2339t.c(i7);
        List listO = this.f17648l.o(objC, this.f17647k.a(i7, objC, interfaceC2339t.d(i7)));
        int size = listO.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            arrayList.add(((InterfaceC2172G) listO.get(i8)).b(j7));
        }
        map.put(Integer.valueOf(i7), arrayList);
        return arrayList;
    }

    @Override // T0.b
    public final float d0(long j7) {
        return this.f17648l.d0(j7);
    }

    @Override // w0.InterfaceC2197o
    public final T0.k getLayoutDirection() {
        return this.f17648l.getLayoutDirection();
    }

    @Override // T0.b
    public final long k0(float f5) {
        return this.f17648l.k0(f5);
    }

    @Override // T0.b
    public final float n() {
        return this.f17648l.n();
    }

    @Override // T0.b
    public final float q0(int i7) {
        return this.f17648l.q0(i7);
    }

    @Override // T0.b
    public final float r0(float f5) {
        return this.f17648l.r0(f5);
    }

    @Override // w0.InterfaceC2197o
    public final boolean s() {
        return this.f17648l.s();
    }

    @Override // T0.b
    public final long v(float f5) {
        return this.f17648l.v(f5);
    }

    @Override // T0.b
    public final long w(long j7) {
        return this.f17648l.w(j7);
    }

    @Override // T0.b
    public final float x(float f5) {
        return this.f17648l.x(f5);
    }
}
