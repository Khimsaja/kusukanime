package J5;

/* loaded from: classes.dex */
public final class k extends l {
    public final Throwable a;

    public k(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return kotlin.jvm.internal.l.a(this.a, ((k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // J5.l
    public final String toString() {
        return "Closed(" + this.a + ')';
    }
}
