package t4;

import P3.A;
import e5.AbstractC0832b;
import j5.C1354i;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import k5.C1397a;
import k5.C1399c;
import k5.C1400d;
import m5.C1521j;
import m5.C1523l;
import m5.EnumC1522k;
import r4.AbstractC1887p;
import u4.InterfaceC2088D;
import u4.InterfaceC2091G;
import x4.C2255A;
import z4.C2490b;

/* loaded from: classes.dex */
public final class q implements InterfaceC2091G {
    public final C1523l a;

    /* renamed from: b, reason: collision with root package name */
    public final C2255A f16082b;

    /* renamed from: c, reason: collision with root package name */
    public C1354i f16083c;

    /* renamed from: d, reason: collision with root package name */
    public final C1521j f16084d;

    public q(C1523l c1523l, C2490b c2490b, C2255A c2255a) {
        this.a = c1523l;
        this.f16082b = c2255a;
        this.f16084d = c1523l.c(new A4.j(16, this));
    }

    @Override // u4.InterfaceC2091G
    public final boolean a(W4.c cVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        C1521j c1521j = this.f16084d;
        Object obj = c1521j.f12984l.get(cVar);
        return ((obj == null || obj == EnumC1522k.f12987l) ? c(cVar) : (InterfaceC2088D) c1521j.invoke(cVar)) == null;
    }

    @Override // u4.InterfaceC2091G
    public final void b(W4.c cVar, ArrayList arrayList) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        w5.k.a(arrayList, this.f16084d.invoke(cVar));
    }

    public final C1399c c(W4.c cVar) throws IOException {
        InputStream inputStreamA;
        kotlin.jvm.internal.l.f("fqName", cVar);
        W4.e eVar = AbstractC1887p.f15027j;
        kotlin.jvm.internal.l.f("segment", eVar);
        if (cVar.a.h(eVar)) {
            C1397a.f12688m.getClass();
            inputStreamA = C1400d.a(C1397a.a(cVar));
        } else {
            inputStreamA = null;
        }
        if (inputStreamA != null) {
            return AbstractC0832b.n(cVar, this.a, this.f16082b, inputStreamA);
        }
        return null;
    }

    @Override // u4.InterfaceC2091G
    public final Collection h(W4.c cVar, e4.k kVar) {
        kotlin.jvm.internal.l.f("fqName", cVar);
        return A.f7737k;
    }
}
