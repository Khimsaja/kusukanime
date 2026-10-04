package L4;

import e4.InterfaceC0821a;
import e5.AbstractC0832b;
import e5.C0833c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import z4.C2491c;

/* loaded from: classes.dex */
public final class p implements InterfaceC0821a {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f6120k;

    /* renamed from: l, reason: collision with root package name */
    public final q f6121l;

    public /* synthetic */ p(q qVar, int i7) {
        this.f6120k = i7;
        this.f6121l = qVar;
    }

    @Override // e4.InterfaceC0821a
    public final Object invoke() {
        switch (this.f6120k) {
            case 0:
                q qVar = this.f6121l;
                K4.a aVar = (K4.a) qVar.f6124r.f110l;
                String str = qVar.f17354o.a.a;
                aVar.f4710l.getClass();
                kotlin.jvm.internal.l.f("packageFqName", str);
                return P3.E.r0(new ArrayList());
            case 1:
                this.f6121l.f6123q.getClass();
                return new ArrayList(P3.r.p(P3.y.f7779k, 10));
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) AbstractC0832b.u(this.f6121l.f6125s, q.f6122w[0])).entrySet()) {
                    String str2 = (String) entry.getKey();
                    C2491c c2491c = (C2491c) entry.getValue();
                    C0833c c0833cC = C0833c.c(str2);
                    Q4.b bVar = c2491c.f19031b;
                    Q4.a aVar2 = (Q4.a) bVar.f8005c;
                    int iOrdinal = aVar2.ordinal();
                    if (iOrdinal == 2) {
                        map.put(c0833cC, c0833cC);
                    } else if (iOrdinal == 5) {
                        String str3 = aVar2 == Q4.a.f8001s ? (String) bVar.f8010h : null;
                        if (str3 != null) {
                            map.put(c0833cC, C0833c.c(str3));
                        }
                    }
                }
                return map;
        }
    }
}
