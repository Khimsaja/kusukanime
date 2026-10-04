package s6;

import f.AbstractC0847h;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a extends AbstractC0847h {
    public final d a;

    public a(d dVar) {
        l.f("trustRootIndex", dVar);
        this.a = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && l.a(((a) obj).a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // f.AbstractC0847h
    public final List j(String str, List list) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException, SSLPeerUnverifiedException {
        l.f("chain", list);
        l.f("hostname", str);
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        l.e("queue.removeFirst()", objRemoveFirst);
        arrayList.add(objRemoveFirst);
        boolean z7 = false;
        for (int i7 = 0; i7 < 9; i7++) {
            Object obj = arrayList.get(arrayList.size() - 1);
            l.d("null cannot be cast to non-null type java.security.cert.X509Certificate", obj);
            X509Certificate x509Certificate = (X509Certificate) obj;
            X509Certificate x509CertificateA = this.a.a(x509Certificate);
            if (x509CertificateA == null) {
                Iterator it = arrayDeque.iterator();
                l.e("queue.iterator()", it);
                while (it.hasNext()) {
                    Object next = it.next();
                    l.d("null cannot be cast to non-null type java.security.cert.X509Certificate", next);
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (l.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate2);
                        } catch (GeneralSecurityException unused) {
                            continue;
                        }
                    }
                }
                if (!z7) {
                    throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                }
                return arrayList;
            }
            if (arrayList.size() > 1 || !x509Certificate.equals(x509CertificateA)) {
                arrayList.add(x509CertificateA);
            }
            if (l.a(x509CertificateA.getIssuerDN(), x509CertificateA.getSubjectDN())) {
                try {
                    x509CertificateA.verify(x509CertificateA.getPublicKey());
                    return arrayList;
                } catch (GeneralSecurityException unused2) {
                }
            }
            z7 = true;
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}
