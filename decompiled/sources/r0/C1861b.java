package r0;

import H5.D;
import O.S0;
import O3.C;
import X4.y;
import a0.p;
import e4.InterfaceC0821a;
import e4.k;
import h0.C0970O;
import io.ktor.util.GzipHeaderFlags;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;
import p.C1772x;
import s.C1944v0;
import w0.C2169D;
import w0.C2203v;
import w0.a0;
import x0.C2244d;
import x0.C2248h;
import y0.AbstractC2359f;
import y0.C2349D;
import y0.C2350E;
import y0.C2356c;
import y0.I;
import y0.J;
import y0.K;
import y0.Y;
import z0.AbstractC2455l0;
import z0.W;
import z0.X;

/* renamed from: r0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1861b extends m implements InterfaceC0821a {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f14783l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f14784m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1861b(int i7, Object obj) {
        super(0);
        this.f14783l = i7;
        this.f14784m = obj;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f14783l) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                S0 s02 = AbstractC2455l0.f18787f;
                C1944v0 c1944v0 = (C1944v0) this.f14784m;
                c1944v0.f15390L.a = new C1772x(new y((T0.b) AbstractC2359f.i(c1944v0, s02)));
                break;
            case 3:
                C2169D c2169dA = ((a0) this.f14784m).a();
                C2349D c2349d = c2169dA.f16816k;
                if (c2169dA.f16829x != ((Q.a) c2349d.p()).f7821k.f7829m) {
                    Iterator it = c2169dA.f16821p.entrySet().iterator();
                    while (it.hasNext()) {
                        ((C2203v) ((Map.Entry) it.next()).getValue()).f16881d = true;
                    }
                    if (!c2349d.f17661H.f17747d) {
                        C2349D.T(c2349d, false, 7);
                    }
                }
                break;
            case GzipHeaderFlags.EXTRA /* 4 */:
                C2244d c2244d = (C2244d) this.f14784m;
                int i7 = 0;
                c2244d.f17301f = false;
                HashSet hashSet = new HashSet();
                Q.d dVar = c2244d.f17299d;
                int i8 = dVar.f7829m;
                Q.d dVar2 = c2244d.f17300e;
                if (i8 > 0) {
                    Object[] objArr = dVar.f7827k;
                    int i9 = 0;
                    do {
                        C2349D c2349d2 = (C2349D) objArr[i9];
                        C2248h c2248h = (C2248h) dVar2.f7827k[i9];
                        p pVar = (p) c2349d2.f17660G.f7176f;
                        if (pVar.f10414w) {
                            C2244d.b(pVar, c2248h, hashSet);
                        }
                        i9++;
                    } while (i9 < i8);
                }
                dVar.g();
                dVar2.g();
                Q.d dVar3 = c2244d.f17297b;
                int i10 = dVar3.f7829m;
                Q.d dVar4 = c2244d.f17298c;
                if (i10 > 0) {
                    Object[] objArr2 = dVar3.f7827k;
                    do {
                        C2356c c2356c = (C2356c) objArr2[i7];
                        C2248h c2248h2 = (C2248h) dVar4.f7827k[i7];
                        if (c2356c.f10414w) {
                            C2244d.b(c2356c, c2248h2, hashSet);
                        }
                        i7++;
                    } while (i7 < i10);
                }
                dVar3.g();
                dVar4.g();
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C2356c) it2.next()).I0();
                }
                break;
            case 5:
                break;
            case 6:
                K k7 = ((C2349D) this.f14784m).f17661H;
                k7.f17761r.f17725F = true;
                I i11 = k7.f17762s;
                if (i11 != null) {
                    i11.f17703C = true;
                }
                break;
            case 7:
                J j7 = (J) this.f14784m;
                K k8 = j7.f17733P;
                int i12 = 0;
                k8.f17754k = 0;
                Q.d dVarV = k8.a.v();
                int i13 = dVarV.f7829m;
                if (i13 > 0) {
                    Object[] objArr3 = dVarV.f7827k;
                    int i14 = 0;
                    do {
                        J j8 = ((C2349D) objArr3[i14]).f17661H.f17761r;
                        j8.f17735q = j8.f17736r;
                        j8.f17736r = Integer.MAX_VALUE;
                        j8.f17722C = false;
                        if (j8.f17739u == 2) {
                            j8.f17739u = 3;
                        }
                        i14++;
                    } while (i14 < i13);
                }
                K k9 = j7.f17733P;
                Q.d dVarV2 = k9.a.v();
                int i15 = dVarV2.f7829m;
                if (i15 > 0) {
                    Object[] objArr4 = dVarV2.f7827k;
                    int i16 = 0;
                    do {
                        ((C2349D) objArr4[i16]).f17661H.f17761r.f17723D.f17689d = false;
                        i16++;
                    } while (i16 < i15);
                }
                j7.j().y0().n();
                C2349D c2349d3 = k9.a;
                Q.d dVarV3 = c2349d3.v();
                int i17 = dVarV3.f7829m;
                if (i17 > 0) {
                    Object[] objArr5 = dVarV3.f7827k;
                    int i18 = 0;
                    do {
                        C2349D c2349d4 = (C2349D) objArr5[i18];
                        if (c2349d4.f17661H.f17761r.f17735q != c2349d4.t()) {
                            c2349d3.K();
                            c2349d3.y();
                            if (c2349d4.t() == Integer.MAX_VALUE) {
                                c2349d4.f17661H.f17761r.u0();
                            }
                        }
                        i18++;
                    } while (i18 < i17);
                }
                Q.d dVarV4 = c2349d3.v();
                int i19 = dVarV4.f7829m;
                if (i19 > 0) {
                    Object[] objArr6 = dVarV4.f7827k;
                    do {
                        C2350E c2350e = ((C2349D) objArr6[i12]).f17661H.f17761r.f17723D;
                        c2350e.f17690e = c2350e.f17689d;
                        i12++;
                    } while (i12 < i19);
                }
                break;
            case 8:
                K k10 = (K) this.f14784m;
                k10.a().b(k10.f17763t);
                break;
            case 9:
                Y y7 = ((Y) this.f14784m).f17827x;
                if (y7 != null) {
                    y7.V0();
                }
                break;
            case 10:
                C0970O c0970o = Y.f17808O;
                ((k) this.f14784m).invoke(c0970o);
                c0970o.f11799y = c0970o.f11794t.c(c0970o.f11796v, c0970o.f11798x, c0970o.f11797w);
                break;
            case 11:
                D.h(((W) this.f14784m).f18707m, null);
                break;
            default:
                ((X) this.f14784m).f18709b = null;
                break;
        }
        return C.a;
    }
}
