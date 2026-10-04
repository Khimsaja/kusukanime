package o6;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class l implements m {
    public final k a;

    /* renamed from: b, reason: collision with root package name */
    public m f13827b;

    public l(k kVar) {
        this.a = kVar;
    }

    @Override // o6.m
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // o6.m
    public final String b(SSLSocket sSLSocket) {
        m mVarE = e(sSLSocket);
        if (mVarE != null) {
            return mVarE.b(sSLSocket);
        }
        return null;
    }

    @Override // o6.m
    public final boolean c() {
        return true;
    }

    @Override // o6.m
    public final void d(SSLSocket sSLSocket, String str, List list) {
        kotlin.jvm.internal.l.f("protocols", list);
        m mVarE = e(sSLSocket);
        if (mVarE != null) {
            mVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized m e(SSLSocket sSLSocket) {
        try {
            if (this.f13827b == null && this.a.a(sSLSocket)) {
                this.f13827b = this.a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f13827b;
    }
}
