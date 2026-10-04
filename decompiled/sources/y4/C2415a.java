package y4;

import Q3.g;
import kotlin.jvm.internal.l;
import u4.Z;
import u4.a0;
import u4.b0;
import u4.e0;
import u4.f0;

/* renamed from: y4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2415a extends f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final C2415a f18371c = new C2415a("package", false);

    @Override // u4.f0
    public final Integer a(f0 f0Var) {
        l.f("visibility", f0Var);
        if (this == f0Var) {
            return 0;
        }
        g gVar = e0.a;
        return (f0Var == Z.f16303c || f0Var == a0.f16304c) ? 1 : -1;
    }

    @Override // u4.f0
    public final String b() {
        return "public/*package*/";
    }

    @Override // u4.f0
    public final f0 c() {
        return b0.f16305c;
    }
}
