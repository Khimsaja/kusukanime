package p;

/* renamed from: p.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1757j {
    public final C1761m a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14020b;

    public C1757j(C1761m c1761m, int i7) {
        this.a = c1761m;
        this.f14020b = i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        int i7 = this.f14020b;
        sb.append(i7 != 1 ? i7 != 2 ? "null" : "Finished" : "BoundReached");
        sb.append(", endState=");
        sb.append(this.a);
        sb.append(')');
        return sb.toString();
    }
}
