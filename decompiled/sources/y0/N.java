package y0;

import f6.AbstractC0905c;
import java.util.Map;
import m.C1500u;
import w0.C2170E;
import w0.C2196n;
import w0.InterfaceC2174I;
import w0.InterfaceC2175J;

/* loaded from: classes.dex */
public abstract class N extends w0.S implements T, InterfaceC2175J {

    /* renamed from: p, reason: collision with root package name */
    public boolean f17770p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17771q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17772r;

    /* renamed from: s, reason: collision with root package name */
    public final C2170E f17773s = new C2170E(0, this);

    /* renamed from: t, reason: collision with root package name */
    public C1500u f17774t;

    /* renamed from: u, reason: collision with root package name */
    public C1500u f17775u;

    public static void B0(Y y7) {
        C2350E c2350e;
        Y y8 = y7.f17826w;
        C2349D c2349d = y8 != null ? y8.f17825v : null;
        C2349D c2349d2 = y7.f17825v;
        if (!kotlin.jvm.internal.l.a(c2349d, c2349d2)) {
            c2349d2.f17661H.f17761r.f17723D.f();
            return;
        }
        InterfaceC2354a interfaceC2354aL = c2349d2.f17661H.f17761r.l();
        if (interfaceC2354aL == null || (c2350e = ((J) interfaceC2354aL).f17723D) == null) {
            return;
        }
        c2350e.f();
    }

    public abstract long A0();

    public abstract void C0();

    @Override // w0.InterfaceC2175J
    public final InterfaceC2174I L(int i7, int i8, Map map, e4.k kVar) {
        if ((i7 & (-16777216)) == 0 && ((-16777216) & i8) == 0) {
            return new L(i7, i8, map, kVar, this);
        }
        AbstractC0905c.C("Size(" + i7 + " x " + i8 + ") is out of range. Each dimension must be between 0 and 16777215.");
        throw null;
    }

    @Override // y0.T
    public final void M(boolean z7) {
        this.f17770p = z7;
    }

    @Override // w0.S
    public final int c0(C2196n c2196n) {
        int iN0;
        if (w0() && (iN0 = n0(c2196n)) != Integer.MIN_VALUE) {
            return iN0 + ((int) (this.f16844o & 4294967295L));
        }
        return Integer.MIN_VALUE;
    }

    public abstract int n0(C2196n c2196n);

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ed, code lost:
    
        r38 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f7, code lost:
    
