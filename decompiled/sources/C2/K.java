package C2;

/* loaded from: classes.dex */
public final class K {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f686b;

    /* renamed from: c, reason: collision with root package name */
    public final int f687c;

    /* renamed from: d, reason: collision with root package name */
    public int f688d;

    /* renamed from: e, reason: collision with root package name */
    public String f689e;

    public K(int i7, int i8) {
        this(Integer.MIN_VALUE, i7, i8);
    }

    public final void a() {
        int i7 = this.f688d;
        this.f688d = i7 == Integer.MIN_VALUE ? this.f686b : i7 + this.f687c;
        this.f689e = this.a + this.f688d;
    }

    public final void b() {
        if (this.f688d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public K(int i7, int i8, int i9) {
        String str;
        if (i7 != Integer.MIN_VALUE) {
            str = i7 + "/";
        } else {
            str = "";
        }
        this.a = str;
        this.f686b = i8;
        this.f687c = i9;
        this.f688d = Integer.MIN_VALUE;
        this.f689e = "";
    }
}
