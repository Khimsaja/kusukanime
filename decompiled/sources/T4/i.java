package T4;

import B1.AbstractC0015b;
import P3.r;
import R4.T;
import R4.U;
import R4.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.l;
import s2.InterfaceC1976d;

/* loaded from: classes.dex */
public final class i implements InterfaceC1976d {

    /* renamed from: k, reason: collision with root package name */
    public final List f9111k;

    public /* synthetic */ i(List list) {
        this.f9111k = list;
    }

    public U a(int i7) {
        return (U) this.f9111k.get(i7);
    }

    @Override // s2.InterfaceC1976d
    public int d(long j7) {
        return j7 < 0 ? 0 : -1;
    }

    @Override // s2.InterfaceC1976d
    public long e(int i7) {
        AbstractC0015b.c(i7 == 0);
        return 0L;
    }

    @Override // s2.InterfaceC1976d
    public List i(long j7) {
        return j7 >= 0 ? this.f9111k : Collections.EMPTY_LIST;
    }

    @Override // s2.InterfaceC1976d
    public int m() {
        return 1;
    }

    public i(a0 a0Var) {
        l.f("typeTable", a0Var);
        List list = a0Var.f8366m;
        if ((a0Var.f8365l & 1) == 1) {
            int i7 = a0Var.f8367n;
            l.e("getTypeList(...)", list);
            ArrayList arrayList = new ArrayList(r.p(list, 10));
            int i8 = 0;
            for (Object obj : list) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    r.X();
                    throw null;
                }
                U uG = (U) obj;
                if (i8 >= i7) {
                    uG.getClass();
                    T tR = U.r(uG);
                    tR.f8277n |= 2;
                    tR.f8279p = true;
                    uG = tR.g();
                    if (!uG.a()) {
                        throw new D6.r();
                    }
                }
                arrayList.add(uG);
                i8 = i9;
            }
            list = arrayList;
        }
        l.e("run(...)", list);
        this.f9111k = list;
    }
}
