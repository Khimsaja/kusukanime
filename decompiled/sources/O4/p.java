package O4;

import P3.B;
import P3.C;
import P3.F;
import e5.EnumC0834d;
import io.ktor.http.LinkHeader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class p {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7585b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7586c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public O3.l f7587d = new O3.l("V", null);

    public p(L2.e eVar, String str, String str2) {
        this.a = str;
        this.f7585b = str2;
    }

    public final void a(String str, e... eVarArr) {
        t tVar;
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, str);
        ArrayList arrayList = this.f7586c;
        if (eVarArr.length == 0) {
            tVar = null;
        } else {
            P3.o oVar = new P3.o(1, new B3.q(3, eVarArr));
            int I = F.I(P3.r.p(oVar, 10));
            if (I < 16) {
                I = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(I);
            Iterator it = oVar.iterator();
            while (true) {
                C c2 = (C) it;
                if (!c2.f7740l.hasNext()) {
                    break;
                }
                B b4 = (B) c2.next();
                linkedHashMap.put(Integer.valueOf(b4.a), (e) b4.f7738b);
            }
            tVar = new t(linkedHashMap);
        }
        arrayList.add(new O3.l(str, tVar));
    }

    public final void b(EnumC0834d enumC0834d) {
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, enumC0834d);
        String strC = enumC0834d.c();
        kotlin.jvm.internal.l.e("getDesc(...)", strC);
        this.f7587d = new O3.l(strC, null);
    }

    public final void c(String str, e... eVarArr) {
        kotlin.jvm.internal.l.f(LinkHeader.Parameters.Type, str);
        P3.o oVar = new P3.o(1, new B3.q(3, eVarArr));
        int I = F.I(P3.r.p(oVar, 10));
        if (I < 16) {
            I = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(I);
        Iterator it = oVar.iterator();
        while (true) {
            C c2 = (C) it;
            if (!c2.f7740l.hasNext()) {
                this.f7587d = new O3.l(str, new t(linkedHashMap));
                return;
            } else {
                B b4 = (B) c2.next();
                linkedHashMap.put(Integer.valueOf(b4.a), (e) b4.f7738b);
            }
        }
    }
}
