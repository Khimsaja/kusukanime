package P;

import O.C0484c;
import O.C0509o0;
import O.C0517t;
import O.D0;
import O.x0;
import e4.InterfaceC0821a;
import java.util.ArrayList;
import y0.C2349D;

/* loaded from: classes.dex */
public final class m extends C {

    /* renamed from: e, reason: collision with root package name */
    public static final m f7675e;

    /* renamed from: g, reason: collision with root package name */
    public static final m f7677g;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7678c;

    /* renamed from: d, reason: collision with root package name */
    public static final m f7674d = new m(1, 2, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final m f7676f = new m(1, 2, 2);

    static {
        int i7 = 1;
        f7675e = new m(i7, i7, 1);
        int i8 = 1;
        f7677g = new m(i8, i8, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(int i7, int i8, int i9) {
        super(i7, i8);
        this.f7678c = i9;
    }

    @Override // P.C
    public final void a(B1.s sVar, B2.l lVar, D0 d02, C0517t c0517t) {
        int iC;
        int iO;
        switch (this.f7678c) {
            case 0:
                Object objInvoke = ((InterfaceC0821a) sVar.e(0)).invoke();
                C0484c c0484c = (C0484c) sVar.e(1);
                sVar.d(0);
                c0484c.getClass();
                d02.L(d02.c(c0484c), objInvoke);
                lVar.getClass();
                lVar.r(objInvoke);
                break;
            case 1:
                C0484c c0484c2 = (C0484c) sVar.e(0);
                int iD = sVar.d(0);
                lVar.U();
                c0484c2.getClass();
                Object objW = d02.w(d02.c(c0484c2));
                lVar.getClass();
                ((C2349D) lVar.f418n).x(iD, (C2349D) objW);
                break;
            case 2:
                Object objE = sVar.e(0);
                C0484c c0484c3 = (C0484c) sVar.e(1);
                int iD2 = sVar.d(0);
                if (objE instanceof x0) {
                    ((ArrayList) c0517t.f7173c).add(((x0) objE).a);
                }
                int iC2 = d02.c(c0484c3);
                int iG = d02.g(d02.F(iC2, iD2));
                Object[] objArr = d02.f6968c;
                Object obj = objArr[iG];
                objArr[iG] = objE;
                if (!(obj instanceof x0)) {
                    if (obj instanceof C0509o0) {
                        ((C0509o0) obj).d();
                        break;
                    }
                } else {
                    int iO2 = d02.o() - d02.F(iC2, iD2);
                    x0 x0Var = (x0) obj;
                    C0484c c0484c4 = x0Var.f7243b;
                    if (c0484c4 == null || !c0484c4.a()) {
                        iC = -1;
                        iO = -1;
                    } else {
                        iC = d02.c(c0484c4);
                        iO = d02.o() - d02.f(d02.f6967b, d02.p(d02.q(iC) + iC));
                    }
                    c0517t.h(x0Var.a, iO2, iC, iO);
                    break;
                }
                break;
            default:
                Object objE2 = sVar.e(0);
                int iD3 = sVar.d(0);
                if (objE2 instanceof x0) {
                    ((ArrayList) c0517t.f7173c).add(((x0) objE2).a);
                }
                int iG2 = d02.g(d02.F(d02.f6985t, iD3));
                Object[] objArr2 = d02.f6968c;
                Object obj2 = objArr2[iG2];
                objArr2[iG2] = objE2;
                if (!(obj2 instanceof x0)) {
                    if (obj2 instanceof C0509o0) {
                        ((C0509o0) obj2).d();
                        break;
                    }
                } else {
                    c0517t.h(((x0) obj2).a, d02.o() - d02.F(d02.f6985t, iD3), -1, -1);
                    break;
                }
                break;
        }
    }

    @Override // P.C
    public final String b(int i7) {
        switch (this.f7678c) {
            case 0:
                if (i7 != 0) {
                    break;
                }
                break;
            case 1:
                if (i7 != 0) {
                    break;
                }
                break;
            case 2:
                if (i7 != 0) {
                    break;
                }
                break;
            default:
                if (i7 != 0) {
                    break;
                }
                break;
        }
        return super.b(i7);
    }

    @Override // P.C
    public final String c(int i7) {
        switch (this.f7678c) {
            case 0:
                if (i7 != 0) {
                    if (i7 != 1) {
                        break;
                    }
                }
                break;
            case 1:
                if (i7 != 0) {
                    break;
                }
                break;
            case 2:
                if (i7 != 0) {
                    if (i7 != 1) {
                        break;
                    }
                }
                break;
            default:
                if (i7 != 0) {
                    break;
                }
                break;
        }
        return super.c(i7);
    }
}
