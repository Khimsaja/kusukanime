package i0;

/* renamed from: i0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1020d {
    public static final float[] a;

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f11868b;

    /* renamed from: c, reason: collision with root package name */
    public static final C1033q f11869c;

    /* renamed from: d, reason: collision with root package name */
    public static final C1033q f11870d;

    /* renamed from: e, reason: collision with root package name */
    public static final C1033q f11871e;

    /* renamed from: f, reason: collision with root package name */
    public static final C1033q f11872f;

    /* renamed from: g, reason: collision with root package name */
    public static final C1033q f11873g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1033q f11874h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1033q f11875i;

    /* renamed from: j, reason: collision with root package name */
    public static final C1033q f11876j;

    /* renamed from: k, reason: collision with root package name */
    public static final C1033q f11877k;

    /* renamed from: l, reason: collision with root package name */
    public static final C1033q f11878l;

    /* renamed from: m, reason: collision with root package name */
    public static final C1033q f11879m;

    /* renamed from: n, reason: collision with root package name */
    public static final C1033q f11880n;

    /* renamed from: o, reason: collision with root package name */
    public static final C1033q f11881o;

    /* renamed from: p, reason: collision with root package name */
    public static final C1033q f11882p;

    /* renamed from: q, reason: collision with root package name */
    public static final C1027k f11883q;

    /* renamed from: r, reason: collision with root package name */
    public static final C1027k f11884r;

    /* renamed from: s, reason: collision with root package name */
    public static final C1033q f11885s;

    /* renamed from: t, reason: collision with root package name */
    public static final C1028l f11886t;

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC1019c[] f11887u;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        f11868b = fArr2;
        C1034r c1034r = new C1034r(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1034r c1034r2 = new C1034r(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        C1035s c1035s = AbstractC1026j.f11896d;
        C1033q c1033q = new C1033q("sRGB IEC61966-2.1", fArr, c1035s, c1034r, 0);
        f11869c = c1033q;
        C1033q c1033q2 = new C1033q("sRGB IEC61966-2.1 (Linear)", fArr, c1035s, 1.0d, 0.0f, 1.0f, 1);
        f11870d = c1033q2;
        C1033q c1033q3 = new C1033q("scRGB-nl IEC 61966-2-2:2003", fArr, c1035s, null, new I1.e(19), new I1.e(20), -0.799f, 2.399f, c1034r, 2);
        f11871e = c1033q3;
        C1033q c1033q4 = new C1033q("scRGB IEC 61966-2-2:2003", fArr, c1035s, 1.0d, -0.5f, 7.499f, 3);
        f11872f = c1033q4;
        C1033q c1033q5 = new C1033q("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, c1035s, new C1034r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        f11873g = c1033q5;
        C1033q c1033q6 = new C1033q("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, c1035s, new C1034r(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        f11874h = c1033q6;
        C1033q c1033q7 = new C1033q("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new C1035s(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        f11875i = c1033q7;
        C1033q c1033q8 = new C1033q("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, c1035s, c1034r, 7);
        f11876j = c1033q8;
        C1033q c1033q9 = new C1033q("NTSC (1953)", fArr2, AbstractC1026j.a, new C1034r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 8);
        f11877k = c1033q9;
        C1033q c1033q10 = new C1033q("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, c1035s, new C1034r(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 9);
        f11878l = c1033q10;
        C1033q c1033q11 = new C1033q("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, c1035s, 2.2d, 0.0f, 1.0f, 10);
        f11879m = c1033q11;
        C1033q c1033q12 = new C1033q("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, AbstractC1026j.f11894b, new C1034r(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        f11880n = c1033q12;
        C1035s c1035s2 = AbstractC1026j.f11895c;
        C1033q c1033q13 = new C1033q("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, c1035s2, 1.0d, -65504.0f, 65504.0f, 12);
        f11881o = c1033q13;
        C1033q c1033q14 = new C1033q("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, c1035s2, 1.0d, -65504.0f, 65504.0f, 13);
        f11882p = c1033q14;
        C1027k c1027k = new C1027k(14, 1, AbstractC1018b.f11862b, "Generic XYZ");
        f11883q = c1027k;
        long j7 = AbstractC1018b.f11863c;
        C1027k c1027k2 = new C1027k(15, 0, j7, "Generic L*a*b*");
        f11884r = c1027k2;
        C1033q c1033q15 = new C1033q("None", fArr, c1035s, c1034r2, 16);
        f11885s = c1033q15;
        C1028l c1028l = new C1028l("Oklab", j7, 17);
        f11886t = c1028l;
        f11887u = new AbstractC1019c[]{c1033q, c1033q2, c1033q3, c1033q4, c1033q5, c1033q6, c1033q7, c1033q8, c1033q9, c1033q10, c1033q11, c1033q12, c1033q13, c1033q14, c1027k, c1027k2, c1033q15, c1028l};
    }
}
