package q2;

import B1.AbstractC0015b;
import B1.B;
import V1.AbstractC0597b;
import j3.G;
import java.util.ArrayList;
import java.util.Arrays;
import n5.P;
import y1.C;
import y1.C2392n;
import y1.C2393o;
import y1.D;

/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: o, reason: collision with root package name */
    public static final byte[] f14705o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: p, reason: collision with root package name */
    public static final byte[] f14706p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* renamed from: n, reason: collision with root package name */
    public boolean f14707n;

    public static boolean e(B b4, byte[] bArr) {
        if (b4.a() < bArr.length) {
            return false;
        }
        int i7 = b4.f288b;
        byte[] bArr2 = new byte[bArr.length];
        b4.e(bArr2, 0, bArr.length);
        b4.F(i7);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // q2.j
    public final long b(B b4) {
        byte[] bArr = b4.a;
        return (this.f14715i * AbstractC0597b.j(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0)) / 1000000;
    }

    @Override // q2.j
    public final boolean c(B b4, long j7, P p7) {
        if (e(b4, f14705o)) {
            byte[] bArrCopyOf = Arrays.copyOf(b4.a, b4.f289c);
            int i7 = bArrCopyOf[9] & 255;
            ArrayList arrayListA = AbstractC0597b.a(bArrCopyOf);
            if (((C2393o) p7.f13378l) == null) {
                C2392n c2392n = new C2392n();
                c2392n.f18073l = D.m("audio/ogg");
                c2392n.f18074m = D.m("audio/opus");
                c2392n.f18055C = i7;
                c2392n.f18056D = 48000;
                c2392n.f18077p = arrayListA;
                p7.f13378l = new C2393o(c2392n);
                return true;
            }
        } else {
            if (!e(b4, f14706p)) {
                AbstractC0015b.i((C2393o) p7.f13378l);
                return false;
            }
            AbstractC0015b.i((C2393o) p7.f13378l);
            if (!this.f14707n) {
                this.f14707n = true;
                b4.G(8);
                C cR = AbstractC0597b.r(G.t((String[]) AbstractC0597b.u(b4, false, false).f741l));
                if (cR != null) {
                    C2392n c2392nA = ((C2393o) p7.f13378l).a();
                    c2392nA.f18072k = cR.b(((C2393o) p7.f13378l).f18110l);
                    p7.f13378l = new C2393o(c2392nA);
                    return true;
                }
            }
        }
        return true;
    }

    @Override // q2.j
    public final void d(boolean z7) {
        super.d(z7);
        if (z7) {
            this.f14707n = false;
        }
    }
}
