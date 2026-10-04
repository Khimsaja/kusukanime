package U0;

import R1.i;
import java.util.Arrays;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c implements a {
    public final float[] a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f9131b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.a = fArr;
        this.f9131b = fArr2;
    }

    @Override // U0.a
    public final float a(float f5) {
        return i.i(f5, this.f9131b, this.a);
    }

    @Override // U0.a
    public final float b(float f5) {
        return i.i(f5, this.a, this.f9131b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.a, cVar.a) && Arrays.equals(this.f9131b, cVar.f9131b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9131b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.a);
        l.e("toString(this)", string);
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f9131b);
        l.e("toString(this)", string2);
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
