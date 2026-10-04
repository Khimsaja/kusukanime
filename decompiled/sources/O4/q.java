package O4;

import P3.E;
import d3.C0802n;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class q {
    public final LinkedHashMap a;

    public q(C0802n c0802n) {
        this.a = E.t0(c0802n.f11316k);
    }

    public q(int i7) {
        switch (i7) {
            case 2:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }
}
