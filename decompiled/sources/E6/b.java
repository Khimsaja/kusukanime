package E6;

import D6.InterfaceC0120n;
import G3.j;
import G3.o;
import f.AbstractC0841b;
import f6.AbstractC0893G;
import f6.C0925w;
import java.io.EOFException;
import java.util.regex.Pattern;
import w6.C2224i;

/* loaded from: classes.dex */
public final class b implements InterfaceC0120n {

    /* renamed from: l, reason: collision with root package name */
    public static final C0925w f1976l;

    /* renamed from: k, reason: collision with root package name */
    public final j f1977k;

    static {
        Pattern pattern = C0925w.f11614e;
        f1976l = AbstractC0841b.k("application/json; charset=UTF-8");
    }

    public b(j jVar) {
        this.f1977k = jVar;
    }

    @Override // D6.InterfaceC0120n
    public final Object a(Object obj) throws EOFException {
        C2224i c2224i = new C2224i();
        this.f1977k.c(new o(c2224i), obj);
        return AbstractC0893G.create(f1976l, c2224i.T(c2224i.f17156l));
    }
}
