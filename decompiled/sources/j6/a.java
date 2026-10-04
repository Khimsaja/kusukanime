package j6;

import H1.C0231l;
import f6.C0887A;
import f6.C0895I;
import f6.InterfaceC0923u;
import f6.InterfaceC0924v;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a implements InterfaceC0924v {
    public static final a a = new a();

    @Override // f6.InterfaceC0924v
    public final C0895I intercept(InterfaceC0923u interfaceC0923u) throws IOException {
        k6.f fVar = (k6.f) interfaceC0923u;
        i iVar = fVar.a;
        iVar.getClass();
        synchronized (iVar) {
            try {
                if (!iVar.f12522x) {
                    throw new IllegalStateException("released");
                }
                if (iVar.f12521w) {
                    throw new IllegalStateException("Check failed.");
                }
                if (iVar.f12520v) {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = iVar.f12516r;
        kotlin.jvm.internal.l.c(eVar);
        C0887A c0887a = iVar.f12509k;
        kotlin.jvm.internal.l.f("client", c0887a);
        try {
            C0231l c0231l = new C0231l(iVar, eVar, eVar.a(fVar.f12702f, fVar.f12703g, fVar.f12704h, c0887a.f11452p, !kotlin.jvm.internal.l.a(fVar.f12701e.f11475b, "GET")).j(c0887a, fVar));
            iVar.f12519u = c0231l;
            iVar.f12524z = c0231l;
            synchronized (iVar) {
                iVar.f12520v = true;
                iVar.f12521w = true;
            }
            if (iVar.f12523y) {
                throw new IOException("Canceled");
            }
            return k6.f.a(fVar, 0, c0231l, null, 61).b(fVar.f12701e);
        } catch (m e7) {
            eVar.c(e7.f12545l);
            throw e7;
        } catch (IOException e8) {
            eVar.c(e8);
            throw new m(e8);
        }
    }
}
