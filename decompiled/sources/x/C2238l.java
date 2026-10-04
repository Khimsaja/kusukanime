package x;

import O.Z;
import O3.C;
import P3.F;
import java.util.ArrayList;
import java.util.List;
import w0.AbstractC2182Q;
import w0.S;

/* renamed from: x.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2238l extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17222l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f17223m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Z f17224n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2238l(ArrayList arrayList, Z z7, int i7) {
        super(1);
        this.f17222l = i7;
        this.f17223m = arrayList;
        this.f17224n = z7;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        int i7;
        int i8;
        switch (this.f17222l) {
            case 0:
                AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
                ArrayList arrayList = this.f17223m;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    C2240n c2240n = (C2240n) arrayList.get(i9);
                    if (c2240n.f17249m == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("position() should be called first");
                    }
                    List list = c2240n.f17241e;
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        S s7 = (S) list.get(i10);
                        int i11 = s7.f16841l;
                        long j7 = c2240n.f17251o;
                        c2240n.f17244h.a(i10, c2240n.f17238b);
                        AbstractC2182Q.j(abstractC2182Q, s7, T0.h.c(j7, c2240n.f17242f));
                    }
                }
                this.f17224n.getValue();
                return C.a;
            default:
                AbstractC2182Q abstractC2182Q2 = (AbstractC2182Q) obj;
                ArrayList arrayList2 = this.f17223m;
                int size3 = arrayList2.size();
                int i12 = 0;
                while (i12 < size3) {
                    z.j jVar = (z.j) arrayList2.get(i12);
                    if (jVar.f18486m == Integer.MIN_VALUE) {
                        throw new IllegalArgumentException("position() should be called first");
                    }
                    List list2 = jVar.f18475b;
                    int size4 = list2.size();
                    int i13 = 0;
                    while (i13 < size4) {
                        S s8 = (S) list2.get(i13);
                        int i14 = i13 * 2;
                        int[] iArr = jVar.f18484k;
                        long jB = F.b(iArr[i14], iArr[i14 + 1]);
                        boolean z7 = jVar.f18481h;
                        boolean z8 = jVar.f18482i;
                        if (z7) {
                            if (z8) {
                                i7 = i12;
                                i8 = (int) (jB >> 32);
                            } else {
                                i7 = i12;
                                i8 = (jVar.f18486m - ((int) (jB >> 32))) - (z8 ? s8.f16841l : s8.f16840k);
                            }
                            jB = F.b(i8, z8 ? (jVar.f18486m - ((int) (jB & 4294967295L))) - (z8 ? s8.f16841l : s8.f16840k) : (int) (jB & 4294967295L));
                        } else {
                            i7 = i12;
                        }
                        long jC = T0.h.c(jB, jVar.f18476c);
                        if (z8) {
                            AbstractC2182Q.j(abstractC2182Q2, s8, jC);
                        } else {
                            AbstractC2182Q.h(abstractC2182Q2, s8, jC);
                        }
                        i13++;
                        i12 = i7;
                    }
                    i12++;
                }
                this.f17224n.getValue();
                return C.a;
        }
    }
}
