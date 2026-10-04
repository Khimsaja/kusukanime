package z5;

/* renamed from: z5.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2502g {

    /* renamed from: d, reason: collision with root package name */
    public static final C2502g f19048d;
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final C2500e f19049b;

    /* renamed from: c, reason: collision with root package name */
    public final C2501f f19050c;

    static {
        C2500e c2500e = C2500e.a;
        C2501f c2501f = C2501f.f19047b;
        f19048d = new C2502g(false, c2500e, c2501f);
        new C2502g(true, c2500e, c2501f);
    }

    public C2502g(boolean z7, C2500e c2500e, C2501f c2501f) {
        kotlin.jvm.internal.l.f("bytes", c2500e);
        kotlin.jvm.internal.l.f("number", c2501f);
        this.a = z7;
        this.f19049b = c2500e;
        this.f19050c = c2501f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HexFormat(\n    upperCase = ");
        sb.append(this.a);
        sb.append(",\n    bytes = BytesHexFormat(\n");
        this.f19049b.a("        ", sb);
        sb.append('\n');
        sb.append("    ),");
        sb.append('\n');
        sb.append("    number = NumberHexFormat(");
        sb.append('\n');
        this.f19050c.a("        ", sb);
        sb.append('\n');
        sb.append("    )");
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
