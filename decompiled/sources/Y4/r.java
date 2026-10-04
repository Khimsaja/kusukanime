package Y4;

import z5.AbstractC2517v;

/* loaded from: classes.dex */
public final class r extends t {
    public r() {
        super("HTML", 1);
    }

    @Override // Y4.t
    public final String a(String str) {
        kotlin.jvm.internal.l.f("string", str);
        return AbstractC2517v.R(AbstractC2517v.R(str, "<", "&lt;"), ">", "&gt;");
    }
}
