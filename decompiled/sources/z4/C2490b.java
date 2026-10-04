package z4;

import C2.C0034g;
import f1.AbstractC0871d;
import f6.AbstractC0905c;
import kotlin.jvm.internal.l;
import z5.AbstractC2517v;

/* renamed from: z4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2490b {
    public final ClassLoader a;

    public /* synthetic */ C2490b(ClassLoader classLoader) {
        this.a = classLoader;
    }

    public C0034g a(W4.b bVar, T4.f fVar) {
        C2491c c2491cH;
        l.f("classId", bVar);
        l.f("metadataVersion", fVar);
        String strQ = AbstractC2517v.Q(bVar.f9616b.a.a, '.', '$');
        W4.c cVar = bVar.a;
        if (!cVar.a.c()) {
            strQ = cVar + '.' + strQ;
        }
        Class clsT0 = AbstractC0871d.t0(this.a, strQ);
        if (clsT0 == null || (c2491cH = AbstractC0905c.h(clsT0)) == null) {
            return null;
        }
        return new C0034g(24, c2491cH);
    }
}
