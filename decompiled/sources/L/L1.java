package L;

import f0.AbstractC0851d;
import f0.C0866s;
import java.util.Collection;
import w0.AbstractC2182Q;
import y.AbstractC2307G;
import y.C2304D;
import y.C2306F;
import y.C2316P;

/* loaded from: classes.dex */
public final class L1 extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f5190l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5191m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f5192n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L1(int i7, int i8, Object obj) {
        super(1);
        this.f5190l = i8;
        this.f5192n = obj;
        this.f5191m = i7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f5190l) {
            case 0:
                AbstractC2182Q.d((AbstractC2182Q) obj, (w0.S) this.f5192n, 0, -this.f5191m);
                break;
            case 1:
                break;
            case 2:
                Boolean boolB = AbstractC0851d.B((C0866s) obj, this.f5191m);
                ((kotlin.jvm.internal.x) this.f5192n).f12720k = boolB;
                break;
            case 3:
                C2304D c2304d = (C2304D) obj;
                O4.c cVar = ((w.u) this.f5192n).a;
                Y.h hVarC = Y.s.c();
                Y.s.f(hVarC, Y.s.d(hVarC), hVarC != null ? hVarC.f() : null);
                for (int i7 = 0; i7 < 2; i7++) {
                    int i8 = this.f5191m + i7;
                    c2304d.getClass();
                    long j7 = AbstractC2307G.a;
                    C2306F c2306f = c2304d.f17575b;
                    B2.l lVar = c2306f.f17577c;
                    if (lVar != null) {
                        c2304d.a.add(new C2316P(lVar, i8, j7, c2306f.f17576b));
                    }
                }
                break;
            default:
                C2304D c2304d2 = (C2304D) obj;
                O4.c cVar2 = ((x.v) this.f5192n).a;
                Y.h hVarC2 = Y.s.c();
                Y.s.f(hVarC2, Y.s.d(hVarC2), hVarC2 != null ? hVarC2.f() : null);
                int i9 = 0;
                while (true) {
                    cVar2.getClass();
                    if (i9 >= 2) {
                        break;
                    } else {
                        int i10 = this.f5191m + i9;
                        c2304d2.getClass();
                        long j8 = AbstractC2307G.a;
                        C2306F c2306f2 = c2304d2.f17575b;
                        B2.l lVar2 = c2306f2.f17577c;
                        if (lVar2 != null) {
                            c2304d2.a.add(new C2316P(lVar2, i10, j8, c2306f2.f17576b));
                        }
                        i9++;
                    }
                }
        }
        return O3.C.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L1(int i7, Collection collection) {
        super(1);
        this.f5190l = 1;
        this.f5191m = i7;
        this.f5192n = collection;
    }
}
