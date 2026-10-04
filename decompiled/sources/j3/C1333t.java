package j3;

import f6.AbstractC0905c;
import java.util.Map;

/* renamed from: j3.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1333t extends AbstractC1327m {

    /* renamed from: k, reason: collision with root package name */
    public final Object f12380k;

    /* renamed from: l, reason: collision with root package name */
    public int f12381l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1334u f12382m;

    public C1333t(C1334u c1334u, int i7) {
        this.f12382m = c1334u;
        Object obj = C1334u.f12383t;
        this.f12380k = c1334u.i()[i7];
        this.f12381l = i7;
    }

    public final void a() {
        int i7 = this.f12381l;
        Object obj = this.f12380k;
        C1334u c1334u = this.f12382m;
        if (i7 != -1 && i7 < c1334u.size()) {
            if (AbstractC0905c.l(obj, c1334u.i()[this.f12381l])) {
                return;
            }
        }
        Object obj2 = C1334u.f12383t;
        this.f12381l = c1334u.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12380k;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C1334u c1334u = this.f12382m;
        Map mapB = c1334u.b();
        if (mapB != null) {
            return mapB.get(this.f12380k);
        }
        a();
        int i7 = this.f12381l;
        if (i7 == -1) {
            return null;
        }
        return c1334u.j()[i7];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C1334u c1334u = this.f12382m;
        Map mapB = c1334u.b();
        Object obj2 = this.f12380k;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        a();
        int i7 = this.f12381l;
        if (i7 == -1) {
            c1334u.put(obj2, obj);
            return null;
        }
        Object obj3 = c1334u.j()[i7];
        c1334u.j()[this.f12381l] = obj;
        return obj3;
    }
}
