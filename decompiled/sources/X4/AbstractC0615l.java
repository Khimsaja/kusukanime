package X4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X4.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0615l extends AbstractC0618o {

    /* renamed from: k, reason: collision with root package name */
    public final C0612i f9899k;

    public AbstractC0615l() {
        this.f9899k = new C0612i();
    }

    public final boolean i() {
        int i7 = 0;
        while (true) {
            C c2 = this.f9899k.a;
            if (i7 >= c2.f9840l.size()) {
                Iterator it = c2.c().iterator();
                while (it.hasNext()) {
                    if (!C0612i.e((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!C0612i.e((Map.Entry) c2.f9840l.get(i7))) {
                break;
            }
            i7++;
        }
        return false;
    }

    public final int j() {
        C c2;
        int i7 = 0;
        int iD = 0;
        while (true) {
            c2 = this.f9899k.a;
            if (i7 >= c2.f9840l.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2.f9840l.get(i7);
            iD += C0612i.d((C0616m) entry.getKey(), entry.getValue());
            i7++;
        }
        for (Map.Entry entry2 : c2.c()) {
            iD += C0612i.d((C0616m) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object k(C0617n c0617n) {
        o(c0617n);
        C c2 = this.f9899k.a;
        C0616m c0616m = c0617n.f9905d;
        Object obj = c2.get(c0616m);
        if (obj == null) {
            return c0617n.f9903b;
        }
        if (!c0616m.f9902m) {
            return c0617n.a(obj);
        }
        if (c0616m.f9901l.f9863k != S.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(c0617n.a(it.next()));
        }
        return arrayList;
    }

    public final boolean l(C0617n c0617n) {
        o(c0617n);
        C0612i c0612i = this.f9899k;
        c0612i.getClass();
        C0616m c0616m = c0617n.f9905d;
        if (c0616m.f9902m) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c0612i.a.get(c0616m) != null;
    }

    public final void m() {
        this.f9899k.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(X4.C0609f r9, B1.G r10, X4.C0611h r11, int r12) throws X4.r {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X4.AbstractC0615l.n(X4.f, B1.G, X4.h, int):boolean");
    }

    public final void o(C0617n c0617n) {
        if (c0617n.a != b()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public AbstractC0615l(AbstractC0614k abstractC0614k) {
        abstractC0614k.f9897l.f();
        abstractC0614k.f9898m = false;
        this.f9899k = abstractC0614k.f9897l;
    }
}
