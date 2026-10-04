package D2;

import B1.B;
import B1.K;
import O1.S;
import V1.G;
import java.math.RoundingMode;
import y1.C2392n;
import y1.C2393o;
import y1.D;
import y1.E;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f1388m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f1389n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final S a;

    /* renamed from: b, reason: collision with root package name */
    public final G f1390b;

    /* renamed from: c, reason: collision with root package name */
    public final e f1391c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1392d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1393e;

    /* renamed from: f, reason: collision with root package name */
    public final B f1394f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1395g;

    /* renamed from: h, reason: collision with root package name */
    public final C2393o f1396h;

    /* renamed from: i, reason: collision with root package name */
    public int f1397i;

    /* renamed from: j, reason: collision with root package name */
    public long f1398j;

    /* renamed from: k, reason: collision with root package name */
    public int f1399k;

    /* renamed from: l, reason: collision with root package name */
    public long f1400l;

    public a(S s7, G g4, e eVar) throws E {
        this.a = s7;
        this.f1390b = g4;
        this.f1391c = eVar;
        int i7 = eVar.f1416m;
        int iMax = Math.max(1, i7 / 10);
        this.f1395g = iMax;
        B b4 = new B((byte[]) eVar.f1419p);
        b4.m();
        int iM = b4.m();
        this.f1392d = iM;
        int i8 = eVar.f1415l;
        int i9 = eVar.f1417n;
        int i10 = (((i9 - (i8 * 4)) * 8) / (eVar.f1418o * i8)) + 1;
        if (iM != i10) {
            throw E.a(null, "Expected frames per block: " + i10 + "; got: " + iM);
        }
        int iE = K.e(iMax, iM);
        this.f1393e = new byte[iE * i9];
        this.f1394f = new B(iM * 2 * i8 * iE);
        int i11 = ((i9 * i7) * 8) / iM;
        C2392n c2392n = new C2392n();
        c2392n.f18074m = D.m("audio/raw");
        c2392n.f18069h = i11;
        c2392n.f18070i = i11;
        c2392n.f18075n = iMax * 2 * i8;
        c2392n.f18055C = i8;
        c2392n.f18056D = i7;
        c2392n.f18057E = 2;
        this.f1396h = new C2393o(c2392n);
    }

    @Override // D2.b
    public final void a(int i7, long j7) {
        this.a.k(new f(this.f1391c, this.f1392d, i7, j7));
        this.f1390b.a(this.f1396h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // D2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(V1.k r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: D2.a.b(V1.k, long):boolean");
    }

    @Override // D2.b
    public final void c(long j7) {
        this.f1397i = 0;
        this.f1398j = j7;
        this.f1399k = 0;
        this.f1400l = 0L;
    }

    public final void d(int i7) {
        long j7 = this.f1398j;
        long j8 = this.f1400l;
        e eVar = this.f1391c;
        long j9 = eVar.f1416m;
        int i8 = K.a;
        long jL = j7 + K.L(j8, 1000000L, j9, RoundingMode.DOWN);
        int i9 = i7 * 2 * eVar.f1415l;
        this.f1390b.b(jL, 1, i9, this.f1399k - i9, null);
        this.f1400l += i7;
        this.f1399k -= i9;
    }
}
