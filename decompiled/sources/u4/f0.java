package u4;

/* loaded from: classes.dex */
public abstract class f0 {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16318b;

    public f0(String str, boolean z7) {
        this.a = str;
        this.f16318b = z7;
    }

    public Integer a(f0 f0Var) {
        kotlin.jvm.internal.l.f("visibility", f0Var);
        Q3.g gVar = e0.a;
        if (this == f0Var) {
            return 0;
        }
        Q3.g gVar2 = e0.a;
        Integer num = (Integer) gVar2.get(this);
        Integer num2 = (Integer) gVar2.get(f0Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String b() {
        return this.a;
    }

    public final String toString() {
        return b();
    }

    public f0 c() {
        return this;
    }
}
