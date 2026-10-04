package m;

/* renamed from: m.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479I extends P3.D {

    /* renamed from: k, reason: collision with root package name */
    public int f12875k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C1478H f12876l;

    public C1479I(C1478H c1478h) {
        this.f12876l = c1478h;
    }

    @Override // P3.D
    public final int a() {
        int i7 = this.f12875k;
        this.f12875k = i7 + 1;
        return this.f12876l.c(i7);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12875k < this.f12876l.e();
    }
}
