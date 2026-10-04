package W;

import f6.AbstractC0915m;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b {
    public int a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.a);
        sb.append(")@");
        int iHashCode = hashCode();
        AbstractC0915m.k(16);
        String string = Integer.toString(iHashCode, 16);
        l.e("toString(this, checkRadix(radix))", string);
        sb.append(string);
        return sb.toString();
    }
}
