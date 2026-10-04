package y0;

import w0.C2196n;
import w0.InterfaceC2173H;

/* renamed from: y0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2371s extends O {
    @Override // y0.O
    public final void E0() {
        I i7 = this.f17777v.f17825v.f17661H.f17762s;
        kotlin.jvm.internal.l.c(i7);
        i7.w0();
    }

    @Override // w0.InterfaceC2172G
    public final int W(int i7) {
        n5.P pR = this.f17777v.f17825v.r();
        InterfaceC2173H interfaceC2173HL = pR.l();
        C2349D c2349d = (C2349D) pR.f13378l;
        return interfaceC2173HL.d((Y) c2349d.f17660G.f7174d, c2349d.l(), i7);
    }

    @Override // w0.InterfaceC2172G
    public final int Y(int i7) {
        n5.P pR = this.f17777v.f17825v.r();
        InterfaceC2173H interfaceC2173HL = pR.l();
        C2349D c2349d = (C2349D) pR.f13378l;
        return interfaceC2173HL.c((Y) c2349d.f17660G.f7174d, c2349d.l(), i7);
    }

    @Override // w0.InterfaceC2172G
    public final w0.S b(long j7) {
        m0(j7);
        Y y7 = this.f17777v;
        Q.d dVarV = y7.f17825v.v();
        int i7 = dVarV.f7829m;
        if (i7 > 0) {
            Object[] objArr = dVarV.f7827k;
            int i8 = 0;
            do {
                I i9 = ((C2349D) objArr[i8]).f17661H.f17762s;
                kotlin.jvm.internal.l.c(i9);
                i9.f17712s = 3;
                i8++;
            } while (i8 < i7);
        }
        C2349D c2349d = y7.f17825v;
        O.D0(this, c2349d.f17686z.b(this, c2349d.l(), j7));
        return this;
    }

    @Override // w0.InterfaceC2172G
    public final int b0(int i7) {
        n5.P pR = this.f17777v.f17825v.r();
        InterfaceC2173H interfaceC2173HL = pR.l();
        C2349D c2349d = (C2349D) pR.f13378l;
        return interfaceC2173HL.e((Y) c2349d.f17660G.f7174d, c2349d.l(), i7);
    }

    @Override // w0.InterfaceC2172G
    public final int c(int i7) {
        n5.P pR = this.f17777v.f17825v.r();
        InterfaceC2173H interfaceC2173HL = pR.l();
        C2349D c2349d = (C2349D) pR.f13378l;
        return interfaceC2173HL.a((Y) c2349d.f17660G.f7174d, c2349d.l(), i7);
    }

    @Override // y0.N
    public final int n0(C2196n c2196n) {
        I i7 = this.f17777v.f17825v.f17661H.f17762s;
        kotlin.jvm.internal.l.c(i7);
        boolean z7 = i7.f17713t;
        C2350E c2350e = i7.f17701A;
        if (!z7) {
            K k7 = i7.f17708H;
            if (k7.f17746c == 2) {
                c2350e.f17691f = true;
                if (c2350e.f17687b) {
                    k7.f17751h = true;
                    k7.f17752i = true;
                }
            } else {
                c2350e.f17692g = true;
            }
        }
        C2371s c2371s = i7.j().f17895U;
        if (c2371s != null) {
            c2371s.f17772r = true;
        }
        i7.p();
        C2371s c2371s2 = i7.j().f17895U;
        if (c2371s2 != null) {
            c2371s2.f17772r = false;
        }
        Integer num = (Integer) c2350e.f17694i.get(c2196n);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f17776A.put(c2196n, Integer.valueOf(iIntValue));
        return iIntValue;
    }
}
