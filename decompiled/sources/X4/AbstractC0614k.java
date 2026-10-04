package X4;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X4.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0614k extends AbstractC0613j implements w {

    /* renamed from: l, reason: collision with root package name */
    public C0612i f9897l = C0612i.f9894c;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9898m;

    public final void f(AbstractC0615l abstractC0615l) {
        C c2;
        if (!this.f9898m) {
            this.f9897l = this.f9897l.clone();
            this.f9898m = true;
        }
        C0612i c0612i = this.f9897l;
        C0612i c0612i2 = abstractC0615l.f9899k;
        c0612i.getClass();
        int i7 = 0;
        while (true) {
            int size = c0612i2.a.f9840l.size();
            c2 = c0612i2.a;
            if (i7 >= size) {
                break;
            }
            c0612i.g((Map.Entry) c2.f9840l.get(i7));
            i7++;
        }
        Iterator it = c2.c().iterator();
        while (it.hasNext()) {
            c0612i.g((Map.Entry) it.next());
        }
    }
}
