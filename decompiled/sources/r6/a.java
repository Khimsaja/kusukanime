package r6;

import g6.b;
import io.ktor.client.engine.okhttp.OkHttpSSESession;
import io.ktor.sse.ServerSentEventKt;
import n5.P;
import p.I0;
import w6.AbstractC2217b;
import w6.C2224i;
import w6.InterfaceC2226k;
import w6.l;
import w6.x;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final x f15051d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f15052e;
    public final InterfaceC2226k a;

    /* renamed from: b, reason: collision with root package name */
    public final P f15053b;

    /* renamed from: c, reason: collision with root package name */
    public String f15054c;

    static {
        l lVar = l.f17157n;
        f15051d = AbstractC2217b.f(I0.s(ServerSentEventKt.END_OF_LINE), I0.s("\r"), I0.s("\n"), I0.s("data: "), I0.s("data:"), I0.s("data\r\n"), I0.s("data\r"), I0.s("data\n"), I0.s("id: "), I0.s("id:"), I0.s("id\r\n"), I0.s("id\r"), I0.s("id\n"), I0.s("event: "), I0.s("event:"), I0.s("event\r\n"), I0.s("event\r"), I0.s("event\n"), I0.s("retry: "), I0.s("retry:"));
        f15052e = I0.s(ServerSentEventKt.END_OF_LINE);
    }

    public a(InterfaceC2226k interfaceC2226k, P p7) {
        kotlin.jvm.internal.l.f("source", interfaceC2226k);
        kotlin.jvm.internal.l.f("callback", p7);
        this.a = interfaceC2226k;
        this.f15053b = p7;
    }

    public final boolean a() throws Throwable {
        long j7;
        String strW = this.f15054c;
        C2224i c2224i = new C2224i();
        while (true) {
            String strW2 = null;
            while (true) {
                InterfaceC2226k interfaceC2226k = this.a;
                x xVar = f15051d;
                int iU = interfaceC2226k.U(xVar);
                P p7 = this.f15053b;
                if (iU >= 0 && iU < 3) {
                    if (c2224i.f17156l == 0) {
                        return true;
                    }
                    this.f15054c = strW;
                    c2224i.n(1L);
                    String strA0 = c2224i.a0();
                    p7.getClass();
                    ((OkHttpSSESession) p7.f13378l).onEvent(p7, strW, strW2, strA0);
                    return true;
                }
                l lVar = f15052e;
                if (3 <= iU && iU < 5) {
                    c2224i.g0(10);
                    interfaceC2226k.G(c2224i, interfaceC2226k.V(lVar));
                    interfaceC2226k.U(xVar);
                } else if (5 <= iU && iU < 8) {
                    c2224i.g0(10);
                } else if (8 <= iU && iU < 10) {
                    strW = interfaceC2226k.w();
                    if (strW.length() <= 0) {
                        strW = null;
                    }
                } else if (10 <= iU && iU < 13) {
                    strW = null;
                } else if (13 <= iU && iU < 15) {
                    strW2 = interfaceC2226k.w();
                    if (strW2.length() > 0) {
                    }
                } else if (15 > iU || iU >= 18) {
                    if (18 <= iU && iU < 20) {
                        String strW3 = interfaceC2226k.w();
                        byte[] bArr = b.a;
                        try {
                            j7 = Long.parseLong(strW3);
                        } catch (NumberFormatException unused) {
                            j7 = -1;
                        }
                        if (j7 != -1) {
                            p7.getClass();
                        }
                    } else {
                        if (iU != -1) {
                            throw new AssertionError();
                        }
                        long jV = interfaceC2226k.V(lVar);
                        if (jV == -1) {
                            return false;
                        }
                        interfaceC2226k.n(jV);
                        interfaceC2226k.U(xVar);
                    }
                }
            }
        }
    }
}
