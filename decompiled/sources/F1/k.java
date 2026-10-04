package F1;

import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class k {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2197b;

    /* renamed from: c, reason: collision with root package name */
    public final TreeSet f2198c = new TreeSet();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f2199d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public p f2200e;

    public k(int i7, String str, p pVar) {
        this.a = i7;
        this.f2197b = str;
        this.f2200e = pVar;
    }

    public final boolean a(long j7, long j8) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f2199d;
            if (i7 >= arrayList.size()) {
                return false;
            }
            j jVar = (j) arrayList.get(i7);
            long j9 = jVar.f2196b;
            long j10 = jVar.a;
            if (j9 == -1) {
                if (j7 >= j10) {
                    return true;
                }
            } else if (j8 != -1 && j10 <= j7 && j7 + j8 <= j10 + j9) {
                return true;
            }
            i7++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.a == kVar.a && this.f2197b.equals(kVar.f2197b) && this.f2198c.equals(kVar.f2198c) && this.f2200e.equals(kVar.f2200e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2200e.hashCode() + A6.b.b(this.f2197b, this.a * 31, 31);
    }
}
