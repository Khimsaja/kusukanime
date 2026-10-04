package n6;

import P3.r;
import f6.EnumC0888B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class l extends o {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f13449c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numU = property != null ? AbstractC2517v.U(property) : null;
        boolean z7 = true;
        if (numU == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
            } catch (NoSuchMethodException unused) {
            }
        } else if (numU.intValue() < 9) {
            z7 = false;
        }
        f13449c = z7;
    }

    @Override // n6.o
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC0888B) obj) != EnumC0888B.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC0888B) it.next()).f11470k);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // n6.o
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
