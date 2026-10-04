package w0;

import f6.AbstractC0905c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y0.C2349D;

/* renamed from: w0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2206y implements b0 {

    /* renamed from: k, reason: collision with root package name */
    public T0.k f16891k = T0.k.f8845l;

    /* renamed from: l, reason: collision with root package name */
    public float f16892l;

    /* renamed from: m, reason: collision with root package name */
    public float f16893m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2169D f16894n;

    public C2206y(C2169D c2169d) {
        this.f16894n = c2169d;
    }

    @Override // w0.InterfaceC2175J
    public final InterfaceC2174I L(int i7, int i8, Map map, e4.k kVar) {
        if ((i7 & (-16777216)) == 0 && ((-16777216) & i8) == 0) {
            return new C2205x(i7, i8, map, this, this.f16894n, kVar);
        }
        AbstractC0905c.C("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // T0.b
    public final float a() {
        return this.f16892l;
    }

    @Override // w0.InterfaceC2197o
    public final T0.k getLayoutDirection() {
        return this.f16891k;
    }

    @Override // T0.b
    public final float n() {
        return this.f16893m;
    }

    @Override // w0.b0
    public final List o(Object obj, e4.n nVar) {
        C2349D c2349d;
        C2169D c2169d = this.f16894n;
        c2169d.e();
        C2349D c2349d2 = c2169d.f16816k;
        int i7 = c2349d2.f17661H.f17746c;
        if (!(i7 == 1 || i7 == 3 || i7 == 2 || i7 == 4)) {
            AbstractC0905c.C("subcompose can only be used inside the measure or layout blocks");
            throw null;
        }
        HashMap map = c2169d.f16822q;
        Object obj2 = map.get(obj);
        Object obj3 = obj2;
        if (obj2 == null) {
            C2349D c2349d3 = (C2349D) c2169d.f16825t.remove(obj);
            if (c2349d3 != null) {
                int i8 = c2169d.f16830y;
                if (i8 <= 0) {
                    AbstractC0905c.C("Check failed.");
                    throw null;
                }
                c2169d.f16830y = i8 - 1;
                c2349d = c2349d3;
            } else {
                C2349D c2349dJ = c2169d.j(obj);
                if (c2349dJ == null) {
                    int i9 = c2169d.f16819n;
                    C2349D c2349d4 = new C2349D(2);
                    c2349d2.f17682v = true;
                    c2349d2.x(i9, c2349d4);
                    c2349d2.f17682v = false;
                    c2349d = c2349d4;
                } else {
                    c2349d = c2349dJ;
                }
            }
            map.put(obj, c2349d);
            obj3 = c2349d;
        }
        C2349D c2349d5 = (C2349D) obj3;
        if (P3.q.u0(c2169d.f16819n, c2349d2.p()) != c2349d5) {
            int iJ = ((Q.a) c2349d2.p()).f7821k.j(c2349d5);
            int i10 = c2169d.f16819n;
            if (iJ < i10) {
                throw new IllegalArgumentException(("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.").toString());
            }
            if (i10 != iJ) {
                c2349d2.f17682v = true;
                c2349d2.I(iJ, i10, 1);
                c2349d2.f17682v = false;
            }
        }
        c2169d.f16819n++;
        c2169d.h(c2349d5, obj, nVar);
        return (i7 == 1 || i7 == 3) ? c2349d5.m() : c2349d5.l();
    }

    @Override // w0.InterfaceC2197o
    public final boolean s() {
        int i7 = this.f16894n.f16816k.f17661H.f17746c;
        return i7 == 4 || i7 == 2;
    }
}
