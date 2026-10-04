package n5;

import java.util.Comparator;
import y0.C2349D;

/* renamed from: n5.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1584v implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13416k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f13417l;

    public /* synthetic */ C1584v(int i7, Object obj) {
        this.f13416k = i7;
        this.f13417l = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f13416k) {
            case 0:
                AbstractC1586x abstractC1586x = (AbstractC1586x) obj;
                kotlin.jvm.internal.l.c(abstractC1586x);
                e4.k kVar = (e4.k) this.f13417l;
                String string = kVar.invoke(abstractC1586x).toString();
                AbstractC1586x abstractC1586x2 = (AbstractC1586x) obj2;
                kotlin.jvm.internal.l.c(abstractC1586x2);
                return z1.c.h(string, kVar.invoke(abstractC1586x2).toString());
            case 1:
                int iCompare = ((Comparator) this.f13417l).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                return C2349D.f17653V.compare(((F0.n) obj).f2103c, ((F0.n) obj2).f2103c);
            default:
                int iCompare2 = ((C1584v) this.f13417l).compare(obj, obj2);
                return iCompare2 != 0 ? iCompare2 : z1.c.h(Integer.valueOf(((F0.n) obj).f2107g), Integer.valueOf(((F0.n) obj2).f2107g));
        }
    }

    public C1584v(Comparator comparator) {
        this.f13416k = 1;
        this.f13417l = comparator;
    }
}
