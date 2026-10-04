package x;

import java.util.ArrayList;
import y.C2326g;

/* loaded from: classes.dex */
public final class s {
    public final C2233g a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f17262b;

    /* renamed from: c, reason: collision with root package name */
    public int f17263c;

    /* renamed from: d, reason: collision with root package name */
    public int f17264d;

    /* renamed from: e, reason: collision with root package name */
    public int f17265e;

    /* renamed from: f, reason: collision with root package name */
    public int f17266f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f17267g;

    /* renamed from: h, reason: collision with root package name */
    public Object f17268h;

    /* renamed from: i, reason: collision with root package name */
    public int f17269i;

    public s(C2233g c2233g) {
        this.a = c2233g;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new q(0, 0));
        this.f17262b = arrayList;
        this.f17266f = -1;
        this.f17267g = new ArrayList();
        this.f17268h = P3.y.f7779k;
    }

    public final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.f17269i)) + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final F5.o b(int r13) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.s.b(int):F5.o");
    }

    public final int c(int i7) {
        int i8;
        if (d() <= 0) {
            return 0;
        }
        if (i7 >= d()) {
            throw new IllegalArgumentException("ItemIndex > total count");
        }
        if (!this.a.f17208c) {
            return i7 / this.f17269i;
        }
        ArrayList arrayList = this.f17262b;
        int size = arrayList.size();
        P3.r.Q(arrayList.size(), size);
        int i9 = size - 1;
        int i10 = 0;
        while (true) {
            if (i10 > i9) {
                i8 = -(i10 + 1);
                break;
            }
            i8 = (i10 + i9) >>> 1;
            int i11 = ((q) arrayList.get(i8)).a - i7;
            if (i11 >= 0) {
                if (i11 <= 0) {
                    break;
                }
                i9 = i8 - 1;
            } else {
                i10 = i8 + 1;
            }
        }
        if (i8 < 0) {
            i8 = (-i8) - 2;
        }
        int iA = a() * i8;
        int i12 = ((q) arrayList.get(i8)).a;
        if (i12 > i7) {
            throw new IllegalArgumentException("currentItemIndex > itemIndex");
        }
        int i13 = 0;
        while (i12 < i7) {
            int i14 = i12 + 1;
            int iE = e(i12);
            i13 += iE;
            int i15 = this.f17269i;
            if (i13 >= i15) {
                if (i13 == i15) {
                    iA++;
                    i13 = 0;
                } else {
                    iA++;
                    i13 = iE;
                }
            }
            if (iA % a() == 0 && iA / a() >= arrayList.size()) {
                arrayList.add(new q(i14 - (i13 > 0 ? 1 : 0), 0));
            }
            i12 = i14;
        }
        return e(i7) + i13 > this.f17269i ? iA + 1 : iA;
    }

    public final int d() {
        return this.a.f17207b.f666l;
    }

    public final int e(int i7) {
        r rVar = r.a;
        C2326g c2326gG = this.a.f17207b.g(i7);
        return (int) ((C2228b) ((C2231e) c2326gG.f17622c).f17201b.invoke(rVar, Integer.valueOf(i7 - c2326gG.a))).a;
    }
}
