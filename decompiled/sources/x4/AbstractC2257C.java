package x4;

import io.ktor.sse.ServerSentEventKt;
import u4.InterfaceC2088D;
import u4.InterfaceC2105k;
import u4.InterfaceC2118y;
import v4.C2158f;
import v4.C2159g;

/* renamed from: x4.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2257C extends AbstractC2288o implements InterfaceC2088D {

    /* renamed from: o, reason: collision with root package name */
    public final W4.c f17354o;

    /* renamed from: p, reason: collision with root package name */
    public final String f17355p;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC2257C(InterfaceC2118y interfaceC2118y, W4.c cVar) {
        kotlin.jvm.internal.l.f("module", interfaceC2118y);
        kotlin.jvm.internal.l.f("fqName", cVar);
        C2158f c2158f = C2159g.a;
        W4.d dVar = cVar.a;
        super(interfaceC2118y, c2158f, dVar.c() ? W4.d.f9620e : dVar.g(), u4.M.f16295i);
        this.f17354o = cVar;
        this.f17355p = "package " + cVar + " of " + interfaceC2118y;
    }

    @Override // x4.AbstractC2288o, u4.InterfaceC2105k
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2118y k() {
        InterfaceC2105k interfaceC2105kK = super.k();
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor", interfaceC2105kK);
        return (InterfaceC2118y) interfaceC2105kK;
    }

    @Override // x4.AbstractC2288o, u4.InterfaceC2106l
    public u4.M l() {
        return u4.M.f16295i;
    }

    @Override // x4.AbstractC2287n
    public String toString() {
        return this.f17355p;
    }

    @Override // u4.InterfaceC2105k
    public final Object u(X4.y yVar, Object obj) {
        switch (yVar.f9915k) {
            case 1:
                StringBuilder sb = (StringBuilder) obj;
                Y4.h hVar = (Y4.h) yVar.f9916l;
                hVar.getClass();
                sb.append(hVar.F("package-fragment"));
                W4.d dVar = this.f17354o.a;
                kotlin.jvm.internal.l.f("fqName", dVar);
                String strM = hVar.m(z1.c.I(W4.d.f(dVar)));
                if (strM.length() > 0) {
                    sb.append(ServerSentEventKt.SPACE);
                    sb.append(strM);
                }
                if (hVar.a.l()) {
                    sb.append(" in ");
                    hVar.M(k(), sb, false);
                }
                return O3.C.a;
            default:
                return null;
        }
    }
}
