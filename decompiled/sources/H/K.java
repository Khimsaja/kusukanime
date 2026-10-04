package H;

import java.util.ArrayList;
import w0.AbstractC2182Q;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.m implements e4.k {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2895l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2896m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i7, ArrayList arrayList) {
        super(1);
        this.f2895l = i7;
        this.f2896m = arrayList;
    }

    @Override // e4.k
    public final Object invoke(Object obj) {
        switch (this.f2895l) {
            case 0:
                AbstractC2182Q abstractC2182Q = (AbstractC2182Q) obj;
                ArrayList arrayList = this.f2896m;
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    AbstractC2182Q.d(abstractC2182Q, (w0.S) arrayList.get(i7), 0, 0);
                }
                break;
            case 1:
                AbstractC2182Q abstractC2182Q2 = (AbstractC2182Q) obj;
                ArrayList arrayList2 = this.f2896m;
                int size2 = arrayList2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    AbstractC2182Q.f(abstractC2182Q2, (w0.S) arrayList2.get(i8), 0, 0);
                }
                break;
            case 2:
                AbstractC2182Q abstractC2182Q3 = (AbstractC2182Q) obj;
                ArrayList arrayList3 = this.f2896m;
                int iY = P3.r.y(arrayList3);
                if (iY >= 0) {
                    int i9 = 0;
                    while (true) {
                        AbstractC2182Q.f(abstractC2182Q3, (w0.S) arrayList3.get(i9), 0, 0);
                        if (i9 != iY) {
                            i9++;
                        }
                    }
                }
                break;
            case 3:
                AbstractC2182Q abstractC2182Q4 = (AbstractC2182Q) obj;
                ArrayList arrayList4 = this.f2896m;
                int size3 = arrayList4.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    AbstractC2182Q.d(abstractC2182Q4, (w0.S) arrayList4.get(i10), 0, 0);
                }
                break;
            default:
                AbstractC2182Q abstractC2182Q5 = (AbstractC2182Q) obj;
                ArrayList arrayList5 = this.f2896m;
                int size4 = arrayList5.size();
                for (int i11 = 0; i11 < size4; i11++) {
                    AbstractC2182Q.g(abstractC2182Q5, (w0.S) arrayList5.get(i11), 0, 0);
                }
                break;
        }
        return O3.C.a;
    }
}
