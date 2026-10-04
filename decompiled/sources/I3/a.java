package I3;

import G3.j;
import b1.AbstractC0703b;
import kotlin.jvm.internal.l;
import l4.InterfaceC1436o;
import l4.InterfaceC1442u;

/* loaded from: classes.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final j f4040b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1442u f4041c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC1436o f4042d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4043e;

    public a(String str, j jVar, InterfaceC1442u interfaceC1442u, InterfaceC1436o interfaceC1436o, int i7) {
        l.f("jsonName", str);
        this.a = str;
        this.f4040b = jVar;
        this.f4041c = interfaceC1442u;
        this.f4042d = interfaceC1436o;
        this.f4043e = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return l.a(this.a, aVar.a) && l.a(this.f4040b, aVar.f4040b) && l.a(this.f4041c, aVar.f4041c) && l.a(this.f4042d, aVar.f4042d) && this.f4043e == aVar.f4043e;
    }

    public final int hashCode() {
        int iHashCode = (this.f4041c.hashCode() + ((this.f4040b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        InterfaceC1436o interfaceC1436o = this.f4042d;
        return Integer.hashCode(this.f4043e) + ((iHashCode + (interfaceC1436o == null ? 0 : interfaceC1436o.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Binding(jsonName=");
        sb.append(this.a);
        sb.append(", adapter=");
        sb.append(this.f4040b);
        sb.append(", property=");
        sb.append(this.f4041c);
        sb.append(", parameter=");
        sb.append(this.f4042d);
        sb.append(", propertyIndex=");
        return AbstractC0703b.l(sb, this.f4043e, ')');
    }
}
