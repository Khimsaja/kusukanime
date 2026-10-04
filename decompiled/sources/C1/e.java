package C1;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f574k = 1;

    /* renamed from: l, reason: collision with root package name */
    public int f575l;

    public /* synthetic */ e() {
    }

    public static String b(int i7) {
        return "" + ((char) ((i7 >> 24) & 255)) + ((char) ((i7 >> 16) & 255)) + ((char) ((i7 >> 8) & 255)) + ((char) (i7 & 255));
    }

    public void a(int i7) {
        this.f575l = i7 | this.f575l;
    }

    public boolean c(int i7) {
        return (this.f575l & i7) == i7;
    }

    public String toString() {
        switch (this.f574k) {
            case 0:
                return b(this.f575l);
            default:
                return super.toString();
        }
    }

    public e(int i7) {
        this.f575l = i7;
    }
}
