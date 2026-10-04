package o4;

import L.C0425v1;
import Z5.C0649s;
import io.ktor.http.ContentDisposition;
import io.ktor.http.LinkHeader;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC1403c;
import kotlin.jvm.internal.InterfaceC1404d;
import l4.InterfaceC1424c;
import l4.InterfaceC1425d;
import l4.InterfaceC1426e;
import l4.InterfaceC1427f;
import l4.InterfaceC1428g;
import l4.InterfaceC1431j;
import l4.InterfaceC1433l;
import l4.InterfaceC1440s;
import l4.InterfaceC1442u;
import l4.InterfaceC1444w;
import l4.InterfaceC1445x;
import n5.AbstractC1566c;
import n5.AbstractC1586x;
import t4.C2053d;
import u4.InterfaceC2099e;
import u4.InterfaceC2102h;

/* loaded from: classes.dex */
public class B0 extends kotlin.jvm.internal.z {
    public static AbstractC1654H n(AbstractC1403c abstractC1403c) {
        InterfaceC1427f owner = abstractC1403c.getOwner();
        return owner instanceof AbstractC1654H ? (AbstractC1654H) owner : C1676e.f13702l;
    }

    @Override // kotlin.jvm.internal.z
    public final InterfaceC1428g a(kotlin.jvm.internal.i iVar) {
        AbstractC1654H abstractC1654HN = n(iVar);
        String name = iVar.getName();
        String signature = iVar.getSignature();
        Object boundReceiver = iVar.getBoundReceiver();
        kotlin.jvm.internal.l.f("container", abstractC1654HN);
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, name);
        kotlin.jvm.internal.l.f("signature", signature);
        return new C1656J(abstractC1654HN, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.z
    public final InterfaceC1425d b(Class cls) {
        return AbstractC1674d.a(cls);
    }

    @Override // kotlin.jvm.internal.z
    public final InterfaceC1427f c(Class cls) {
        C0649s c0649s = AbstractC1674d.a;
        kotlin.jvm.internal.l.f("jClass", cls);
        return (InterfaceC1427f) AbstractC1674d.f13697b.a(cls);
    }

    @Override // kotlin.jvm.internal.z
    public final InterfaceC1444w d(InterfaceC1444w interfaceC1444w) {
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, interfaceC1444w);
        AbstractC1586x abstractC1586x = ((v0) interfaceC1444w).f13766k;
        if (!(abstractC1586x instanceof n5.B)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + interfaceC1444w).toString());
        }
        InterfaceC2102h interfaceC2102hF = abstractC1586x.t0().f();
        InterfaceC2099e interfaceC2099e = interfaceC2102hF instanceof InterfaceC2099e ? (InterfaceC2099e) interfaceC2102hF : null;
        if (interfaceC2099e == null) {
            throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + interfaceC1444w);
        }
        n5.B b4 = (n5.B) abstractC1586x;
        String str = C2053d.a;
        W4.c cVar = (W4.c) C2053d.f16047k.get(d5.e.h(interfaceC2099e));
        if (cVar == null) {
            throw new IllegalArgumentException("Not a readonly collection: " + interfaceC2099e);
        }
        n5.M mV = d5.e.e(interfaceC2099e).j(cVar).v();
        kotlin.jvm.internal.l.e("getTypeConstructor(...)", mV);
        n5.I iS0 = b4.s0();
        List listQ0 = b4.q0();
        boolean zU0 = b4.u0();
        kotlin.jvm.internal.l.f("annotations", iS0);
        kotlin.jvm.internal.l.f("arguments", listQ0);
        return new v0(AbstractC1566c.u(listQ0, iS0, mV, zU0), null);
    }

    @Override // kotlin.jvm.internal.z
    public final InterfaceC1431j e(M.K k7) {
        return new C1658L(n(k7), k7.getName(), k7.getSignature(), k7.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.z
    public final InterfaceC1433l f(kotlin.jvm.internal.n nVar) {
        return new C1660N(n(nVar), nVar.getName(), nVar.getSignature(), nVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.z
    public final InterfaceC1440s g(C0425v1 c0425v1) {
        return new C1675d0(n(c0425v1), c0425v1.getName(), c0425v1.getSignature(), c0425v1.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.z
    public final InterfaceC1442u h(kotlin.jvm.internal.r rVar) {
        return new C1681g0(n(rVar), rVar.getName(), rVar.getSignature(), rVar.getBoundReceiver());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0011  */
    @Override // kotlin.jvm.internal.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String i(kotlin.jvm.internal.h r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.B0.i(kotlin.jvm.internal.h):java.lang.String");
    }

    @Override // kotlin.jvm.internal.z
    public final String j(kotlin.jvm.internal.m mVar) {
        return i(mVar);
    }

    @Override // kotlin.jvm.internal.z
    public final InterfaceC1444w l(InterfaceC1426e interfaceC1426e, List list, boolean z7) {
        if (!(interfaceC1426e instanceof InterfaceC1404d)) {
            return e3.c.s(interfaceC1426e, list, z7, Collections.EMPTY_LIST);
        }
        Class clsD = ((InterfaceC1404d) interfaceC1426e).d();
        C0649s c0649s = AbstractC1674d.a;
        kotlin.jvm.internal.l.f("jClass", clsD);
        kotlin.jvm.internal.l.f("arguments", list);
        if (list.isEmpty()) {
            return z7 ? (InterfaceC1444w) AbstractC1674d.f13699d.a(clsD) : (InterfaceC1444w) AbstractC1674d.f13698c.a(clsD);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) AbstractC1674d.f13700e.a(clsD);
        O3.l lVar = new O3.l(list, Boolean.valueOf(z7));
        Object obj = concurrentHashMap.get(lVar);
        if (obj == null) {
            v0 v0VarS = e3.c.s(AbstractC1674d.a(clsD), list, z7, P3.y.f7779k);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(lVar, v0VarS);
            obj = objPutIfAbsent == null ? v0VarS : objPutIfAbsent;
        }
        return (InterfaceC1444w) obj;
    }

    @Override // kotlin.jvm.internal.z
    public final InterfaceC1445x m(InterfaceC1425d interfaceC1425d) {
        List<InterfaceC1445x> typeParameters;
        if (interfaceC1425d != null) {
            typeParameters = interfaceC1425d.getTypeParameters();
        } else {
            if (!(interfaceC1425d instanceof InterfaceC1424c)) {
                throw new IllegalArgumentException("Type parameter container must be a class or a callable: " + interfaceC1425d);
            }
            typeParameters = ((InterfaceC1424c) interfaceC1425d).getTypeParameters();
        }
        for (InterfaceC1445x interfaceC1445x : typeParameters) {
            if (interfaceC1445x.getName().equals("PluginConfigT")) {
                return interfaceC1445x;
            }
        }
        throw new IllegalArgumentException("Type parameter PluginConfigT is not found in container: " + interfaceC1425d);
    }

    @Override // kotlin.jvm.internal.z
    public final void k(InterfaceC1445x interfaceC1445x, List list) {
    }
}
