package O1;

import j3.AbstractC1331q;
import j3.C1334u;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import y1.C2396s;
import y1.C2397t;
import y1.C2399v;
import y1.C2401x;

/* loaded from: classes.dex */
public final class L extends AbstractC0537k {

    /* renamed from: s, reason: collision with root package name */
    public static final C2401x f7282s;

    /* renamed from: k, reason: collision with root package name */
    public final AbstractC0527a[] f7283k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f7284l;

    /* renamed from: m, reason: collision with root package name */
    public final y1.P[] f7285m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f7286n;

    /* renamed from: o, reason: collision with root package name */
    public final A.e f7287o;

    /* renamed from: p, reason: collision with root package name */
    public int f7288p;

    /* renamed from: q, reason: collision with root package name */
    public long[][] f7289q;

    /* renamed from: r, reason: collision with root package name */
    public D1.a f7290r;

    static {
        V1.r rVar = new V1.r();
        j3.E e7 = j3.G.f12277l;
        j3.X x7 = j3.X.f12304o;
        List list = Collections.EMPTY_LIST;
        j3.X x8 = j3.X.f12304o;
        C2396s c2396s = new C2396s();
        f7282s = new C2401x("MergingMediaSource", new y1.r(rVar), null, new C2397t(c2396s), y1.A.f17903B, C2399v.a);
    }

    public L(AbstractC0527a... abstractC0527aArr) {
        A.e eVar = new A.e(23);
        this.f7283k = abstractC0527aArr;
        this.f7287o = eVar;
        this.f7286n = new ArrayList(Arrays.asList(abstractC0527aArr));
        this.f7288p = -1;
        this.f7284l = new ArrayList(abstractC0527aArr.length);
        for (int i7 = 0; i7 < abstractC0527aArr.length; i7++) {
            this.f7284l.add(new ArrayList());
        }
        this.f7285m = new y1.P[abstractC0527aArr.length];
        this.f7289q = new long[0][];
        new HashMap();
        AbstractC1331q.b(8, "expectedKeys");
        AbstractC1331q.b(2, "expectedValuesPerKey");
        C1334u c1334uA = C1334u.a();
        new j3.S();
        if (!c1334uA.isEmpty()) {
            throw new IllegalArgumentException();
        }
    }

    @Override // O1.AbstractC0527a
    public final InterfaceC0551z a(B b4, R1.f fVar, long j7) {
        AbstractC0527a[] abstractC0527aArr = this.f7283k;
        int length = abstractC0527aArr.length;
        InterfaceC0551z[] interfaceC0551zArr = new InterfaceC0551z[length];
        y1.P[] pArr = this.f7285m;
        int iB = pArr[0].b(b4.a);
        for (int i7 = 0; i7 < length; i7++) {
            B bA = b4.a(pArr[i7].l(iB));
            interfaceC0551zArr[i7] = abstractC0527aArr[i7].a(bA, fVar, j7 - this.f7289q[iB][i7]);
            ((List) this.f7284l.get(i7)).add(new K(bA, interfaceC0551zArr[i7]));
        }
        return new J(this.f7287o, this.f7289q[iB], interfaceC0551zArr);
    }

    @Override // O1.AbstractC0527a
    public final C2401x g() {
        AbstractC0527a[] abstractC0527aArr = this.f7283k;
        return abstractC0527aArr.length > 0 ? abstractC0527aArr[0].g() : f7282s;
    }

    @Override // O1.AbstractC0537k, O1.AbstractC0527a
    public final void i() throws D1.a {
        D1.a aVar = this.f7290r;
        if (aVar != null) {
            throw aVar;
        }
        super.i();
    }

    @Override // O1.AbstractC0527a
    public final void k(E1.D d4) {
        this.f7460j = d4;
        this.f7459i = B1.K.l(null);
        int i7 = 0;
        while (true) {
            AbstractC0527a[] abstractC0527aArr = this.f7283k;
            if (i7 >= abstractC0527aArr.length) {
                return;
            }
            w(Integer.valueOf(i7), abstractC0527aArr[i7]);
            i7++;
        }
    }

    @Override // O1.AbstractC0527a
    public final void m(InterfaceC0551z interfaceC0551z) {
        J j7 = (J) interfaceC0551z;
        int i7 = 0;
        while (true) {
            AbstractC0527a[] abstractC0527aArr = this.f7283k;
            if (i7 >= abstractC0527aArr.length) {
                return;
            }
            List list = (List) this.f7284l.get(i7);
            int i8 = 0;
            while (true) {
                if (i8 >= list.size()) {
                    break;
                }
                if (((K) list.get(i8)).f7281b.equals(interfaceC0551z)) {
                    list.remove(i8);
                    break;
                }
                i8++;
            }
            AbstractC0527a abstractC0527a = abstractC0527aArr[i7];
            boolean z7 = j7.f7272l[i7];
            InterfaceC0551z[] interfaceC0551zArr = j7.f7271k;
            abstractC0527a.m(z7 ? ((f0) interfaceC0551zArr[i7]).f7437k : interfaceC0551zArr[i7]);
            i7++;
        }
    }

    @Override // O1.AbstractC0537k, O1.AbstractC0527a
    public final void o() {
        super.o();
        Arrays.fill(this.f7285m, (Object) null);
        this.f7288p = -1;
        this.f7290r = null;
        ArrayList arrayList = this.f7286n;
        arrayList.clear();
        Collections.addAll(arrayList, this.f7283k);
    }

    @Override // O1.AbstractC0527a
    public final void r(C2401x c2401x) {
        this.f7283k[0].r(c2401x);
    }

    @Override // O1.AbstractC0537k
    public final B s(Object obj, B b4) {
        ArrayList arrayList = this.f7284l;
        List list = (List) arrayList.get(((Integer) obj).intValue());
        for (int i7 = 0; i7 < list.size(); i7++) {
            if (((K) list.get(i7)).a.equals(b4)) {
                return ((K) ((List) arrayList.get(0)).get(i7)).a;
            }
        }
        return null;
    }

    @Override // O1.AbstractC0537k
    public final void v(Object obj, AbstractC0527a abstractC0527a, y1.P p7) {
        Integer num = (Integer) obj;
        if (this.f7290r != null) {
            return;
        }
        if (this.f7288p == -1) {
            this.f7288p = p7.h();
        } else if (p7.h() != this.f7288p) {
            this.f7290r = new D1.a();
            return;
        }
        int length = this.f7289q.length;
        y1.P[] pArr = this.f7285m;
        if (length == 0) {
            this.f7289q = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.f7288p, pArr.length);
        }
        ArrayList arrayList = this.f7286n;
        arrayList.remove(abstractC0527a);
        pArr[num.intValue()] = p7;
        if (arrayList.isEmpty()) {
            l(pArr[0]);
        }
    }
}
