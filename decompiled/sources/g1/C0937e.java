package g1;

import java.util.ArrayList;
import m.C1477G;

/* renamed from: g1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0937e {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11679b;

    public /* synthetic */ C0937e(int i7, Object obj) {
        this.a = i7;
        this.f11679b = obj;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                C0939g c0939g = (C0939g) obj;
                if (c0939g == null) {
                    c0939g = new C0939g(-3);
                }
                ((L2.e) this.f11679b).m1(c0939g);
                return;
            default:
                C0939g c0939g2 = (C0939g) obj;
                synchronized (AbstractC0940h.f11684c) {
                    try {
                        C1477G c1477g = AbstractC0940h.f11685d;
                        ArrayList arrayList = (ArrayList) c1477g.get((String) this.f11679b);
                        if (arrayList == null) {
                            return;
                        }
                        c1477g.remove((String) this.f11679b);
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            ((C0937e) arrayList.get(i7)).a(c0939g2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
