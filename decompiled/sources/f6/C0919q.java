package f6;

import e4.InterfaceC0821a;
import io.ktor.http.LinkHeader;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f6.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0919q {
    public final EnumC0899M a;

    /* renamed from: b, reason: collision with root package name */
    public final C0912j f11593b;

    /* renamed from: c, reason: collision with root package name */
    public final List f11594c;

    /* renamed from: d, reason: collision with root package name */
    public final O3.q f11595d;

    public C0919q(EnumC0899M enumC0899M, C0912j c0912j, List list, InterfaceC0821a interfaceC0821a) {
        this.a = enumC0899M;
        this.f11593b = c0912j;
        this.f11594c = list;
        this.f11595d = z1.c.C(new B.e(interfaceC0821a));
    }

    public final List a() {
        return (List) this.f11595d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0919q)) {
            return false;
        }
        C0919q c0919q = (C0919q) obj;
        return c0919q.a == this.a && kotlin.jvm.internal.l.a(c0919q.f11593b, this.f11593b) && kotlin.jvm.internal.l.a(c0919q.a(), a()) && kotlin.jvm.internal.l.a(c0919q.f11594c, this.f11594c);
    }

    public final int hashCode() {
        return this.f11594c.hashCode() + ((a().hashCode() + ((this.f11593b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(P3.r.p(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.l.e(LinkHeader.Parameters.Type, type2);
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.f11593b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f11594c;
        ArrayList arrayList2 = new ArrayList(P3.r.p(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.l.e(LinkHeader.Parameters.Type, type);
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
