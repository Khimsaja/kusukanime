package s4;

/* loaded from: classes.dex */
public abstract class k {
    public final W4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final String f15834b;

    public k(W4.c cVar, String str) {
        kotlin.jvm.internal.l.f("packageFqName", cVar);
        this.a = cVar;
        this.f15834b = str;
    }

    public final W4.e a(int i7) {
        return W4.e.e(this.f15834b + i7);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        return A6.b.j(sb, this.f15834b, 'N');
    }
}
