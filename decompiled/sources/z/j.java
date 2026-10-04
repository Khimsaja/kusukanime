package z;

import java.util.List;
import s.EnumC1903a0;
import w0.S;

/* loaded from: classes.dex */
public final class j {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final List f18475b;

    /* renamed from: c, reason: collision with root package name */
    public final long f18476c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f18477d;

    /* renamed from: e, reason: collision with root package name */
    public final a0.c f18478e;

    /* renamed from: f, reason: collision with root package name */
    public final a0.h f18479f;

    /* renamed from: g, reason: collision with root package name */
    public final T0.k f18480g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f18481h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f18482i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18483j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f18484k;

    /* renamed from: l, reason: collision with root package name */
    public int f18485l;

    /* renamed from: m, reason: collision with root package name */
    public int f18486m;

    public j(int i7, int i8, List list, long j7, Object obj, EnumC1903a0 enumC1903a0, a0.c cVar, a0.h hVar, T0.k kVar, boolean z7) {
        this.a = i7;
        this.f18475b = list;
        this.f18476c = j7;
        this.f18477d = obj;
        this.f18478e = cVar;
        this.f18479f = hVar;
        this.f18480g = kVar;
        this.f18481h = z7;
        this.f18482i = enumC1903a0 == EnumC1903a0.f15259k;
        int size = list.size();
        int iMax = 0;
        for (int i9 = 0; i9 < size; i9++) {
            S s7 = (S) list.get(i9);
            iMax = Math.max(iMax, !this.f18482i ? s7.f16841l : s7.f16840k);
        }
        this.f18483j = iMax;
        this.f18484k = new int[this.f18475b.size() * 2];
        this.f18486m = Integer.MIN_VALUE;
    }

    public final void a(int i7) {
        this.f18485l += i7;
        int[] iArr = this.f18484k;
        int length = iArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            boolean z7 = this.f18482i;
            if ((z7 && i8 % 2 == 1) || (!z7 && i8 % 2 == 0)) {
                iArr[i8] = iArr[i8] + i7;
            }
        }
    }

    public final void b(int i7, int i8, int i9) {
        int i10;
        this.f18485l = i7;
        boolean z7 = this.f18482i;
        this.f18486m = z7 ? i9 : i8;
        List list = this.f18475b;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            S s7 = (S) list.get(i11);
            int i12 = i11 * 2;
            int[] iArr = this.f18484k;
            if (z7) {
                a0.c cVar = this.f18478e;
                if (cVar == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i12] = cVar.a(s7.f16840k, i8, this.f18480g);
                iArr[i12 + 1] = i7;
                i10 = s7.f16841l;
            } else {
                iArr[i12] = i7;
                int i13 = i12 + 1;
                a0.h hVar = this.f18479f;
                if (hVar == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr[i13] = hVar.a(s7.f16841l, i9);
                i10 = s7.f16840k;
            }
            i7 += i10;
        }
    }
}
