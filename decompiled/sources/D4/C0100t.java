package D4;

/* renamed from: D4.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0100t extends L {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1630b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1631c;

    public C0100t(String str, int i7) {
        kotlin.jvm.internal.l.f("className", str);
        this.a = str;
        this.f1630b = i7;
        if (i7 <= 0) {
            throw new IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
        }
        StringBuilder sb = new StringBuilder("ArrayKClassValue(");
        for (int i8 = 0; i8 < i7; i8++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.a);
        int i9 = this.f1630b;
        for (int i10 = 0; i10 < i9; i10++) {
            sb.append(">");
        }
        sb.append(")");
        this.f1631c = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0100t)) {
            return false;
        }
        C0100t c0100t = (C0100t) obj;
        return kotlin.jvm.internal.l.a(this.a, c0100t.a) && this.f1630b == c0100t.f1630b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1630b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return this.f1631c;
    }
}
