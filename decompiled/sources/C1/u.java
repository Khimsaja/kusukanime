package C1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: l, reason: collision with root package name */
    public long f628l = -9223372036854775807L;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f627k = new ArrayList();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f628l, ((u) obj).f628l);
    }
}
