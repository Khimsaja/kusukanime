package m;

import java.util.Arrays;

/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1502w {
    public Object[] a = new Object[16];

    /* renamed from: b, reason: collision with root package name */
    public int f12934b;

    public final void a(Object obj) {
        int i7 = this.f12934b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i7) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i7, (objArr.length * 3) / 2));
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
            this.a = objArrCopyOf;
        }
        Object[] objArr2 = this.a;
        int i8 = this.f12934b;
        objArr2[i8] = obj;
        this.f12934b = i8 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1502w) {
            C1502w c1502w = (C1502w) obj;
            int i7 = c1502w.f12934b;
            int i8 = this.f12934b;
            if (i7 == i8) {
                Object[] objArr = this.a;
                Object[] objArr2 = c1502w.a;
                k4.g gVarL = e3.c.L(0, i8);
                int i9 = gVarL.f12672k;
                int i10 = gVarL.f12673l;
                if (i9 > i10) {
                    return true;
                }
                while (kotlin.jvm.internal.l.a(objArr[i9], objArr2[i9])) {
                    if (i9 == i10) {
                        return true;
                    }
                    i9++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i7 = this.f12934b;
        int iHashCode = 0;
        for (int i8 = 0; i8 < i7; i8++) {
            Object obj = objArr[i8];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.a;
        int i7 = this.f12934b;
        int i8 = 0;
        while (true) {
            if (i8 >= i7) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i8];
            if (i8 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i8 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) (obj == this ? "(this)" : String.valueOf(obj)));
            i8++;
        }
        String string = sb.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
