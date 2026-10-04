package X5;

import O3.q;
import P3.B;
import P3.C;
import P3.E;
import P3.F;
import P3.o;
import P3.r;
import Z5.AbstractC0632e0;
import Z5.InterfaceC0643l;
import io.ktor.http.ContentDisposition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.l;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes.dex */
public final class g implements SerialDescriptor, InterfaceC0643l {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final n6.d f9938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9939c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9940d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f9941e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f9942f;

    /* renamed from: g, reason: collision with root package name */
    public final SerialDescriptor[] f9943g;

    /* renamed from: h, reason: collision with root package name */
    public final List[] f9944h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f9945i;

    /* renamed from: j, reason: collision with root package name */
    public final Map f9946j;

    /* renamed from: k, reason: collision with root package name */
    public final SerialDescriptor[] f9947k;

    /* renamed from: l, reason: collision with root package name */
    public final q f9948l;

    public g(String str, n6.d dVar, int i7, List list, a aVar) {
        l.f("serialName", str);
        this.a = str;
        this.f9938b = dVar;
        this.f9939c = i7;
        this.f9940d = aVar.f9919b;
        ArrayList arrayList = aVar.f9920c;
        l.f("<this>", arrayList);
        HashSet hashSet = new HashSet(F.I(r.p(arrayList, 12)));
        P3.q.Q0(arrayList, hashSet);
        this.f9941e = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f9942f = strArr;
        this.f9943g = AbstractC0632e0.c(aVar.f9922e);
        this.f9944h = (List[]) aVar.f9923f.toArray(new List[0]);
        ArrayList arrayList2 = aVar.f9924g;
        l.f("<this>", arrayList2);
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        int i8 = 0;
        while (it.hasNext()) {
            zArr[i8] = ((Boolean) it.next()).booleanValue();
            i8++;
        }
        this.f9945i = zArr;
        l.f("<this>", strArr);
        o oVar = new o(1, new B3.q(3, strArr));
        ArrayList arrayList3 = new ArrayList(r.p(oVar, 10));
        Iterator it2 = oVar.iterator();
        while (true) {
            C c2 = (C) it2;
            if (!c2.f7740l.hasNext()) {
                this.f9946j = E.r0(arrayList3);
                this.f9947k = AbstractC0632e0.c(list);
                this.f9948l = z1.c.C(new B3.q(7, this));
                return;
            }
            B b4 = (B) c2.next();
            arrayList3.add(new O3.l(b4.f7738b, Integer.valueOf(b4.a)));
        }
    }

    @Override // Z5.InterfaceC0643l
    public final Set a() {
        return this.f9941e;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final n6.d c() {
        return this.f9938b;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int d(String str) {
        l.f(ContentDisposition.Parameters.Name, str);
        Integer num = (Integer) this.f9946j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (l.a(this.a, serialDescriptor.e()) && Arrays.equals(this.f9947k, ((g) obj).f9947k)) {
                int iF = serialDescriptor.f();
                int i7 = this.f9939c;
                if (i7 == iF) {
                    for (int i8 = 0; i8 < i7; i8++) {
                        SerialDescriptor[] serialDescriptorArr = this.f9943g;
                        if (l.a(serialDescriptorArr[i8].e(), serialDescriptor.j(i8).e()) && l.a(serialDescriptorArr[i8].c(), serialDescriptor.j(i8).c())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int f() {
        return this.f9939c;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String g(int i7) {
        return this.f9942f[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.f9940d;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return ((Number) this.f9948l.getValue()).intValue();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List i(int i7) {
        return this.f9944h[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor j(int i7) {
        return this.f9943g[i7];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean k(int i7) {
        return this.f9945i[i7];
    }

    public final String toString() {
        return AbstractC0632e0.l(this);
    }
}
