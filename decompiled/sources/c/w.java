package c;

import O3.C;
import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import e4.InterfaceC0821a;
import f0.AbstractC0851d;
import f0.C0852e;
import f0.C0866s;
import f0.EnumC0865r;
import f0.InterfaceC0850c;
import f0.InterfaceC0860m;
import f6.AbstractC0905c;
import io.ktor.util.GzipHeaderFlags;
import m.C1472B;
import y0.AbstractC2359f;
import y0.AbstractC2367n;
import z0.C2471u;

/* loaded from: classes.dex */
public final /* synthetic */ class w extends kotlin.jvm.internal.j implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f11108k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i7, Object obj, Class cls, String str, String str2, int i8, int i9) {
        super(i7, i8, cls, obj, str, str2);
        this.f11108k = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        C1472B c1472b;
        char c2;
        long j7;
        long j8;
        C1472B c1472b2;
        Object[] objArr;
        long[] jArr;
        C1472B c1472b3;
        Object[] objArr2;
        long j9;
        long[] jArr2;
        Q.d dVar;
        Q.d dVar2;
        long[] jArr3;
        long j10;
        int i7;
        Q.d dVar3;
        Object[] objArr3;
        C1472B c1472b4;
        Object[] objArr4;
        char c4;
        long j11;
        Q.d dVar4;
        Q.d dVar5;
        C1472B c1472b5;
        Object[] objArr5;
        int i8;
        ContentCaptureSession contentCaptureSessionA;
        switch (this.f11108k) {
            case 0:
                ((x) this.receiver).e();
                return C.a;
            case 1:
                ((x) this.receiver).e();
                return C.a;
            case 2:
                C0852e c0852e = (C0852e) this.receiver;
                C1472B c1472b6 = c0852e.f11393e;
                Object[] objArr6 = c1472b6.f12864b;
                long[] jArr4 = c1472b6.a;
                int length = jArr4.length - 2;
                char c6 = 7;
                long j12 = -9187201950435737472L;
                C1472B c1472b7 = c0852e.f11391c;
                if (length >= 0) {
                    int i9 = 0;
                    j8 = 255;
                    while (true) {
                        long j13 = jArr4[i9];
                        int i10 = i9;
                        if ((((~j13) << c6) & j13 & j12) != j12) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j13 & 255) < 128) {
                                    c4 = c6;
                                    a0.p pVar = (a0.p) ((InterfaceC0860m) objArr6[(i10 << 3) + i12]);
                                    j11 = j12;
                                    a0.p pVarF = pVar.f10402k;
                                    if (pVarF.f10414w) {
                                        Q.d dVar6 = null;
                                        while (pVarF != null) {
                                            if (pVarF instanceof C0866s) {
                                                c1472b7.a((C0866s) pVarF);
                                            } else {
                                                if ((pVarF.f10404m & 1024) != 0 && (pVarF instanceof AbstractC2367n)) {
                                                    a0.p pVar2 = ((AbstractC2367n) pVarF).f17880y;
                                                    c1472b5 = c1472b6;
                                                    int i13 = 0;
                                                    while (pVar2 != null) {
                                                        Object[] objArr7 = objArr6;
                                                        if ((pVar2.f10404m & 1024) != 0) {
                                                            i13++;
                                                            if (i13 == 1) {
                                                                pVarF = pVar2;
                                                            } else {
                                                                if (dVar6 == null) {
                                                                    i8 = i13;
                                                                    dVar6 = new Q.d(new a0.p[16]);
                                                                } else {
                                                                    i8 = i13;
                                                                }
                                                                if (pVarF != null) {
                                                                    dVar6.b(pVarF);
                                                                    pVarF = null;
                                                                }
                                                                dVar6.b(pVar2);
                                                                i13 = i8;
                                                            }
                                                        }
                                                        pVar2 = pVar2.f10407p;
                                                        objArr6 = objArr7;
                                                    }
                                                    objArr5 = objArr6;
                                                    if (i13 == 1) {
                                                    }
                                                    c1472b6 = c1472b5;
                                                    objArr6 = objArr5;
                                                }
                                                pVarF = AbstractC2359f.f(dVar6);
                                                c1472b6 = c1472b5;
                                                objArr6 = objArr5;
                                            }
                                            c1472b5 = c1472b6;
                                            objArr5 = objArr6;
                                            pVarF = AbstractC2359f.f(dVar6);
                                            c1472b6 = c1472b5;
                                            objArr6 = objArr5;
                                        }
                                        c1472b4 = c1472b6;
                                        objArr4 = objArr6;
                                        a0.p pVar3 = pVar.f10402k;
                                        if (!pVar3.f10414w) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        Q.d dVar7 = new Q.d(new a0.p[16]);
                                        a0.p pVar4 = pVar3.f10407p;
                                        if (pVar4 == null) {
                                            AbstractC2359f.b(dVar7, pVar3);
                                        } else {
                                            dVar7.b(pVar4);
                                        }
                                        while (dVar7.l()) {
                                            a0.p pVarF2 = (a0.p) dVar7.n(dVar7.f7829m - 1);
                                            if ((pVarF2.f10405n & 1024) == 0) {
                                                AbstractC2359f.b(dVar7, pVarF2);
                                            } else {
                                                while (true) {
                                                    if (pVarF2 == null) {
                                                        break;
                                                    }
                                                    if ((pVarF2.f10404m & 1024) != 0) {
                                                        Q.d dVar8 = null;
                                                        while (pVarF2 != null) {
                                                            if (pVarF2 instanceof C0866s) {
                                                                c1472b7.a((C0866s) pVarF2);
                                                            } else {
                                                                if ((pVarF2.f10404m & 1024) != 0 && (pVarF2 instanceof AbstractC2367n)) {
                                                                    a0.p pVar5 = ((AbstractC2367n) pVarF2).f17880y;
                                                                    int i14 = 0;
                                                                    while (pVar5 != null) {
                                                                        if ((pVar5.f10404m & 1024) != 0) {
                                                                            i14++;
                                                                            if (i14 == 1) {
                                                                                dVar5 = dVar7;
                                                                                pVarF2 = pVar5;
                                                                            } else {
                                                                                if (dVar8 == null) {
                                                                                    dVar5 = dVar7;
                                                                                    dVar8 = new Q.d(new a0.p[16]);
                                                                                } else {
                                                                                    dVar5 = dVar7;
                                                                                }
                                                                                if (pVarF2 != null) {
                                                                                    dVar8.b(pVarF2);
                                                                                    pVarF2 = null;
                                                                                }
                                                                                dVar8.b(pVar5);
                                                                            }
                                                                        } else {
                                                                            dVar5 = dVar7;
                                                                        }
                                                                        pVar5 = pVar5.f10407p;
                                                                        dVar7 = dVar5;
                                                                    }
                                                                    dVar4 = dVar7;
                                                                    if (i14 == 1) {
                                                                    }
                                                                    dVar7 = dVar4;
                                                                }
                                                                pVarF2 = AbstractC2359f.f(dVar8);
                                                                dVar7 = dVar4;
                                                            }
                                                            dVar4 = dVar7;
                                                            pVarF2 = AbstractC2359f.f(dVar8);
                                                            dVar7 = dVar4;
                                                        }
                                                    } else {
                                                        pVarF2 = pVarF2.f10407p;
                                                        dVar7 = dVar7;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        c1472b4 = c1472b6;
                                        objArr4 = objArr6;
                                    }
                                } else {
                                    c1472b4 = c1472b6;
                                    objArr4 = objArr6;
                                    c4 = c6;
                                    j11 = j12;
                                }
                                j13 >>= 8;
                                i12++;
                                c6 = c4;
                                j12 = j11;
                                c1472b6 = c1472b4;
                                objArr6 = objArr4;
                            }
                            c1472b = c1472b6;
                            objArr3 = objArr6;
                            c2 = c6;
                            j7 = j12;
                            if (i11 == 8) {
                            }
                        } else {
                            c1472b = c1472b6;
                            objArr3 = objArr6;
                            c2 = c6;
                            j7 = j12;
                        }
                        if (i10 != length) {
                            i9 = i10 + 1;
                            c6 = c2;
                            j12 = j7;
                            c1472b6 = c1472b;
                            objArr6 = objArr3;
                        }
                    }
                } else {
                    c1472b = c1472b6;
                    c2 = 7;
                    j7 = -9187201950435737472L;
                    j8 = 255;
                }
                c1472b.b();
                C1472B c1472b8 = c0852e.f11392d;
                Object[] objArr8 = c1472b8.f12864b;
                long[] jArr5 = c1472b8.a;
                int length2 = jArr5.length - 2;
                C1472B c1472b9 = c0852e.f11394f;
                if (length2 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j14 = jArr5[i15];
                        if ((((~j14) << c2) & j14 & j7) != j7) {
                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j14 & j8) < 128) {
                                    InterfaceC0850c interfaceC0850c = (InterfaceC0850c) objArr8[(i15 << 3) + i17];
                                    a0.p pVar6 = (a0.p) interfaceC0850c;
                                    c1472b3 = c1472b8;
                                    a0.p pVar7 = pVar6.f10402k;
                                    objArr2 = objArr8;
                                    boolean z7 = pVar7.f10414w;
                                    EnumC0865r enumC0865r = EnumC0865r.f11422m;
                                    if (z7) {
                                        C0866s c0866s = null;
                                        Q.d dVar9 = null;
                                        a0.p pVarF3 = pVar7;
                                        boolean z8 = true;
                                        boolean z9 = false;
                                        while (pVarF3 != null) {
                                            EnumC0865r enumC0865r2 = enumC0865r;
                                            if (pVarF3 instanceof C0866s) {
                                                C0866s c0866s2 = (C0866s) pVarF3;
                                                if (c0866s != null) {
                                                    z9 = true;
                                                }
                                                if (c1472b7.c(c0866s2)) {
                                                    c1472b9.a(c0866s2);
                                                    z8 = false;
                                                }
                                                c0866s = c0866s2;
                                            } else {
                                                if ((pVarF3.f10404m & 1024) != 0 && (pVarF3 instanceof AbstractC2367n)) {
                                                    a0.p pVar8 = ((AbstractC2367n) pVarF3).f17880y;
                                                    jArr3 = jArr5;
                                                    int i18 = 0;
                                                    while (pVar8 != null) {
                                                        long j15 = j14;
                                                        if ((pVar8.f10404m & 1024) != 0) {
                                                            i18++;
                                                            if (i18 == 1) {
                                                                pVarF3 = pVar8;
                                                            } else {
                                                                if (dVar9 == null) {
                                                                    i7 = i18;
                                                                    dVar3 = new Q.d(new a0.p[16]);
                                                                } else {
                                                                    i7 = i18;
                                                                    dVar3 = dVar9;
                                                                }
                                                                if (pVarF3 != null) {
                                                                    dVar3.b(pVarF3);
                                                                    pVarF3 = null;
                                                                }
                                                                dVar3.b(pVar8);
                                                                dVar9 = dVar3;
                                                                i18 = i7;
                                                            }
                                                        }
                                                        pVar8 = pVar8.f10407p;
                                                        j14 = j15;
                                                    }
                                                    j10 = j14;
                                                    if (i18 == 1) {
                                                    }
                                                    enumC0865r = enumC0865r2;
                                                    jArr5 = jArr3;
                                                    j14 = j10;
                                                }
                                                pVarF3 = AbstractC2359f.f(dVar9);
                                                enumC0865r = enumC0865r2;
                                                jArr5 = jArr3;
                                                j14 = j10;
                                            }
                                            jArr3 = jArr5;
                                            j10 = j14;
                                            pVarF3 = AbstractC2359f.f(dVar9);
                                            enumC0865r = enumC0865r2;
                                            jArr5 = jArr3;
                                            j14 = j10;
                                        }
                                        EnumC0865r enumC0865r3 = enumC0865r;
                                        jArr2 = jArr5;
                                        j9 = j14;
                                        a0.p pVar9 = pVar6.f10402k;
                                        if (!pVar9.f10414w) {
                                            throw new IllegalStateException("visitChildren called on an unattached node");
                                        }
                                        Q.d dVar10 = new Q.d(new a0.p[16]);
                                        a0.p pVar10 = pVar9.f10407p;
                                        if (pVar10 == null) {
                                            AbstractC2359f.b(dVar10, pVar9);
                                        } else {
                                            dVar10.b(pVar10);
                                        }
                                        while (dVar10.l()) {
                                            a0.p pVarF4 = (a0.p) dVar10.n(dVar10.f7829m - 1);
                                            if ((pVarF4.f10405n & 1024) == 0) {
                                                AbstractC2359f.b(dVar10, pVarF4);
                                            } else {
                                                while (pVarF4 != null) {
                                                    if ((pVarF4.f10404m & 1024) != 0) {
                                                        Q.d dVar11 = null;
                                                        while (pVarF4 != null) {
                                                            if (pVarF4 instanceof C0866s) {
                                                                C0866s c0866s3 = (C0866s) pVarF4;
                                                                if (c0866s != null) {
                                                                    z9 = true;
                                                                }
                                                                if (c1472b7.c(c0866s3)) {
                                                                    c1472b9.a(c0866s3);
                                                                    z8 = false;
                                                                }
                                                                c0866s = c0866s3;
                                                            } else {
                                                                if ((pVarF4.f10404m & 1024) != 0 && (pVarF4 instanceof AbstractC2367n)) {
                                                                    a0.p pVar11 = ((AbstractC2367n) pVarF4).f17880y;
                                                                    int i19 = 0;
                                                                    while (pVar11 != null) {
                                                                        if ((pVar11.f10404m & 1024) != 0) {
                                                                            i19++;
                                                                            if (i19 == 1) {
                                                                                dVar2 = dVar10;
                                                                                pVarF4 = pVar11;
                                                                            } else {
                                                                                if (dVar11 == null) {
                                                                                    dVar2 = dVar10;
                                                                                    dVar11 = new Q.d(new a0.p[16]);
                                                                                } else {
                                                                                    dVar2 = dVar10;
                                                                                }
                                                                                if (pVarF4 != null) {
                                                                                    dVar11.b(pVarF4);
                                                                                    pVarF4 = null;
                                                                                }
                                                                                dVar11.b(pVar11);
                                                                                pVar11 = pVar11.f10407p;
                                                                                dVar10 = dVar2;
                                                                            }
                                                                        } else {
                                                                            dVar2 = dVar10;
                                                                        }
                                                                        pVar11 = pVar11.f10407p;
                                                                        dVar10 = dVar2;
                                                                    }
                                                                    dVar = dVar10;
                                                                    if (i19 == 1) {
                                                                    }
                                                                    dVar10 = dVar;
                                                                }
                                                                pVarF4 = AbstractC2359f.f(dVar11);
                                                                dVar10 = dVar;
                                                            }
                                                            dVar = dVar10;
                                                            pVarF4 = AbstractC2359f.f(dVar11);
                                                            dVar10 = dVar;
                                                        }
                                                    } else {
                                                        pVarF4 = pVarF4.f10407p;
                                                        dVar10 = dVar10;
                                                    }
                                                }
                                            }
                                            dVar10 = dVar10;
                                        }
                                        if (z8) {
                                            interfaceC0850c.B(z9 ? AbstractC0851d.o(interfaceC0850c) : c0866s != null ? c0866s.H0() : enumC0865r3);
                                        }
                                        j14 = j9 >> 8;
                                        i17++;
                                        c1472b8 = c1472b3;
                                        objArr8 = objArr2;
                                        jArr5 = jArr2;
                                    } else {
                                        interfaceC0850c.B(enumC0865r);
                                    }
                                } else {
                                    c1472b3 = c1472b8;
                                    objArr2 = objArr8;
                                }
                                jArr2 = jArr5;
                                j9 = j14;
                                j14 = j9 >> 8;
                                i17++;
                                c1472b8 = c1472b3;
                                objArr8 = objArr2;
                                jArr5 = jArr2;
                            }
                            c1472b2 = c1472b8;
                            objArr = objArr8;
                            jArr = jArr5;
                            if (i16 == 8) {
                            }
                        } else {
                            c1472b2 = c1472b8;
                            objArr = objArr8;
                            jArr = jArr5;
                        }
                        if (i15 != length2) {
                            i15++;
                            c1472b8 = c1472b2;
                            objArr8 = objArr;
                            jArr5 = jArr;
                        }
                    }
                } else {
                    c1472b2 = c1472b8;
                }
                c1472b2.b();
                Object[] objArr9 = c1472b7.f12864b;
                long[] jArr6 = c1472b7.a;
                int length3 = jArr6.length - 2;
                if (length3 >= 0) {
                    int i20 = 0;
                    while (true) {
                        long j16 = jArr6[i20];
                        if ((((~j16) << c2) & j16 & j7) != j7) {
                            int i21 = 8 - ((~(i20 - length3)) >>> 31);
                            for (int i22 = 0; i22 < i21; i22++) {
                                if ((j16 & j8) < 128) {
                                    C0866s c0866s4 = (C0866s) objArr9[(i20 << 3) + i22];
                                    if (c0866s4.f10414w) {
                                        EnumC0865r enumC0865rH0 = c0866s4.H0();
                                        c0866s4.K0();
                                        if (enumC0865rH0 != c0866s4.H0() || c1472b9.c(c0866s4)) {
                                            AbstractC0851d.A(c0866s4);
                                        }
                                    }
                                }
                                j16 >>= 8;
                            }
                            if (i21 == 8) {
                            }
                        }
                        if (i20 != length3) {
                            i20++;
                        }
                    }
                }
                c1472b7.b();
                c1472b9.b();
                c0852e.f11390b.invoke();
                if (!c1472b.g()) {
                    AbstractC0905c.C("Unprocessed FocusProperties nodes");
                    throw null;
                }
                if (!c1472b2.g()) {
                    AbstractC0905c.C("Unprocessed FocusEvent nodes");
                    throw null;
                }
                if (c1472b7.g()) {
                    return C.a;
                }
                AbstractC0905c.C("Unprocessed FocusTarget nodes");
                throw null;
            case 3:
                androidx.compose.ui.focus.b bVar = (androidx.compose.ui.focus.b) this.receiver;
                if (bVar.f10654f.H0() == EnumC0865r.f11422m) {
                    bVar.f10651c.invoke();
                }
                return C.a;
            case GzipHeaderFlags.EXTRA /* 4 */:
                View view = (View) this.receiver;
                int i23 = Build.VERSION.SDK_INT;
                if (i23 >= 30) {
                    C0.i.a(view, 1);
                }
                if (i23 < 29 || (contentCaptureSessionA = C0.h.a(view)) == null) {
                    return null;
                }
                return new C0.f(contentCaptureSessionA, view);
            case 5:
                C2471u c2471u = (C2471u) this.receiver;
                if (c2471u.isFocused() || c2471u.hasFocus()) {
                    c2471u.clearFocus();
                }
                return C.a;
            default:
                return ((C2471u) this.receiver).t();
        }
    }
}
