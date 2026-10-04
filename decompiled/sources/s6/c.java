package s6;

import P3.y;
import b1.AbstractC0703b;
import io.github.jan.supabase.auth.SettingsSessionManager;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.l;
import v.c0;

/* loaded from: classes.dex */
public final class c implements HostnameVerifier {
    public static final c a = new c();

    public static List a(X509Certificate x509Certificate, int i7) throws CertificateParsingException {
        Collection<List<?>> subjectAlternativeNames;
        Object obj;
        y yVar = y.f7779k;
        try {
            subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        } catch (CertificateParsingException unused) {
        }
        if (subjectAlternativeNames == null) {
            return yVar;
        }
        ArrayList arrayList = new ArrayList();
        for (List<?> list : subjectAlternativeNames) {
            if (list != null && list.size() >= 2 && l.a(list.get(0), Integer.valueOf(i7)) && (obj = list.get(1)) != null) {
                arrayList.add((String) obj);
            }
        }
        return arrayList;
    }

    public static boolean b(String str) {
        int i7;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(c0.a(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbP = AbstractC0703b.p(length2, "endIndex > string.length: ", " > ");
            sbP.append(str.length());
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        long j7 = 0;
        int i8 = 0;
        while (i8 < length2) {
            char cCharAt = str.charAt(i8);
            if (cCharAt < 128) {
                j7++;
            } else {
                if (cCharAt < 2048) {
                    i7 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i7 = 3;
                } else {
                    int i9 = i8 + 1;
                    char cCharAt2 = i9 < length2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j7++;
                        i8 = i9;
                    } else {
                        j7 += 4;
                        i8 += 2;
                    }
                }
                j7 += i7;
            }
            i8++;
        }
        return length == ((int) j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r11, java.security.cert.X509Certificate r12) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.c.c(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        l.f("host", str);
        l.f(SettingsSessionManager.SETTINGS_KEY, sSLSession);
        if (b(str)) {
            try {
                Certificate certificate = sSLSession.getPeerCertificates()[0];
                l.d("null cannot be cast to non-null type java.security.cert.X509Certificate", certificate);
                return c(str, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
