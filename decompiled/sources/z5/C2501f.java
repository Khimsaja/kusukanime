package z5;

/* renamed from: z5.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2501f {

    /* renamed from: b, reason: collision with root package name */
    public static final C2501f f19047b = new C2501f();
    public final boolean a = true;

    public C2501f() {
        if (e3.c.d("")) {
            return;
        }
        e3.c.d("");
    }

    public final void a(String str, StringBuilder sb) {
        sb.append(str);
        sb.append("prefix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
