package L;

import O.C0509o0;
import O.C0510p;
import f.AbstractC0847h;
import h0.InterfaceC0973S;
import io.ktor.utils.io.ByteChannelKt;
import o.AbstractC1599K;
import p.AbstractC1745d;
import v.AbstractC2136o;

/* loaded from: classes.dex */
public final class y2 {
    public static final y2 a = new y2();

    /* renamed from: b, reason: collision with root package name */
    public static final float f5959b = 56;

    /* renamed from: c, reason: collision with root package name */
    public static final float f5960c = 280;

    /* renamed from: d, reason: collision with root package name */
    public static final float f5961d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final float f5962e = 2;

    public static v.Z c() {
        float f5 = M.W.f6267b;
        return new v.Z(f5, M.W.f6269d, f5, 0);
    }

    public final void a(boolean z7, u.j jVar, t2 t2Var, InterfaceC0973S interfaceC0973S, C0510p c0510p, int i7) {
        int i8 = 16;
        a0.n nVar = a0.n.a;
        c0510p.T(-818661242);
        int i9 = i7 | (c0510p.g(z7) ? 4 : 2) | (c0510p.g(false) ? 32 : 16) | (c0510p.f(jVar) ? 256 : 128) | (c0510p.f(t2Var) ? 16384 : 8192) | (c0510p.f(interfaceC0973S) ? 131072 : 65536);
        if ((38347923 & i9) == 38347922 && c0510p.y()) {
            c0510p.M();
        } else {
            c0510p.O();
            if ((i7 & 1) != 0 && !c0510p.x()) {
                c0510p.M();
            }
            c0510p.q();
            x2 x2Var = new x2(new C0425v1(0, 1, O.R0.class, AbstractC1599K.a(!z7 ? t2Var.f5835g : ((Boolean) AbstractC0847h.k(jVar, c0510p, (i9 >> 6) & 14).getValue()).booleanValue() ? t2Var.f5833e : t2Var.f5834f, AbstractC1745d.q(150, 0, null, 6), c0510p, 48, 12), "value", "getValue()Ljava/lang/Object;"));
            float f5 = M.W.f6267b;
            AbstractC2136o.a(a0.a.a(androidx.compose.ui.draw.a.b(nVar, new A3.t(i8, interfaceC0973S, x2Var)), new B.c(jVar, z7, t2Var)), c0510p, 0);
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new u2(this, z7, jVar, t2Var, interfaceC0973S, i7);
        }
    }

    public final void b(String str, e4.n nVar, boolean z7, boolean z8, I1.e eVar, u.j jVar, W.a aVar, W.a aVar2, W.a aVar3, InterfaceC0973S interfaceC0973S, t2 t2Var, v.Z z9, W.a aVar4, C0510p c0510p, int i7) {
        String str2;
        int i8;
        boolean z10;
        I1.e eVar2;
        v.Z z11;
        int i9;
        W.a aVarB;
        v.Z z12;
        W.a aVar5;
        c0510p.T(289640444);
        if ((i7 & 6) == 0) {
            str2 = str;
            i8 = (c0510p.f(str2) ? 4 : 2) | i7;
        } else {
            str2 = str;
            i8 = i7;
        }
        if ((i7 & 48) == 0) {
            i8 |= c0510p.h(nVar) ? 32 : 16;
        }
        if ((i7 & 384) == 0) {
            i8 |= c0510p.g(z7) ? 256 : 128;
        }
        if ((i7 & 3072) == 0) {
            z10 = z8;
            i8 |= c0510p.g(z10) ? 2048 : 1024;
        } else {
            z10 = z8;
        }
        if ((i7 & 24576) == 0) {
            eVar2 = eVar;
            i8 |= c0510p.f(eVar2) ? 16384 : 8192;
        } else {
            eVar2 = eVar;
        }
        if ((i7 & 196608) == 0) {
            i8 |= c0510p.f(jVar) ? 131072 : 65536;
        }
        if ((i7 & 1572864) == 0) {
            i8 |= c0510p.g(false) ? ByteChannelKt.CHANNEL_MAX_SIZE : 524288;
        }
        if ((i7 & 12582912) == 0) {
            i8 |= c0510p.h(null) ? 8388608 : 4194304;
        }
        if ((i7 & 100663296) == 0) {
            i8 |= c0510p.h(aVar) ? 67108864 : 33554432;
        }
        if ((i7 & 805306368) == 0) {
            i8 |= c0510p.h(aVar2) ? 536870912 : 268435456;
        }
        int i10 = 100663296 | (c0510p.h(aVar3) ? 4 : 2) | (c0510p.h(null) ? 32 : 16) | (c0510p.h(null) ? 256 : 128) | (c0510p.h(null) ? 2048 : 1024) | (c0510p.f(interfaceC0973S) ? 16384 : 8192) | (c0510p.f(t2Var) ? 131072 : 65536) | 13107200;
        if ((306783379 & i8) == 306783378 && (38347923 & i10) == 38347922 && c0510p.y()) {
            c0510p.M();
            z12 = z9;
            aVar5 = aVar4;
        } else {
            c0510p.O();
            if ((i7 & 1) == 0 || c0510p.x()) {
                float f5 = M.W.f6267b;
                z11 = new v.Z(f5, f5, f5, f5);
                i9 = i10 & (-3670017);
                aVarB = W.f.b(-435523791, new v2(z7, jVar, t2Var, interfaceC0973S), c0510p);
            } else {
                c0510p.M();
                i9 = i10 & (-3670017);
                z11 = z9;
                aVarB = aVar4;
            }
            c0510p.q();
            int i11 = i8 << 3;
            int i12 = i8 >> 3;
            int i13 = (i12 & 7168) | (i11 & 112) | 6 | (i11 & 896);
            int i14 = i8 >> 9;
            int i15 = i9 << 21;
            v.Z z13 = z11;
            M.W.a(M.X.f6275k, str2, nVar, eVar2, null, aVar, aVar2, aVar3, null, null, z10, z7, false, jVar, z13, t2Var, aVarB, c0510p, i13 | (i14 & 57344) | (i14 & 458752) | (i14 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192), (i12 & 57344) | (i14 & 7168) | ((i9 >> 9) & 14) | ((i8 >> 6) & 112) | (i8 & 896) | ((i9 << 3) & 3670016) | 12582912);
            z12 = z13;
            aVar5 = aVarB;
        }
        C0509o0 c0509o0S = c0510p.s();
        if (c0509o0S != null) {
            c0509o0S.f7111d = new w2(this, str, nVar, z7, z8, eVar, jVar, aVar, aVar2, aVar3, interfaceC0973S, t2Var, z12, aVar5, i7);
        }
    }
}
