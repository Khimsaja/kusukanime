package B2;

/* loaded from: classes.dex */
public final class h implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final int f400k;

    /* renamed from: l, reason: collision with root package name */
    public final c f401l;

    public h(int i7, c cVar) {
        this.f400k = i7;
        this.f401l = cVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f400k, ((h) obj).f400k);
    }
}
