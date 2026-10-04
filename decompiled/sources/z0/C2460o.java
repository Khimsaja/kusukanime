package z0;

import android.content.res.Resources;
import d0.C0780a;

/* renamed from: z0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2460o extends kotlin.jvm.internal.j implements e4.o {
    @Override // e4.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            throw new ClassCastException();
        }
        C2471u c2471u = (C2471u) this.receiver;
        Resources resources = c2471u.getContext().getResources();
        return Boolean.valueOf(I.a.a(c2471u, null, new C0780a(new T0.c(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((g0.f) obj2).a, (e4.k) obj3)));
    }
}
