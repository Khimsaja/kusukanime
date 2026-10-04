package x;

import java.util.List;

/* loaded from: classes.dex */
public final class o {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final C2240n[] f17254b;

    /* renamed from: c, reason: collision with root package name */
    public final p f17255c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f17256d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17257e;

    /* renamed from: f, reason: collision with root package name */
    public final int f17258f;

    /* renamed from: g, reason: collision with root package name */
    public final int f17259g;

    public o(int i7, C2240n[] c2240nArr, p pVar, List list, int i8) {
        this.a = i7;
        this.f17254b = c2240nArr;
        this.f17255c = pVar;
        this.f17256d = list;
        this.f17257e = i8;
        int iMax = 0;
        for (C2240n c2240n : c2240nArr) {
            iMax = Math.max(iMax, c2240n.f17247k);
        }
        this.f17258f = iMax;
        int i9 = iMax + this.f17257e;
        this.f17259g = i9 >= 0 ? i9 : 0;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.List] */
    public final C2240n[] a(int i7, int i8, int i9) {
        C2240n[] c2240nArr = this.f17254b;
        int length = c2240nArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            C2240n c2240n = c2240nArr[i10];
            int i13 = i11 + 1;
            int i14 = (int) ((C2228b) this.f17256d.get(i11)).a;
            c2240n.h(i7, this.f17255c.f17260b[i12], i8, i9, this.a, i12);
            i12 += i14;
            i10++;
            i11 = i13;
        }
        return c2240nArr;
    }
}
