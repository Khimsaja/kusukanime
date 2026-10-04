package M1;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6537k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f6538l;

    public /* synthetic */ u(int i7, Object obj) {
        this.f6537k = i7;
        this.f6538l = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6537k) {
            case 0:
                y yVar = (y) this.f6538l;
                return yVar.e(obj2) - yVar.e(obj);
            default:
                for (e4.k kVar : (e4.k[]) this.f6538l) {
                    int iH = z1.c.h((Comparable) kVar.invoke(obj), (Comparable) kVar.invoke(obj2));
                    if (iH != 0) {
                        return iH;
                    }
                }
                return 0;
        }
    }
}