        if (((r4 & ((~r4) << 6)) & r24) == 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f9, code lost:
    
        r4 = r2.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ff, code lost:
    
        if (r2.f12928f != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0113, code lost:
    
        if (((r2.a[r4 >> 3] >> ((r4 & 7) << 3)) & 255) != 254) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0117, code lost:
    
        r4 = r2.f12926d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x011b, code lost:
    
        if (r4 <= 8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0135, code lost:
    
        if (java.lang.Long.compare((r2.f12927e * 32) ^ Long.MIN_VALUE, (r4 * 25) ^ Long.MIN_VALUE) > 0) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0137, code lost:
    
        r4 = r2.a;
        r5 = r2.f12926d;
        r6 = r2.f12924b;
        r9 = r2.f12925c;
        m.AbstractC1475E.a(r4, r5);
        r12 = 0;
        r6 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0147, code lost:
    
        if (r12 == r5) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0149, code lost:
    
        r39 = r12 >> 3;
        r44 = (r12 & 7) << 3;
        r42 = (r4[r39] >> r44) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0157, code lost:
    
        if (r42 != 128) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0159, code lost:
    
        r55 = r12;
        r12 = r12 + 1;
        r6 = r55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0163, code lost:
    
        if (r42 == 254) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0165, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0168, code lost:
    
        r42 = r6[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x016a, code lost:
    
        if (r42 == null) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x016c, code lost:
    
        r42 = r42.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0171, code lost:
    
        r42 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0173, code lost:
    
        r42 = r42 * (-862048943);
        r11 = (r42 ^ (r42 << 16)) >>> 7;
        r45 = r2.b(r11);
        r11 = r11 & r5;
        r47 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0194, code lost:
    
        if ((((r45 - r11) & r5) / 8) != (((r12 - r11) & r5) / 8)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0196, code lost:
    
        r4[r39] = (r4[r39] & (~(255 << r44))) | ((r42 & 127) << r44);
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b7, code lost:
    
        r9 = r47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01ba, code lost:
    
        r46 = r12;
        r9 = r45 >> 3;
        r11 = r4[r9];
        r50 = (r45 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ca, code lost:
    
        if (((r11 >> r50) & 255) != 128) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01cc, code lost:
    
        r4[r9] = (r11 & (~(255 << r50))) | ((r42 & 127) << r50);
        r4[r39] = (r4[r39] & (~(255 << r44))) | (128 << r44);
        r6[r45] = r6[r46];
        r6[r46] = null;
        r47[r45] = r47[r46];
        r47[r46] = 0.0f;
        r6 = r46;
        r12 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01ff, code lost:
    
        r4[r9] = (r11 & (~(255 << r50))) | ((r42 & 127) << r50);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0212, code lost:
    
        if (r6 != (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0214, code lost:
    
        r6 = m.AbstractC1475E.b(r4, r46 + 1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x021a, code lost:
    
        r6[r6] = r6[r45];
        r6[r45] = r6[r46];
        r6[r46] = r6[r6];
        r47[r6] = r47[r45];
        r47[r45] = r47[r46];
        r47[r46] = r47[r6];
        r12 = r46 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0234, code lost:
    
        r4[r4.length - 1] = (r4[0] & 72057594037927935L) | Long.MIN_VALUE;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0243, code lost:
    
        r2.f12928f = m.AbstractC1475E.c(r2.f12926d) - r2.f12927e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0250, code lost:
    
        r4 = m.AbstractC1475E.d(r2.f12926d);
        r5 = r2.a;
        r6 = r2.f12924b;
        r9 = r2.f12925c;
        r11 = r2.f12926d;
        r2.d(r4);
        r4 = r2.a;
        r12 = r2.f12924b;
        r4 = r2.f12925c;
        r4 = r2.f12926d;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0271, code lost:
    
        if (r4 >= r11) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0281, code lost:
    
        if (((r5[r4 >> 3] >> ((r4 & 7) << 3)) & 255) >= 128) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0283, code lost:
    
        r36 = r6[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0285, code lost:
    
        if (r36 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0287, code lost:
    
        r37 = r36.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x028c, code lost:
    
        r37 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x028e, code lost:
    
        r37 = r37 * (-862048943);
        r37 = r37 ^ (r37 << 16);
        r39 = r4;
        r4 = r2.b(r37 >>> 7);
        r4 = r37 & 127;
        r37 = r5;
        r43 = r4 >> 3;
        r44 = (r4 & 7) << 3;
        r4 = (r4[r43] & (~(255 << r44))) | (r4 << r44);
        r4[r43] = r4;
        r4[(((r4 - 7) & r4) + (r4 & 7)) >> 3] = r4;
        r12[r4] = r36;
        r4[r4] = r9[r39];
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02cb, code lost:
    
        r39 = r4;
        r37 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02cf, code lost:
    
        r4 = r39 + 1;
        r5 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02d4, code lost:
    
        r4 = r2.b(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02d8, code lost:
    
        r2.f12927e++;
        r5 = r2.f12928f;
        r6 = r2.a;
        r8 = r4 >> 3;
        r11 = r6[r8];
        r9 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02f0, code lost:
    
        if (((r11 >> r9) & 255) != 128) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02f3, code lost:
    
        r33 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02f5, code lost:
    
        r2.f12928f = r5 - r33;
        r5 = r2.f12926d;
        r5 = ((~(255 << r9)) & r11) | (r11 << r9);
        r6[r8] = r5;
        r6[(((r4 - 7) & r5) + (r5 & 7)) >> 3] = r5;
        r4 = ~r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(y0.i0 r57) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.N.p0(y0.i0):void");
    }

    @Override // w0.InterfaceC2197o
    public boolean s() {
        return false;
    }

    public abstract N u0();

    public abstract w0.r v0();

    public abstract boolean w0();

    public abstract C2349D x0();

    public abstract InterfaceC2174I y0();

    public abstract N z0();
}
