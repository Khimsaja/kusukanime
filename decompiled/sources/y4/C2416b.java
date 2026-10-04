package y4;

import Q3.g;
import kotlin.jvm.internal.l;
import u4.W;
import u4.Z;
import u4.a0;
import u4.b0;
import u4.e0;
import u4.f0;

/* renamed from: y4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2416b extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C2416b f18372c = new C2416b("protected_and_package", true);

    @Override // u4.f0
    public final Integer a(f0 f0Var) {
        l.f("visibility", f0Var);
        if (equals(f0Var)) {
            return 0;
        }
        if (f0Var == W.f16300c) {
            return null;
        }
        g gVar = e0.a;
        return f0Var == Z.f16303c || f0Var == a0.f16304c ? 1 : -1;
    }

    @Override // u4.f0
    public final String b() {
        return "protected/*protected and package*/";
    }

    @Override // u4.f0
    public final f0 c() {
        return b0.f16305c;
    }
}
