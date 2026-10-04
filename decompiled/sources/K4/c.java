package K4;

import A4.C0012e;
import A4.j;
import P3.m;
import P3.q;
import b6.z;
import f6.AbstractC0915m;
import java.util.Iterator;
import kotlin.jvm.internal.l;
import m5.C1521j;
import r4.AbstractC1886o;
import s3.T;
import v4.InterfaceC2154b;
import v4.h;
import y5.f;
import y5.k;
import y5.o;

/* loaded from: classes.dex */
public final class c implements h {

    /* renamed from: k, reason: collision with root package name */
    public final A2.b f4725k;

    /* renamed from: l, reason: collision with root package name */
    public final N4.b f4726l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f4727m;

    /* renamed from: n, reason: collision with root package name */
    public final C1521j f4728n;

    public c(A2.b bVar, N4.b bVar2, boolean z7) {
        l.f("c", bVar);
        l.f("annotationOwner", bVar2);
        this.f4725k = bVar;
        this.f4726l = bVar2;
        this.f4727m = z7;
        this.f4728n = ((a) bVar.f110l).a.c(new j(5, this));
    }

    @Override // v4.h
    public final /* bridge */ boolean d(W4.c cVar) {
        return AbstractC0915m.x(this, cVar);
    }

    @Override // v4.h
    public final boolean isEmpty() {
        return this.f4726l.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        N4.b bVar = this.f4726l;
        o oVarU = k.U(q.l0(bVar.getAnnotations()), this.f4728n);
        W4.e eVar = I4.c.a;
        return new y5.e(new f(k.Q(m.Q(new y5.h[]{oVarU, new z(1, I4.c.a(AbstractC1886o.f15005m, bVar, this.f4725k))})), false, new T(16)));
    }

    @Override // v4.h
    public final InterfaceC2154b l(W4.c cVar) {
        InterfaceC2154b interfaceC2154b;
        l.f("fqName", cVar);
        N4.b bVar = this.f4726l;
        C0012e c0012eA = bVar.a(cVar);
        if (c0012eA != null && (interfaceC2154b = (InterfaceC2154b) this.f4728n.invoke(c0012eA)) != null) {
            return interfaceC2154b;
        }
        W4.e eVar = I4.c.a;
        return I4.c.a(cVar, bVar, this.f4725k);
    }
}
