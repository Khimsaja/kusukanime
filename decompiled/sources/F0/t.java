package F0;

/* loaded from: classes.dex */
public final class t {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final e4.n f2154b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2155c;

    public t(String str, e4.n nVar) {
        this.a = str;
        this.f2154b = nVar;
    }

    public final void a(i iVar, Object obj) {
        iVar.j(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ t(String str) {
        this(str, p.f2120x);
    }

    public t(String str, boolean z7, e4.n nVar) {
        this(str, nVar);
        this.f2155c = z7;
    }
}
