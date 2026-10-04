package j3;

/* renamed from: j3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1329o {

    /* renamed from: k, reason: collision with root package name */
    public transient C1319e f12367k;

    /* renamed from: l, reason: collision with root package name */
    public transient C1328n f12368l;

    /* renamed from: m, reason: collision with root package name */
    public transient C1318d f12369m;

    public abstract C1318d a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1329o) {
            return ((T) this).a().equals(((T) ((AbstractC1329o) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f12335m.hashCode();
    }

    public final String toString() {
        return a().f12335m.toString();
    }
}
