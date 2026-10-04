package p;

import java.util.Arrays;
import m.C1495p;
import m.C1496q;

/* renamed from: p.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1726M implements InterfaceC1773y {
    public final F5.o a;

    public C1726M(F5.o oVar) {
        this.a = oVar;
    }

    @Override // p.InterfaceC1773y, p.InterfaceC1760l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final H0 a(B0 b02) {
        int[] iArr;
        Object[] objArr;
        int[] iArr2;
        Object[] objArr2;
        int i7;
        F5.o oVar = this.a;
        C1496q c1496q = (C1496q) oVar.f2542m;
        C1495p c1495p = new C1495p(c1496q.f12909e + 2);
        C1496q c1496q2 = new C1496q(c1496q.f12909e);
        int[] iArr3 = c1496q.f12906b;
        Object[] objArr3 = c1496q.f12907c;
        long[] jArr = c1496q.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j7 = jArr[i8];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j7 & 255) < 128) {
                            int i12 = (i8 << 3) + i11;
                            int i13 = iArr3[i12];
                            i7 = i9;
                            C1725L c1725l = (C1725L) objArr3[i12];
                            c1495p.a(i13);
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            c1496q2.h(i13, new G0((AbstractC1766r) b02.a.invoke(c1725l.a), c1725l.f13890b));
                        } else {
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            i7 = i9;
                        }
                        j7 >>= i7;
                        i11++;
                        iArr3 = iArr2;
                        i9 = i7;
                        objArr3 = objArr2;
                    }
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i10 != i9) {
                        break;
                    }
                } else {
                    iArr = iArr3;
                    objArr = objArr3;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                iArr3 = iArr;
                objArr3 = objArr;
            }
        }
        if (!c1496q.b(0)) {
            int i14 = c1495p.f12905b;
            if (i14 < 0) {
                throw new IndexOutOfBoundsException("Index 0 must be in 0.." + c1495p.f12905b);
            }
            c1495p.b(i14 + 1);
            int[] iArr4 = c1495p.a;
            int i15 = c1495p.f12905b;
            if (i15 != 0) {
                P3.m.V(1, 0, i15, iArr4, iArr4);
            }
            iArr4[0] = 0;
            c1495p.f12905b++;
        }
        if (!c1496q.b(oVar.f2541l)) {
            c1495p.a(oVar.f2541l);
        }
        int i16 = c1495p.f12905b;
        if (i16 != 0) {
            int[] iArr5 = c1495p.a;
            kotlin.jvm.internal.l.f("<this>", iArr5);
            Arrays.sort(iArr5, 0, i16);
        }
        return new H0(c1495p, c1496q2, oVar.f2541l, AbstractC1714A.f13835c);
    }
}
