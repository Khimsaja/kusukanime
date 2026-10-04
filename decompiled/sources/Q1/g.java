package Q1;

import H1.AbstractC0225f;
import y1.C2393o;
import y1.Q;

/* loaded from: classes.dex */
public final class g extends o implements Comparable {

    /* renamed from: o, reason: collision with root package name */
    public final int f7877o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7878p;

    public g(int i7, Q q6, int i8, j jVar, int i9) {
        int i10;
        super(i7, q6, i8);
        this.f7877o = AbstractC0225f.m(i9, jVar.f7899z) ? 1 : 0;
        C2393o c2393o = this.f7912n;
        int i11 = c2393o.f18119u;
        int i12 = -1;
        if (i11 != -1 && (i10 = c2393o.f18120v) != -1) {
            i12 = i11 * i10;
        }
        this.f7878p = i12;
    }

    @Override // Q1.o
    public final int a() {
        return this.f7877o;
    }

    @Override // Q1.o
    public final /* bridge */ /* synthetic */ boolean b(o oVar) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f7878p, ((g) obj).f7878p);
    }
}
