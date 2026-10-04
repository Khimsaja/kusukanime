package m;

import java.util.Arrays;
import n.AbstractC1529a;

/* renamed from: m.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1478H implements Cloneable {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ boolean f12871k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ int[] f12872l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object[] f12873m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ int f12874n;

    public C1478H(int i7) {
        int i8;
        int i9 = 4;
        while (true) {
            i8 = 40;
            if (i9 >= 32) {
                break;
            }
            int i10 = (1 << i9) - 12;
            if (40 <= i10) {
                i8 = i10;
                break;
            }
            i9++;
        }
        int i11 = i8 / 4;
        this.f12872l = new int[i11];
        this.f12873m = new Object[i11];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C1478H clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>", objClone);
        C1478H c1478h = (C1478H) objClone;
        c1478h.f12872l = (int[]) this.f12872l.clone();
        c1478h.f12873m = (Object[]) this.f12873m.clone();
        return c1478h;
    }

    public final Object b(int i7) {
        Object obj;
        int iA = AbstractC1529a.a(this.f12874n, i7, this.f12872l);
        if (iA < 0 || (obj = this.f12873m[iA]) == AbstractC1493n.f12899c) {
            return null;
        }
        return obj;
    }

    public final int c(int i7) {
        if (this.f12871k) {
            AbstractC1493n.a(this);
        }
        return this.f12872l[i7];
    }

    public final void d(int i7, Object obj) {
        int iA = AbstractC1529a.a(this.f12874n, i7, this.f12872l);
        if (iA >= 0) {
            this.f12873m[iA] = obj;
            return;
        }
        int i8 = ~iA;
        int i9 = this.f12874n;
        if (i8 < i9) {
            Object[] objArr = this.f12873m;
            if (objArr[i8] == AbstractC1493n.f12899c) {
                this.f12872l[i8] = i7;
                objArr[i8] = obj;
                return;
            }
        }
        if (this.f12871k && i9 >= this.f12872l.length) {
            AbstractC1493n.a(this);
            i8 = ~AbstractC1529a.a(this.f12874n, i7, this.f12872l);
        }
        int i10 = this.f12874n;
        if (i10 >= this.f12872l.length) {
            int i11 = (i10 + 1) * 4;
            int i12 = 4;
            while (true) {
                if (i12 >= 32) {
                    break;
                }
                int i13 = (1 << i12) - 12;
                if (i11 <= i13) {
                    i11 = i13;
                    break;
                }
                i12++;
            }
            int i14 = i11 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f12872l, i14);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", iArrCopyOf);
            this.f12872l = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f12873m, i14);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
            this.f12873m = objArrCopyOf;
        }
        int i15 = this.f12874n;
        if (i15 - i8 != 0) {
            int[] iArr = this.f12872l;
            int i16 = i8 + 1;
            P3.m.V(i16, i8, i15, iArr, iArr);
            Object[] objArr2 = this.f12873m;
            P3.m.W(i16, i8, this.f12874n, objArr2, objArr2);
        }
        this.f12872l[i8] = i7;
        this.f12873m[i8] = obj;
        this.f12874n++;
    }

    public final int e() {
        if (this.f12871k) {
            AbstractC1493n.a(this);
        }
        return this.f12874n;
    }

    public final Object f(int i7) {
        if (this.f12871k) {
            AbstractC1493n.a(this);
        }
        return this.f12873m[i7];
    }

    public final String toString() {
        if (e() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f12874n * 28);
        sb.append('{');
        int i7 = this.f12874n;
        for (int i8 = 0; i8 < i7; i8++) {
            if (i8 > 0) {
                sb.append(", ");
            }
            sb.append(c(i8));
            sb.append('=');
            Object objF = f(i8);
            if (objF != this) {
                sb.append(objF);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.l.e("buffer.toString()", string);
        return string;
    }
}
