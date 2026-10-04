package y0;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class c0 implements Comparator {

    /* renamed from: l, reason: collision with root package name */
    public static final c0 f17836l = new c0(0);

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f17837k;

    public /* synthetic */ c0(int i7) {
        this.f17837k = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17837k) {
            case 0:
                C2349D c2349d = (C2349D) obj;
                C2349D c2349d2 = (C2349D) obj2;
                int iG = kotlin.jvm.internal.l.g(c2349d2.f17681u, c2349d.f17681u);
                return iG != 0 ? iG : kotlin.jvm.internal.l.g(c2349d.hashCode(), c2349d2.hashCode());
            default:
                C2349D c2349d3 = (C2349D) obj;
                C2349D c2349d4 = (C2349D) obj2;
                int iG2 = kotlin.jvm.internal.l.g(c2349d3.f17681u, c2349d4.f17681u);
                return iG2 != 0 ? iG2 : kotlin.jvm.internal.l.g(c2349d3.hashCode(), c2349d4.hashCode());
        }
    }
}
