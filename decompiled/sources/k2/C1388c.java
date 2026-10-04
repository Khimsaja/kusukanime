package k2;

import B1.AbstractC0015b;
import java.util.ArrayList;
import y1.B;

/* renamed from: k2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1388c implements B {
    public final ArrayList a;

    public C1388c(ArrayList arrayList) {
        this.a = arrayList;
        boolean z7 = false;
        if (!arrayList.isEmpty()) {
            long j7 = ((C1387b) arrayList.get(0)).f12661b;
            int i7 = 1;
            while (true) {
                if (i7 >= arrayList.size()) {
                    break;
                }
                if (((C1387b) arrayList.get(i7)).a < j7) {
                    z7 = true;
                    break;
                } else {
                    j7 = ((C1387b) arrayList.get(i7)).f12661b;
                    i7++;
                }
            }
        }
        AbstractC0015b.c(!z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1388c.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C1388c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
