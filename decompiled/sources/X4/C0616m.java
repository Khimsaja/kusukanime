package X4;

/* renamed from: X4.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616m implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public final int f9900k;

    /* renamed from: l, reason: collision with root package name */
    public final Q f9901l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f9902m;

    public C0616m(int i7, Q q6, boolean z7) {
        this.f9900k = i7;
        this.f9901l = q6;
        this.f9902m = z7;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9900k - ((C0616m) obj).f9900k;
    }
}
