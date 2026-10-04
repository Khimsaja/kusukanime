package G2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class x implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final y f2751k;

    /* renamed from: l, reason: collision with root package name */
    public final Bundle f2752l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f2753m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2754n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f2755o;

    public x(y yVar, Bundle bundle, boolean z7, int i7, boolean z8) {
        kotlin.jvm.internal.l.f("destination", yVar);
        this.f2751k = yVar;
        this.f2752l = bundle;
        this.f2753m = z7;
        this.f2754n = i7;
        this.f2755o = z8;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(x xVar) {
        kotlin.jvm.internal.l.f("other", xVar);
        boolean z7 = xVar.f2753m;
        boolean z8 = this.f2753m;
        if (z8 && !z7) {
            return 1;
        }
        if (!z8 && z7) {
            return -1;
        }
        int i7 = this.f2754n - xVar.f2754n;
        if (i7 > 0) {
            return 1;
        }
        if (i7 < 0) {
            return -1;
        }
        Bundle bundle = xVar.f2752l;
        Bundle bundle2 = this.f2752l;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            kotlin.jvm.internal.l.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z9 = xVar.f2755o;
        boolean z10 = this.f2755o;
        if (!z10 || z9) {
            return (z10 || !z9) ? 0 : -1;
        }
        return 1;
    }
}
