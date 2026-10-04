package t2;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* renamed from: t2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2039e {

    /* renamed from: A, reason: collision with root package name */
    public static final boolean[] f15925A;

    /* renamed from: B, reason: collision with root package name */
    public static final int[] f15926B;

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f15927C;

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f15928D;

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f15929E;

    /* renamed from: v, reason: collision with root package name */
    public static final int f15930v = c(2, 2, 2, 0);

    /* renamed from: w, reason: collision with root package name */
    public static final int f15931w;

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f15932x;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f15933y;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f15934z;
    public final ArrayList a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final SpannableStringBuilder f15935b = new SpannableStringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public boolean f15936c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15937d;

    /* renamed from: e, reason: collision with root package name */
    public int f15938e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f15939f;

    /* renamed from: g, reason: collision with root package name */
    public int f15940g;

    /* renamed from: h, reason: collision with root package name */
    public int f15941h;

    /* renamed from: i, reason: collision with root package name */
    public int f15942i;

    /* renamed from: j, reason: collision with root package name */
    public int f15943j;

    /* renamed from: k, reason: collision with root package name */
    public int f15944k;

    /* renamed from: l, reason: collision with root package name */
    public int f15945l;

    /* renamed from: m, reason: collision with root package name */
    public int f15946m;

    /* renamed from: n, reason: collision with root package name */
    public int f15947n;

    /* renamed from: o, reason: collision with root package name */
    public int f15948o;

    /* renamed from: p, reason: collision with root package name */
    public int f15949p;

    /* renamed from: q, reason: collision with root package name */
    public int f15950q;

    /* renamed from: r, reason: collision with root package name */
    public int f15951r;

    /* renamed from: s, reason: collision with root package name */
    public int f15952s;

    /* renamed from: t, reason: collision with root package name */
    public int f15953t;

    /* renamed from: u, reason: collision with root package name */
    public int f15954u;

    static {
        int iC = c(0, 0, 0, 0);
        f15931w = iC;
        int iC2 = c(0, 0, 0, 3);
        f15932x = new int[]{0, 0, 0, 0, 0, 2, 0};
        f15933y = new int[]{0, 0, 0, 0, 0, 0, 2};
        f15934z = new int[]{3, 3, 3, 3, 3, 3, 1};
        f15925A = new boolean[]{false, false, false, true, true, true, false};
        f15926B = new int[]{iC, iC2, iC, iC, iC2, iC, iC};
        f15927C = new int[]{0, 1, 2, 3, 4, 3, 4};
        f15928D = new int[]{0, 0, 0, 0, 0, 3, 3};
        f15929E = new int[]{iC, iC, iC, iC, iC, iC2, iC2};
    }

    public C2039e() {
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(int r4, int r5, int r6, int r7) {
        /*
            r0 = 4
            B1.AbstractC0015b.f(r4, r0)
            B1.AbstractC0015b.f(r5, r0)
            B1.AbstractC0015b.f(r6, r0)
            B1.AbstractC0015b.f(r7, r0)
            r0 = 0
            r1 = 1
            r2 = 255(0xff, float:3.57E-43)
            if (r7 == 0) goto L1b
            if (r7 == r1) goto L1b
            r3 = 2
            if (r7 == r3) goto L1f
            r3 = 3
            if (r7 == r3) goto L1d
        L1b:
            r7 = r2
            goto L21
        L1d:
            r7 = r0
            goto L21
        L1f:
            r7 = 127(0x7f, float:1.78E-43)
        L21:
            if (r4 <= r1) goto L25
            r4 = r2
            goto L26
        L25:
            r4 = r0
        L26:
            if (r5 <= r1) goto L2a
            r5 = r2
            goto L2b
        L2a:
            r5 = r0
        L2b:
            if (r6 <= r1) goto L2e
            r0 = r2
        L2e:
            int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2039e.c(int, int, int, int):int");
    }

    public final void a(char c2) {
        SpannableStringBuilder spannableStringBuilder = this.f15935b;
        if (c2 != '\n') {
            spannableStringBuilder.append(c2);
            return;
        }
        ArrayList arrayList = this.a;
        arrayList.add(b());
        spannableStringBuilder.clear();
        if (this.f15948o != -1) {
            this.f15948o = 0;
        }
        if (this.f15949p != -1) {
            this.f15949p = 0;
        }
        if (this.f15950q != -1) {
            this.f15950q = 0;
        }
        if (this.f15952s != -1) {
            this.f15952s = 0;
        }
        while (true) {
            if (arrayList.size() < this.f15943j && arrayList.size() < 15) {
                this.f15954u = arrayList.size();
                return;
            }
            arrayList.remove(0);
        }
    }

    public final SpannableString b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f15935b);
        int length = spannableStringBuilder.length();
        if (length > 0) {
            if (this.f15948o != -1) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f15948o, length, 33);
            }
            if (this.f15949p != -1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), this.f15949p, length, 33);
            }
            if (this.f15950q != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f15951r), this.f15950q, length, 33);
            }
            if (this.f15952s != -1) {
                spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f15953t), this.f15952s, length, 33);
            }
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final void d() {
        this.a.clear();
        this.f15935b.clear();
        this.f15948o = -1;
        this.f15949p = -1;
        this.f15950q = -1;
        this.f15952s = -1;
        this.f15954u = 0;
        this.f15936c = false;
        this.f15937d = false;
        this.f15938e = 4;
        this.f15939f = false;
        this.f15940g = 0;
        this.f15941h = 0;
        this.f15942i = 0;
        this.f15943j = 15;
        this.f15944k = 0;
        this.f15945l = 0;
        this.f15946m = 0;
        int i7 = f15931w;
        this.f15947n = i7;
        this.f15951r = f15930v;
        this.f15953t = i7;
    }

    public final void e(boolean z7, boolean z8) {
        int i7 = this.f15948o;
        SpannableStringBuilder spannableStringBuilder = this.f15935b;
        if (i7 != -1) {
            if (!z7) {
                spannableStringBuilder.setSpan(new StyleSpan(2), this.f15948o, spannableStringBuilder.length(), 33);
                this.f15948o = -1;
            }
        } else if (z7) {
            this.f15948o = spannableStringBuilder.length();
        }
        if (this.f15949p == -1) {
            if (z8) {
                this.f15949p = spannableStringBuilder.length();
            }
        } else {
            if (z8) {
                return;
            }
            spannableStringBuilder.setSpan(new UnderlineSpan(), this.f15949p, spannableStringBuilder.length(), 33);
            this.f15949p = -1;
        }
    }

    public final void f(int i7, int i8) {
        int i9 = this.f15950q;
        SpannableStringBuilder spannableStringBuilder = this.f15935b;
        if (i9 != -1 && this.f15951r != i7) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f15951r), this.f15950q, spannableStringBuilder.length(), 33);
        }
        if (i7 != f15930v) {
            this.f15950q = spannableStringBuilder.length();
            this.f15951r = i7;
        }
        if (this.f15952s != -1 && this.f15953t != i8) {
            spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f15953t), this.f15952s, spannableStringBuilder.length(), 33);
        }
        if (i8 != f15931w) {
            this.f15952s = spannableStringBuilder.length();
            this.f15953t = i8;
        }
    }
}
