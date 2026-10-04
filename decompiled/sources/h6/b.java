package h6;

import L2.e;
import f6.AbstractC0897K;
import f6.C0890D;
import f6.C0894H;
import f6.C0895I;
import f6.C0920r;
import f6.EnumC0888B;
import f6.InterfaceC0923u;
import f6.InterfaceC0924v;
import io.ktor.http.ContentDisposition;
import j6.i;
import java.util.ArrayList;
import k6.f;
import kotlin.jvm.internal.l;
import z5.AbstractC2510o;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class b implements InterfaceC0924v {
    @Override // f6.InterfaceC0924v
    public final C0895I intercept(InterfaceC0923u interfaceC0923u) throws Throwable {
        Throwable th;
        int i7;
        f fVar = (f) interfaceC0923u;
        System.currentTimeMillis();
        C0890D c0890d = fVar.f12701e;
        l.f("request", c0890d);
        Throwable th2 = null;
        e eVar = new e(24, c0890d, th2);
        if (c0890d.a().f11544j) {
            eVar = new e(24, th2, th2);
        }
        i iVar = fVar.a;
        C0890D c0890d2 = (C0890D) eVar.f6045l;
        C0895I c0895i = (C0895I) eVar.f6046m;
        if (c0890d2 == null && c0895i == null) {
            C0895I c0895i2 = new C0895I(c0890d, EnumC0888B.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new C0920r((String[]) new ArrayList(20).toArray(new String[0])), g6.b.f11773c, null, null, null, -1L, System.currentTimeMillis(), null);
            l.f("call", iVar);
            return c0895i2;
        }
        if (c0890d2 == null) {
            l.c(c0895i);
            C0894H c0894hG = c0895i.g();
            C0895I c0895iA = a.a(c0895i);
            C0894H.b(c0895iA, "cacheResponse");
            c0894hG.f11490i = c0895iA;
            C0895I c0895iA2 = c0894hG.a();
            l.f("call", iVar);
            return c0895iA2;
        }
        if (c0895i != null) {
            l.f("call", iVar);
        }
        C0895I c0895iB = fVar.b(c0890d2);
        if (c0895i != null) {
            if (c0895iB.f11498n == 304) {
                C0894H c0894hG2 = c0895i.g();
                C0920r c0920r = c0895iB.f11500p;
                ArrayList arrayList = new ArrayList(20);
                C0920r c0920r2 = c0895i.f11500p;
                int size = c0920r2.size();
                int i8 = 0;
                while (true) {
                    th = th2;
                    if (i8 >= size) {
                        break;
                    }
                    String strH = c0920r2.h(i8);
                    int i9 = size;
                    String strM = c0920r2.m(i8);
                    C0920r c0920r3 = c0920r2;
                    if ("Warning".equalsIgnoreCase(strH)) {
                        i7 = i8;
                        if (AbstractC2517v.T(strM, "1", false)) {
                        }
                        i8 = i7 + 1;
                        th2 = th;
                        size = i9;
                        c0920r2 = c0920r3;
                    } else {
                        i7 = i8;
                    }
                    if ("Content-Length".equalsIgnoreCase(strH) || "Content-Encoding".equalsIgnoreCase(strH) || "Content-Type".equalsIgnoreCase(strH) || !a.b(strH) || c0920r.a(strH) == null) {
                        l.f(ContentDisposition.Parameters.Name, strH);
                        l.f("value", strM);
                        arrayList.add(strH);
                        arrayList.add(AbstractC2510o.J0(strM).toString());
                    }
                    i8 = i7 + 1;
                    th2 = th;
                    size = i9;
                    c0920r2 = c0920r3;
                }
                int size2 = c0920r.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    String strH2 = c0920r.h(i10);
                    if (!"Content-Length".equalsIgnoreCase(strH2) && !"Content-Encoding".equalsIgnoreCase(strH2) && !"Content-Type".equalsIgnoreCase(strH2) && a.b(strH2)) {
                        String strM2 = c0920r.m(i10);
                        l.f(ContentDisposition.Parameters.Name, strH2);
                        l.f("value", strM2);
                        arrayList.add(strH2);
                        arrayList.add(AbstractC2510o.J0(strM2).toString());
                    }
                }
                c0894hG2.f11487f = new C0920r((String[]) arrayList.toArray(new String[0])).j();
                c0894hG2.f11492k = c0895iB.f11505u;
                c0894hG2.f11493l = c0895iB.f11506v;
                C0895I c0895iA3 = a.a(c0895i);
                C0894H.b(c0895iA3, "cacheResponse");
                c0894hG2.f11490i = c0895iA3;
                C0895I c0895iA4 = a.a(c0895iB);
                C0894H.b(c0895iA4, "networkResponse");
                c0894hG2.f11489h = c0895iA4;
                c0894hG2.a();
                AbstractC0897K abstractC0897K = c0895iB.f11501q;
                l.c(abstractC0897K);
                abstractC0897K.close();
                l.c(th);
                throw th;
            }
            AbstractC0897K abstractC0897K2 = c0895i.f11501q;
            if (abstractC0897K2 != null) {
                g6.b.c(abstractC0897K2);
            }
        }
        C0894H c0894hG3 = c0895iB.g();
        C0895I c0895iA5 = a.a(c0895i);
        C0894H.b(c0895iA5, "cacheResponse");
        c0894hG3.f11490i = c0895iA5;
        C0895I c0895iA6 = a.a(c0895iB);
        C0894H.b(c0895iA6, "networkResponse");
        c0894hG3.f11489h = c0895iA6;
        return c0894hG3.a();
    }
}
