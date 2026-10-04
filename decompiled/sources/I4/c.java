package I4;

import A4.AbstractC0011d;
import A4.C0012e;
import H4.x;
import O3.l;
import P3.E;
import io.ktor.http.ContentType;
import n6.m;
import r4.AbstractC1886o;

/* loaded from: classes.dex */
public abstract class c {
    public static final W4.e a = W4.e.e(ContentType.Message.TYPE);

    /* renamed from: b, reason: collision with root package name */
    public static final W4.e f4053b = W4.e.e("allowedTargets");

    /* renamed from: c, reason: collision with root package name */
    public static final W4.e f4054c = W4.e.e("value");

    /* renamed from: d, reason: collision with root package name */
    public static final Object f4055d = E.n0(new l(AbstractC1886o.f15012t, x.f3756c), new l(AbstractC1886o.f15015w, x.f3757d), new l(AbstractC1886o.f15016x, x.f3759f));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    public static J4.h a(W4.c cVar, N4.b bVar, A2.b bVar2) {
        C0012e c0012eA;
        kotlin.jvm.internal.l.f("kotlinName", cVar);
        kotlin.jvm.internal.l.f("annotationOwner", bVar);
        kotlin.jvm.internal.l.f("c", bVar2);
        if (cVar.equals(AbstractC1886o.f15005m)) {
            W4.c cVar2 = x.f3758e;
            kotlin.jvm.internal.l.e("DEPRECATED_ANNOTATION", cVar2);
            C0012e c0012eA2 = bVar.a(cVar2);
            if (c0012eA2 != null) {
                return new g(c0012eA2, bVar2);
            }
        }
        W4.c cVar3 = (W4.c) f4055d.get(cVar);
        if (cVar3 == null || (c0012eA = bVar.a(cVar3)) == null) {
            return null;
        }
        return b(bVar2, c0012eA, false);
    }

    public static J4.h b(A2.b bVar, C0012e c0012e, boolean z7) {
        kotlin.jvm.internal.l.f("annotation", c0012e);
        kotlin.jvm.internal.l.f("c", bVar);
        W4.b bVarA = AbstractC0011d.a(m.F(m.B(c0012e.a)));
        W4.c cVar = x.f3756c;
        kotlin.jvm.internal.l.e("TARGET_ANNOTATION", cVar);
        if (bVarA.equals(android.support.v4.media.session.b.L(cVar))) {
            return new j(c0012e, bVar);
        }
        W4.c cVar2 = x.f3757d;
        kotlin.jvm.internal.l.e("RETENTION_ANNOTATION", cVar2);
        if (bVarA.equals(android.support.v4.media.session.b.L(cVar2))) {
            return new i(c0012e, bVar);
        }
        W4.c cVar3 = x.f3759f;
        kotlin.jvm.internal.l.e("DOCUMENTED_ANNOTATION", cVar3);
        if (bVarA.equals(android.support.v4.media.session.b.L(cVar3))) {
            return new b(bVar, c0012e, AbstractC1886o.f15016x);
        }
        W4.c cVar4 = x.f3758e;
        kotlin.jvm.internal.l.e("DEPRECATED_ANNOTATION", cVar4);
        if (bVarA.equals(android.support.v4.media.session.b.L(cVar4))) {
            return null;
        }
        return new L4.f(bVar, c0012e, z7);
    }
}
