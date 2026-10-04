package Q1;

import H1.AbstractC0225f;
import j3.AbstractC1338y;
import y1.C2393o;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f7879k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f7880l;

    public h(C2393o c2393o, int i7) {
        this.f7879k = (c2393o.f18103e & 1) != 0;
        this.f7880l = AbstractC0225f.m(i7, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return AbstractC1338y.a.c(this.f7880l, hVar.f7880l).c(this.f7879k, hVar.f7879k).e();
    }
}
