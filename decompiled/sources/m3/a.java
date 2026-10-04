package m3;

import f6.AbstractC0915m;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f12968m = 0;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f12969k;

    /* renamed from: l, reason: collision with root package name */
    public final int f12970l;

    static {
        new a(new int[0]);
    }

    public a(int[] iArr) {
        int length = iArr.length;
        this.f12969k = iArr;
        this.f12970l = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            int i7 = aVar.f12970l;
            int i8 = this.f12970l;
            if (i8 == i7) {
                for (int i9 = 0; i9 < i8; i9++) {
                    AbstractC0915m.h(i9, i8);
                    int i10 = this.f12969k[i9];
                    AbstractC0915m.h(i9, aVar.f12970l);
                    if (i10 == aVar.f12969k[i9]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = 1;
        for (int i8 = 0; i8 < this.f12970l; i8++) {
            i7 = (i7 * 31) + this.f12969k[i8];
        }
        return i7;
    }

    public final String toString() {
        int i7 = this.f12970l;
        if (i7 == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i7 * 5);
        sb.append('[');
        int[] iArr = this.f12969k;
        sb.append(iArr[0]);
        for (int i8 = 1; i8 < i7; i8++) {
            sb.append(", ");
            sb.append(iArr[i8]);
        }
        sb.append(']');
        return sb.toString();
    }
}
