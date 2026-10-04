package t2;

import B1.AbstractC0015b;
import B1.B;
import T4.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import s2.C1975c;

/* renamed from: t2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2037c extends AbstractC2042h {

    /* renamed from: i, reason: collision with root package name */
    public final int f15906i;

    /* renamed from: j, reason: collision with root package name */
    public final int f15907j;

    /* renamed from: k, reason: collision with root package name */
    public final int f15908k;

    /* renamed from: o, reason: collision with root package name */
    public List f15912o;

    /* renamed from: p, reason: collision with root package name */
    public List f15913p;

    /* renamed from: q, reason: collision with root package name */
    public int f15914q;

    /* renamed from: r, reason: collision with root package name */
    public int f15915r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15916s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f15917t;

    /* renamed from: u, reason: collision with root package name */
    public byte f15918u;

    /* renamed from: v, reason: collision with root package name */
    public byte f15919v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f15921x;

    /* renamed from: y, reason: collision with root package name */
    public long f15922y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f15904z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A, reason: collision with root package name */
    public static final int[] f15897A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f15898B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f15899C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f15900D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f15901E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F, reason: collision with root package name */
    public static final int[] f15902F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G, reason: collision with root package name */
    public static final boolean[] f15903G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h, reason: collision with root package name */
    public final B f15905h = new B();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f15910m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public C2036b f15911n = new C2036b(0, 4);

    /* renamed from: w, reason: collision with root package name */
    public int f15920w = 0;

    /* renamed from: l, reason: collision with root package name */
    public final long f15909l = 16000000;

    public C2037c(String str, int i7) {
        this.f15906i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i7 == 1) {
            this.f15908k = 0;
            this.f15907j = 0;
        } else if (i7 == 2) {
            this.f15908k = 1;
            this.f15907j = 0;
        } else if (i7 == 3) {
            this.f15908k = 0;
            this.f15907j = 1;
        } else if (i7 != 4) {
            AbstractC0015b.v("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f15908k = 0;
            this.f15907j = 0;
        } else {
            this.f15908k = 1;
            this.f15907j = 1;
        }
        m(0);
        l();
        this.f15921x = true;
        this.f15922y = -9223372036854775807L;
    }

    @Override // t2.AbstractC2042h, G1.c
    public final void flush() {
        super.flush();
        this.f15912o = null;
        this.f15913p = null;
        m(0);
        this.f15915r = 4;
        this.f15911n.f15896h = 4;
        l();
        this.f15916s = false;
        this.f15917t = false;
        this.f15918u = (byte) 0;
        this.f15919v = (byte) 0;
        this.f15920w = 0;
        this.f15921x = true;
        this.f15922y = -9223372036854775807L;
    }

    @Override // t2.AbstractC2042h
    public final i g() {
        List list = this.f15912o;
        this.f15913p = list;
        list.getClass();
        return new i(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // t2.AbstractC2042h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(t2.C2041g r15) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2037c.h(t2.g):void");
    }

    @Override // t2.AbstractC2042h, G1.c
    /* renamed from: i */
    public final C1975c e() {
        C1975c c1975c;
        C1975c c1975cE = super.e();
        if (c1975cE != null) {
            return c1975cE;
        }
        long j7 = this.f15909l;
        if (j7 == -9223372036854775807L) {
            return null;
        }
        long j8 = this.f15922y;
        if (j8 == -9223372036854775807L || this.f15969e - j8 < j7 || (c1975c = (C1975c) this.f15966b.pollFirst()) == null) {
            return null;
        }
        this.f15912o = Collections.EMPTY_LIST;
        this.f15922y = -9223372036854775807L;
        i iVarG = g();
        long j9 = this.f15969e;
        c1975c.f2614m = j9;
        c1975c.f15514o = iVarG;
        c1975c.f15515p = j9;
        return c1975c;
    }

    @Override // t2.AbstractC2042h
    public final boolean j() {
        return this.f15912o != this.f15913p;
    }

    public final ArrayList k() {
        ArrayList arrayList = this.f15910m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i7 = 0; i7 < size; i7++) {
            A1.b bVarC = ((C2036b) arrayList.get(i7)).c(Integer.MIN_VALUE);
            arrayList2.add(bVarC);
            if (bVarC != null) {
                iMin = Math.min(iMin, bVarC.f78i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i8 = 0; i8 < size; i8++) {
            A1.b bVarC2 = (A1.b) arrayList2.get(i8);
            if (bVarC2 != null) {
                if (bVarC2.f78i != iMin) {
                    bVarC2 = ((C2036b) arrayList.get(i8)).c(iMin);
                    bVarC2.getClass();
                }
                arrayList3.add(bVarC2);
            }
        }
        return arrayList3;
    }

    public final void l() {
        C2036b c2036b = this.f15911n;
        c2036b.f15895g = this.f15914q;
        c2036b.a.clear();
        c2036b.f15890b.clear();
        c2036b.f15891c.setLength(0);
        c2036b.f15892d = 15;
        c2036b.f15893e = 0;
        c2036b.f15894f = 0;
        ArrayList arrayList = this.f15910m;
        arrayList.clear();
        arrayList.add(this.f15911n);
    }

    public final void m(int i7) {
        int i8 = this.f15914q;
        if (i8 == i7) {
            return;
        }
        this.f15914q = i7;
        if (i7 != 3) {
            l();
            if (i8 == 3 || i7 == 1 || i7 == 0) {
                this.f15912o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f15910m;
            if (i9 >= arrayList.size()) {
                return;
            }
            ((C2036b) arrayList.get(i9)).f15895g = i7;
            i9++;
        }
    }

    @Override // t2.AbstractC2042h, G1.c
    public final void a() {
    }
}
