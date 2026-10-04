package F1;

import java.io.File;

/* loaded from: classes.dex */
public abstract class i implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final String f2190k;

    /* renamed from: l, reason: collision with root package name */
    public final long f2191l;

    /* renamed from: m, reason: collision with root package name */
    public final long f2192m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f2193n;

    /* renamed from: o, reason: collision with root package name */
    public final File f2194o;

    /* renamed from: p, reason: collision with root package name */
    public final long f2195p;

    public i(String str, long j7, long j8, long j9, File file) {
        this.f2190k = str;
        this.f2191l = j7;
        this.f2192m = j8;
        this.f2193n = file != null;
        this.f2194o = file;
        this.f2195p = j9;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(i iVar) {
        String str = iVar.f2190k;
        String str2 = this.f2190k;
        if (!str2.equals(str)) {
            return str2.compareTo(iVar.f2190k);
        }
        long j7 = this.f2191l - iVar.f2191l;
        if (j7 == 0) {
            return 0;
        }
        return j7 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(this.f2191l);
        sb.append(", ");
        return A6.b.f(this.f2192m, "]", sb);
    }
}
