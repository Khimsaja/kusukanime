package n5;

import java.io.IOException;
import java.util.Iterator;
import v4.InterfaceC2154b;

/* loaded from: classes.dex */
public abstract class B extends a0 implements q5.f, q5.g {
    @Override // n5.a0
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public abstract B x0(boolean z7);

    @Override // n5.a0
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public abstract B z0(I i7);

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {"[", Y4.h.f10164e.u((InterfaceC2154b) it.next(), null), "] "};
            for (int i7 = 0; i7 < 3; i7++) {
                sb.append(strArr[i7]);
            }
        }
        sb.append(t0());
        if (!q0().isEmpty()) {
            P3.q.x0(q0(), sb, ", ", "<", ">", null, 112);
        }
        if (u0()) {
            sb.append("?");
        }
        return sb.toString();
    }
}
