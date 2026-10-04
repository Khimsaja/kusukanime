package D6;

import f6.AbstractC0893G;
import f6.C0925w;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import w6.C2220e;
import w6.InterfaceC2225j;

/* loaded from: classes.dex */
public final class Q extends AbstractC0893G {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final C0925w f1685b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1686c;

    public /* synthetic */ Q(C0925w c0925w, Object obj, int i7) {
        this.a = i7;
        this.f1685b = c0925w;
        this.f1686c = obj;
    }

    @Override // f6.AbstractC0893G
    public final long contentLength() {
        switch (this.a) {
            case 0:
                return ((AbstractC0893G) this.f1686c).contentLength();
            case 1:
                return ((File) this.f1686c).length();
            default:
                return ((w6.l) this.f1686c).d();
        }
    }

    @Override // f6.AbstractC0893G
    public final C0925w contentType() {
        switch (this.a) {
        }
        return this.f1685b;
    }

    @Override // f6.AbstractC0893G
    public final void writeTo(InterfaceC2225j interfaceC2225j) throws IOException {
        switch (this.a) {
            case 0:
                ((AbstractC0893G) this.f1686c).writeTo(interfaceC2225j);
                return;
            case 1:
                File file = (File) this.f1686c;
                kotlin.jvm.internal.l.f("<this>", file);
                C2220e c2220e = new C2220e(new FileInputStream(file), w6.J.f17126d);
                try {
                    interfaceC2225j.l(c2220e);
                    c2220e.close();
                    return;
                } finally {
                }
            default:
                interfaceC2225j.k((w6.l) this.f1686c);
                return;
        }
    }

    public Q(AbstractC0893G abstractC0893G, C0925w c0925w) {
        this.a = 0;
        this.f1686c = abstractC0893G;
        this.f1685b = c0925w;
    }
}
