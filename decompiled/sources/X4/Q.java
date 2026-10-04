package X4;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF12' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class Q {

    /* renamed from: m, reason: collision with root package name */
    public static final Q f9857m;

    /* renamed from: n, reason: collision with root package name */
    public static final Q f9858n;

    /* renamed from: o, reason: collision with root package name */
    public static final N f9859o;

    /* renamed from: p, reason: collision with root package name */
    public static final O f9860p;

    /* renamed from: q, reason: collision with root package name */
    public static final Q f9861q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ Q[] f9862r;

    /* renamed from: k, reason: collision with root package name */
    public final S f9863k;

    /* renamed from: l, reason: collision with root package name */
    public final int f9864l;

    /* JADX INFO: Fake field, exist only in values array */
    Q EF10;

    /* JADX INFO: Fake field, exist only in values array */
    Q EF11;

    /* JADX INFO: Fake field, exist only in values array */
    Q EF12;

    static {
        Q q6 = new Q("DOUBLE", 0, S.DOUBLE, 1);
        Q q7 = new Q("FLOAT", 1, S.FLOAT, 5);
        S s7 = S.LONG;
        Q q8 = new Q("INT64", 2, s7, 0);
        Q q9 = new Q("UINT64", 3, s7, 0);
        S s8 = S.INT;
        Q q10 = new Q("INT32", 4, s8, 0);
        f9857m = q10;
        Q q11 = new Q("FIXED64", 5, s7, 1);
        Q q12 = new Q("FIXED32", 6, s8, 5);
        Q q13 = new Q("BOOL", 7, S.BOOLEAN, 0);
        f9858n = q13;
        M m7 = new M("STRING", 8, S.STRING, 2);
        S s9 = S.MESSAGE;
        N n7 = new N("GROUP", 9, s9, 3);
        f9859o = n7;
        O o7 = new O("MESSAGE", 10, s9, 2);
        f9860p = o7;
        P p7 = new P("BYTES", 11, S.BYTE_STRING, 2);
        Q q14 = new Q("UINT32", 12, s8, 0);
        Q q15 = new Q("ENUM", 13, S.ENUM, 0);
        f9861q = q15;
        f9862r = new Q[]{q6, q7, q8, q9, q10, q11, q12, q13, m7, n7, o7, p7, q14, q15, new Q("SFIXED32", 14, s8, 5), new Q("SFIXED64", 15, s7, 1), new Q("SINT32", 16, s8, 0), new Q("SINT64", 17, s7, 0)};
    }

    public Q(String str, int i7, S s7, int i8) {
        this.f9863k = s7;
        this.f9864l = i8;
    }

    public static Q valueOf(String str) {
        return (Q) Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) f9862r.clone();
    }

    public boolean a() {
        return !(this instanceof M);
    }
}
