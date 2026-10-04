package D4;

import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l4.InterfaceC1443v;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC1443v[] f1545l;
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final Z f1546b;

    /* renamed from: c, reason: collision with root package name */
    public final Z f1547c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1548d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1549e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1550f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f1551g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1552h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1553i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1554j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f1555k;

    static {
        kotlin.jvm.internal.o oVar = new kotlin.jvm.internal.o(Y.class, "_hasSetter", "get_hasSetter()Z", 0);
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.y.a;
        f1545l = new InterfaceC1443v[]{zVar.f(oVar), A6.b.m(Y.class, "_hasGetter", "get_hasGetter()Z", 0, zVar)};
    }

    public Y(int i7, int i8, int i9, String str) {
        int i10;
        kotlin.jvm.internal.l.f(ContentDisposition.Parameters.Name, str);
        this.a = i7;
        T4.b bVar = T4.e.f9068A;
        kotlin.jvm.internal.l.e("HAS_SETTER", bVar);
        C1.i iVar = new C1.i(bVar);
        E4.e eVar = E4.e.f1937k;
        int i11 = iVar.f580b;
        if (i11 != 1 || (i10 = iVar.f581c) != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar, " was passed").toString());
        }
        int i12 = iVar.a;
        T4.b bVar2 = T4.e.f9106z;
        kotlin.jvm.internal.l.e("HAS_GETTER", bVar2);
        C1.i iVar2 = new C1.i(bVar2);
        if (iVar2.f580b != 1 || iVar2.f581c != 1) {
            throw new IllegalArgumentException(A6.b.g("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", iVar2, " was passed").toString());
        }
        int i13 = 1 << iVar2.a;
        Z z7 = new Z(i8);
        InterfaceC1443v[] interfaceC1443vArr = f1545l;
        kotlin.jvm.internal.l.f("property", interfaceC1443vArr[1]);
        eVar.set(this, Integer.valueOf(i13 | ((Number) eVar.get(this)).intValue()));
        this.f1546b = z7;
        kotlin.jvm.internal.l.f("property", interfaceC1443vArr[0]);
        this.f1547c = ((((Number) eVar.get(this)).intValue() >>> i12) & ((1 << i11) - 1)) == i10 ? new Z(i9) : null;
        this.f1548d = new ArrayList(0);
        this.f1549e = new ArrayList(0);
        new ArrayList(0);
        this.f1550f = new ArrayList();
        this.f1551g = new ArrayList(0);
        this.f1552h = new ArrayList(0);
        this.f1553i = new ArrayList(0);
        this.f1554j = new ArrayList(0);
        F4.k.a.getClass();
        List listA = F4.j.a();
        ArrayList arrayList = new ArrayList(P3.r.p(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((G4.d) ((F4.k) it.next())).getClass();
            arrayList.add(new G4.e());
        }
        this.f1555k = arrayList;
    }
}
