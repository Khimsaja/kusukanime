package j6;

import f6.C0911i;
import f6.C0912j;
import f6.C0913k;
import f6.C0914l;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class b {
    public final List a;

    /* renamed from: b, reason: collision with root package name */
    public int f12482b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12483c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f12484d;

    public b(List list) {
        kotlin.jvm.internal.l.f("connectionSpecs", list);
        this.a = list;
    }

    public final C0914l a(SSLSocket sSLSocket) throws UnknownServiceException {
        C0914l c0914l;
        int i7;
        boolean z7;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i8 = this.f12482b;
        List list = this.a;
        int size = list.size();
        while (true) {
            if (i8 >= size) {
                c0914l = null;
                break;
            }
            c0914l = (C0914l) list.get(i8);
            if (c0914l.b(sSLSocket)) {
                this.f12482b = i8 + 1;
                break;
            }
            i8++;
        }
        if (c0914l == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.f12484d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.l.c(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            kotlin.jvm.internal.l.e("toString(this)", string);
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i9 = this.f12482b;
        int size2 = list.size();
        while (true) {
            i7 = 0;
            if (i9 >= size2) {
                z7 = false;
                break;
            }
            if (((C0914l) list.get(i9)).b(sSLSocket)) {
                z7 = true;
                break;
            }
            i9++;
        }
        this.f12483c = z7;
        boolean z8 = this.f12484d;
        String[] strArr = c0914l.f11575c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            kotlin.jvm.internal.l.e("sslSocket.enabledCipherSuites", enabledCipherSuites2);
            enabledCipherSuites = g6.b.p(enabledCipherSuites2, strArr, C0912j.f11551c);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = c0914l.f11576d;
        if (strArr2 != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            kotlin.jvm.internal.l.e("sslSocket.enabledProtocols", enabledProtocols3);
            enabledProtocols = g6.b.p(enabledProtocols3, strArr2, R3.a.f8097l);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        kotlin.jvm.internal.l.e("supportedCipherSuites", supportedCipherSuites);
        C0911i c0911i = C0912j.f11551c;
        byte[] bArr = g6.b.a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (c0911i.compare(supportedCipherSuites[i7], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i7++;
        }
        if (z8 && i7 != -1) {
            kotlin.jvm.internal.l.e("cipherSuitesIntersection", enabledCipherSuites);
            String str = supportedCipherSuites[i7];
            kotlin.jvm.internal.l.e("supportedCipherSuites[indexOfFallbackScsv]", str);
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            kotlin.jvm.internal.l.e("copyOf(this, newSize)", objArrCopyOf);
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C0913k c0913k = new C0913k();
        c0913k.a = c0914l.a;
        c0913k.f11569b = strArr;
        c0913k.f11570c = strArr2;
        c0913k.f11571d = c0914l.f11574b;
        kotlin.jvm.internal.l.e("cipherSuitesIntersection", enabledCipherSuites);
        c0913k.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        kotlin.jvm.internal.l.e("tlsVersionsIntersection", enabledProtocols);
        c0913k.e((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C0914l c0914lA = c0913k.a();
        if (c0914lA.c() != null) {
            sSLSocket.setEnabledProtocols(c0914lA.f11576d);
        }
        if (c0914lA.a() != null) {
            sSLSocket.setEnabledCipherSuites(c0914lA.f11575c);
        }
        return c0914l;
    }
}
